package typings.tslint.constructorExclusionMod

import typings.tslint.completedDocsRuleMod.Privacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConstructorExclusionDescriptor extends js.Object {
  
  var privacies: js.UndefOr[js.Array[Privacy]] = js.native
}
object IConstructorExclusionDescriptor {
  
  @scala.inline
  def apply(): IConstructorExclusionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstructorExclusionDescriptor]
  }
  
  @scala.inline
  implicit class IConstructorExclusionDescriptorOps[Self <: IConstructorExclusionDescriptor] (val x: Self) extends AnyVal {
    
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
    def setPrivaciesVarargs(value: Privacy*): Self = this.set("privacies", js.Array(value :_*))
    
    @scala.inline
    def setPrivacies(value: js.Array[Privacy]): Self = this.set("privacies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacies: Self = this.set("privacies", js.undefined)
  }
}
