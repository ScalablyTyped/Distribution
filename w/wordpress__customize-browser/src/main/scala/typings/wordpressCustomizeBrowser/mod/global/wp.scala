package typings.wordpressCustomizeBrowser.mod.global

import typings.jquery.JQuery.Promise
import typings.wordpressCustomizeBrowser.customizeMod.Customize
import typings.wordpressCustomizeBrowser.settingMod.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("wp")
@js.native
object wp extends js.Object {
  
  def customize(arg: String): Setting[_] = js.native
  def customize(args: (String | (js.Function1[/* repeated */ Setting[_], Unit]))*): Promise[_, _, _] = js.native
  @JSName("customize")
  var customize_Original: Customize = js.native
}
