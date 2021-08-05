package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionStatistic extends StObject {
  
  var statisticName: String
  
  var value: Double
}
object ExtensionStatistic {
  
  inline def apply(statisticName: String, value: Double): ExtensionStatistic = {
    val __obj = js.Dynamic.literal(statisticName = statisticName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionStatistic]
  }
  
  extension [Self <: ExtensionStatistic](x: Self) {
    
    inline def setStatisticName(value: String): Self = StObject.set(x, "statisticName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
