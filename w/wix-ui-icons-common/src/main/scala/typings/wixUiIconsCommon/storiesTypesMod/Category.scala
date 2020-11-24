package typings.wixUiIconsCommon.storiesTypesMod

import typings.wixUiIconsCommon.typesMod.IconMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Category extends js.Object {
  
  var iconsMetadata: js.Array[IconMetadata] = js.native
  
  var title: String = js.native
}
object Category {
  
  @scala.inline
  def apply(iconsMetadata: js.Array[IconMetadata], title: String): Category = {
    val __obj = js.Dynamic.literal(iconsMetadata = iconsMetadata.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
    
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
    def setIconsMetadataVarargs(value: IconMetadata*): Self = this.set("iconsMetadata", js.Array(value :_*))
    
    @scala.inline
    def setIconsMetadata(value: js.Array[IconMetadata]): Self = this.set("iconsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
