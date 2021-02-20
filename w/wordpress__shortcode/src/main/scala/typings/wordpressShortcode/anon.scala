package typings.wordpressShortcode

import typings.std.Record
import typings.wordpressShortcode.mod.ShortcodeAttrs
import typings.wordpressShortcode.wordpressShortcodeStrings.`self-closing`
import typings.wordpressShortcode.wordpressShortcodeStrings.closed
import typings.wordpressShortcode.wordpressShortcodeStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attrs extends StObject {
    
    var attrs: ShortcodeAttrs = js.native
    
    var tag: String = js.native
  }
  object Attrs {
    
    @scala.inline
    def apply(attrs: ShortcodeAttrs, tag: String): Attrs = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attrs]
    }
    
    @scala.inline
    implicit class AttrsMutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: ShortcodeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    /**
      * Parse shortcode attributes.
      *
      * @remarks
      * Shortcodes accept many types of attributes. These can chiefly be divided into
      * named and numeric attributes:
      *
      * Named attributes are assigned on a key/value basis, while numeric attributes
      * are treated as an array.
      *
      * Named attributes can be formatted as either `name="value"`, `name='value'`,
      * or `name=value`. Numeric attributes can be formatted as `"value"` or just
      * `value`.
      *
      * @param text - Serialised shortcode attributes.
      *
      * @returns Parsed shortcode attributes.
      */
    def apply(text: String): ShortcodeAttrs = js.native
    
    /**
      * Used to clear the memoized cache of this function.
      */
    def clear(): Unit = js.native
  }
  
  @js.native
  trait Content extends StObject {
    
    var content: String = js.native
    
    var `type`: closed = js.native
  }
  object Content {
    
    @scala.inline
    def apply(content: String, `type`: closed): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: closed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@wordpress/shortcode.@wordpress/shortcode.ShortcodeAttrs> */
  @js.native
  trait PartialShortcodeAttrs extends StObject {
    
    var named: js.UndefOr[Record[String, js.UndefOr[String]]] = js.native
    
    var numeric: js.UndefOr[js.Array[String]] = js.native
  }
  object PartialShortcodeAttrs {
    
    @scala.inline
    def apply(): PartialShortcodeAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialShortcodeAttrs]
    }
    
    @scala.inline
    implicit class PartialShortcodeAttrsMutableBuilder[Self <: PartialShortcodeAttrs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamed(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedUndefined: Self = StObject.set(x, "named", js.undefined)
      
      @scala.inline
      def setNumeric(value: js.Array[String]): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      @scala.inline
      def setNumericVarargs(value: String*): Self = StObject.set(x, "numeric", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<@wordpress/shortcode.@wordpress/shortcode.ShortcodeOptions> */
  @js.native
  trait PartialShortcodeOptions extends StObject {
    
    var attrs: js.UndefOr[PartialShortcodeAttrs | String] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[closed | `self-closing` | single] = js.native
  }
  object PartialShortcodeOptions {
    
    @scala.inline
    def apply(): PartialShortcodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialShortcodeOptions]
    }
    
    @scala.inline
    implicit class PartialShortcodeOptionsMutableBuilder[Self <: PartialShortcodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: PartialShortcodeAttrs | String): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setType(value: closed | `self-closing` | single): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: `self-closing` | single = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: `self-closing` | single): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: `self-closing` | single): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
