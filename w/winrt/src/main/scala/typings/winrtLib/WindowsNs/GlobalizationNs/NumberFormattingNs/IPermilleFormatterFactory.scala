package typings
package winrtLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPermilleFormatterFactory extends js.Object {
  def createPermilleFormatter(
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    geographicRegion: java.lang.String
  ): PermilleFormatter
}

object IPermilleFormatterFactory {
  @scala.inline
  def apply(
    createPermilleFormatter: (winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], java.lang.String) => PermilleFormatter
  ): IPermilleFormatterFactory = {
    val __obj = js.Dynamic.literal(createPermilleFormatter = js.Any.fromFunction2(createPermilleFormatter))
  
    __obj.asInstanceOf[IPermilleFormatterFactory]
  }
}

