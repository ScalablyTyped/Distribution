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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AttributeSource {
  
  type Attribute = typings.wordpressBlocks.anon.Attribute with (Default | Type | DefaultType)
  
  @js.native
  trait Children
    extends _BlockAttribute[js.Any] {
    
    var selector: js.UndefOr[String] = js.native
    
    var source: typings.wordpressBlocks.wordpressBlocksStrings.children = js.native
    
    var `type`: array = js.native
  }
  object Children {
    
    @scala.inline
    def apply(source: typings.wordpressBlocks.wordpressBlocksStrings.children, `type`: array): Children = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setSource(value: typings.wordpressBlocks.wordpressBlocksStrings.children): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HTML
    extends _BlockAttribute[js.Any] {
    
    var default: js.UndefOr[String] = js.native
    
    var multiline: js.UndefOr[li | p] = js.native
    
    var selector: js.UndefOr[String] = js.native
    
    var source: html = js.native
    
    var `type`: string = js.native
  }
  object HTML {
    
    @scala.inline
    def apply(source: html, `type`: string): HTML = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTML]
    }
    
    @scala.inline
    implicit class HTMLMutableBuilder[Self <: HTML] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setMultiline(value: li | p): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setSource(value: html): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Meta
    extends _BlockAttribute[js.Any] {
    
    var default: js.UndefOr[String] = js.native
    
    var meta: String = js.native
    
    var source: meta = js.native
    
    var `type`: string = js.native
  }
  object Meta {
    
    @scala.inline
    def apply(meta: String, source: meta, `type`: string): Meta = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    @scala.inline
    implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: meta): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type None = Source with (`1` | Default | Type | DefaultType)
  
  @js.native
  trait Query[T] extends _BlockAttribute[T] {
    
    var default: js.UndefOr[js.Array[_]] = js.native
    
    var query: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
      */ typings.wordpressBlocks.wordpressBlocksStrings.Query with TopLevel[js.Any] = js.native
    
    var selector: String = js.native
    
    var source: query_ = js.native
    
    var `type`: array = js.native
  }
  object Query {
    
    @scala.inline
    def apply[T](
      query: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
      */ typings.wordpressBlocks.wordpressBlocksStrings.Query with TopLevel[js.Any],
      selector: String,
      source: query_,
      `type`: array
    ): Query[T] = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query[T]]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query[_], T] (val x: Self with Query[T]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Array[_]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultVarargs(value: js.Any*): Self = StObject.set(x, "default", js.Array(value :_*))
      
      @scala.inline
      def setQuery(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
        */ typings.wordpressBlocks.wordpressBlocksStrings.Query with TopLevel[js.Any]
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: query_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Text
    extends _BlockAttribute[js.Any] {
    
    var default: js.UndefOr[String] = js.native
    
    var selector: js.UndefOr[String] = js.native
    
    var source: text = js.native
    
    var `type`: string = js.native
  }
  object Text {
    
    @scala.inline
    def apply(source: text, `type`: string): Text = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setSource(value: text): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
