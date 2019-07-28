package typings.vscodeDashLanguageclient

import typings.vscode.vscodeMod.Declaration
import typings.vscode.vscodeMod.Position
import typings.vscode.vscodeMod.ProviderResult
import typings.vscode.vscodeMod.TextDocument
import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDeclarationMod {
  type ProvideDeclarationSignature = js.Function3[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Declaration]
  ]
}
