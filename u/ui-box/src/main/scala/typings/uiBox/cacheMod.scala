package typings.uiBox

import typings.uiBox.typesEnhancersMod.BoxPropValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ui-box/dist/src/cache", JSImport.Namespace)
@js.native
object cacheMod extends js.Object {
  def clear(): Unit = js.native
  def entries(): js.Array[js.Tuple2[String, String]] = js.native
  def get(property: String, value: CacheValue): js.UndefOr[String] = js.native
  def hydrate(newEntries: js.Array[CacheEntry]): Unit = js.native
  def set(property: String, value: js.Object, className: String): Unit = js.native
  def set(property: String, value: CacheValue, className: String): Unit = js.native
  type CacheEntry = js.Tuple2[String, String]
  type CacheValue = BoxPropValue
}

