package typings.wanakana

import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.std.Record
import typings.wanakana.anon.PassKanji
import typings.wanakana.mod.StripOkuriganaOptions
import typings.wanakana.mod.TokenizeOptions
import typings.wanakana.mod.WanakanaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object wanakana {
    
    @JSGlobal("wanakana")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("wanakana.ROMANIZATIONS")
    @js.native
    val ROMANIZATIONS: Record[String, String] = js.native
    
    @JSGlobal("wanakana.TO_KANA_METHODS")
    @js.native
    val TO_KANA_METHODS: Record[String, String] = js.native
    
    @JSGlobal("wanakana.VERSION")
    @js.native
    val VERSION: String = js.native
    
    inline def bind(el: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def bind(el: HTMLInputElement, options: WanakanaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def bind(el: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def bind(el: HTMLTextAreaElement, options: WanakanaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def isHiragana(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHiragana")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isJapanese(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJapanese")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isKana(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKana")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isKanji(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKanji")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isKatakana(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKatakana")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isMixed(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMixed")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isMixed(input: String, options: PassKanji): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMixed")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isRomaji(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRomaji")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def stripOkurigana(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripOkurigana")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stripOkurigana(input: String, options: StripOkuriganaOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stripOkurigana")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toHiragana(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHiragana")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toHiragana(input: String, options: WanakanaOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHiragana")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toKana(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKana")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toKana(input: String, options: WanakanaOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toKana")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toKatakana(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKatakana")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toKatakana(input: String, options: WanakanaOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toKatakana")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toRomaji(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRomaji")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toRomaji(input: String, options: WanakanaOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toRomaji")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def tokenize(input: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def tokenize(input: String, options: TokenizeOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    inline def unbind(el: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unbind(el: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
