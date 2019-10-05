package typings.yog2DashKernel.yog2DashKernelMod

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
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
    copy: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    del: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    delete: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    get: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    head: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    link: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    lock: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    options: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    patch: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    post: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    propfind: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    purge: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    put: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    unlick: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    unlock: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null,
    view: (/* req */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request[ParamsDictionary], /* res */ typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response, /* next */ NextFunction) => js.Any = null
  ): ActionObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction3(copy))
    if (del != null) __obj.updateDynamic("del")(js.Any.fromFunction3(del))
    if (delete != null) __obj.updateDynamic("delete")(js.Any.fromFunction3(delete))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction3(get))
    if (head != null) __obj.updateDynamic("head")(js.Any.fromFunction3(head))
    if (link != null) __obj.updateDynamic("link")(js.Any.fromFunction3(link))
    if (lock != null) __obj.updateDynamic("lock")(js.Any.fromFunction3(lock))
    if (options != null) __obj.updateDynamic("options")(js.Any.fromFunction3(options))
    if (patch != null) __obj.updateDynamic("patch")(js.Any.fromFunction3(patch))
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction3(post))
    if (propfind != null) __obj.updateDynamic("propfind")(js.Any.fromFunction3(propfind))
    if (purge != null) __obj.updateDynamic("purge")(js.Any.fromFunction3(purge))
    if (put != null) __obj.updateDynamic("put")(js.Any.fromFunction3(put))
    if (unlick != null) __obj.updateDynamic("unlick")(js.Any.fromFunction3(unlick))
    if (unlock != null) __obj.updateDynamic("unlock")(js.Any.fromFunction3(unlock))
    if (view != null) __obj.updateDynamic("view")(js.Any.fromFunction3(view))
    __obj.asInstanceOf[ActionObject]
  }
}

