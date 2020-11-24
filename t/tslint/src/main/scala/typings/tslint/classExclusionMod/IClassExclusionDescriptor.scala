package typings.tslint.classExclusionMod

import typings.tslint.completedDocsRuleMod.Location
import typings.tslint.completedDocsRuleMod.Privacy
import typings.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClassExclusionDescriptor extends ExclusionDescriptor {
  
  var locations: js.UndefOr[js.Array[Location]] = js.native
  
  var privacies: js.UndefOr[js.Array[Privacy]] = js.native
}
object IClassExclusionDescriptor {
  
  @scala.inline
  def apply(): IClassExclusionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClassExclusionDescriptor]
  }
  
  @scala.inline
  implicit class IClassExclusionDescriptorOps[Self <: IClassExclusionDescriptor] (val x: Self) extends AnyVal {
    
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
    def setLocationsVarargs(value: Location*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[Location]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setPrivaciesVarargs(value: Privacy*): Self = this.set("privacies", js.Array(value :_*))
    
    @scala.inline
    def setPrivacies(value: js.Array[Privacy]): Self = this.set("privacies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacies: Self = this.set("privacies", js.undefined)
  }
}
