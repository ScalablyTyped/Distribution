package typings.w3cCssTypedObjectModelLevel1

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylePropertyMapReadOnly extends js.Object {
  
  def get(property: String): js.UndefOr[CSSStyleValue] = js.native
  
  def getAll(property: String): js.Array[CSSStyleValue] = js.native
  
  def has(property: String): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[String, js.Array[CSSStyleValue]]]] = js.native
  
  val size: Double = js.native
}
