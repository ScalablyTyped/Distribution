package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of HTML conversion settings. */
trait HtmlSettings extends StObject {
  
  var exclude_content: js.UndefOr[XPathPatterns] = js.undefined
  
  /** Array of HTML tag attributes to exclude. */
  var exclude_tag_attributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Array of HTML tags that are excluded completely. */
  var exclude_tags_completely: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Array of HTML tags which are excluded but still retain content. */
  var exclude_tags_keep_content: js.UndefOr[js.Array[String]] = js.undefined
  
  var keep_content: js.UndefOr[XPathPatterns] = js.undefined
  
  /** An array of HTML tag attributes to keep in the converted document. */
  var keep_tag_attributes: js.UndefOr[js.Array[String]] = js.undefined
}
object HtmlSettings {
  
  inline def apply(): HtmlSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlSettings]
  }
  
  extension [Self <: HtmlSettings](x: Self) {
    
    inline def setExclude_content(value: XPathPatterns): Self = StObject.set(x, "exclude_content", value.asInstanceOf[js.Any])
    
    inline def setExclude_contentUndefined: Self = StObject.set(x, "exclude_content", js.undefined)
    
    inline def setExclude_tag_attributes(value: js.Array[String]): Self = StObject.set(x, "exclude_tag_attributes", value.asInstanceOf[js.Any])
    
    inline def setExclude_tag_attributesUndefined: Self = StObject.set(x, "exclude_tag_attributes", js.undefined)
    
    inline def setExclude_tag_attributesVarargs(value: String*): Self = StObject.set(x, "exclude_tag_attributes", js.Array(value :_*))
    
    inline def setExclude_tags_completely(value: js.Array[String]): Self = StObject.set(x, "exclude_tags_completely", value.asInstanceOf[js.Any])
    
    inline def setExclude_tags_completelyUndefined: Self = StObject.set(x, "exclude_tags_completely", js.undefined)
    
    inline def setExclude_tags_completelyVarargs(value: String*): Self = StObject.set(x, "exclude_tags_completely", js.Array(value :_*))
    
    inline def setExclude_tags_keep_content(value: js.Array[String]): Self = StObject.set(x, "exclude_tags_keep_content", value.asInstanceOf[js.Any])
    
    inline def setExclude_tags_keep_contentUndefined: Self = StObject.set(x, "exclude_tags_keep_content", js.undefined)
    
    inline def setExclude_tags_keep_contentVarargs(value: String*): Self = StObject.set(x, "exclude_tags_keep_content", js.Array(value :_*))
    
    inline def setKeep_content(value: XPathPatterns): Self = StObject.set(x, "keep_content", value.asInstanceOf[js.Any])
    
    inline def setKeep_contentUndefined: Self = StObject.set(x, "keep_content", js.undefined)
    
    inline def setKeep_tag_attributes(value: js.Array[String]): Self = StObject.set(x, "keep_tag_attributes", value.asInstanceOf[js.Any])
    
    inline def setKeep_tag_attributesUndefined: Self = StObject.set(x, "keep_tag_attributes", js.undefined)
    
    inline def setKeep_tag_attributesVarargs(value: String*): Self = StObject.set(x, "keep_tag_attributes", js.Array(value :_*))
  }
}
