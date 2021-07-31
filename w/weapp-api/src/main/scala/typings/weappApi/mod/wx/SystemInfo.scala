package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfo extends StObject {
  
  /** 微信设置的语言 */
  var language: String
  
  /** 手机型号 */
  var model: String
  
  /** 设备像素比 */
  var pixelRatio: Double
  
  /** 微信版本号 */
  var version: String
  
  /** 窗口高度 */
  var windowHeight: Double
  
  /** 窗口宽度 */
  var windowWidth: Double
}
object SystemInfo {
  
  @scala.inline
  def apply(
    language: String,
    model: String,
    pixelRatio: Double,
    version: String,
    windowHeight: Double,
    windowWidth: Double
  ): SystemInfo = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfo]
  }
  
  @scala.inline
  implicit class SystemInfoMutableBuilder[Self <: SystemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}
