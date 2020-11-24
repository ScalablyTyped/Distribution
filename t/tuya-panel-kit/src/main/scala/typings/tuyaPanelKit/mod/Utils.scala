package typings.tuyaPanelKit.mod

import typings.tuyaPanelKit.anon.Add
import typings.tuyaPanelKit.anon.C2f
import typings.tuyaPanelKit.anon.Camelize
import typings.tuyaPanelKit.anon.Chunk
import typings.tuyaPanelKit.anon.Convert
import typings.tuyaPanelKit.anon.DateFormat
import typings.tuyaPanelKit.anon.DeepMerge
import typings.tuyaPanelKit.anon.HslToRgb
import typings.tuyaPanelKit.anon.ParseJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Utils")
@js.native
object Utils extends js.Object {
  
  var ColorUtils: HslToRgb = js.native
  
  var CoreUtils: Chunk = js.native
  
  var JsonUtils: ParseJSON = js.native
  
  var NumberUtils: Add = js.native
  
  var RatioUtils: Convert = js.native
  
  var StringUtils: Camelize = js.native
  
  var TemperatureUtils: C2f = js.native
  
  var ThemeUtils: DeepMerge = js.native
  
  var TimeUtils: DateFormat = js.native
}
