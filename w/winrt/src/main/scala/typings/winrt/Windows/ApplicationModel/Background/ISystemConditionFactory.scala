package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISystemConditionFactory extends StObject {
  
  def create(conditionType: SystemConditionType): SystemCondition = js.native
}
object ISystemConditionFactory {
  
  @scala.inline
  def apply(create: SystemConditionType => SystemCondition): ISystemConditionFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ISystemConditionFactory]
  }
  
  @scala.inline
  implicit class ISystemConditionFactoryMutableBuilder[Self <: ISystemConditionFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: SystemConditionType => SystemCondition): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
