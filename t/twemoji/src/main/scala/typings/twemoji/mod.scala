package typings.twemoji

import typings.std.HTMLElement
import typings.twemoji.anon.PartialParseObject
import typings.twemoji.twemojiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("twemoji", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twemoji", "base")
  @js.native
  val base: String = js.native
  
  @JSImport("twemoji", "className")
  @js.native
  val className: String = js.native
  
  object convert {
    
    @JSImport("twemoji", "convert")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given an HEX codepoint, returns UTF16 surrogate pairs.
      *
      * @param   codepoint string  generic codepoint, i.e. '1F4A9'
      * @return  string  codepoint transformed into utf16 surrogates pair,
      *          i.e. \\uD83D\\uDCA9
      *
      * @example
      *  twemoji.convert.fromCodePoint('1f1e8');
      *  // "\\ud83c\\udde8"
      *
      *  '1f1e8-1f1f3'.split('-').map(twemoji.convert.fromCodePoint).join('')
      *  // "\\ud83c\\udde8\\ud83c\\uddf3"
      */
    @scala.inline
    def fromCodePoint(codepoint: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(codepoint.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Given UTF16 surrogate pairs, returns the equivalent HEX codepoint.
      *
      * @param   unicodeSurrogates   string  generic utf16 surrogates pair, i.e. \\uD83D\\uDCA9
      * @param   sep                 string  optional separator for double code points, default='-'
      * @return  string  utf16 transformed into codepoint, i.e. '1F4A9'
      *
      * @example
      *  twemoji.convert.toCodePoint('\\ud83c\\udde8\\ud83c\\uddf3');
      *  // "1f1e8-1f1f3"
      *
      *  twemoji.convert.toCodePoint('\\ud83c\\udde8\\ud83c\\uddf3', '~');
      *  // "1f1e8~1f1f3"
      */
    @scala.inline
    def toCodePoint(unicodeSurrogates: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCodePoint")(unicodeSurrogates.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def toCodePoint(unicodeSurrogates: String, sep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toCodePoint")(unicodeSurrogates.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("twemoji", "ext")
  @js.native
  val ext: String = js.native
  
  @scala.inline
  def onerror(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onerror")().asInstanceOf[Unit]
  
  @scala.inline
  def parse(what: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(what.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def parse(what: String, how: PartialParseObject): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(what.asInstanceOf[js.Any], how.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def parse(what: String, how: ParseCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(what.asInstanceOf[js.Any], how.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def parse(what: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(what.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def parse(what: HTMLElement, how: PartialParseObject): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(what.asInstanceOf[js.Any], how.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def parse(what: HTMLElement, how: ParseCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(what.asInstanceOf[js.Any], how.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def replace(text: String, callback: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("twemoji", "size")
  @js.native
  val size: String = js.native
  
  @scala.inline
  def test(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type ParseCallback = js.Function3[/* icon */ String, /* options */ js.Object, /* variant */ String, String | `false`]
  
  trait ParseObject extends StObject {
    
    /**
      * The function to invoke in order to generate additional, custom attributes for the image tag.
      *
      * @param the lower case HEX code point i.e. "1f4a9"
      * @param variant the optional \\uFE0F ("as image") variant, in case this info is anyhow meaningful. By default this is ignored.
      */
    def attributes(icon: String, variant: String): js.Object
    
    /**
      * default: MaxCDN
      */
    var base: String
    
    /**
      * the callback to invoke per each found emoji.
      *
      * default: the common replacer
      */
    def callback(icon: String, options: js.Object, variant: String): String | `false`
    /**
      * the callback to invoke per each found emoji.
      *
      * default: the common replacer
      */
    @JSName("callback")
    var callback_Original: ParseCallback
    
    /**
      * default: "emoji"
      */
    var className: String
    
    /**
      * default: ".png"
      */
    var ext: String
    
    /**
      * in case it's specified it replaces .size info, if any
      */
    var folder: String
    
    /**
      * default: "72x72"
      */
    var size: String | Double
  }
  object ParseObject {
    
    @scala.inline
    def apply(
      attributes: (String, String) => js.Object,
      base: String,
      callback: (/* icon */ String, /* options */ js.Object, /* variant */ String) => String | `false`,
      className: String,
      ext: String,
      folder: String,
      size: String | Double
    ): ParseObject = {
      val __obj = js.Dynamic.literal(attributes = js.Any.fromFunction2(attributes), base = base.asInstanceOf[js.Any], callback = js.Any.fromFunction3(callback), className = className.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseObject]
    }
    
    @scala.inline
    implicit class ParseObjectMutableBuilder[Self <: ParseObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: (String, String) => js.Object): Self = StObject.set(x, "attributes", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallback(value: (/* icon */ String, /* options */ js.Object, /* variant */ String) => String | `false`): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
