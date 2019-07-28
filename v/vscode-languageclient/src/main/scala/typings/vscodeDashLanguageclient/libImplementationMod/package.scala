package typings.vscodeDashLanguageclient

import typings.vscode.vscodeMod.Definition
import typings.vscode.vscodeMod.DefinitionLink
import typings.vscode.vscodeMod.Position
import typings.vscode.vscodeMod.ProviderResult
import typings.vscode.vscodeMod.TextDocument
import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libImplementationMod {
  type ProvideImplementationSignature = js.Function3[
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Definition | js.Array[DefinitionLink]]
  ]
}
