package typings.uifabricStyling

import typings.uifabricMergeStyles.irawstylebaseMod.IFontWeight
import typings.uifabricStyling.ifontstylesMod.IFontStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles/fonts", JSImport.Namespace)
@js.native
object fontsMod extends js.Object {
  def createFontStyles(): IFontStyles = js.native
  def createFontStyles(localeCode: String): IFontStyles = js.native
  @js.native
  object FontSizes extends js.Object {
    val icon: String = js.native
    val large: String = js.native
    val medium: String = js.native
    val mediumPlus: String = js.native
    val mega: String = js.native
    val mini: String = js.native
    val small: String = js.native
    val smallPlus: String = js.native
    val superLarge: String = js.native
    val xLarge: String = js.native
    val xLargePlus: String = js.native
    val xSmall: String = js.native
    val xxLarge: String = js.native
    val xxLargePlus: String = js.native
  }
  
  @js.native
  object FontWeights extends js.Object {
    val bold: IFontWeight = js.native
    val light: IFontWeight = js.native
    val regular: IFontWeight = js.native
    val semibold: IFontWeight = js.native
    val semilight: IFontWeight = js.native
  }
  
  @js.native
  object IconFontSizes extends js.Object {
    val large: String = js.native
    val medium: String = js.native
    val small: String = js.native
    val xSmall: String = js.native
  }
  
  @js.native
  object LocalizedFontFamilies extends js.Object {
    val Arabic: String = js.native
    val Armenian: String = js.native
    val ChineseSimplified: /* "'Microsoft Yahei UI', Verdana, Simsun" */ String = js.native
    val ChineseTraditional: /* "'Microsoft Jhenghei UI', Pmingliu" */ String = js.native
    val Cyrillic: String = js.native
    val EastEuropean: String = js.native
    val Georgian: String = js.native
    val Greek: String = js.native
    val Hebrew: String = js.native
    val Hindi: /* "'Nirmala UI'" */ String = js.native
    val Japanese: /* "'Yu Gothic UI', 'Meiryo UI', Meiryo, 'MS Pgothic', Osaka" */ String = js.native
    val Korean: /* "'Malgun Gothic', Gulim" */ String = js.native
    val Selawik: String = js.native
    val Thai: /* "'Leelawadee UI Web', 'Kmer UI'" */ String = js.native
    val Vietnamese: String = js.native
    val WestEuropean: String = js.native
  }
  
  @js.native
  object LocalizedFontNames extends js.Object {
    val Arabic: /* "Segoe UI Web (Arabic)" */ String = js.native
    val Armenian: /* "Segoe UI Web (Armenian)" */ String = js.native
    val Cyrillic: /* "Segoe UI Web (Cyrillic)" */ String = js.native
    val EastEuropean: /* "Segoe UI Web (East European)" */ String = js.native
    val Georgian: /* "Segoe UI Web (Georgian)" */ String = js.native
    val Greek: /* "Segoe UI Web (Greek)" */ String = js.native
    val Hebrew: /* "Segoe UI Web (Hebrew)" */ String = js.native
    val Selawik: /* "Selawik Web" */ String = js.native
    val Thai: /* "Leelawadee UI Web" */ String = js.native
    val Vietnamese: /* "Segoe UI Web (Vietnamese)" */ String = js.native
    val WestEuropean: /* "Segoe UI Web (West European)" */ String = js.native
  }
  
}

