package typings.wordpressRichText

import typings.std.Record
import typings.wordpressRichText.anon.Element
import typings.wordpressRichText.anon.Html
import typings.wordpressRichText.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMod {
  
  @JSImport("@wordpress/rich-text/create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Value]
  inline def create(args: Element): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def create(args: Html): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def create(args: Text): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  trait Format extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var `object`: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
    
    var unregisteredAttributes: js.UndefOr[Record[String, String]] = js.undefined
  }
  object Format {
    
    inline def apply(`type`: String): Format = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setObject(value: Boolean): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnregisteredAttributes(value: Record[String, String]): Self = StObject.set(x, "unregisteredAttributes", value.asInstanceOf[js.Any])
      
      inline def setUnregisteredAttributesUndefined: Self = StObject.set(x, "unregisteredAttributes", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    var activeFormats: js.UndefOr[js.Array[Format]] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var formats: js.Array[js.UndefOr[js.Array[Format]]]
    
    var replacements: js.Array[js.UndefOr[js.Array[Format]]]
    
    var start: js.UndefOr[Double] = js.undefined
    
    var text: String
  }
  object Value {
    
    inline def apply(
      formats: js.Array[js.UndefOr[js.Array[Format]]],
      replacements: js.Array[js.UndefOr[js.Array[Format]]],
      text: String
    ): Value = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], replacements = replacements.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setActiveFormats(value: js.Array[Format]): Self = StObject.set(x, "activeFormats", value.asInstanceOf[js.Any])
      
      inline def setActiveFormatsUndefined: Self = StObject.set(x, "activeFormats", js.undefined)
      
      inline def setActiveFormatsVarargs(value: Format*): Self = StObject.set(x, "activeFormats", js.Array(value*))
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFormats(value: js.Array[js.UndefOr[js.Array[Format]]]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsVarargs(value: js.UndefOr[js.Array[Format]]*): Self = StObject.set(x, "formats", js.Array(value*))
      
      inline def setReplacements(value: js.Array[js.UndefOr[js.Array[Format]]]): Self = StObject.set(x, "replacements", value.asInstanceOf[js.Any])
      
      inline def setReplacementsVarargs(value: js.UndefOr[js.Array[Format]]*): Self = StObject.set(x, "replacements", js.Array(value*))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
