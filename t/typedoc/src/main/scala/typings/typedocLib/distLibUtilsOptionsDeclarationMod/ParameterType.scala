package typings
package typedocLib.distLibUtilsOptionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterType extends js.Object

@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterType")
@js.native
object ParameterType extends js.Object {
  @js.native
  sealed trait Array
    extends typedocLib.distLibUtilsOptionsDeclarationMod.ParameterType
  
  @js.native
  sealed trait Boolean
    extends typedocLib.distLibUtilsOptionsDeclarationMod.ParameterType
  
  @js.native
  sealed trait Map
    extends typedocLib.distLibUtilsOptionsDeclarationMod.ParameterType
  
  @js.native
  sealed trait Mixed
    extends typedocLib.distLibUtilsOptionsDeclarationMod.ParameterType
  
  @js.native
  sealed trait Number
    extends typedocLib.distLibUtilsOptionsDeclarationMod.ParameterType
  
  @js.native
  sealed trait String
    extends typedocLib.distLibUtilsOptionsDeclarationMod.ParameterType
  
  /* 5 */ val Array: Array with scala.Double = js.native
  /* 2 */ val Boolean: Boolean with scala.Double = js.native
  /* 3 */ val Map: Map with scala.Double = js.native
  /* 4 */ val Mixed: Mixed with scala.Double = js.native
  /* 1 */ val Number: Number with scala.Double = js.native
  /* 0 */ val String: String with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typedocLib.distLibUtilsOptionsDeclarationMod.ParameterType with scala.Double] = js.native
}

