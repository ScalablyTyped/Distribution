package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSTransformValue
  extends StObject
     with CSSStyleValue {
  
  def forEach(
    callbackfn: js.Function3[/* value */ CSSTransformComponent, /* key */ Double, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ CSSTransformComponent, /* key */ Double, /* parent */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  val is2D: Boolean = js.native
  
  val length: Double = js.native
  
  def toMatrix(): DOMMatrix = js.native
}
