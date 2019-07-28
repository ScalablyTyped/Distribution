package typings.yog2DashKernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CleanCache extends js.Object {
  // 清除viewcache
  def cleanCache(): Unit
}

object Anon_CleanCache {
  @scala.inline
  def apply(cleanCache: () => Unit): Anon_CleanCache = {
    val __obj = js.Dynamic.literal(cleanCache = js.Any.fromFunction0(cleanCache))
  
    __obj.asInstanceOf[Anon_CleanCache]
  }
}

