package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.TopLevel
import typings.wordpressBlocks.anon.Default
import typings.wordpressBlocks.anon.DefaultType
import typings.wordpressBlocks.anon.Source
import typings.wordpressBlocks.anon.Type
import typings.wordpressBlocks.anon.`1`
import typings.wordpressBlocks.wordpressBlocksStrings.array
import typings.wordpressBlocks.wordpressBlocksStrings.html
import typings.wordpressBlocks.wordpressBlocksStrings.li
import typings.wordpressBlocks.wordpressBlocksStrings.meta
import typings.wordpressBlocks.wordpressBlocksStrings.p
import typings.wordpressBlocks.wordpressBlocksStrings.query_
import typings.wordpressBlocks.wordpressBlocksStrings.string
import typings.wordpressBlocks.wordpressBlocksStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AttributeSource {
  
  type Attribute = typings.wordpressBlocks.anon.Attribute & (Default | Type | DefaultType)
  
  trait Children
    extends StObject
       with _BlockAttribute[js.Any] {
    
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
    
    extension [Self <: Children](x: Self) {
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSource(value: typings.wordpressBlocks.wordpressBlocksStrings.children): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait HTML
    extends StObject
       with _BlockAttribute[js.Any] {
    
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
    
    extension [Self <: HTML](x: Self) {
      
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
       with _BlockAttribute[js.Any] {
    
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
    
    extension [Self <: Meta](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setSource(value: meta): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type None = Source & (`1` | Default | Type | DefaultType)
  
  trait Query[T]
    extends StObject
       with _BlockAttribute[T] {
    
    var default: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var query: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
      */ typings.wordpressBlocks.wordpressBlocksStrings.Query & TopLevel[js.Any]
    
    var selector: String
    
    var source: query_
    
    var `type`: array
  }
  object Query {
    
    inline def apply[T](
      query: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
      */ typings.wordpressBlocks.wordpressBlocksStrings.Query & TopLevel[js.Any],
      selector: String
    ): Query[T] = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], source = "query")
      __obj.updateDynamic("type")("array")
      __obj.asInstanceOf[Query[T]]
    }
    
    extension [Self <: Query[?], T](x: Self & Query[T]) {
      
      inline def setDefault(value: js.Array[js.Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: js.Any*): Self = StObject.set(x, "default", js.Array(value :_*))
      
      inline def setQuery(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
        */ typings.wordpressBlocks.wordpressBlocksStrings.Query & TopLevel[js.Any]
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSource(value: query_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text
    extends StObject
       with _BlockAttribute[js.Any] {
    
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
    
    extension [Self <: Text](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSource(value: text): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
