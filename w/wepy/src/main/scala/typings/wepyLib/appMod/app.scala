package typings
package wepyLib.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait app extends js.Object {
  var config: wepyLib.Anon_Window = js.native
  @JSName("$init")
  def $init(wepy: js.Any, config: AppConfig): scala.Unit = js.native
  @JSName("$initAPI")
  def $initAPI(wepy: js.Any, noPromiseAPI: js.Array[java.lang.String]): scala.Unit = js.native
  @JSName("$initAPI")
  def $initAPI(wepy: js.Any, noPromiseAPI: org.scalablytyped.runtime.StringDictionary[scala.Boolean]): scala.Unit = js.native
  def use(addonName: AddOn, args: js.Any*): scala.Unit = js.native
}

