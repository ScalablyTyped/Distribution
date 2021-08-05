package typings.winrt.global.Windows.UI

import typings.winrt.Windows.UI.Color
import typings.winrt.Windows.UI.Text.FontStretch
import typings.winrt.Windows.UI.Text.FontStyle
import typings.winrt.Windows.UI.Text.FontWeight
import typings.winrt.Windows.UI.Text.IFontWeights
import typings.winrt.Windows.UI.Text.TabLeader.equals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSGlobal("Windows.UI.Text.CaretType")
  @js.native
  object CaretType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.CaretType & Double] = js.native
    
    /* 0 */ val normal: typings.winrt.Windows.UI.Text.CaretType.normal & Double = js.native
    
    /* 1 */ val null_ : typings.winrt.Windows.UI.Text.CaretType.null_ & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.FindOptions")
  @js.native
  object FindOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.FindOptions & Double] = js.native
    
    /* 2 */ val case_ : typings.winrt.Windows.UI.Text.FindOptions.case_ & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.UI.Text.FindOptions.none & Double = js.native
    
    /* 1 */ val word: typings.winrt.Windows.UI.Text.FindOptions.word & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.FontStretch")
  @js.native
  object FontStretch extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.FontStretch & Double] = js.native
    
    /* 3 */ val condensed: typings.winrt.Windows.UI.Text.FontStretch.condensed & Double = js.native
    
    /* 7 */ val expanded: typings.winrt.Windows.UI.Text.FontStretch.expanded & Double = js.native
    
    /* 2 */ val extraCondensed: typings.winrt.Windows.UI.Text.FontStretch.extraCondensed & Double = js.native
    
    /* 8 */ val extraExpanded: typings.winrt.Windows.UI.Text.FontStretch.extraExpanded & Double = js.native
    
    /* 5 */ val normal: typings.winrt.Windows.UI.Text.FontStretch.normal & Double = js.native
    
    /* 4 */ val semiCondensed: typings.winrt.Windows.UI.Text.FontStretch.semiCondensed & Double = js.native
    
    /* 6 */ val semiExpanded: typings.winrt.Windows.UI.Text.FontStretch.semiExpanded & Double = js.native
    
    /* 1 */ val ultraCondensed: typings.winrt.Windows.UI.Text.FontStretch.ultraCondensed & Double = js.native
    
    /* 9 */ val ultraExpanded: typings.winrt.Windows.UI.Text.FontStretch.ultraExpanded & Double = js.native
    
    /* 0 */ val undefined: typings.winrt.Windows.UI.Text.FontStretch.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.FontStyle & Double] = js.native
    
    /* 2 */ val italic: typings.winrt.Windows.UI.Text.FontStyle.italic & Double = js.native
    
    /* 0 */ val normal: typings.winrt.Windows.UI.Text.FontStyle.normal & Double = js.native
    
    /* 1 */ val oblique: typings.winrt.Windows.UI.Text.FontStyle.oblique & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.FontWeights")
  @js.native
  class FontWeights ()
    extends StObject
       with IFontWeights
  /* static members */
  object FontWeights {
    
    @JSGlobal("Windows.UI.Text.FontWeights")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.UI.Text.FontWeights.black")
    @js.native
    def black: FontWeight = js.native
    inline def black_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("black")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.bold")
    @js.native
    def bold: FontWeight = js.native
    inline def bold_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bold")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.extraBlack")
    @js.native
    def extraBlack: FontWeight = js.native
    inline def extraBlack_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraBlack")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.extraBold")
    @js.native
    def extraBold: FontWeight = js.native
    inline def extraBold_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraBold")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.extraLight")
    @js.native
    def extraLight: FontWeight = js.native
    inline def extraLight_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraLight")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.light")
    @js.native
    def light: FontWeight = js.native
    inline def light_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.medium")
    @js.native
    def medium: FontWeight = js.native
    inline def medium_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("medium")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.normal")
    @js.native
    def normal: FontWeight = js.native
    inline def normal_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.semiBold")
    @js.native
    def semiBold: FontWeight = js.native
    inline def semiBold_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("semiBold")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.semiLight")
    @js.native
    def semiLight: FontWeight = js.native
    inline def semiLight_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("semiLight")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.thin")
    @js.native
    def thin: FontWeight = js.native
    inline def thin_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thin")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.UI.Text.FormatEffect")
  @js.native
  object FormatEffect extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.FormatEffect & Double] = js.native
    
    /* 0 */ val off: typings.winrt.Windows.UI.Text.FormatEffect.off & Double = js.native
    
    /* 1 */ val on: typings.winrt.Windows.UI.Text.FormatEffect.on & Double = js.native
    
    /* 2 */ val toggle: typings.winrt.Windows.UI.Text.FormatEffect.toggle & Double = js.native
    
    /* 3 */ val undefined: typings.winrt.Windows.UI.Text.FormatEffect.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.HorizontalCharacterAlignment")
  @js.native
  object HorizontalCharacterAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.HorizontalCharacterAlignment & Double] = js.native
    
    /* 2 */ val center: typings.winrt.Windows.UI.Text.HorizontalCharacterAlignment.center & Double = js.native
    
    /* 0 */ val left: typings.winrt.Windows.UI.Text.HorizontalCharacterAlignment.left & Double = js.native
    
    /* 1 */ val right: typings.winrt.Windows.UI.Text.HorizontalCharacterAlignment.right & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.LetterCase")
  @js.native
  object LetterCase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.LetterCase & Double] = js.native
    
    /* 0 */ val lower: typings.winrt.Windows.UI.Text.LetterCase.lower & Double = js.native
    
    /* 1 */ val upper: typings.winrt.Windows.UI.Text.LetterCase.upper & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.LineSpacingRule")
  @js.native
  object LineSpacingRule extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.LineSpacingRule & Double] = js.native
    
    /* 4 */ val atLeast: typings.winrt.Windows.UI.Text.LineSpacingRule.atLeast & Double = js.native
    
    /* 3 */ val double: typings.winrt.Windows.UI.Text.LineSpacingRule.double & Double = js.native
    
    /* 5 */ val exactly: typings.winrt.Windows.UI.Text.LineSpacingRule.exactly & Double = js.native
    
    /* 6 */ val multiple: typings.winrt.Windows.UI.Text.LineSpacingRule.multiple & Double = js.native
    
    /* 2 */ val oneAndHalf: typings.winrt.Windows.UI.Text.LineSpacingRule.oneAndHalf & Double = js.native
    
    /* 7 */ val percent: typings.winrt.Windows.UI.Text.LineSpacingRule.percent & Double = js.native
    
    /* 1 */ val single: typings.winrt.Windows.UI.Text.LineSpacingRule.single & Double = js.native
    
    /* 0 */ val undefined: typings.winrt.Windows.UI.Text.LineSpacingRule.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.LinkType")
  @js.native
  object LinkType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.LinkType & Double] = js.native
    
    /* 5 */ val autoLink: typings.winrt.Windows.UI.Text.LinkType.autoLink & Double = js.native
    
    /* 6 */ val autoLinkEmail: typings.winrt.Windows.UI.Text.LinkType.autoLinkEmail & Double = js.native
    
    /* 8 */ val autoLinkPath: typings.winrt.Windows.UI.Text.LinkType.autoLinkPath & Double = js.native
    
    /* 7 */ val autoLinkPhone: typings.winrt.Windows.UI.Text.LinkType.autoLinkPhone & Double = js.native
    
    /* 2 */ val clientLink: typings.winrt.Windows.UI.Text.LinkType.clientLink & Double = js.native
    
    /* 4 */ val friendlyLinkAddress: typings.winrt.Windows.UI.Text.LinkType.friendlyLinkAddress & Double = js.native
    
    /* 3 */ val friendlyLinkName: typings.winrt.Windows.UI.Text.LinkType.friendlyLinkName & Double = js.native
    
    /* 1 */ val notALink: typings.winrt.Windows.UI.Text.LinkType.notALink & Double = js.native
    
    /* 0 */ val undefined: typings.winrt.Windows.UI.Text.LinkType.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.MarkerAlignment")
  @js.native
  object MarkerAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.MarkerAlignment & Double] = js.native
    
    /* 2 */ val center: typings.winrt.Windows.UI.Text.MarkerAlignment.center & Double = js.native
    
    /* 1 */ val left: typings.winrt.Windows.UI.Text.MarkerAlignment.left & Double = js.native
    
    /* 3 */ val right: typings.winrt.Windows.UI.Text.MarkerAlignment.right & Double = js.native
    
    /* 0 */ val undefined: typings.winrt.Windows.UI.Text.MarkerAlignment.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.MarkerStyle")
  @js.native
  object MarkerStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.MarkerStyle & Double] = js.native
    
    /* 5 */ val minus: typings.winrt.Windows.UI.Text.MarkerStyle.minus & Double = js.native
    
    /* 6 */ val noNumber: typings.winrt.Windows.UI.Text.MarkerStyle.noNumber & Double = js.native
    
    /* 2 */ val parentheses: typings.winrt.Windows.UI.Text.MarkerStyle.parentheses & Double = js.native
    
    /* 1 */ val parenthesis: typings.winrt.Windows.UI.Text.MarkerStyle.parenthesis & Double = js.native
    
    /* 3 */ val period: typings.winrt.Windows.UI.Text.MarkerStyle.period & Double = js.native
    
    /* 4 */ val plain: typings.winrt.Windows.UI.Text.MarkerStyle.plain & Double = js.native
    
    /* 0 */ val undefined: typings.winrt.Windows.UI.Text.MarkerStyle.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.MarkerType")
  @js.native
  object MarkerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.MarkerType & Double] = js.native
    
    /* 3 */ val arabic: typings.winrt.Windows.UI.Text.MarkerType.arabic & Double = js.native
    
    /* 18 */ val arabicAbjad: typings.winrt.Windows.UI.Text.MarkerType.arabicAbjad & Double = js.native
    
    /* 17 */ val arabicDictionary: typings.winrt.Windows.UI.Text.MarkerType.arabicDictionary & Double = js.native
    
    /* 12 */ val arabicWide: typings.winrt.Windows.UI.Text.MarkerType.arabicWide & Double = js.native
    
    /* 10 */ val blackCircleWingding: typings.winrt.Windows.UI.Text.MarkerType.blackCircleWingding & Double = js.native
    
    /* 2 */ val bullet: typings.winrt.Windows.UI.Text.MarkerType.bullet & Double = js.native
    
    /* 9 */ val circledNumber: typings.winrt.Windows.UI.Text.MarkerType.circledNumber & Double = js.native
    
    /* 23 */ val devanagariConsonant: typings.winrt.Windows.UI.Text.MarkerType.devanagariConsonant & Double = js.native
    
    /* 24 */ val devanagariNumeric: typings.winrt.Windows.UI.Text.MarkerType.devanagariNumeric & Double = js.native
    
    /* 22 */ val devanagariVowel: typings.winrt.Windows.UI.Text.MarkerType.devanagariVowel & Double = js.native
    
    /* 19 */ val hebrew: typings.winrt.Windows.UI.Text.MarkerType.hebrew & Double = js.native
    
    /* 16 */ val japanKorea: typings.winrt.Windows.UI.Text.MarkerType.japanKorea & Double = js.native
    
    /* 15 */ val japanSimplifiedChinese: typings.winrt.Windows.UI.Text.MarkerType.japanSimplifiedChinese & Double = js.native
    
    /* 4 */ val lowercaseEnglishLetter: typings.winrt.Windows.UI.Text.MarkerType.lowercaseEnglishLetter & Double = js.native
    
    /* 6 */ val lowercaseRoman: typings.winrt.Windows.UI.Text.MarkerType.lowercaseRoman & Double = js.native
    
    /* 1 */ val none: typings.winrt.Windows.UI.Text.MarkerType.none & Double = js.native
    
    /* 13 */ val simplifiedChinese: typings.winrt.Windows.UI.Text.MarkerType.simplifiedChinese & Double = js.native
    
    /* 20 */ val thaiAlphabetic: typings.winrt.Windows.UI.Text.MarkerType.thaiAlphabetic & Double = js.native
    
    /* 21 */ val thaiNumeric: typings.winrt.Windows.UI.Text.MarkerType.thaiNumeric & Double = js.native
    
    /* 14 */ val traditionalChinese: typings.winrt.Windows.UI.Text.MarkerType.traditionalChinese & Double = js.native
    
    /* 0 */ val undefined: typings.winrt.Windows.UI.Text.MarkerType.undefined & Double = js.native
    
    /* 8 */ val unicodeSequence: typings.winrt.Windows.UI.Text.MarkerType.unicodeSequence & Double = js.native
    
    /* 5 */ val uppercaseEnglishLetter: typings.winrt.Windows.UI.Text.MarkerType.uppercaseEnglishLetter & Double = js.native
    
    /* 7 */ val uppercaseRoman: typings.winrt.Windows.UI.Text.MarkerType.uppercaseRoman & Double = js.native
    
    /* 11 */ val whiteCircleWingding: typings.winrt.Windows.UI.Text.MarkerType.whiteCircleWingding & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.ParagraphAlignment")
  @js.native
  object ParagraphAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.ParagraphAlignment & Double] = js.native
    
    /* 2 */ val center: typings.winrt.Windows.UI.Text.ParagraphAlignment.center & Double = js.native
    
    /* 4 */ val justify: typings.winrt.Windows.UI.Text.ParagraphAlignment.justify & Double = js.native
    
    /* 1 */ val left: typings.winrt.Windows.UI.Text.ParagraphAlignment.left & Double = js.native
    
    /* 3 */ val right: typings.winrt.Windows.UI.Text.ParagraphAlignment.right & Double = js.native
    
    /* 0 */ val undefined: typings.winrt.Windows.UI.Text.ParagraphAlignment.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.ParagraphStyle")
  @js.native
  object ParagraphStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.ParagraphStyle & Double] = js.native
    
    /* 3 */ val heading1: typings.winrt.Windows.UI.Text.ParagraphStyle.heading1 & Double = js.native
    
    /* 4 */ val heading2: typings.winrt.Windows.UI.Text.ParagraphStyle.heading2 & Double = js.native
    
    /* 5 */ val heading3: typings.winrt.Windows.UI.Text.ParagraphStyle.heading3 & Double = js.native
    
    /* 6 */ val heading4: typings.winrt.Windows.UI.Text.ParagraphStyle.heading4 & Double = js.native
    
    /* 7 */ val heading5: typings.winrt.Windows.UI.Text.ParagraphStyle.heading5 & Double = js.native
    
    /* 8 */ val heading6: typings.winrt.Windows.UI.Text.ParagraphStyle.heading6 & Double = js.native
    
    /* 9 */ val heading7: typings.winrt.Windows.UI.Text.ParagraphStyle.heading7 & Double = js.native
    
    /* 10 */ val heading8: typings.winrt.Windows.UI.Text.ParagraphStyle.heading8 & Double = js.native
    
    /* 11 */ val heading9: typings.winrt.Windows.UI.Text.ParagraphStyle.heading9 & Double = js.native
    
    /* 1 */ val none: typings.winrt.Windows.UI.Text.ParagraphStyle.none & Double = js.native
    
    /* 2 */ val normal: typings.winrt.Windows.UI.Text.ParagraphStyle.normal & Double = js.native
    
    /* 0 */ val undefined: typings.winrt.Windows.UI.Text.ParagraphStyle.undefined & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.PointOptions")
  @js.native
  object PointOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.PointOptions & Double] = js.native
    
    /* 4 */ val allowOffClient: typings.winrt.Windows.UI.Text.PointOptions.allowOffClient & Double = js.native
    
    /* 3 */ val clientCoordinates: typings.winrt.Windows.UI.Text.PointOptions.clientCoordinates & Double = js.native
    
    /* 1 */ val includeInset: typings.winrt.Windows.UI.Text.PointOptions.includeInset & Double = js.native
    
    /* 6 */ val noHorizontalScroll: typings.winrt.Windows.UI.Text.PointOptions.noHorizontalScroll & Double = js.native
    
    /* 7 */ val noVerticalScroll: typings.winrt.Windows.UI.Text.PointOptions.noVerticalScroll & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.UI.Text.PointOptions.none & Double = js.native
    
    /* 2 */ val start: typings.winrt.Windows.UI.Text.PointOptions.start & Double = js.native
    
    /* 5 */ val transform: typings.winrt.Windows.UI.Text.PointOptions.transform & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.RangeGravity")
  @js.native
  object RangeGravity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.RangeGravity & Double] = js.native
    
    /* 1 */ val backward: typings.winrt.Windows.UI.Text.RangeGravity.backward & Double = js.native
    
    /* 2 */ val forward: typings.winrt.Windows.UI.Text.RangeGravity.forward & Double = js.native
    
    /* 3 */ val inward: typings.winrt.Windows.UI.Text.RangeGravity.inward & Double = js.native
    
    /* 4 */ val outward: typings.winrt.Windows.UI.Text.RangeGravity.outward & Double = js.native
    
    /* 0 */ val uIBehavior: typings.winrt.Windows.UI.Text.RangeGravity.uIBehavior & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.SelectionOptions")
  @js.native
  object SelectionOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.SelectionOptions & Double] = js.native
    
    /* 3 */ val active: typings.winrt.Windows.UI.Text.SelectionOptions.active & Double = js.native
    
    /* 1 */ val atEndOfLine: typings.winrt.Windows.UI.Text.SelectionOptions.atEndOfLine & Double = js.native
    
    /* 2 */ val overtype: typings.winrt.Windows.UI.Text.SelectionOptions.overtype & Double = js.native
    
    /* 4 */ val replace: typings.winrt.Windows.UI.Text.SelectionOptions.replace & Double = js.native
    
    /* 0 */ val startActive: typings.winrt.Windows.UI.Text.SelectionOptions.startActive & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.SelectionType & Double] = js.native
    
    /* 3 */ val inlineShape: typings.winrt.Windows.UI.Text.SelectionType.inlineShape & Double = js.native
    
    /* 1 */ val insertionPoint: typings.winrt.Windows.UI.Text.SelectionType.insertionPoint & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.UI.Text.SelectionType.none & Double = js.native
    
    /* 2 */ val normal: typings.winrt.Windows.UI.Text.SelectionType.normal & Double = js.native
    
    /* 4 */ val shape: typings.winrt.Windows.UI.Text.SelectionType.shape & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TabAlignment")
  @js.native
  object TabAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.TabAlignment & Double] = js.native
    
    /* 4 */ val bar: typings.winrt.Windows.UI.Text.TabAlignment.bar & Double = js.native
    
    /* 1 */ val center: typings.winrt.Windows.UI.Text.TabAlignment.center & Double = js.native
    
    /* 3 */ val decimal: typings.winrt.Windows.UI.Text.TabAlignment.decimal & Double = js.native
    
    /* 0 */ val left: typings.winrt.Windows.UI.Text.TabAlignment.left & Double = js.native
    
    /* 2 */ val right: typings.winrt.Windows.UI.Text.TabAlignment.right & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TabLeader")
  @js.native
  object TabLeader extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.TabLeader & Double] = js.native
    
    /* 2 */ val dashes: typings.winrt.Windows.UI.Text.TabLeader.dashes & Double = js.native
    
    /* 1 */ val dots: typings.winrt.Windows.UI.Text.TabLeader.dots & Double = js.native
    
    /* 5 */ @JSName("equals")
    val equals_ : equals & Double = js.native
    
    /* 3 */ val lines: typings.winrt.Windows.UI.Text.TabLeader.lines & Double = js.native
    
    /* 0 */ val spaces: typings.winrt.Windows.UI.Text.TabLeader.spaces & Double = js.native
    
    /* 4 */ val thickLines: typings.winrt.Windows.UI.Text.TabLeader.thickLines & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TextConstants")
  @js.native
  class TextConstants ()
    extends StObject
       with typings.winrt.Windows.UI.Text.TextConstants
  /* static members */
  object TextConstants {
    
    @JSGlobal("Windows.UI.Text.TextConstants")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.UI.Text.TextConstants.autoColor")
    @js.native
    def autoColor: Color = js.native
    inline def autoColor_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoColor")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.maxUnitCount")
    @js.native
    def maxUnitCount: Double = js.native
    inline def maxUnitCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxUnitCount")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.minUnitCount")
    @js.native
    def minUnitCount: Double = js.native
    inline def minUnitCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minUnitCount")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedColor")
    @js.native
    def undefinedColor: Color = js.native
    inline def undefinedColor_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedColor")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedFloatValue")
    @js.native
    def undefinedFloatValue: Double = js.native
    inline def undefinedFloatValue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedFloatValue")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedFontStretch")
    @js.native
    def undefinedFontStretch: FontStretch = js.native
    inline def undefinedFontStretch_=(x: FontStretch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedFontStretch")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedFontStyle")
    @js.native
    def undefinedFontStyle: FontStyle = js.native
    inline def undefinedFontStyle_=(x: FontStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedFontStyle")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedInt32Value")
    @js.native
    def undefinedInt32Value: Double = js.native
    inline def undefinedInt32Value_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedInt32Value")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.UI.Text.TextGetOptions")
  @js.native
  object TextGetOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.TextGetOptions & Double] = js.native
    
    /* 1 */ val adjustCrlf: typings.winrt.Windows.UI.Text.TextGetOptions.adjustCrlf & Double = js.native
    
    /* 4 */ val allowFinalEop: typings.winrt.Windows.UI.Text.TextGetOptions.allowFinalEop & Double = js.native
    
    /* 7 */ val formatRtf: typings.winrt.Windows.UI.Text.TextGetOptions.formatRtf & Double = js.native
    
    /* 6 */ val includeNumbering: typings.winrt.Windows.UI.Text.TextGetOptions.includeNumbering & Double = js.native
    
    /* 5 */ val noHidden: typings.winrt.Windows.UI.Text.TextGetOptions.noHidden & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.UI.Text.TextGetOptions.none & Double = js.native
    
    /* 2 */ val useCrlf: typings.winrt.Windows.UI.Text.TextGetOptions.useCrlf & Double = js.native
    
    /* 3 */ val useObjectText: typings.winrt.Windows.UI.Text.TextGetOptions.useObjectText & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TextRangeUnit")
  @js.native
  object TextRangeUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.TextRangeUnit & Double] = js.native
    
    /* 21 */ val allCaps: typings.winrt.Windows.UI.Text.TextRangeUnit.allCaps & Double = js.native
    
    /* 14 */ val bold: typings.winrt.Windows.UI.Text.TextRangeUnit.bold & Double = js.native
    
    /* 0 */ val character: typings.winrt.Windows.UI.Text.TextRangeUnit.character & Double = js.native
    
    /* 9 */ val characterFormat: typings.winrt.Windows.UI.Text.TextRangeUnit.characterFormat & Double = js.native
    
    /* 13 */ val cluster: typings.winrt.Windows.UI.Text.TextRangeUnit.cluster & Double = js.native
    
    /* 26 */ val disabled: typings.winrt.Windows.UI.Text.TextRangeUnit.disabled & Double = js.native
    
    /* 30 */ val fontBound: typings.winrt.Windows.UI.Text.TextRangeUnit.fontBound & Double = js.native
    
    /* 12 */ val hardParagraph: typings.winrt.Windows.UI.Text.TextRangeUnit.hardParagraph & Double = js.native
    
    /* 22 */ val hidden: typings.winrt.Windows.UI.Text.TextRangeUnit.hidden & Double = js.native
    
    /* 25 */ val imprint: typings.winrt.Windows.UI.Text.TextRangeUnit.imprint & Double = js.native
    
    /* 15 */ val italic: typings.winrt.Windows.UI.Text.TextRangeUnit.italic & Double = js.native
    
    /* 4 */ val line: typings.winrt.Windows.UI.Text.TextRangeUnit.line & Double = js.native
    
    /* 19 */ val link: typings.winrt.Windows.UI.Text.TextRangeUnit.link & Double = js.native
    
    /* 31 */ val linkProtected: typings.winrt.Windows.UI.Text.TextRangeUnit.linkProtected & Double = js.native
    
    /* 11 */ val `object`: typings.winrt.Windows.UI.Text.TextRangeUnit.`object` & Double = js.native
    
    /* 23 */ val outline: typings.winrt.Windows.UI.Text.TextRangeUnit.outline & Double = js.native
    
    /* 3 */ val paragraph: typings.winrt.Windows.UI.Text.TextRangeUnit.paragraph & Double = js.native
    
    /* 10 */ val paragraphFormat: typings.winrt.Windows.UI.Text.TextRangeUnit.paragraphFormat & Double = js.native
    
    /* 18 */ val protectedText: typings.winrt.Windows.UI.Text.TextRangeUnit.protectedText & Double = js.native
    
    /* 27 */ val revised: typings.winrt.Windows.UI.Text.TextRangeUnit.revised & Double = js.native
    
    /* 6 */ val screen: typings.winrt.Windows.UI.Text.TextRangeUnit.screen & Double = js.native
    
    /* 7 */ val section: typings.winrt.Windows.UI.Text.TextRangeUnit.section & Double = js.native
    
    /* 2 */ val sentence: typings.winrt.Windows.UI.Text.TextRangeUnit.sentence & Double = js.native
    
    /* 24 */ val shadow: typings.winrt.Windows.UI.Text.TextRangeUnit.shadow & Double = js.native
    
    /* 20 */ val smallCaps: typings.winrt.Windows.UI.Text.TextRangeUnit.smallCaps & Double = js.native
    
    /* 5 */ val story: typings.winrt.Windows.UI.Text.TextRangeUnit.story & Double = js.native
    
    /* 17 */ val strikethrough: typings.winrt.Windows.UI.Text.TextRangeUnit.strikethrough & Double = js.native
    
    /* 28 */ val subscript: typings.winrt.Windows.UI.Text.TextRangeUnit.subscript & Double = js.native
    
    /* 29 */ val superscript: typings.winrt.Windows.UI.Text.TextRangeUnit.superscript & Double = js.native
    
    /* 16 */ val underline: typings.winrt.Windows.UI.Text.TextRangeUnit.underline & Double = js.native
    
    /* 8 */ val window: typings.winrt.Windows.UI.Text.TextRangeUnit.window & Double = js.native
    
    /* 1 */ val word: typings.winrt.Windows.UI.Text.TextRangeUnit.word & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TextScript")
  @js.native
  object TextScript extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.TextScript & Double] = js.native
    
    /* 10 */ val default: typings.winrt.Windows.UI.Text.TextScript.default & Double = js.native
    
    /* 40 */ val aboriginal: typings.winrt.Windows.UI.Text.TextScript.aboriginal & Double = js.native
    
    /* 1 */ val ansi: typings.winrt.Windows.UI.Text.TextScript.ansi & Double = js.native
    
    /* 7 */ val arabic: typings.winrt.Windows.UI.Text.TextScript.arabic & Double = js.native
    
    /* 20 */ val armenian: typings.winrt.Windows.UI.Text.TextScript.armenian & Double = js.native
    
    /* 8 */ val baltic: typings.winrt.Windows.UI.Text.TextScript.baltic & Double = js.native
    
    /* 24 */ val bengali: typings.winrt.Windows.UI.Text.TextScript.bengali & Double = js.native
    
    /* 16 */ val big5: typings.winrt.Windows.UI.Text.TextScript.big5 & Double = js.native
    
    /* 45 */ val braille: typings.winrt.Windows.UI.Text.TextScript.braille & Double = js.native
    
    /* 39 */ val cherokee: typings.winrt.Windows.UI.Text.TextScript.cherokee & Double = js.native
    
    /* 3 */ val cyrillic: typings.winrt.Windows.UI.Text.TextScript.cyrillic & Double = js.native
    
    /* 62 */ val deseret: typings.winrt.Windows.UI.Text.TextScript.deseret & Double = js.native
    
    /* 23 */ val devanagari: typings.winrt.Windows.UI.Text.TextScript.devanagari & Double = js.native
    
    /* 2 */ val eastEurope: typings.winrt.Windows.UI.Text.TextScript.eastEurope & Double = js.native
    
    /* 54 */ val emoji: typings.winrt.Windows.UI.Text.TextScript.emoji & Double = js.native
    
    /* 38 */ val ethiopic: typings.winrt.Windows.UI.Text.TextScript.ethiopic & Double = js.native
    
    /* 14 */ val gB2312: typings.winrt.Windows.UI.Text.TextScript.gB2312 & Double = js.native
    
    /* 36 */ val georgian: typings.winrt.Windows.UI.Text.TextScript.georgian & Double = js.native
    
    /* 55 */ val glagolitic: typings.winrt.Windows.UI.Text.TextScript.glagolitic & Double = js.native
    
    /* 61 */ val gothic: typings.winrt.Windows.UI.Text.TextScript.gothic & Double = js.native
    
    /* 4 */ val greek: typings.winrt.Windows.UI.Text.TextScript.greek & Double = js.native
    
    /* 26 */ val gujarati: typings.winrt.Windows.UI.Text.TextScript.gujarati & Double = js.native
    
    /* 25 */ val gurmukhi: typings.winrt.Windows.UI.Text.TextScript.gurmukhi & Double = js.native
    
    /* 15 */ val hangul: typings.winrt.Windows.UI.Text.TextScript.hangul & Double = js.native
    
    /* 6 */ val hebrew: typings.winrt.Windows.UI.Text.TextScript.hebrew & Double = js.native
    
    /* 37 */ val jamo: typings.winrt.Windows.UI.Text.TextScript.jamo & Double = js.native
    
    /* 30 */ val kannada: typings.winrt.Windows.UI.Text.TextScript.kannada & Double = js.native
    
    /* 52 */ val kayahli: typings.winrt.Windows.UI.Text.TextScript.kayahli & Double = js.native
    
    /* 51 */ val kharoshthi: typings.winrt.Windows.UI.Text.TextScript.kharoshthi & Double = js.native
    
    /* 43 */ val khmer: typings.winrt.Windows.UI.Text.TextScript.khmer & Double = js.native
    
    /* 33 */ val lao: typings.winrt.Windows.UI.Text.TextScript.lao & Double = js.native
    
    /* 47 */ val limbu: typings.winrt.Windows.UI.Text.TextScript.limbu & Double = js.native
    
    /* 56 */ val lisu: typings.winrt.Windows.UI.Text.TextScript.lisu & Double = js.native
    
    /* 19 */ val mac: typings.winrt.Windows.UI.Text.TextScript.mac & Double = js.native
    
    /* 31 */ val malayalam: typings.winrt.Windows.UI.Text.TextScript.malayalam & Double = js.native
    
    /* 44 */ val mongolian: typings.winrt.Windows.UI.Text.TextScript.mongolian & Double = js.native
    
    /* 35 */ val myanmar: typings.winrt.Windows.UI.Text.TextScript.myanmar & Double = js.native
    
    /* 58 */ val nKo: typings.winrt.Windows.UI.Text.TextScript.nKo & Double = js.native
    
    /* 49 */ val newTaiLue: typings.winrt.Windows.UI.Text.TextScript.newTaiLue & Double = js.native
    
    /* 18 */ val oem: typings.winrt.Windows.UI.Text.TextScript.oem & Double = js.native
    
    /* 41 */ val ogham: typings.winrt.Windows.UI.Text.TextScript.ogham & Double = js.native
    
    /* 27 */ val oriya: typings.winrt.Windows.UI.Text.TextScript.oriya & Double = js.native
    
    /* 59 */ val osmanya: typings.winrt.Windows.UI.Text.TextScript.osmanya & Double = js.native
    
    /* 17 */ val pC437: typings.winrt.Windows.UI.Text.TextScript.pC437 & Double = js.native
    
    /* 60 */ val phagsPa: typings.winrt.Windows.UI.Text.TextScript.phagsPa & Double = js.native
    
    /* 42 */ val runic: typings.winrt.Windows.UI.Text.TextScript.runic & Double = js.native
    
    /* 13 */ val shiftJis: typings.winrt.Windows.UI.Text.TextScript.shiftJis & Double = js.native
    
    /* 32 */ val sinhala: typings.winrt.Windows.UI.Text.TextScript.sinhala & Double = js.native
    
    /* 50 */ val sylotiNagri: typings.winrt.Windows.UI.Text.TextScript.sylotiNagri & Double = js.native
    
    /* 11 */ val symbol: typings.winrt.Windows.UI.Text.TextScript.symbol & Double = js.native
    
    /* 21 */ val syriac: typings.winrt.Windows.UI.Text.TextScript.syriac & Double = js.native
    
    /* 48 */ val taiLe: typings.winrt.Windows.UI.Text.TextScript.taiLe & Double = js.native
    
    /* 28 */ val tamil: typings.winrt.Windows.UI.Text.TextScript.tamil & Double = js.native
    
    /* 29 */ val telugu: typings.winrt.Windows.UI.Text.TextScript.telugu & Double = js.native
    
    /* 22 */ val thaana: typings.winrt.Windows.UI.Text.TextScript.thaana & Double = js.native
    
    /* 12 */ val thai: typings.winrt.Windows.UI.Text.TextScript.thai & Double = js.native
    
    /* 34 */ val tibetan: typings.winrt.Windows.UI.Text.TextScript.tibetan & Double = js.native
    
    /* 63 */ val tifinagh: typings.winrt.Windows.UI.Text.TextScript.tifinagh & Double = js.native
    
    /* 5 */ val turkish: typings.winrt.Windows.UI.Text.TextScript.turkish & Double = js.native
    
    /* 0 */ val undefined: typings.winrt.Windows.UI.Text.TextScript.undefined & Double = js.native
    
    /* 53 */ val unicodeSymbol: typings.winrt.Windows.UI.Text.TextScript.unicodeSymbol & Double = js.native
    
    /* 57 */ val vai: typings.winrt.Windows.UI.Text.TextScript.vai & Double = js.native
    
    /* 9 */ val vietnamese: typings.winrt.Windows.UI.Text.TextScript.vietnamese & Double = js.native
    
    /* 46 */ val yi: typings.winrt.Windows.UI.Text.TextScript.yi & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TextSetOptions")
  @js.native
  object TextSetOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.TextSetOptions & Double] = js.native
    
    /* 6 */ val applyRtfDocumentDefaults: typings.winrt.Windows.UI.Text.TextSetOptions.applyRtfDocumentDefaults & Double = js.native
    
    /* 4 */ val checkTextLimit: typings.winrt.Windows.UI.Text.TextSetOptions.checkTextLimit & Double = js.native
    
    /* 5 */ val formatRtf: typings.winrt.Windows.UI.Text.TextSetOptions.formatRtf & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.UI.Text.TextSetOptions.none & Double = js.native
    
    /* 3 */ val unhide: typings.winrt.Windows.UI.Text.TextSetOptions.unhide & Double = js.native
    
    /* 1 */ val unicodeBidi: typings.winrt.Windows.UI.Text.TextSetOptions.unicodeBidi & Double = js.native
    
    /* 2 */ val unlink: typings.winrt.Windows.UI.Text.TextSetOptions.unlink & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.UnderlineType")
  @js.native
  object UnderlineType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.UnderlineType & Double] = js.native
    
    /* 6 */ val dash: typings.winrt.Windows.UI.Text.UnderlineType.dash & Double = js.native
    
    /* 7 */ val dashDot: typings.winrt.Windows.UI.Text.UnderlineType.dashDot & Double = js.native
    
    /* 8 */ val dashDotDot: typings.winrt.Windows.UI.Text.UnderlineType.dashDotDot & Double = js.native
    
    /* 5 */ val dotted: typings.winrt.Windows.UI.Text.UnderlineType.dotted & Double = js.native
    
    /* 4 */ val double: typings.winrt.Windows.UI.Text.UnderlineType.double & Double = js.native
    
    /* 12 */ val doubleWave: typings.winrt.Windows.UI.Text.UnderlineType.doubleWave & Double = js.native
    
    /* 13 */ val heavyWave: typings.winrt.Windows.UI.Text.UnderlineType.heavyWave & Double = js.native
    
    /* 14 */ val longDash: typings.winrt.Windows.UI.Text.UnderlineType.longDash & Double = js.native
    
    /* 1 */ val none: typings.winrt.Windows.UI.Text.UnderlineType.none & Double = js.native
    
    /* 2 */ val single: typings.winrt.Windows.UI.Text.UnderlineType.single & Double = js.native
    
    /* 10 */ val thick: typings.winrt.Windows.UI.Text.UnderlineType.thick & Double = js.native
    
    /* 15 */ val thickDash: typings.winrt.Windows.UI.Text.UnderlineType.thickDash & Double = js.native
    
    /* 16 */ val thickDashDot: typings.winrt.Windows.UI.Text.UnderlineType.thickDashDot & Double = js.native
    
    /* 17 */ val thickDashDotDot: typings.winrt.Windows.UI.Text.UnderlineType.thickDashDotDot & Double = js.native
    
    /* 18 */ val thickDotted: typings.winrt.Windows.UI.Text.UnderlineType.thickDotted & Double = js.native
    
    /* 19 */ val thickLongDash: typings.winrt.Windows.UI.Text.UnderlineType.thickLongDash & Double = js.native
    
    /* 11 */ val thin: typings.winrt.Windows.UI.Text.UnderlineType.thin & Double = js.native
    
    /* 0 */ val undefined: typings.winrt.Windows.UI.Text.UnderlineType.undefined & Double = js.native
    
    /* 9 */ val wave: typings.winrt.Windows.UI.Text.UnderlineType.wave & Double = js.native
    
    /* 3 */ val words: typings.winrt.Windows.UI.Text.UnderlineType.words & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.VerticalCharacterAlignment")
  @js.native
  object VerticalCharacterAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Text.VerticalCharacterAlignment & Double] = js.native
    
    /* 1 */ val baseline: typings.winrt.Windows.UI.Text.VerticalCharacterAlignment.baseline & Double = js.native
    
    /* 2 */ val bottom: typings.winrt.Windows.UI.Text.VerticalCharacterAlignment.bottom & Double = js.native
    
    /* 0 */ val top: typings.winrt.Windows.UI.Text.VerticalCharacterAlignment.top & Double = js.native
  }
}
