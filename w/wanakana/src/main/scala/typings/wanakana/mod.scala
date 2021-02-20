package typings.wanakana

import typings.std.HTMLElement
import typings.std.Record
import typings.wanakana.wanakanaStrings.hepburn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wanakana", "bind")
  @js.native
  def bind(el: HTMLElement): Unit = js.native
  @JSImport("wanakana", "bind")
  @js.native
  def bind(el: HTMLElement, options: WanakanaOptions): Unit = js.native
  
  @JSImport("wanakana", "isHiragana")
  @js.native
  def isHiragana(input: String): Boolean = js.native
  
  @JSImport("wanakana", "isJapanese")
  @js.native
  def isJapanese(input: String): Boolean = js.native
  
  @JSImport("wanakana", "isKana")
  @js.native
  def isKana(input: String): Boolean = js.native
  
  @JSImport("wanakana", "isKanji")
  @js.native
  def isKanji(input: String): Boolean = js.native
  
  @JSImport("wanakana", "isKatakana")
  @js.native
  def isKatakana(input: String): Boolean = js.native
  
  @JSImport("wanakana", "isRomaji")
  @js.native
  def isRomaji(input: String): Boolean = js.native
  
  @JSImport("wanakana", "stripOkurigana")
  @js.native
  def stripOkurigana(input: String): String = js.native
  @JSImport("wanakana", "stripOkurigana")
  @js.native
  def stripOkurigana(input: String, options: StripOkuriganaOptions): String = js.native
  
  @JSImport("wanakana", "toHiragana")
  @js.native
  def toHiragana(input: String): String = js.native
  @JSImport("wanakana", "toHiragana")
  @js.native
  def toHiragana(input: String, options: WanakanaOptions): String = js.native
  
  @JSImport("wanakana", "toKana")
  @js.native
  def toKana(input: String): String = js.native
  @JSImport("wanakana", "toKana")
  @js.native
  def toKana(input: String, options: WanakanaOptions): String = js.native
  
  @JSImport("wanakana", "toKatakana")
  @js.native
  def toKatakana(input: String): String = js.native
  @JSImport("wanakana", "toKatakana")
  @js.native
  def toKatakana(input: String, options: WanakanaOptions): String = js.native
  
  @JSImport("wanakana", "toRomaji")
  @js.native
  def toRomaji(input: String): String = js.native
  @JSImport("wanakana", "toRomaji")
  @js.native
  def toRomaji(input: String, options: WanakanaOptions): String = js.native
  
  @JSImport("wanakana", "tokenize")
  @js.native
  def tokenize(input: String): js.Array[String] = js.native
  @JSImport("wanakana", "tokenize")
  @js.native
  def tokenize(input: String, options: TokenizeOptions): js.Array[String] = js.native
  
  @JSImport("wanakana", "unbind")
  @js.native
  def unbind(el: HTMLElement): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.wanakana.wanakanaBooleans.`true`
    - typings.wanakana.wanakanaBooleans.`false`
    - typings.wanakana.wanakanaStrings.toHiragana
    - typings.wanakana.wanakanaStrings.toKatakana
  */
  trait IMEModes extends StObject
  object IMEModes {
    
    @scala.inline
    def `false`: typings.wanakana.wanakanaBooleans.`false` = false.asInstanceOf[typings.wanakana.wanakanaBooleans.`false`]
    
    @scala.inline
    def toHiragana: typings.wanakana.wanakanaStrings.toHiragana = "toHiragana".asInstanceOf[typings.wanakana.wanakanaStrings.toHiragana]
    
    @scala.inline
    def toKatakana: typings.wanakana.wanakanaStrings.toKatakana = "toKatakana".asInstanceOf[typings.wanakana.wanakanaStrings.toKatakana]
    
    @scala.inline
    def `true`: typings.wanakana.wanakanaBooleans.`true` = true.asInstanceOf[typings.wanakana.wanakanaBooleans.`true`]
  }
  
  @js.native
  trait StripOkuriganaOptions extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.native
    
    var matchKanji: js.UndefOr[String] = js.native
  }
  object StripOkuriganaOptions {
    
    @scala.inline
    def apply(): StripOkuriganaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StripOkuriganaOptions]
    }
    
    @scala.inline
    implicit class StripOkuriganaOptionsMutableBuilder[Self <: StripOkuriganaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setMatchKanji(value: String): Self = StObject.set(x, "matchKanji", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchKanjiUndefined: Self = StObject.set(x, "matchKanji", js.undefined)
    }
  }
  
  @js.native
  trait TokenizeOptions extends StObject {
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var detailed: js.UndefOr[Boolean] = js.native
  }
  object TokenizeOptions {
    
    @scala.inline
    def apply(): TokenizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenizeOptions]
    }
    
    @scala.inline
    implicit class TokenizeOptionsMutableBuilder[Self <: TokenizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    }
  }
  
  @js.native
  trait WanakanaOptions extends StObject {
    
    var IMEMode: js.UndefOr[IMEModes] = js.native
    
    var customKanaMapping: js.UndefOr[Record[String, String]] = js.native
    
    var customRomajiMapping: js.UndefOr[Record[String, String]] = js.native
    
    var passRomaji: js.UndefOr[Boolean] = js.native
    
    var romanization: js.UndefOr[hepburn] = js.native
    
    var upcaseKatakana: js.UndefOr[Boolean] = js.native
    
    var useObsoleteKana: js.UndefOr[Boolean] = js.native
  }
  object WanakanaOptions {
    
    @scala.inline
    def apply(): WanakanaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WanakanaOptions]
    }
    
    @scala.inline
    implicit class WanakanaOptionsMutableBuilder[Self <: WanakanaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomKanaMapping(value: Record[String, String]): Self = StObject.set(x, "customKanaMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomKanaMappingUndefined: Self = StObject.set(x, "customKanaMapping", js.undefined)
      
      @scala.inline
      def setCustomRomajiMapping(value: Record[String, String]): Self = StObject.set(x, "customRomajiMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRomajiMappingUndefined: Self = StObject.set(x, "customRomajiMapping", js.undefined)
      
      @scala.inline
      def setIMEMode(value: IMEModes): Self = StObject.set(x, "IMEMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIMEModeUndefined: Self = StObject.set(x, "IMEMode", js.undefined)
      
      @scala.inline
      def setPassRomaji(value: Boolean): Self = StObject.set(x, "passRomaji", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassRomajiUndefined: Self = StObject.set(x, "passRomaji", js.undefined)
      
      @scala.inline
      def setRomanization(value: hepburn): Self = StObject.set(x, "romanization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRomanizationUndefined: Self = StObject.set(x, "romanization", js.undefined)
      
      @scala.inline
      def setUpcaseKatakana(value: Boolean): Self = StObject.set(x, "upcaseKatakana", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpcaseKatakanaUndefined: Self = StObject.set(x, "upcaseKatakana", js.undefined)
      
      @scala.inline
      def setUseObsoleteKana(value: Boolean): Self = StObject.set(x, "useObsoleteKana", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseObsoleteKanaUndefined: Self = StObject.set(x, "useObsoleteKana", js.undefined)
    }
  }
}
