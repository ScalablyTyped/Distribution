package typings.winrt.Windows.Globalization.NumberFormatting

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPercentFormatterFactory extends js.Object {
  
  def createPercentFormatter(languages: IIterable[String], geographicRegion: String): PercentFormatter = js.native
}
object IPercentFormatterFactory {
  
  @scala.inline
  def apply(createPercentFormatter: (IIterable[String], String) => PercentFormatter): IPercentFormatterFactory = {
    val __obj = js.Dynamic.literal(createPercentFormatter = js.Any.fromFunction2(createPercentFormatter))
    __obj.asInstanceOf[IPercentFormatterFactory]
  }
  
  @scala.inline
  implicit class IPercentFormatterFactoryOps[Self <: IPercentFormatterFactory] (val x: Self) extends AnyVal {
    
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
    def setCreatePercentFormatter(value: (IIterable[String], String) => PercentFormatter): Self = this.set("createPercentFormatter", js.Any.fromFunction2(value))
  }
}
