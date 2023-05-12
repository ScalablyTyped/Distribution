package typings.wordpressRichText

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedFormatConfiguration
  extends StObject
     with FormatConfiguration {
  
  var name: String
}
object NamedFormatConfiguration {
  
  inline def apply(
    edit: ComponentType[FormatProps],
    name: String,
    tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wordpressRichText.wordpressRichTextStrings.a, typings.wordpressRichText.wordpressRichTextStrings.abbr, typings.wordpressRichText.wordpressRichTextStrings.address */ Any) & String,
    title: String
  ): NamedFormatConfiguration = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], className = null)
    __obj.asInstanceOf[NamedFormatConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedFormatConfiguration] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
