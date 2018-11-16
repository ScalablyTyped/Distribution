package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LanguageVersion extends js.Object

@JSGlobal("TypeScript.LanguageVersion")
@js.native
object LanguageVersion extends js.Object {
  @js.native
  sealed trait EcmaScript3
    extends typescriptDashServicesLib.TypeScriptNs.LanguageVersion
  
  @js.native
  sealed trait EcmaScript5
    extends typescriptDashServicesLib.TypeScriptNs.LanguageVersion
  
  /* 0 */ val EcmaScript3: EcmaScript3 with scala.Double = js.native
  /* 1 */ val EcmaScript5: EcmaScript5 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptDashServicesLib.TypeScriptNs.LanguageVersion with scala.Double] = js.native
}

