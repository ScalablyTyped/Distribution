package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsxEmit extends js.Object
@JSImport("typescript", "JsxEmit")
@js.native
object JsxEmit extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxEmit with Double] = js.native
  
  @js.native
  sealed trait None extends JsxEmit
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Preserve extends JsxEmit
  /* 1 */ @js.native
  object Preserve extends TopLevel[Preserve with Double]
  
  @js.native
  sealed trait React extends JsxEmit
  /* 2 */ @js.native
  object React extends TopLevel[React with Double]
  
  @js.native
  sealed trait ReactJSX extends JsxEmit
  /* 4 */ @js.native
  object ReactJSX extends TopLevel[ReactJSX with Double]
  
  @js.native
  sealed trait ReactJSXDev extends JsxEmit
  /* 5 */ @js.native
  object ReactJSXDev extends TopLevel[ReactJSXDev with Double]
  
  @js.native
  sealed trait ReactNative extends JsxEmit
  /* 3 */ @js.native
  object ReactNative extends TopLevel[ReactNative with Double]
}
