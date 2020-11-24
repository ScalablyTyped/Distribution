package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.getIDForTypeSubstitutions")
@js.native
object getIDForTypeSubstitutions extends js.Object {
  
  def apply(
    instantiatingSignature: typings.typescriptServices.TypeScript.PullSignatureSymbol,
    typeArgumentMap: TypeArgumentMap
  ): String = js.native
  def apply(
    instantiatingType: typings.typescriptServices.TypeScript.PullTypeSymbol,
    typeArgumentMap: TypeArgumentMap
  ): String = js.native
}
