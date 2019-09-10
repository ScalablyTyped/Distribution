package typings.tsutils.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SideEffectOptions extends js.Object

@JSImport("tsutils/util/util", "SideEffectOptions")
@js.native
object SideEffectOptions extends js.Object {
  @js.native
  sealed trait Constructor extends SideEffectOptions
  
  @js.native
  sealed trait JsxElement extends SideEffectOptions
  
  @js.native
  sealed trait None extends SideEffectOptions
  
  @js.native
  sealed trait TaggedTemplate extends SideEffectOptions
  
  /* 2 */ val Constructor: typings.tsutils.utilUtilMod.SideEffectOptions.Constructor with Double = js.native
  /* 4 */ val JsxElement: typings.tsutils.utilUtilMod.SideEffectOptions.JsxElement with Double = js.native
  /* 0 */ val None: typings.tsutils.utilUtilMod.SideEffectOptions.None with Double = js.native
  /* 1 */ val TaggedTemplate: typings.tsutils.utilUtilMod.SideEffectOptions.TaggedTemplate with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SideEffectOptions with Double] = js.native
}

