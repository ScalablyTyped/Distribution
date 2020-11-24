package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.NumberDictionary
import typings.std.DOMMatrix
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSTransformValue
  extends CSSStyleValue
     with /* index */ NumberDictionary[CSSTransformComponent] {
  
  val is2D: Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSTransformComponent]] = js.native
  
  val length: Double = js.native
  
  def toMatrix(): DOMMatrix = js.native
}
