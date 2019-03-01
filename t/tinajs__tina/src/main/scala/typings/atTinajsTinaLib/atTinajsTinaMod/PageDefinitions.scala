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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attached")(attached)
    __obj.updateDynamic("beforeLoad")(beforeLoad)
    __obj.updateDynamic("compute")(compute)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("detached")(detached)
    __obj.updateDynamic("methods")(methods)
    __obj.updateDynamic("mixins")(mixins)
    __obj.updateDynamic("moved")(moved)
    __obj.updateDynamic("onHide")(onHide)
    __obj.updateDynamic("onLoad")(onLoad)
    __obj.updateDynamic("onPageScroll")(onPageScroll)
    __obj.updateDynamic("onPullDownRefresh")(onPullDownRefresh)
    __obj.updateDynamic("onReachBottom")(onReachBottom)
    __obj.updateDynamic("onReady")(onReady)
    __obj.updateDynamic("onShareAppMessage")(onShareAppMessage)
    __obj.updateDynamic("onShow")(onShow)
    __obj.updateDynamic("onUnload")(onUnload)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("ready")(ready)
    __obj.asInstanceOf[PageDefinitions]
  }
}

