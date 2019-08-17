package typings.vscodeDashLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDeclarationMod {
  import typings.vscode.vscodeMod.Declaration
  import typings.vscode.vscodeMod.Position
  import typings.vscode.vscodeMod.ProviderResult
  import typings.vscode.vscodeMod.TextDocument
  import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken

  type ProvideDeclarationSignature = js.Function3[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Declaration]
  ]
}
