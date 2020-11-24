package typings.tslint.tagExclusionMod

import typings.tslint.anon.Content
import typings.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITagExclusionDescriptor extends ExclusionDescriptor {
  
  var tags: js.UndefOr[Content] = js.native
}
object ITagExclusionDescriptor {
  
  @scala.inline
  def apply(): ITagExclusionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITagExclusionDescriptor]
  }
  
  @scala.inline
  implicit class ITagExclusionDescriptorOps[Self <: ITagExclusionDescriptor] (val x: Self) extends AnyVal {
    
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
    def setTags(value: Content): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
