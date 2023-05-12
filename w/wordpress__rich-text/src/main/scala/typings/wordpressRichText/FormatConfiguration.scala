package typings.wordpressRichText

import typings.react.mod.ComponentType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatConfiguration extends StObject {
  
  /**
    * Maps react prop name to html attribute name.
    *
    * { className: 'class' } => <tag class={<className attr here>}></tag>
    */
  var attributes: js.UndefOr[Record[String, String]] = js.undefined
  
  var className: String | Null
  
  var edit: ComponentType[FormatProps]
  
  var keywords: js.UndefOr[
    js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String])
  ] = js.undefined
  
  var `object`: js.UndefOr[Boolean] = js.undefined
  
  var tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any) & String
  
  var title: String
}
object FormatConfiguration {
  
  inline def apply(
    edit: ComponentType[FormatProps],
    tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any) & String,
    title: String
  ): FormatConfiguration = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], className = null)
    __obj.asInstanceOf[FormatConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameNull: Self = StObject.set(x, "className", null)
    
    inline def setEdit(value: ComponentType[FormatProps]): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setKeywords(value: js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String])): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setObject(value: Boolean): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setTagName(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any) & String
    ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
