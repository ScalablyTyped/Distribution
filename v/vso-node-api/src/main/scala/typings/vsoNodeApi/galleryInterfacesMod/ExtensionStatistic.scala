package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionStatistic extends StObject {
  
  var statisticName: String = js.native
  
  var value: Double = js.native
}
object ExtensionStatistic {
  
  @scala.inline
  def apply(statisticName: String, value: Double): ExtensionStatistic = {
    val __obj = js.Dynamic.literal(statisticName = statisticName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionStatistic]
  }
  
  @scala.inline
  implicit class ExtensionStatisticMutableBuilder[Self <: ExtensionStatistic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatisticName(value: String): Self = StObject.set(x, "statisticName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
