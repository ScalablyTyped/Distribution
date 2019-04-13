package typings
package w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSSTransformValue")
@js.native
class CSSTransformValue protected ()
  extends CSSStyleValue
     with /* index */ org.scalablytyped.runtime.NumberDictionary[CSSTransformComponent] {
  def this(transforms: js.Array[CSSTransformComponent]) = this()
  val is2D: scala.Boolean = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[stdLib.IterableIterator[CSSTransformComponent]] = js.native
  val length: scala.Double = js.native
  def toMatrix(): stdLib.DOMMatrix = js.native
}

