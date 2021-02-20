package typings.useCallbackRef

import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createRefMod {
  
  @JSImport("use-callback-ref/dist/es5/createRef", "createCallbackRef")
  @js.native
  def createCallbackRef[T](callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, _]): RefObject[T] = js.native
}
