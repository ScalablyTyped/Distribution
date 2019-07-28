package typings.vscodeDashLanguageclient

import typings.vscode.vscodeMod.FoldingContext
import typings.vscode.vscodeMod.FoldingRange
import typings.vscode.vscodeMod.ProviderResult
import typings.vscode.vscodeMod.TextDocument
import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFoldingRangeMod {
  type ProvideFoldingRangeSignature = js.Function3[
    /* document */ TextDocument, 
    /* context */ FoldingContext, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[FoldingRange]]
  ]
}
