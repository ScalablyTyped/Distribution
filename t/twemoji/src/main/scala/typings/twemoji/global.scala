package typings.twemoji

import typings.std.HTMLElement
import typings.twemoji.anon.PartialParseObject
import typings.twemoji.mod.ParseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object twemoji {
    
    @JSGlobal("twemoji")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("twemoji.base")
    @js.native
    val base: String = js.native
    
    @JSGlobal("twemoji.className")
    @js.native
    val className: String = js.native
    
    object convert {
      
      @JSGlobal("twemoji.convert")
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
      inline def fromCodePoint(codepoint: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(codepoint.asInstanceOf[js.Any]).asInstanceOf[String]
      
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
      inline def toCodePoint(unicodeSurrogates: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCodePoint")(unicodeSurrogates.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def toCodePoint(unicodeSurrogates: String, sep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toCodePoint")(unicodeSurrogates.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[String]
    }
    
    @JSGlobal("twemoji.ext")
    @js.native
    val ext: String = js.native
    
    inline def onerror(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onerror")().asInstanceOf[Unit]
    
    inline def parse(what: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(what.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def parse(what: String, how: PartialParseObject): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(what.asInstanceOf[js.Any], how.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def parse(what: String, how: ParseCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(what.asInstanceOf[js.Any], how.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def parse(what: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(what.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def parse(what: HTMLElement, how: PartialParseObject): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(what.asInstanceOf[js.Any], how.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def parse(what: HTMLElement, how: ParseCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(what.asInstanceOf[js.Any], how.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def replace(text: String, callback: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("twemoji.size")
    @js.native
    val size: String = js.native
    
    inline def test(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
