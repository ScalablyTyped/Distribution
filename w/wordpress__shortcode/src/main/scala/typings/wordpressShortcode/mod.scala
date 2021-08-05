package typings.wordpressShortcode

import typings.std.Record
import typings.std.RegExp
import typings.std.RegExpMatchArray
import typings.wordpressShortcode.anon.Attrs
import typings.wordpressShortcode.anon.Call
import typings.wordpressShortcode.anon.Content
import typings.wordpressShortcode.anon.PartialShortcodeAttrs
import typings.wordpressShortcode.anon.PartialShortcodeOptions
import typings.wordpressShortcode.anon.Type
import typings.wordpressShortcode.wordpressShortcodeStrings.`self-closing`
import typings.wordpressShortcode.wordpressShortcodeStrings.closed
import typings.wordpressShortcode.wordpressShortcodeStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/shortcode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/shortcode", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with shortcode {
    def this(options: PartialShortcodeOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@wordpress/shortcode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/shortcode", "default.attrs")
    @js.native
    def attrs: Call = js.native
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
    inline def attrs(text: String): ShortcodeAttrs = ^.asInstanceOf[js.Dynamic].applyDynamic("attrs")(text.asInstanceOf[js.Any]).asInstanceOf[ShortcodeAttrs]
    inline def attrs_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attrs")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/shortcode", "default.fromMatch")
    @js.native
    def fromMatch: js.Function1[/* match */ RegExpMatchArray, Shortcode_] = js.native
    inline def fromMatch(`match`: RegExpMatchArray): Shortcode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatch")(`match`.asInstanceOf[js.Any]).asInstanceOf[Shortcode_]
    inline def fromMatch_=(x: js.Function1[/* match */ RegExpMatchArray, Shortcode_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMatch")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/shortcode", "default.next")
    @js.native
    def next: js.Function3[
        /* tag */ String, 
        /* text */ String, 
        /* index */ js.UndefOr[Double], 
        js.UndefOr[ShortcodeMatch]
      ] = js.native
    inline def next(tag: String, text: String): js.UndefOr[ShortcodeMatch] = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(tag.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ShortcodeMatch]]
    inline def next(tag: String, text: String, index: Double): js.UndefOr[ShortcodeMatch] = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(tag.asInstanceOf[js.Any], text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ShortcodeMatch]]
    inline def next_=(
      x: js.Function3[
          /* tag */ String, 
          /* text */ String, 
          /* index */ js.UndefOr[Double], 
          js.UndefOr[ShortcodeMatch]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("next")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/shortcode", "default.regexp")
    @js.native
    def regexp: js.Function1[/* tag */ String, RegExp] = js.native
    inline def regexp(tag: String): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("regexp")(tag.asInstanceOf[js.Any]).asInstanceOf[RegExp]
    inline def regexp_=(x: js.Function1[/* tag */ String, RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/shortcode", "default.replace")
    @js.native
    def replace: js.Function3[
        /* tag */ String, 
        /* text */ String, 
        /* callback */ js.Function1[/* shortcode */ Shortcode_, String], 
        String
      ] = js.native
    inline def replace(tag: String, text: String, callback: js.Function1[/* shortcode */ Shortcode_, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(tag.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def replace_=(
      x: js.Function3[
          /* tag */ String, 
          /* text */ String, 
          /* callback */ js.Function1[/* shortcode */ Shortcode_, String], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replace")(x.asInstanceOf[js.Any])
    
    // NOTE: this refers to the function, not `string` type. Bad naming choice.
    @JSImport("@wordpress/shortcode", "default.string")
    @js.native
    def string: String = js.native
    inline def string_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
  }
  
  object attrs {
    
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
    inline def apply(text: String): ShortcodeAttrs = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[ShortcodeAttrs]
    
    @JSImport("@wordpress/shortcode", "attrs")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to clear the memoized cache of this function.
      */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  }
  
  inline def fromMatch(`match`: RegExpMatchArray): Shortcode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatch")(`match`.asInstanceOf[js.Any]).asInstanceOf[Shortcode_]
  
  inline def next(tag: String, text: String): js.UndefOr[ShortcodeMatch] = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(tag.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ShortcodeMatch]]
  inline def next(tag: String, text: String, index: Double): js.UndefOr[ShortcodeMatch] = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(tag.asInstanceOf[js.Any], text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ShortcodeMatch]]
  
  inline def regexp(tag: String): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("regexp")(tag.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  
  inline def replace(tag: String, text: String, callback: js.Function1[/* shortcode */ Shortcode_, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(tag.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def string(options: ShortcodeOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ShortcodeAttrs extends StObject {
    
    var named: Record[String, js.UndefOr[String]]
    
    var numeric: js.Array[String]
  }
  object ShortcodeAttrs {
    
    inline def apply(named: Record[String, js.UndefOr[String]], numeric: js.Array[String]): ShortcodeAttrs = {
      val __obj = js.Dynamic.literal(named = named.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortcodeAttrs]
    }
    
    extension [Self <: ShortcodeAttrs](x: Self) {
      
      inline def setNamed(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setNumeric(value: js.Array[String]): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setNumericVarargs(value: String*): Self = StObject.set(x, "numeric", js.Array(value :_*))
    }
  }
  
  trait ShortcodeMatch extends StObject {
    
    var content: String
    
    var index: Double
    
    var shortcode: Shortcode_
  }
  object ShortcodeMatch {
    
    inline def apply(content: String, index: Double, shortcode: Shortcode_): ShortcodeMatch = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], shortcode = shortcode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortcodeMatch]
    }
    
    extension [Self <: ShortcodeMatch](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setShortcode(value: Shortcode_): Self = StObject.set(x, "shortcode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShortcodeOptions extends StObject {
    
    var attrs: js.UndefOr[PartialShortcodeAttrs | String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var tag: String
    
    var `type`: js.UndefOr[closed | `self-closing` | single] = js.undefined
  }
  object ShortcodeOptions {
    
    inline def apply(tag: String): ShortcodeOptions = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortcodeOptions]
    }
    
    extension [Self <: ShortcodeOptions](x: Self) {
      
      inline def setAttrs(value: PartialShortcodeAttrs | String): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setType(value: closed | `self-closing` | single): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Shortcode_ = Attrs & (Content | Type)
  
  @js.native
  trait shortcode extends StObject {
    
    var attrs: ShortcodeAttrs = js.native
    
    var content: js.UndefOr[String] = js.native
    
    /**
      * Get a shortcode attribute.
      *
      * Automatically detects whether `attr` is named or numeric and routes it accordingly.
      *
      * @param attr - Attribute key.
      *
      * @returns Attribute value.
      */
    def get(attr: String): js.UndefOr[String] = js.native
    def get(attr: Double): js.UndefOr[String] = js.native
    
    /**
      * Set a shortcode attribute.
      *
      * Automatically detects whether `attr` is named or numeric and routes it
      * accordingly.
      *
      * @param attr - Attribute key.
      * @param value - Attribute value.
      *
      * @returns Shortcode instance.
      */
    def set(attr: String, value: String): this.type = js.native
    def set(attr: Double, value: String): this.type = js.native
    
    /**
      * Transform the shortcode into a string.
      *
      * @returns String representation of the shortcode.
      */
    def string(): String = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[closed | `self-closing` | single] = js.native
  }
}
