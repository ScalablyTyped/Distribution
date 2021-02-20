package typings.victory.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VictoryStyleInterface extends StObject {
  
  var data: js.UndefOr[VictoryStyleObject] = js.native
  
  var labels: js.UndefOr[VictoryStyleObject] = js.native
  
  var parent: js.UndefOr[VictoryStyleObject] = js.native
}
object VictoryStyleInterface {
  
  @scala.inline
  def apply(): VictoryStyleInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryStyleInterface]
  }
  
  @scala.inline
  implicit class VictoryStyleInterfaceMutableBuilder[Self <: VictoryStyleInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: VictoryStyleObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLabels(value: VictoryStyleObject): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setParent(value: VictoryStyleObject): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
