package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsxEmit extends StObject
@JSImport("typescript", "JsxEmit")
@js.native
object JsxEmit extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxEmit & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with JsxEmit
  /* 0 */ val None: typings.typescript.mod.JsxEmit.None & Double = js.native
  
  @js.native
  sealed trait Preserve
    extends StObject
       with JsxEmit
  /* 1 */ val Preserve: typings.typescript.mod.JsxEmit.Preserve & Double = js.native
  
  @js.native
  sealed trait React
    extends StObject
       with JsxEmit
  /* 2 */ val React: typings.typescript.mod.JsxEmit.React & Double = js.native
  
  @js.native
  sealed trait ReactJSX
    extends StObject
       with JsxEmit
  /* 4 */ val ReactJSX: typings.typescript.mod.JsxEmit.ReactJSX & Double = js.native
  
  @js.native
  sealed trait ReactJSXDev
    extends StObject
       with JsxEmit
  /* 5 */ val ReactJSXDev: typings.typescript.mod.JsxEmit.ReactJSXDev & Double = js.native
  
  @js.native
  sealed trait ReactNative
    extends StObject
       with JsxEmit
  /* 3 */ val ReactNative: typings.typescript.mod.JsxEmit.ReactNative & Double = js.native
}
