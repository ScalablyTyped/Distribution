package typings
package wpapiLib.wpapiMod

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
    delete: TransportFunction = null,
    get: TransportFunction = null,
    head: TransportFunction = null,
    post: TransportFunction = null,
    put: TransportFunction = null
  ): Transport = {
    val __obj = js.Dynamic.literal()
    if (delete != null) __obj.updateDynamic("delete")(delete)
    if (get != null) __obj.updateDynamic("get")(get)
    if (head != null) __obj.updateDynamic("head")(head)
    if (post != null) __obj.updateDynamic("post")(post)
    if (put != null) __obj.updateDynamic("put")(put)
    __obj.asInstanceOf[Transport]
  }
}

