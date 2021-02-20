package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of Document Segmentation settings. */
@js.native
trait SegmentSettings extends StObject {
  
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
  implicit class SegmentSettingsMutableBuilder[Self <: SegmentSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setSelector_tags(value: js.Array[String]): Self = StObject.set(x, "selector_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector_tagsUndefined: Self = StObject.set(x, "selector_tags", js.undefined)
    
    @scala.inline
    def setSelector_tagsVarargs(value: String*): Self = StObject.set(x, "selector_tags", js.Array(value :_*))
  }
}
