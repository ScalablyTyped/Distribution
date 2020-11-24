package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A collection of PerceptionCorrelations describing multiple unique providers in a common coordinate frame. */
@js.native
trait PerceptionCorrelationGroup extends js.Object {
  
  /** The collection of PerceptionCorrelations describing multiple unique providers in a common coordinate frame. */
  var relativeLocations: IVectorView[PerceptionCorrelation] = js.native
}
object PerceptionCorrelationGroup {
  
  @scala.inline
  def apply(relativeLocations: IVectorView[PerceptionCorrelation]): PerceptionCorrelationGroup = {
    val __obj = js.Dynamic.literal(relativeLocations = relativeLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionCorrelationGroup]
  }
  
  @scala.inline
  implicit class PerceptionCorrelationGroupOps[Self <: PerceptionCorrelationGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRelativeLocations(value: IVectorView[PerceptionCorrelation]): Self = this.set("relativeLocations", value.asInstanceOf[js.Any])
  }
}
