package typings.weappDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object weappDashApiMod {
  import typings.weappDashApi.weappDashApiMod.wx.AppOptions
  import typings.weappDashApi.weappDashApiMod.wx.PageOptions

  type AppConstructor = js.Function1[/* options */ AppOptions, Unit]
  type PageConstructor = js.Function1[/* options */ PageOptions, Unit]
}
