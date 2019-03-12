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
    attached: () => scala.Unit,
    beforeLoad: Page => scala.Unit,
    compute: org.scalablytyped.runtime.StringDictionary[js.Any] => org.scalablytyped.runtime.StringDictionary[js.Any],
    created: () => scala.Unit,
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    detached: () => scala.Unit,
    methods: org.scalablytyped.runtime.StringDictionary[js.ThisFunction0[/* this */ Component, _]],
    mixins: js.Array[stdLib.Partial[PageDefinitions]],
    moved: () => scala.Unit,
    onHide: Page => scala.Unit,
    onLoad: Page => scala.Unit,
    onPageScroll: Page => scala.Unit,
    onPullDownRefresh: Page => scala.Unit,
    onReachBottom: Page => scala.Unit,
    onReady: Page => scala.Unit,
    onShareAppMessage: Page => scala.Unit,
    onShow: Page => scala.Unit,
    onUnload: Page => scala.Unit,
    properties: ComponentProperties,
    ready: () => scala.Unit
  ): PageDefinitions = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), beforeLoad = js.Any.fromFunction1(beforeLoad), compute = js.Any.fromFunction1(compute), created = js.Any.fromFunction0(created), data = data, detached = js.Any.fromFunction0(detached), methods = methods, mixins = mixins, moved = js.Any.fromFunction0(moved), onHide = js.Any.fromFunction1(onHide), onLoad = js.Any.fromFunction1(onLoad), onPageScroll = js.Any.fromFunction1(onPageScroll), onPullDownRefresh = js.Any.fromFunction1(onPullDownRefresh), onReachBottom = js.Any.fromFunction1(onReachBottom), onReady = js.Any.fromFunction1(onReady), onShareAppMessage = js.Any.fromFunction1(onShareAppMessage), onShow = js.Any.fromFunction1(onShow), onUnload = js.Any.fromFunction1(onUnload), properties = properties, ready = js.Any.fromFunction0(ready))
  
    __obj.asInstanceOf[PageDefinitions]
  }
}

