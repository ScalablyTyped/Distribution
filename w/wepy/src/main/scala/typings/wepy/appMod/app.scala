package typings.wepy.appMod

import org.scalablytyped.runtime.StringDictionary
import typings.wepy.anon.Pages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait app extends js.Object {
  
  @JSName("$init")
  def $init(wepy: js.Any, config: AppConfig): Unit = js.native
  
  @JSName("$initAPI")
  def $initAPI(wepy: js.Any, noPromiseAPI: js.Array[String]): Unit = js.native
  @JSName("$initAPI")
  def $initAPI(wepy: js.Any, noPromiseAPI: StringDictionary[Boolean]): Unit = js.native
  
  var config: Pages = js.native
  
  def use(addonName: AddOn, args: js.Any*): Unit = js.native
}
