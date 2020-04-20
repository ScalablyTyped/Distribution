package typings.winrt.Windows.Globalization.NumberFormatting

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPercentFormatterFactory extends js.Object {
  def createPercentFormatter(languages: IIterable[String], geographicRegion: String): PercentFormatter
}

object IPercentFormatterFactory {
  @scala.inline
  def apply(createPercentFormatter: (IIterable[String], String) => PercentFormatter): IPercentFormatterFactory = {
    val __obj = js.Dynamic.literal(createPercentFormatter = js.Any.fromFunction2(createPercentFormatter))
    __obj.asInstanceOf[IPercentFormatterFactory]
  }
}

