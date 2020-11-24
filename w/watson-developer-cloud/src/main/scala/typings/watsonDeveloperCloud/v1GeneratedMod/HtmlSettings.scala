package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of HTML conversion settings. */
@js.native
trait HtmlSettings extends js.Object {
  
  var exclude_content: js.UndefOr[XPathPatterns] = js.native
  
  /** Array of HTML tag attributes to exclude. */
  var exclude_tag_attributes: js.UndefOr[js.Array[String]] = js.native
  
  /** Array of HTML tags that are excluded completely. */
  var exclude_tags_completely: js.UndefOr[js.Array[String]] = js.native
  
  /** Array of HTML tags which are excluded but still retain content. */
  var exclude_tags_keep_content: js.UndefOr[js.Array[String]] = js.native
  
  var keep_content: js.UndefOr[XPathPatterns] = js.native
  
  /** An array of HTML tag attributes to keep in the converted document. */
  var keep_tag_attributes: js.UndefOr[js.Array[String]] = js.native
}
object HtmlSettings {
  
  @scala.inline
  def apply(): HtmlSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlSettings]
  }
  
  @scala.inline
  implicit class HtmlSettingsOps[Self <: HtmlSettings] (val x: Self) extends AnyVal {
    
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
    def setExclude_content(value: XPathPatterns): Self = this.set("exclude_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude_content: Self = this.set("exclude_content", js.undefined)
    
    @scala.inline
    def setExclude_tag_attributesVarargs(value: String*): Self = this.set("exclude_tag_attributes", js.Array(value :_*))
    
    @scala.inline
    def setExclude_tag_attributes(value: js.Array[String]): Self = this.set("exclude_tag_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude_tag_attributes: Self = this.set("exclude_tag_attributes", js.undefined)
    
    @scala.inline
    def setExclude_tags_completelyVarargs(value: String*): Self = this.set("exclude_tags_completely", js.Array(value :_*))
    
    @scala.inline
    def setExclude_tags_completely(value: js.Array[String]): Self = this.set("exclude_tags_completely", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude_tags_completely: Self = this.set("exclude_tags_completely", js.undefined)
    
    @scala.inline
    def setExclude_tags_keep_contentVarargs(value: String*): Self = this.set("exclude_tags_keep_content", js.Array(value :_*))
    
    @scala.inline
    def setExclude_tags_keep_content(value: js.Array[String]): Self = this.set("exclude_tags_keep_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude_tags_keep_content: Self = this.set("exclude_tags_keep_content", js.undefined)
    
    @scala.inline
    def setKeep_content(value: XPathPatterns): Self = this.set("keep_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep_content: Self = this.set("keep_content", js.undefined)
    
    @scala.inline
    def setKeep_tag_attributesVarargs(value: String*): Self = this.set("keep_tag_attributes", js.Array(value :_*))
    
    @scala.inline
    def setKeep_tag_attributes(value: js.Array[String]): Self = this.set("keep_tag_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep_tag_attributes: Self = this.set("keep_tag_attributes", js.undefined)
  }
}
