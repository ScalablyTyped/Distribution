package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SideEffectOptions extends js.Object
@JSImport("tsutils/util/util", "SideEffectOptions")
@js.native
object SideEffectOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SideEffectOptions with Double] = js.native
  
  @js.native
  sealed trait Constructor extends SideEffectOptions
  /* 2 */ @js.native
  object Constructor extends TopLevel[Constructor with Double]
  
  @js.native
  sealed trait JsxElement extends SideEffectOptions
  /* 4 */ @js.native
  object JsxElement extends TopLevel[JsxElement with Double]
  
  @js.native
  sealed trait None extends SideEffectOptions
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait TaggedTemplate extends SideEffectOptions
  /* 1 */ @js.native
  object TaggedTemplate extends TopLevel[TaggedTemplate with Double]
}
