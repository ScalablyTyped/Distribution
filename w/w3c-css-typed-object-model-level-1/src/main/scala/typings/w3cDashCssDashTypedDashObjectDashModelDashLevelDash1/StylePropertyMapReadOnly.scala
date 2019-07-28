package typings.w3cDashCssDashTypedDashObjectDashModelDashLevelDash1

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StylePropertyMapReadOnly")
@js.native
class StylePropertyMapReadOnly () extends js.Object {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[String, js.Array[CSSStyleValue]]]] = js.native
  val size: Double = js.native
  def get(property: String): js.UndefOr[CSSStyleValue] = js.native
  def getAll(property: String): js.Array[CSSStyleValue] = js.native
  def has(property: String): Boolean = js.native
}

