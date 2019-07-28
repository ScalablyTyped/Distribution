package typings.vscodeDashLanguageclient

import typings.vscode.vscodeMod.Color
import typings.vscode.vscodeMod.ColorInformation
import typings.vscode.vscodeMod.ColorPresentation
import typings.vscode.vscodeMod.ProviderResult
import typings.vscode.vscodeMod.TextDocument
import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import typings.vscodeDashLanguageclient.Anon_Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libColorProviderMod {
  type ProvideColorPresentationSignature = js.Function3[
    /* color */ Color, 
    /* context */ Anon_Document, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[ColorPresentation]]
  ]
  type ProvideDocumentColorsSignature = js.Function2[
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[ColorInformation]]
  ]
}
