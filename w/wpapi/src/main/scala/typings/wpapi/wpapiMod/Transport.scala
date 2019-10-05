package typings.wpapi.wpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  var delete: js.UndefOr[TransportFunction] = js.undefined
  var get: js.UndefOr[TransportFunction] = js.undefined
  var head: js.UndefOr[TransportFunction] = js.undefined
  var post: js.UndefOr[TransportFunction] = js.undefined
  var put: js.UndefOr[TransportFunction] = js.undefined
}

object Transport {
  @scala.inline
  def apply(
    delete: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any] = null,
    get: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any] = null,
    head: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any] = null,
    post: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any] = null,
    put: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any] = null
  ): Transport = {
    val __obj = js.Dynamic.literal()
    if (delete != null) __obj.updateDynamic("delete")(js.Any.fromFunction2(delete))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction2(get))
    if (head != null) __obj.updateDynamic("head")(js.Any.fromFunction2(head))
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction2(post))
    if (put != null) __obj.updateDynamic("put")(js.Any.fromFunction2(put))
    __obj.asInstanceOf[Transport]
  }
}

