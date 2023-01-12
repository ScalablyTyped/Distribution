package typings.wordpressShortcode

import typings.std.Record
import typings.wordpressShortcode.mod.ShortcodeAttrs
import typings.wordpressShortcode.mod.Shortcode_
import typings.wordpressShortcode.wordpressShortcodeStrings.`self-closing`
import typings.wordpressShortcode.wordpressShortcodeStrings.closed
import typings.wordpressShortcode.wordpressShortcodeStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
  
  /* Inlined std.Partial<@wordpress/shortcode.@wordpress/shortcode.ShortcodeAttrs> */
  trait PartialShortcodeAttrs extends StObject {
    
    var named: js.UndefOr[Record[String, js.UndefOr[String]]] = js.undefined
    
    var numeric: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PartialShortcodeAttrs {
    
    inline def apply(): PartialShortcodeAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialShortcodeAttrs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialShortcodeAttrs] (val x: Self) extends AnyVal {
      
      inline def setNamed(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setNamedUndefined: Self = StObject.set(x, "named", js.undefined)
      
      inline def setNumeric(value: js.Array[String]): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      inline def setNumericVarargs(value: String*): Self = StObject.set(x, "numeric", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@wordpress/shortcode.@wordpress/shortcode.ShortcodeOptions> */
  trait PartialShortcodeOptions extends StObject {
    
    var attrs: js.UndefOr[PartialShortcodeAttrs | String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[closed | `self-closing` | single] = js.undefined
  }
  object PartialShortcodeOptions {
    
    inline def apply(): PartialShortcodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialShortcodeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialShortcodeOptions] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: PartialShortcodeAttrs | String): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setType(value: closed | `self-closing` | single): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined {  type :'closed',   content :string} & {  attrs :@wordpress/shortcode.@wordpress/shortcode.ShortcodeAttrs,   tag :string} */
  trait typeclosedcontentstringat
    extends StObject
       with Shortcode_ {
    
    var attrs: ShortcodeAttrs
    
    var content: String
    
    var tag: String
    
    var `type`: closed
  }
  object typeclosedcontentstringat {
    
    inline def apply(attrs: ShortcodeAttrs, content: String, tag: String): typeclosedcontentstringat = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("closed")
      __obj.asInstanceOf[typeclosedcontentstringat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typeclosedcontentstringat] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: ShortcodeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setType(value: closed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  type :'self-closing' | 'single'} & {  attrs :@wordpress/shortcode.@wordpress/shortcode.ShortcodeAttrs,   tag :string} */
  trait typeselfclosingsingleattr
    extends StObject
       with Shortcode_ {
    
    var attrs: ShortcodeAttrs
    
    var tag: String
    
    var `type`: `self-closing` | single
  }
  object typeselfclosingsingleattr {
    
    inline def apply(attrs: ShortcodeAttrs, tag: String, `type`: `self-closing` | single): typeselfclosingsingleattr = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typeselfclosingsingleattr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typeselfclosingsingleattr] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: ShortcodeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setType(value: `self-closing` | single): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
