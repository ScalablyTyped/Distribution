package typings
package tsutilsLib.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SideEffectOptions extends js.Object

@JSImport("tsutils/util/util", "SideEffectOptions")
@js.native
object SideEffectOptions extends js.Object {
  @js.native
  sealed trait Constructor
    extends tsutilsLib.utilUtilMod.SideEffectOptions
  
  @js.native
  sealed trait JsxElement
    extends tsutilsLib.utilUtilMod.SideEffectOptions
  
  @js.native
  sealed trait None
    extends tsutilsLib.utilUtilMod.SideEffectOptions
  
  @js.native
  sealed trait TaggedTemplate
    extends tsutilsLib.utilUtilMod.SideEffectOptions
  
  /* 2 */ val Constructor: Constructor with scala.Double = js.native
  /* 4 */ val JsxElement: JsxElement with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val TaggedTemplate: TaggedTemplate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tsutilsLib.utilUtilMod.SideEffectOptions with scala.Double] = js.native
}

