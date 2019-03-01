package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/observer.html
	 */
trait ObserversDefs[V]
  extends /* expression */ org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, _]]

object ObserversDefs {
  @scala.inline
  def apply[V](
    StringDictionary: /* expression */ org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, _]] = null
  ): ObserversDefs[V] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ObserversDefs[V]]
  }
}

