package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends js.Object {
  
  var meta_description: js.UndefOr[Nullable[String]] = js.native
  
  var meta_title: js.UndefOr[Nullable[String]] = js.native
}
object Metadata {
  
  @scala.inline
  def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    
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
    def setMeta_description(value: Nullable[String]): Self = this.set("meta_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta_description: Self = this.set("meta_description", js.undefined)
    
    @scala.inline
    def setMeta_descriptionNull: Self = this.set("meta_description", null)
    
    @scala.inline
    def setMeta_title(value: Nullable[String]): Self = this.set("meta_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta_title: Self = this.set("meta_title", js.undefined)
    
    @scala.inline
    def setMeta_titleNull: Self = this.set("meta_title", null)
  }
}
