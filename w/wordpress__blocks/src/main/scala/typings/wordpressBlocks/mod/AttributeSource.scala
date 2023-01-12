package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.array
import typings.wordpressBlocks.wordpressBlocksStrings.html
import typings.wordpressBlocks.wordpressBlocksStrings.li
import typings.wordpressBlocks.wordpressBlocksStrings.meta
import typings.wordpressBlocks.wordpressBlocksStrings.p
import typings.wordpressBlocks.wordpressBlocksStrings.query
import typings.wordpressBlocks.wordpressBlocksStrings.string
import typings.wordpressBlocks.wordpressBlocksStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AttributeSource {
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressBlocks.anon.typebooleandefaultboolean
    - typings.wordpressBlocks.anon.typenumberdefaultnumberun
    - typings.wordpressBlocks.anon.typestringdefaultstringun
  */
  trait Attribute
    extends StObject
       with BlockAttribute[Any]
  object Attribute {
    
    inline def typebooleandefaultboolean(attribute: String): typings.wordpressBlocks.anon.typebooleandefaultboolean = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = "attribute")
      __obj.updateDynamic("type")("boolean")
      __obj.asInstanceOf[typings.wordpressBlocks.anon.typebooleandefaultboolean]
    }
    
    inline def typenumberdefaultnumberun(attribute: String): typings.wordpressBlocks.anon.typenumberdefaultnumberun = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = "attribute")
      __obj.updateDynamic("type")("number")
      __obj.asInstanceOf[typings.wordpressBlocks.anon.typenumberdefaultnumberun]
    }
    
    inline def typestringdefaultstringun(attribute: String): typings.wordpressBlocks.anon.typestringdefaultstringun = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = "attribute")
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[typings.wordpressBlocks.anon.typestringdefaultstringun]
    }
  }
  
  trait Children
    extends StObject
       with BlockAttribute[Any] {
    
    var selector: js.UndefOr[String] = js.undefined
    
    var source: typings.wordpressBlocks.wordpressBlocksStrings.children
    
    var `type`: array
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal(source = "children")
      __obj.updateDynamic("type")("array")
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSource(value: typings.wordpressBlocks.wordpressBlocksStrings.children): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait HTML
    extends StObject
       with BlockAttribute[Any] {
    
    var default: js.UndefOr[String] = js.undefined
    
    var multiline: js.UndefOr[li | p] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var source: html
    
    var `type`: string
  }
  object HTML {
    
    inline def apply(): HTML = {
      val __obj = js.Dynamic.literal(source = "html")
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[HTML]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HTML] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setMultiline(value: li | p): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSource(value: html): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Meta
    extends StObject
       with BlockAttribute[Any] {
    
    var default: js.UndefOr[String] = js.undefined
    
    var meta: String
    
    var source: meta
    
    var `type`: string
  }
  object Meta {
    
    inline def apply(meta: String): Meta = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], source = "meta")
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[Meta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setSource(value: meta): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressBlocks.anon.typearraydefaultArrayanyu
    - typings.wordpressBlocks.anon.typeobjectdefaultobjectun
    - typings.wordpressBlocks.anon.typebooleandefaultbooleanDefault
    - typings.wordpressBlocks.anon.typenumberdefaultnumberunDefault
    - typings.wordpressBlocks.anon.typestringdefaultstringunDefault
    - typings.wordpressBlocks.wordpressBlocksStrings.array
    - typings.wordpressBlocks.wordpressBlocksStrings.`object`
    - typings.wordpressBlocks.wordpressBlocksStrings.boolean
    - typings.wordpressBlocks.wordpressBlocksStrings.number
    - typings.wordpressBlocks.wordpressBlocksStrings.string
  */
  trait None
    extends StObject
       with BlockAttribute[Any]
  
  trait Query[T]
    extends StObject
       with BlockAttribute[T] {
    
    var default: js.UndefOr[js.Array[Any]] = js.undefined
    
    var query: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? U : T[k]>} */ js.Any
    
    var selector: String
    
    var source: query
    
    var `type`: array
  }
  object Query {
    
    inline def apply[T](
      query: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? U : T[k]>} */ js.Any,
      selector: String
    ): Query[T] = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], source = "query")
      __obj.updateDynamic("type")("array")
      __obj.asInstanceOf[Query[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Query[?], T] (val x: Self & Query[T]) extends AnyVal {
      
      inline def setDefault(value: js.Array[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: Any*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setQuery(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? U : T[k]>} */ js.Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSource(value: query): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text
    extends StObject
       with BlockAttribute[Any] {
    
    var default: js.UndefOr[String] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var source: text
    
    var `type`: string
  }
  object Text {
    
    inline def apply(): Text = {
      val __obj = js.Dynamic.literal(source = "text")
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSource(value: text): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
