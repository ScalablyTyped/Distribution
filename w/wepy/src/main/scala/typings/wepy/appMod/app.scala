package typings.wepy.appMod

import org.scalablytyped.runtime.StringDictionary
import typings.wepy.Anon_Pages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait app extends js.Object {
  var config: Anon_Pages = js.native
  @JSName("$init")
  def $init(wepy: js.Any, config: AppConfig): Unit = js.native
  @JSName("$initAPI")
  def $initAPI(wepy: js.Any, noPromiseAPI: js.Array[String]): Unit = js.native
  @JSName("$initAPI")
  def $initAPI(wepy: js.Any, noPromiseAPI: StringDictionary[Boolean]): Unit = js.native
  def use(addonName: AddOn, args: js.Any*): Unit = js.native
}

