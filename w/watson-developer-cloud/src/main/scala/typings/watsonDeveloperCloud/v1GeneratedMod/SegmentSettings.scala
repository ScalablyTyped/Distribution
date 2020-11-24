package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of Document Segmentation settings. */
@js.native
trait SegmentSettings extends js.Object {
  
  /** Enables/disables the Document Segmentation feature. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Defines the heading level that splits into document segments. Valid values are h1, h2, h3, h4, h5, h6. The content of the header field that the segmentation splits at is used as the **title** field for that segmented result. */
  var selector_tags: js.UndefOr[js.Array[String]] = js.native
}
object SegmentSettings {
  
  @scala.inline
  def apply(): SegmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentSettings]
  }
  
  @scala.inline
  implicit class SegmentSettingsOps[Self <: SegmentSettings] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setSelector_tagsVarargs(value: String*): Self = this.set("selector_tags", js.Array(value :_*))
    
    @scala.inline
    def setSelector_tags(value: js.Array[String]): Self = this.set("selector_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector_tags: Self = this.set("selector_tags", js.undefined)
  }
}
