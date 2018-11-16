package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GenerativeTypeClassification extends js.Object

@JSGlobal("TypeScript.GenerativeTypeClassification")
@js.native
object GenerativeTypeClassification extends js.Object {
  @js.native
  sealed trait Closed
    extends typescriptDashServicesLib.TypeScriptNs.GenerativeTypeClassification
  
  @js.native
  sealed trait InfinitelyExpanding
    extends typescriptDashServicesLib.TypeScriptNs.GenerativeTypeClassification
  
  @js.native
  sealed trait Open
    extends typescriptDashServicesLib.TypeScriptNs.GenerativeTypeClassification
  
  @js.native
  sealed trait Unknown
    extends typescriptDashServicesLib.TypeScriptNs.GenerativeTypeClassification
  
  /* 2 */ val Closed: Closed with scala.Double = js.native
  /* 3 */ val InfinitelyExpanding: InfinitelyExpanding with scala.Double = js.native
  /* 1 */ val Open: Open with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    typescriptDashServicesLib.TypeScriptNs.GenerativeTypeClassification with scala.Double
  ] = js.native
}

