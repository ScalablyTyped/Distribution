package typings.tslint.blockExclusionMod

import typings.tslint.completedDocsRuleMod.Visibility
import typings.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBlockExclusionDescriptor extends ExclusionDescriptor {
  
  var visibilities: js.UndefOr[js.Array[Visibility]] = js.native
}
object IBlockExclusionDescriptor {
  
  @scala.inline
  def apply(): IBlockExclusionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBlockExclusionDescriptor]
  }
  
  @scala.inline
  implicit class IBlockExclusionDescriptorOps[Self <: IBlockExclusionDescriptor] (val x: Self) extends AnyVal {
    
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
    def setVisibilitiesVarargs(value: Visibility*): Self = this.set("visibilities", js.Array(value :_*))
    
    @scala.inline
    def setVisibilities(value: js.Array[Visibility]): Self = this.set("visibilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibilities: Self = this.set("visibilities", js.undefined)
  }
}
