package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISystemConditionFactory extends StObject {
  
  def create(conditionType: SystemConditionType): SystemCondition
}
object ISystemConditionFactory {
  
  inline def apply(create: SystemConditionType => SystemCondition): ISystemConditionFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ISystemConditionFactory]
  }
  
  extension [Self <: ISystemConditionFactory](x: Self) {
    
    inline def setCreate(value: SystemConditionType => SystemCondition): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
