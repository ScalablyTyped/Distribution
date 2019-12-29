package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SideEffectOptions with Double] = js.native
  /* 2 */ @js.native
  object Constructor extends TopLevel[Constructor with Double]
  
  /* 4 */ @js.native
  object JsxElement extends TopLevel[JsxElement with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object TaggedTemplate extends TopLevel[TaggedTemplate with Double]
  
}

