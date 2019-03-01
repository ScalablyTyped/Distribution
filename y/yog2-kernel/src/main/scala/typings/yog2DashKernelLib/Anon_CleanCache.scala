package typings
package yog2DashKernelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CleanCache extends js.Object {
  // 清除viewcache
  def cleanCache(): scala.Unit
}

object Anon_CleanCache {
  @scala.inline
  def apply(cleanCache: js.Function0[scala.Unit]): Anon_CleanCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cleanCache")(cleanCache)
    __obj.asInstanceOf[Anon_CleanCache]
  }
}

