package typings.winrt.Windows.Globalization.NumberFormatting

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPermilleFormatterFactory extends js.Object {
  def createPermilleFormatter(languages: IIterable[String], geographicRegion: String): PermilleFormatter = js.native
}

object IPermilleFormatterFactory {
  @scala.inline
  def apply(createPermilleFormatter: (IIterable[String], String) => PermilleFormatter): IPermilleFormatterFactory = {
    val __obj = js.Dynamic.literal(createPermilleFormatter = js.Any.fromFunction2(createPermilleFormatter))
    __obj.asInstanceOf[IPermilleFormatterFactory]
  }
  @scala.inline
  implicit class IPermilleFormatterFactoryOps[Self <: IPermilleFormatterFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreatePermilleFormatter(value: (IIterable[String], String) => PermilleFormatter): Self = this.set("createPermilleFormatter", js.Any.fromFunction2(value))
  }
  
}

