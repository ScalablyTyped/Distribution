package typings.winrt.Windows.Globalization.NumberFormatting

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPermilleFormatterFactory extends js.Object {
  def createPermilleFormatter(languages: IIterable[String], geographicRegion: String): PermilleFormatter
}

object IPermilleFormatterFactory {
  @scala.inline
  def apply(createPermilleFormatter: (IIterable[String], String) => PermilleFormatter): IPermilleFormatterFactory = {
    val __obj = js.Dynamic.literal(createPermilleFormatter = js.Any.fromFunction2(createPermilleFormatter))
  
    __obj.asInstanceOf[IPermilleFormatterFactory]
  }
}

