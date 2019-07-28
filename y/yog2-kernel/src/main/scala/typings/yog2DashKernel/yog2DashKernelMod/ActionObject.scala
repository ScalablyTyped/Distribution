package typings.yog2DashKernel.yog2DashKernelMod

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionObject
  extends /* key */ StringDictionary[js.Any] {
  var copy: js.UndefOr[RequestHandler] = js.undefined
  var del: js.UndefOr[RequestHandler] = js.undefined
  var delete: js.UndefOr[RequestHandler] = js.undefined
  var get: js.UndefOr[RequestHandler] = js.undefined
  var head: js.UndefOr[RequestHandler] = js.undefined
  var link: js.UndefOr[RequestHandler] = js.undefined
  var lock: js.UndefOr[RequestHandler] = js.undefined
  var options: js.UndefOr[RequestHandler] = js.undefined
  var patch: js.UndefOr[RequestHandler] = js.undefined
  var post: js.UndefOr[RequestHandler] = js.undefined
  var propfind: js.UndefOr[RequestHandler] = js.undefined
  var purge: js.UndefOr[RequestHandler] = js.undefined
  var put: js.UndefOr[RequestHandler] = js.undefined
  var unlick: js.UndefOr[RequestHandler] = js.undefined
  var unlock: js.UndefOr[RequestHandler] = js.undefined
  var view: js.UndefOr[RequestHandler] = js.undefined
}

object ActionObject {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    copy: RequestHandler = null,
    del: RequestHandler = null,
    delete: RequestHandler = null,
    get: RequestHandler = null,
    head: RequestHandler = null,
    link: RequestHandler = null,
    lock: RequestHandler = null,
    options: RequestHandler = null,
    patch: RequestHandler = null,
    post: RequestHandler = null,
    propfind: RequestHandler = null,
    purge: RequestHandler = null,
    put: RequestHandler = null,
    unlick: RequestHandler = null,
    unlock: RequestHandler = null,
    view: RequestHandler = null
  ): ActionObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (del != null) __obj.updateDynamic("del")(del)
    if (delete != null) __obj.updateDynamic("delete")(delete)
    if (get != null) __obj.updateDynamic("get")(get)
    if (head != null) __obj.updateDynamic("head")(head)
    if (link != null) __obj.updateDynamic("link")(link)
    if (lock != null) __obj.updateDynamic("lock")(lock)
    if (options != null) __obj.updateDynamic("options")(options)
    if (patch != null) __obj.updateDynamic("patch")(patch)
    if (post != null) __obj.updateDynamic("post")(post)
    if (propfind != null) __obj.updateDynamic("propfind")(propfind)
    if (purge != null) __obj.updateDynamic("purge")(purge)
    if (put != null) __obj.updateDynamic("put")(put)
    if (unlick != null) __obj.updateDynamic("unlick")(unlick)
    if (unlock != null) __obj.updateDynamic("unlock")(unlock)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[ActionObject]
  }
}

