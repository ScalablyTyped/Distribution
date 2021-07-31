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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utils {
  
  @JSImport("tuya-panel-kit", "Utils")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Utils.ColorUtils")
  @js.native
  def ColorUtils: HslToRgb = js.native
  @scala.inline
  def ColorUtils_=(x: HslToRgb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ColorUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Utils.CoreUtils")
  @js.native
  def CoreUtils: Chunk = js.native
  @scala.inline
  def CoreUtils_=(x: Chunk): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CoreUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Utils.JsonUtils")
  @js.native
  def JsonUtils: ParseJSON = js.native
  @scala.inline
  def JsonUtils_=(x: ParseJSON): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JsonUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Utils.NumberUtils")
  @js.native
  def NumberUtils: Add = js.native
  @scala.inline
  def NumberUtils_=(x: Add): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumberUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Utils.RatioUtils")
  @js.native
  def RatioUtils: Convert = js.native
  @scala.inline
  def RatioUtils_=(x: Convert): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RatioUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Utils.StringUtils")
  @js.native
  def StringUtils: Camelize = js.native
  @scala.inline
  def StringUtils_=(x: Camelize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Utils.TemperatureUtils")
  @js.native
  def TemperatureUtils: C2f = js.native
  @scala.inline
  def TemperatureUtils_=(x: C2f): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TemperatureUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Utils.ThemeUtils")
  @js.native
  def ThemeUtils: DeepMerge = js.native
  @scala.inline
  def ThemeUtils_=(x: DeepMerge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThemeUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Utils.TimeUtils")
  @js.native
  def TimeUtils: DateFormat = js.native
  @scala.inline
  def TimeUtils_=(x: DateFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TimeUtils")(x.asInstanceOf[js.Any])
}
