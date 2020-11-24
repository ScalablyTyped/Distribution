package typings.winrt.global.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Globalization.NumberFormatting")
@js.native
object NumberFormatting extends js.Object {
  
  @js.native
  class CurrencyFormatter protected ()
    extends typings.winrt.Windows.Globalization.NumberFormatting.CurrencyFormatter {
    def this(currencyCode: String) = this()
    def this(currencyCode: String, languages: IIterable[String], geographicRegion: String) = this()
  }
  
  @js.native
  class DecimalFormatter ()
    extends typings.winrt.Windows.Globalization.NumberFormatting.DecimalFormatter {
    def this(languages: IIterable[String], geographicRegion: String) = this()
  }
  
  @js.native
  class PercentFormatter ()
    extends typings.winrt.Windows.Globalization.NumberFormatting.PercentFormatter {
    def this(languages: IIterable[String], geographicRegion: String) = this()
  }
  
  @js.native
  class PermilleFormatter ()
    extends typings.winrt.Windows.Globalization.NumberFormatting.PermilleFormatter {
    def this(languages: IIterable[String], geographicRegion: String) = this()
  }
}
