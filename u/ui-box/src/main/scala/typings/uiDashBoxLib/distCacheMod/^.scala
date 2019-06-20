package typings
package uiDashBoxLib.distCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ui-box/dist/cache", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clear(): scala.Unit = js.native
  def entries(): js.Array[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def get(property: java.lang.String, value: CacheValue): js.UndefOr[java.lang.String] = js.native
  def hydrate(newEntries: js.Array[CacheEntry]): scala.Unit = js.native
  def set(property: java.lang.String, value: js.Object, className: java.lang.String): scala.Unit = js.native
  def set(property: java.lang.String, value: CacheValue, className: java.lang.String): scala.Unit = js.native
}

