package typings.wordpressCustomizeBrowser.settingMod

import typings.wordpressCustomizeBrowser.anon.PartialSettingOptions
import typings.wordpressCustomizeBrowser.controlMod.Control
import typings.wordpressCustomizeBrowser.valueMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/Setting", "Setting")
@js.native
class Setting[T] () extends Value[T] {
  
  var defaults: SettingOptions = js.native
  
  def findControls(): js.Array[Control] = js.native
  
  def initialize(id: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], options: PartialSettingOptions): Unit = js.native
  def initialize(id: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
  def initialize(id: js.UndefOr[scala.Nothing], value: js.Any, options: PartialSettingOptions): Unit = js.native
  def initialize(id: String, value: js.UndefOr[scala.Nothing], options: PartialSettingOptions): Unit = js.native
  def initialize(id: String, value: js.Any): Unit = js.native
  def initialize(id: String, value: js.Any, options: PartialSettingOptions): Unit = js.native
  
  def preview(): Unit = js.native
}
