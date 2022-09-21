package typings.tuyaPanelKit.mod

import typings.tuyaPanelKit.anon.BatteryColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatteryProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 电池颜色
    * @types string
    * @defaultValue 'rgba(0,0,0,.5)'
    */
  /**
    * @language en-US
    * @description the color of battery
    * @types string
    * @defaultValue 'rgba(0,0,0,.5)'
    */
  var batteryColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 高电量颜色
    * @types number
    * @defaultValue 'rgba(0,0,0,.5)'
    */
  /**
    * @language en-US
    * @description the color of high power
    * @types number
    * @defaultValue 'rgba(0,0,0,.5)'
    */
  var highColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 低电量颜色
    * @types number
    * @defaultValue 'rgba(0,0,0,.5)'
    */
  /**
    * @language en-US
    * @description the color of low power
    * @types number
    * @defaultValue 'rgba(0,0,0,.5)'
    */
  var lowColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 中电量颜色
    * @types number
    * @defaultValue 'rgba(0,0,0,.5)'
    */
  /**
    * @language en-US
    * @description the color of middle power
    * @types number
    * @defaultValue 'rgba(0,0,0,.5)'
    */
  var middleColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 自定义电量的颜色分配规则
    * @types number
    * @defaultValue 'rgba(0,0,0,.5)'
    */
  /**
    * @language en-US
    * @description Customize the color distribution rules of the battery
    * @types number
    * @defaultValue 'rgba(0,0,0,.5)'
    */
  var onCalcColor: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 电池尺寸
    * @types number
    * @defaultValue cx(10)
    */
  /**
    * @language en-US
    * @description the size of battery
    * @types number
    * @defaultValue cx(10)
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 主题配置
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Theme configuration
    * @defaultValue {}
    */
  var theme: js.UndefOr[BatteryColor] = js.undefined
  
  /**
    * @language zh-CN
    * @description 电量
    * @types number
    * @defaultValue 'rgba(0,0,0,.5)'
    */
  /**
    * @language en-US
    * @description the value of battery power
    * @types number
    * @defaultValue 'rgba(0,0,0,.5)'
    */
  var value: js.UndefOr[Double] = js.undefined
}
object BatteryProps {
  
  inline def apply(): BatteryProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatteryProps]
  }
  
  extension [Self <: BatteryProps](x: Self) {
    
    inline def setBatteryColor(value: String): Self = StObject.set(x, "batteryColor", value.asInstanceOf[js.Any])
    
    inline def setBatteryColorUndefined: Self = StObject.set(x, "batteryColor", js.undefined)
    
    inline def setHighColor(value: String): Self = StObject.set(x, "highColor", value.asInstanceOf[js.Any])
    
    inline def setHighColorUndefined: Self = StObject.set(x, "highColor", js.undefined)
    
    inline def setLowColor(value: String): Self = StObject.set(x, "lowColor", value.asInstanceOf[js.Any])
    
    inline def setLowColorUndefined: Self = StObject.set(x, "lowColor", js.undefined)
    
    inline def setMiddleColor(value: String): Self = StObject.set(x, "middleColor", value.asInstanceOf[js.Any])
    
    inline def setMiddleColorUndefined: Self = StObject.set(x, "middleColor", js.undefined)
    
    inline def setOnCalcColor(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onCalcColor", js.Any.fromFunction1(value))
    
    inline def setOnCalcColorUndefined: Self = StObject.set(x, "onCalcColor", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTheme(value: BatteryColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
