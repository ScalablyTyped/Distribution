package typings
package winrtLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPercentFormatterFactory extends js.Object {
  def createPercentFormatter(
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    geographicRegion: java.lang.String
  ): PercentFormatter
}

object IPercentFormatterFactory {
  @scala.inline
  def apply(
    createPercentFormatter: js.Function2[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], 
      java.lang.String, 
      PercentFormatter
    ]
  ): IPercentFormatterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createPercentFormatter")(createPercentFormatter)
    __obj.asInstanceOf[IPercentFormatterFactory]
  }
}

