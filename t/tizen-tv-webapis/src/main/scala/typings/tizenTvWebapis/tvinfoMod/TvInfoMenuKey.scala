package typings.tizenTvWebapis.tvinfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TvInfoMenuKey extends StObject
@JSImport("tizen-tv-webapis/tvinfo", "TvInfoMenuKey")
@js.native
object TvInfoMenuKey extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TvInfoMenuKey & Double] = js.native
  
  /**
    * Focus zoom menu value
    * expected value TvInfoMenuValue
    * unsigned long OFF = 0;
    * unsigned long ON = 1;
    */
  @js.native
  sealed trait ACCESSIBILITY_FOCUS_ZOOM
    extends StObject
       with TvInfoMenuKey
  /* 12 */ val ACCESSIBILITY_FOCUS_ZOOM: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.ACCESSIBILITY_FOCUS_ZOOM & Double = js.native
  
  /**
    * High Contrast menu value
    * expected value TvInfoMenuValue
    * unsigned long OFF = 0;
    * unsigned long ON = 1;
    */
  @js.native
  sealed trait ACCESSIBILITY_HIGH_CONTRAST
    extends StObject
       with TvInfoMenuKey
  /* 13 */ val ACCESSIBILITY_HIGH_CONTRAST: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.ACCESSIBILITY_HIGH_CONTRAST & Double = js.native
  
  /**
    * voice guide speed
    * expected value TvInfoMenuValue
    * DOMString VOICEGUIDE_SPEED_VERY_FAST = "VERY_FAST";
    * DOMString VOICEGUIDE_SPEED_FAST = "FAST";
    * DOMString VOICEGUIDE_SPEED_NORMAL= "NORMAL";
    * DOMString VOICEGUIDE_SPEED_SLOW = "SLOW";
    * DOMString VOICEGUIDE_SPEED_VERY_SLOW  = "VERY_SLOW";
    */
  @js.native
  sealed trait ACCESSIBILITY_VOICE_GUIDE_SPEED
    extends StObject
       with TvInfoMenuKey
  /* 20 */ val ACCESSIBILITY_VOICE_GUIDE_SPEED: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.ACCESSIBILITY_VOICE_GUIDE_SPEED & Double = js.native
  
  /**
    * Caption text background color
    * expected value TvInfoMenuValue
    * unsigned long CAPTION_COLOR_DEFAULT = 0;
    * unsigned long CAPTION_COLOR_WHITE = 1;
    * unsigned long CAPTION_COLOR_BLACK = 2;
    * unsigned long CAPTION_COLOR_RED = 3;
    * unsigned long CAPTION_COLOR_GREEN = 4;
    * unsigned long CAPTION_COLOR_BLUE = 5;
    * unsigned long CAPTION_COLOR_YELLOW = 6;
    * unsigned long CAPTION_COLOR_MAGENTA = 7;
    * unsigned long CAPTION_COLOR_CYAN = 8;
    */
  @js.native
  sealed trait CAPTION_BG_COLOR_KEY
    extends StObject
       with TvInfoMenuKey
  /* 6 */ val CAPTION_BG_COLOR_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.CAPTION_BG_COLOR_KEY & Double = js.native
  
  /**
    * Caption text background opacity
    * expected value TvInfoMenuValue
    * unsigned long CAPTION_OPACITY_SOLID = 0;
    * unsigned long CAPTION_OPACITY_FLASH = 1;
    * unsigned long CAPTION_OPACITY_TRANSLUCENT = 2;
    * unsigned long CAPTION_OPACITY_TRANSPARENT = 3;
    * unsigned long CAPTION_OPACITY_DEFAULT = 4;
    * unsigned long CAPTION_OPACITY_HIGHLY_TRANSLUCENT = 5;
    * unsigned long CAPTION_OPACITY_SLIGHTLY_TRANSLUCENT = 6;
    */
  @js.native
  sealed trait CAPTION_BG_OPACITY_KEY
    extends StObject
       with TvInfoMenuKey
  /* 7 */ val CAPTION_BG_OPACITY_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.CAPTION_BG_OPACITY_KEY & Double = js.native
  
  /**
    * Caption text edge color
    * expected value TvInfoMenuValue
    * unsigned long CAPTION_COLOR_DEFAULT = 0;
    * unsigned long CAPTION_COLOR_WHITE = 1;
    * unsigned long CAPTION_COLOR_BLACK = 2;
    * unsigned long CAPTION_COLOR_RED = 3;
    * unsigned long CAPTION_COLOR_GREEN = 4;
    * unsigned long CAPTION_COLOR_BLUE = 5;
    * unsigned long CAPTION_COLOR_YELLOW = 6;
    * unsigned long CAPTION_COLOR_MAGENTA = 7;
    * unsigned long CAPTION_COLOR_CYAN = 8;
    */
  @js.native
  sealed trait CAPTION_EDGE_COLOR_KEY
    extends StObject
       with TvInfoMenuKey
  /* 9 */ val CAPTION_EDGE_COLOR_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.CAPTION_EDGE_COLOR_KEY & Double = js.native
  
  /**
    * Caption text edge type
    * expected value TvInfoMenuValue
    * unsigned long CAPTION_EDGE_NONE = 0;
    * unsigned long CAPTION_EDGE_RAISED = 1;
    * unsigned long CAPTION_EDGE_DEPRESSED = 2;
    * unsigned long CAPTION_EDGE_UNIFORM = 3;
    * unsigned long CAPTION_EDGE_DROP_SHADOWED = 4;
    */
  @js.native
  sealed trait CAPTION_EDGE_TYPE_KEY
    extends StObject
       with TvInfoMenuKey
  /* 8 */ val CAPTION_EDGE_TYPE_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.CAPTION_EDGE_TYPE_KEY & Double = js.native
  
  /**
    * Caption text foreground color
    * expected value TvInfoMenuValue
    * unsigned long CAPTION_COLOR_DEFAULT = 0;
    * unsigned long CAPTION_COLOR_WHITE = 1;
    * unsigned long CAPTION_COLOR_BLACK = 2;
    * unsigned long CAPTION_COLOR_RED = 3;
    * unsigned long CAPTION_COLOR_GREEN = 4;
    * unsigned long CAPTION_COLOR_BLUE = 5;
    * unsigned long CAPTION_COLOR_YELLOW = 6;
    * unsigned long CAPTION_COLOR_MAGENTA = 7;
    * unsigned long CAPTION_COLOR_CYAN = 8;
    */
  @js.native
  sealed trait CAPTION_FG_COLOR_KEY
    extends StObject
       with TvInfoMenuKey
  /* 4 */ val CAPTION_FG_COLOR_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.CAPTION_FG_COLOR_KEY & Double = js.native
  
  /**
    * Caption text foreground opacity
    * expected value TvInfoMenuValue
    * unsigned long CAPTION_OPACITY_SOLID = 0;
    * unsigned long CAPTION_OPACITY_FLASH = 1;
    * unsigned long CAPTION_OPACITY_TRANSLUCENT = 2;
    * unsigned long CAPTION_OPACITY_TRANSPARENT = 3;
    * unsigned long CAPTION_OPACITY_DEFAULT = 4;
    * unsigned long CAPTION_OPACITY_HIGHLY_TRANSLUCENT = 5;
    * unsigned long CAPTION_OPACITY_SLIGHTLY_TRANSLUCENT = 6;
    */
  @js.native
  sealed trait CAPTION_FG_OPACITY_KEY
    extends StObject
       with TvInfoMenuKey
  /* 5 */ val CAPTION_FG_OPACITY_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.CAPTION_FG_OPACITY_KEY & Double = js.native
  
  /**
    * expected value TvInfoMenuValue
    * unsigned long CAPTION_SIZE_DEFAULT = 0;
    * unsigned long CAPTION_SIZE_SMALL = 1;
    * unsigned long CAPTION_SIZE_STANDARD = 2;
    * unsigned long CAPTION_SIZE_LARGE = 3;
    * unsigned long CAPTION_SIZE_EXTRA_LARGE = 4;
    */
  @js.native
  sealed trait CAPTION_FONT_SIZE_KEY
    extends StObject
       with TvInfoMenuKey
  /* 2 */ val CAPTION_FONT_SIZE_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.CAPTION_FONT_SIZE_KEY & Double = js.native
  
  /**
    * Caption font style. Default: Style 6
    * expected value TvInfoMenuValue
    * unsigned long CAPTION_FONT_DEFAULT = 0;
    * unsigned long CAPTION_FONT_STYLE0 = 1;
    * unsigned long CAPTION_FONT_STYLE1 = 2;
    * unsigned long CAPTION_FONT_STYLE2 = 3;
    * unsigned long CAPTION_FONT_STYLE3 = 4;
    * unsigned long CAPTION_FONT_STYLE4 = 5;
    * unsigned long CAPTION_FONT_STYLE5 = 6;
    * unsigned long CAPTION_FONT_STYLE6 = 7;
    */
  @js.native
  sealed trait CAPTION_FONT_STYLE_KEY
    extends StObject
       with TvInfoMenuKey
  /* 3 */ val CAPTION_FONT_STYLE_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.CAPTION_FONT_STYLE_KEY & Double = js.native
  
  /**
    * Caption mode. Default: Service 6
    * expected value TvInfoMenuValue
    * unsigned long CAPTION_MODE_DEFAULT = 0;
    * unsigned long CAPTION_MODE_SERVICE1 = 1;
    * unsigned long CAPTION_MODE_SERVICE2 = 2;
    * unsigned long CAPTION_MODE_SERVICE3 = 3;
    * unsigned long CAPTION_MODE_SERVICE4 = 4;
    * unsigned long CAPTION_MODE_SERVICE5 = 5;
    * unsigned long CAPTION_MODE_SERVICE6 = 6;
    * unsigned long CAPTION_MODE_CC1 = 7;
    * unsigned long CAPTION_MODE_CC2 = 8;
    * unsigned long CAPTION_MODE_CC3 = 9;
    * unsigned long CAPTION_MODE_CC4 = 10;
    * unsigned long CAPTION_MODE_TEXT1 = 11;
    * unsigned long CAPTION_MODE_TEXT2 = 12;
    * unsigned long CAPTION_MODE_TEXT3 = 13;
    * unsigned long CAPTION_MODE_TEXT4 = 14;
    */
  @js.native
  sealed trait CAPTION_MODE_KEY
    extends StObject
       with TvInfoMenuKey
  /* 1 */ val CAPTION_MODE_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.CAPTION_MODE_KEY & Double = js.native
  
  /**
    * Caption On/Off
    * expected value TvInfoMenuValue
    * unsigned long CAPTION_OFF = 0;
    * unsigned long CAPTION_ON = 1;
    */
  @js.native
  sealed trait CAPTION_ONOFF_KEY
    extends StObject
       with TvInfoMenuKey
  /* 0 */ val CAPTION_ONOFF_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.CAPTION_ONOFF_KEY & Double = js.native
  
  /**
    * caption style
    * expected value TvInfoMenuValue
    * unsigned long CAPTION_STYLE_DEFAULT = 0;
    * unsigned long CAPTION_STYLE_BOLD = 1;
    * unsigned long CAPTION_STYLE_ITALIC = 2;
    */
  @js.native
  sealed trait CAPTION_STYLE_KEY
    extends StObject
       with TvInfoMenuKey
  /* 21 */ val CAPTION_STYLE_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.CAPTION_STYLE_KEY & Double = js.native
  
  /**
    * Caption text window color
    * expected value TvInfoMenuValue
    * unsigned long CAPTION_COLOR_DEFAULT = 0;
    * unsigned long CAPTION_COLOR_WHITE = 1;
    * unsigned long CAPTION_COLOR_BLACK = 2;
    * unsigned long CAPTION_COLOR_RED = 3;
    * unsigned long CAPTION_COLOR_GREEN = 4;
    * unsigned long CAPTION_COLOR_BLUE = 5;
    * unsigned long CAPTION_COLOR_YELLOW = 6;
    * unsigned long CAPTION_COLOR_MAGENTA = 7;
    * unsigned long CAPTION_COLOR_CYAN = 8;
    */
  @js.native
  sealed trait CAPTION_WINDOW_COLOR_KEY
    extends StObject
       with TvInfoMenuKey
  /* 10 */ val CAPTION_WINDOW_COLOR_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.CAPTION_WINDOW_COLOR_KEY & Double = js.native
  
  /**
    * Caption text window opacity
    * expected value TvInfoMenuValue
    * unsigned long CAPTION_OPACITY_SOLID = 0;
    * unsigned long CAPTION_OPACITY_FLASH = 1;
    * unsigned long CAPTION_OPACITY_TRANSLUCENT = 2;
    * unsigned long CAPTION_OPACITY_TRANSPARENT = 3;
    * unsigned long CAPTION_OPACITY_DEFAULT = 4;
    * unsigned long CAPTION_OPACITY_HIGHLY_TRANSLUCENT = 5;
    * unsigned long CAPTION_OPACITY_SLIGHTLY_TRANSLUCENT = 6;
    */
  @js.native
  sealed trait CAPTION_WINDOW_OPACITY_KEY
    extends StObject
       with TvInfoMenuKey
  /* 11 */ val CAPTION_WINDOW_OPACITY_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.CAPTION_WINDOW_OPACITY_KEY & Double = js.native
  
  /**
    * Primary Audio Language
    * expected value TvInfoMenuValue
    * DOMString AUDIO_LANGUAGE_CODE_AFR = "AFR";
    * DOMString AUDIO_LANGUAGE_CODE_AKA = "AKA";
    * DOMString AUDIO_LANGUAGE_CODE_AMH = "AMH";
    * DOMString AUDIO_LANGUAGE_CODE_ARA = "ARA";
    * DOMString AUDIO_LANGUAGE_CODE_ASM = "ASM";
    * DOMString AUDIO_LANGUAGE_CODE_BEN = "BEN";
    * DOMString AUDIO_LANGUAGE_CODE_BUL = "BUL";
    * DOMString AUDIO_LANGUAGE_CODE_CAT = "CAT";
    * DOMString AUDIO_LANGUAGE_CODE_CHI = "CHI";
    * DOMString AUDIO_LANGUAGE_CODE_CMN = "CMN";
    * DOMString AUDIO_LANGUAGE_CODE_CZE = "CZE";
    * DOMString AUDIO_LANGUAGE_CODE_DAG = "DAG";
    * DOMString AUDIO_LANGUAGE_CODE_DAN = "DAN";
    * DOMString AUDIO_LANGUAGE_CODE_DUT = "DUT";
    * DOMString AUDIO_LANGUAGE_CODE_ENG = "ENG";
    * DOMString AUDIO_LANGUAGE_CODE_EST = "EST";
    * DOMString AUDIO_LANGUAGE_CODE_EUS = "EUS";
    * DOMString AUDIO_LANGUAGE_CODE_EWE = "EWE";
    * DOMString AUDIO_LANGUAGE_CODE_FIN = "FIN";
    * DOMString AUDIO_LANGUAGE_CODE_FRE = "FRE";
    * DOMString AUDIO_LANGUAGE_CODE_GAA = "GAA";
    * DOMString AUDIO_LANGUAGE_CODE_GER = "GER";
    * DOMString AUDIO_LANGUAGE_CODE_GLA = "GLA";
    * DOMString AUDIO_LANGUAGE_CODE_GLG = "GLG";
    * DOMString AUDIO_LANGUAGE_CODE_GOS = "GOS";
    * DOMString AUDIO_LANGUAGE_CODE_GRE = "GRE";
    * DOMString AUDIO_LANGUAGE_CODE_GUJ = "GUJ";
    * DOMString AUDIO_LANGUAGE_CODE_HAU = "HAU";
    * DOMString AUDIO_LANGUAGE_CODE_HEB = "HEB";
    * DOMString AUDIO_LANGUAGE_CODE_HIN = "HIN";
    * DOMString AUDIO_LANGUAGE_CODE_HRV = "HRV";
    * DOMString AUDIO_LANGUAGE_CODE_HUN = "HUN";
    * DOMString AUDIO_LANGUAGE_CODE_IGB = "IGB";
    * DOMString AUDIO_LANGUAGE_CODE_IND = "IND";
    * DOMString AUDIO_LANGUAGE_CODE_IRI = "IRI";
    * DOMString AUDIO_LANGUAGE_CODE_ITA = "ITA";
    * DOMString AUDIO_LANGUAGE_CODE_JPN = "JPN";
    * DOMString AUDIO_LANGUAGE_CODE_KAN = "KAN";
    * DOMString AUDIO_LANGUAGE_CODE_KOK = "KOK";
    * DOMString AUDIO_LANGUAGE_CODE_KOR = "KOR";
    * DOMString AUDIO_LANGUAGE_CODE_LAV = "LAV";
    * DOMString AUDIO_LANGUAGE_CODE_LIT = "LIT";
    * DOMString AUDIO_LANGUAGE_CODE_MAL = "MAL";
    * DOMString AUDIO_LANGUAGE_CODE_MAO = "MAO";
    * DOMString AUDIO_LANGUAGE_CODE_MAR = "MAR";
    * DOMString AUDIO_LANGUAGE_CODE_MSA = "MSA";
    * DOMString AUDIO_LANGUAGE_CODE_NBL = "NBL";
    * DOMString AUDIO_LANGUAGE_CODE_NOR = "NOR";
    * DOMString AUDIO_LANGUAGE_CODE_NSO = "NSO";
    * DOMString AUDIO_LANGUAGE_CODE_NZI = "NZI";
    * DOMString AUDIO_LANGUAGE_CODE_ORI = "ORI";
    * DOMString AUDIO_LANGUAGE_CODE_PAN = "PAN";
    * DOMString AUDIO_LANGUAGE_CODE_PER = "PER";
    * DOMString AUDIO_LANGUAGE_CODE_POL = "POL";
    * DOMString AUDIO_LANGUAGE_CODE_POR = "POR";
    * DOMString AUDIO_LANGUAGE_CODE_QAA = "QAA";
    * DOMString AUDIO_LANGUAGE_CODE_QAB = "QAB";
    * DOMString AUDIO_LANGUAGE_CODE_QAC = "QAC";
    * DOMString AUDIO_LANGUAGE_CODE_ROM = "ROM";
    * DOMString AUDIO_LANGUAGE_CODE_RUS = "RUS";
    * DOMString AUDIO_LANGUAGE_CODE_SLK = "SLK";
    * DOMString AUDIO_LANGUAGE_CODE_SOT = "SOT";
    * DOMString AUDIO_LANGUAGE_CODE_SPA = "SPA";
    * DOMString AUDIO_LANGUAGE_CODE_SRP = "SRP";
    * DOMString AUDIO_LANGUAGE_CODE_SSW = "SSW";
    * DOMString AUDIO_LANGUAGE_CODE_SWA = "SWA";
    * DOMString AUDIO_LANGUAGE_CODE_SWE = "SWE";
    * DOMString AUDIO_LANGUAGE_CODE_TAM = "TAM";
    * DOMString AUDIO_LANGUAGE_CODE_TEL = "TEL";
    * DOMString AUDIO_LANGUAGE_CODE_THA = "THA";
    * DOMString AUDIO_LANGUAGE_CODE_TSN = "TSN";
    * DOMString AUDIO_LANGUAGE_CODE_TSO = "TSO";
    * DOMString AUDIO_LANGUAGE_CODE_TUR = "TUR";
    * DOMString AUDIO_LANGUAGE_CODE_TWI = "TWI";
    * DOMString AUDIO_LANGUAGE_CODE_UKR = "UKR";
    * DOMString AUDIO_LANGUAGE_CODE_VAL = "VAL";
    * DOMString AUDIO_LANGUAGE_CODE_VEN = "VEN";
    * DOMString AUDIO_LANGUAGE_CODE_VIE = "VIE";
    * DOMString AUDIO_LANGUAGE_CODE_WEL = "WEL";
    * DOMString AUDIO_LANGUAGE_CODE_XHO = "XHO";
    * DOMString AUDIO_LANGUAGE_CODE_XSM = "XSM";
    * DOMString AUDIO_LANGUAGE_CODE_YOR = "YOR";
    * DOMString AUDIO_LANGUAGE_CODE_YUE = "YUE";
    * DOMString AUDIO_LANGUAGE_CODE_ZHO = "ZHO";
    * DOMString AUDIO_LANGUAGE_CODE_ZUL = "ZUL";
    * Only the values that can be set in the menu can be set to webapi
    */
  @js.native
  sealed trait PRIMARY_AUDIO_LANGUAGE_KEY
    extends StObject
       with TvInfoMenuKey
  /* 18 */ val PRIMARY_AUDIO_LANGUAGE_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.PRIMARY_AUDIO_LANGUAGE_KEY & Double = js.native
  
  /**
    * Secondary Audio Language
    * expected value TvInfoMenuValue
    * DOMString AUDIO_LANGUAGE_CODE_AFR = "AFR";
    * DOMString AUDIO_LANGUAGE_CODE_AKA = "AKA";
    * DOMString AUDIO_LANGUAGE_CODE_AMH = "AMH";
    * DOMString AUDIO_LANGUAGE_CODE_ARA = "ARA";
    * DOMString AUDIO_LANGUAGE_CODE_ASM = "ASM";
    * DOMString AUDIO_LANGUAGE_CODE_BEN = "BEN";
    * DOMString AUDIO_LANGUAGE_CODE_BUL = "BUL";
    * DOMString AUDIO_LANGUAGE_CODE_CAT = "CAT";
    * DOMString AUDIO_LANGUAGE_CODE_CHI = "CHI";
    * DOMString AUDIO_LANGUAGE_CODE_CMN = "CMN";
    * DOMString AUDIO_LANGUAGE_CODE_CZE = "CZE";
    * DOMString AUDIO_LANGUAGE_CODE_DAG = "DAG";
    * DOMString AUDIO_LANGUAGE_CODE_DAN = "DAN";
    * DOMString AUDIO_LANGUAGE_CODE_DUT = "DUT";
    * DOMString AUDIO_LANGUAGE_CODE_ENG = "ENG";
    * DOMString AUDIO_LANGUAGE_CODE_EST = "EST";
    * DOMString AUDIO_LANGUAGE_CODE_EUS = "EUS";
    * DOMString AUDIO_LANGUAGE_CODE_EWE = "EWE";
    * DOMString AUDIO_LANGUAGE_CODE_FIN = "FIN";
    * DOMString AUDIO_LANGUAGE_CODE_FRE = "FRE";
    * DOMString AUDIO_LANGUAGE_CODE_GAA = "GAA";
    * DOMString AUDIO_LANGUAGE_CODE_GER = "GER";
    * DOMString AUDIO_LANGUAGE_CODE_GLA = "GLA";
    * DOMString AUDIO_LANGUAGE_CODE_GLG = "GLG";
    * DOMString AUDIO_LANGUAGE_CODE_GOS = "GOS";
    * DOMString AUDIO_LANGUAGE_CODE_GRE = "GRE";
    * DOMString AUDIO_LANGUAGE_CODE_GUJ = "GUJ";
    * DOMString AUDIO_LANGUAGE_CODE_HAU = "HAU";
    * DOMString AUDIO_LANGUAGE_CODE_HEB = "HEB";
    * DOMString AUDIO_LANGUAGE_CODE_HIN = "HIN";
    * DOMString AUDIO_LANGUAGE_CODE_HRV = "HRV";
    * DOMString AUDIO_LANGUAGE_CODE_HUN = "HUN";
    * DOMString AUDIO_LANGUAGE_CODE_IGB = "IGB";
    * DOMString AUDIO_LANGUAGE_CODE_IND = "IND";
    * DOMString AUDIO_LANGUAGE_CODE_IRI = "IRI";
    * DOMString AUDIO_LANGUAGE_CODE_ITA = "ITA";
    * DOMString AUDIO_LANGUAGE_CODE_JPN = "JPN";
    * DOMString AUDIO_LANGUAGE_CODE_KAN = "KAN";
    * DOMString AUDIO_LANGUAGE_CODE_KOK = "KOK";
    * DOMString AUDIO_LANGUAGE_CODE_KOR = "KOR";
    * DOMString AUDIO_LANGUAGE_CODE_LAV = "LAV";
    * DOMString AUDIO_LANGUAGE_CODE_LIT = "LIT";
    * DOMString AUDIO_LANGUAGE_CODE_MAL = "MAL";
    * DOMString AUDIO_LANGUAGE_CODE_MAO = "MAO";
    * DOMString AUDIO_LANGUAGE_CODE_MAR = "MAR";
    * DOMString AUDIO_LANGUAGE_CODE_MSA = "MSA";
    * DOMString AUDIO_LANGUAGE_CODE_NBL = "NBL";
    * DOMString AUDIO_LANGUAGE_CODE_NOR = "NOR";
    * DOMString AUDIO_LANGUAGE_CODE_NSO = "NSO";
    * DOMString AUDIO_LANGUAGE_CODE_NZI = "NZI";
    * DOMString AUDIO_LANGUAGE_CODE_ORI = "ORI";
    * DOMString AUDIO_LANGUAGE_CODE_PAN = "PAN";
    * DOMString AUDIO_LANGUAGE_CODE_PER = "PER";
    * DOMString AUDIO_LANGUAGE_CODE_POL = "POL";
    * DOMString AUDIO_LANGUAGE_CODE_POR = "POR";
    * DOMString AUDIO_LANGUAGE_CODE_QAA = "QAA";
    * DOMString AUDIO_LANGUAGE_CODE_QAB = "QAB";
    * DOMString AUDIO_LANGUAGE_CODE_QAC = "QAC";
    * DOMString AUDIO_LANGUAGE_CODE_ROM = "ROM";
    * DOMString AUDIO_LANGUAGE_CODE_RUS = "RUS";
    * DOMString AUDIO_LANGUAGE_CODE_SLK = "SLK";
    * DOMString AUDIO_LANGUAGE_CODE_SOT = "SOT";
    * DOMString AUDIO_LANGUAGE_CODE_SPA = "SPA";
    * DOMString AUDIO_LANGUAGE_CODE_SRP = "SRP";
    * DOMString AUDIO_LANGUAGE_CODE_SSW = "SSW";
    * DOMString AUDIO_LANGUAGE_CODE_SWA = "SWA";
    * DOMString AUDIO_LANGUAGE_CODE_SWE = "SWE";
    * DOMString AUDIO_LANGUAGE_CODE_TAM = "TAM";
    * DOMString AUDIO_LANGUAGE_CODE_TEL = "TEL";
    * DOMString AUDIO_LANGUAGE_CODE_THA = "THA";
    * DOMString AUDIO_LANGUAGE_CODE_TSN = "TSN";
    * DOMString AUDIO_LANGUAGE_CODE_TSO = "TSO";
    * DOMString AUDIO_LANGUAGE_CODE_TUR = "TUR";
    * DOMString AUDIO_LANGUAGE_CODE_TWI = "TWI";
    * DOMString AUDIO_LANGUAGE_CODE_UKR = "UKR";
    * DOMString AUDIO_LANGUAGE_CODE_VAL = "VAL";
    * DOMString AUDIO_LANGUAGE_CODE_VEN = "VEN";
    * DOMString AUDIO_LANGUAGE_CODE_VIE = "VIE";
    * DOMString AUDIO_LANGUAGE_CODE_WEL = "WEL";
    * DOMString AUDIO_LANGUAGE_CODE_XHO = "XHO";
    * DOMString AUDIO_LANGUAGE_CODE_XSM = "XSM";
    * DOMString AUDIO_LANGUAGE_CODE_YOR = "YOR";
    * DOMString AUDIO_LANGUAGE_CODE_YUE = "YUE";
    * DOMString AUDIO_LANGUAGE_CODE_ZHO = "ZHO";
    * DOMString AUDIO_LANGUAGE_CODE_ZUL = "ZUL";
    * Only the values that can be set in the menu can be set to webapi
    */
  @js.native
  sealed trait SECONDARY_AUDIO_LANGUAGE_KEY
    extends StObject
       with TvInfoMenuKey
  /* 19 */ val SECONDARY_AUDIO_LANGUAGE_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.SECONDARY_AUDIO_LANGUAGE_KEY & Double = js.native
  
  /**
    * Channel-bound apps ticker menu value
    * expected value DOMString
    * "OFF", "ON"
    * @since 2.3
    * @note `deprecated` 3.0
    */
  @js.native
  sealed trait SMARTHUB_CHANNEL_BOUND_APPS_TICKER
    extends StObject
       with TvInfoMenuKey
  /* 14 */ val SMARTHUB_CHANNEL_BOUND_APPS_TICKER: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.SMARTHUB_CHANNEL_BOUND_APPS_TICKER & Double = js.native
  
  /**
    * Subtitle mode
    * expected value TvInfoMenuValue
    * unsigned long SUBTITLE_NORMAL = 0;
    * unsigned long SUBTITLE_HEARING_IMMPEARED = 1;
    */
  @js.native
  sealed trait SUBTITLE_MODE_KEY
    extends StObject
       with TvInfoMenuKey
  /* 17 */ val SUBTITLE_MODE_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.SUBTITLE_MODE_KEY & Double = js.native
  
  /**
    * Subtitles On/Off
    * expected value TvInfoMenuValue
    * unsigned long OFF = 0;
    * unsigned long ON = 1;
    */
  @js.native
  sealed trait SUBTITLE_ONOFF_KEY
    extends StObject
       with TvInfoMenuKey
  /* 16 */ val SUBTITLE_ONOFF_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.SUBTITLE_ONOFF_KEY & Double = js.native
  
  /**
    * Voice guide menu value
    * expected value TvInfoMenuValue
    * unsigned long OFF = 0;
    * unsigned long ON = 1;
    */
  @js.native
  sealed trait VOICE_GUIDE_KEY
    extends StObject
       with TvInfoMenuKey
  /* 15 */ val VOICE_GUIDE_KEY: typings.tizenTvWebapis.tvinfoMod.TvInfoMenuKey.VOICE_GUIDE_KEY & Double = js.native
}
