package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JsxEmit extends js.Object

@JSImport("typescript", "JsxEmit")
@js.native
object JsxEmit extends js.Object {
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.JsxEmit
  
  @js.native
  sealed trait Preserve
    extends typescriptLib.typescriptMod.JsxEmit
  
  @js.native
  sealed trait React
    extends typescriptLib.typescriptMod.JsxEmit
  
  @js.native
  sealed trait ReactNative
    extends typescriptLib.typescriptMod.JsxEmit
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Preserve: Preserve with scala.Double = js.native
  /* 2 */ val React: React with scala.Double = js.native
  /* 3 */ val ReactNative: ReactNative with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.JsxEmit with scala.Double] = js.native
}

