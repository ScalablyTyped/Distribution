package typings
package atTinajsTinaLib.atTinajsTinaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageDefinitions
  extends ComponentDefinitions
     with PageEvents
     with PageHooks {
  @JSName("mixins")
  var mixins_PageDefinitions: js.Array[stdLib.Partial[PageDefinitions]]
}

object PageDefinitions {
  @scala.inline
  def apply(
    attached: js.Function0[scala.Unit],
    beforeLoad: js.Function1[Page, scala.Unit],
    compute: js.Function1[
      org.scalablytyped.runtime.StringDictionary[js.Any], 
      org.scalablytyped.runtime.StringDictionary[js.Any]
    ],
    created: js.Function0[scala.Unit],
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    detached: js.Function0[scala.Unit],
    methods: org.scalablytyped.runtime.StringDictionary[js.ThisFunction0[/* this */ Component, _]],
    mixins: js.Array[stdLib.Partial[PageDefinitions]],
    moved: js.Function0[scala.Unit],
    onHide: js.Function1[Page, scala.Unit],
    onLoad: js.Function1[Page, scala.Unit],
    onPageScroll: js.Function1[Page, scala.Unit],
    onPullDownRefresh: js.Function1[Page, scala.Unit],
    onReachBottom: js.Function1[Page, scala.Unit],
    onReady: js.Function1[Page, scala.Unit],
    onShareAppMessage: js.Function1[Page, scala.Unit],
    onShow: js.Function1[Page, scala.Unit],
    onUnload: js.Function1[Page, scala.Unit],
    properties: ComponentProperties,
    ready: js.Function0[scala.Unit]
  ): PageDefinitions = {
    val __obj = js.Dynamic.literal(attached = attached, beforeLoad = beforeLoad, compute = compute, created = created, data = data, detached = detached, methods = methods, mixins = mixins, moved = moved, onHide = onHide, onLoad = onLoad, onPageScroll = onPageScroll, onPullDownRefresh = onPullDownRefresh, onReachBottom = onReachBottom, onReady = onReady, onShareAppMessage = onShareAppMessage, onShow = onShow, onUnload = onUnload, properties = properties, ready = ready)
  
    __obj.asInstanceOf[PageDefinitions]
  }
}

