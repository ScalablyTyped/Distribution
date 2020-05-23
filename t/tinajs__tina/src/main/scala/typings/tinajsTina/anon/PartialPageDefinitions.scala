package typings.tinajsTina.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.tinajsTina.mod.Component
import typings.tinajsTina.mod.ComponentProperties
import typings.tinajsTina.mod.Page
import typings.tinajsTina.mod.PageDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@tinajs/tina.@tinajs/tina.PageDefinitions> */
trait PartialPageDefinitions extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeLoad: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
  var compute: js.UndefOr[js.Function1[/* data */ StringDictionary[js.Any], StringDictionary[_]]] = js.undefined
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var methods: js.UndefOr[
    StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]
  ] = js.undefined
  var mixins: js.UndefOr[js.Array[Partial[PageDefinitions]]] = js.undefined
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.ThisFunction1[/* this */ Page, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onPageScroll: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.undefined
  var onPullDownRefresh: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.undefined
  var onReachBottom: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.undefined
  var onReady: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
  var onShareAppMessage: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.undefined
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
  var onUnload: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
  var properties: js.UndefOr[ComponentProperties] = js.undefined
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialPageDefinitions {
  @scala.inline
  def apply(
    attached: () => Unit = null,
    beforeLoad: js.ThisFunction0[/* this */ Page, Unit] = null,
    compute: /* data */ StringDictionary[js.Any] => StringDictionary[_] = null,
    created: () => Unit = null,
    data: StringDictionary[js.Any] = null,
    detached: () => Unit = null,
    methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]] = null,
    mixins: js.Array[Partial[PageDefinitions]] = null,
    moved: () => Unit = null,
    onHide: js.ThisFunction0[/* this */ Page, Unit] = null,
    onLoad: js.ThisFunction1[/* this */ Page, /* options */ js.UndefOr[js.Any], Unit] = null,
    onPageScroll: /* event */ Page => Unit = null,
    onPullDownRefresh: /* event */ Page => Unit = null,
    onReachBottom: /* event */ Page => Unit = null,
    onReady: js.ThisFunction0[/* this */ Page, Unit] = null,
    onShareAppMessage: /* event */ Page => Unit = null,
    onShow: js.ThisFunction0[/* this */ Page, Unit] = null,
    onUnload: js.ThisFunction0[/* this */ Page, Unit] = null,
    properties: ComponentProperties = null,
    ready: () => Unit = null
  ): PartialPageDefinitions = {
    val __obj = js.Dynamic.literal()
    if (attached != null) __obj.updateDynamic("attached")(js.Any.fromFunction0(attached))
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(beforeLoad.asInstanceOf[js.Any])
    if (compute != null) __obj.updateDynamic("compute")(js.Any.fromFunction1(compute))
    if (created != null) __obj.updateDynamic("created")(js.Any.fromFunction0(created))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (detached != null) __obj.updateDynamic("detached")(js.Any.fromFunction0(detached))
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (moved != null) __obj.updateDynamic("moved")(js.Any.fromFunction0(moved))
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (onPageScroll != null) __obj.updateDynamic("onPageScroll")(js.Any.fromFunction1(onPageScroll))
    if (onPullDownRefresh != null) __obj.updateDynamic("onPullDownRefresh")(js.Any.fromFunction1(onPullDownRefresh))
    if (onReachBottom != null) __obj.updateDynamic("onReachBottom")(js.Any.fromFunction1(onReachBottom))
    if (onReady != null) __obj.updateDynamic("onReady")(onReady.asInstanceOf[js.Any])
    if (onShareAppMessage != null) __obj.updateDynamic("onShareAppMessage")(js.Any.fromFunction1(onShareAppMessage))
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (onUnload != null) __obj.updateDynamic("onUnload")(onUnload.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction0(ready))
    __obj.asInstanceOf[PartialPageDefinitions]
  }
}

