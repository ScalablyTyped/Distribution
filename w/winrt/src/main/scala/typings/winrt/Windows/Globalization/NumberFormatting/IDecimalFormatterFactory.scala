package typings.winrt.Windows.Globalization.NumberFormatting

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDecimalFormatterFactory extends js.Object {
  
  def createDecimalFormatter(languages: IIterable[String], geographicRegion: String): DecimalFormatter = js.native
}
object IDecimalFormatterFactory {
  
  @scala.inline
  def apply(createDecimalFormatter: (IIterable[String], String) => DecimalFormatter): IDecimalFormatterFactory = {
    val __obj = js.Dynamic.literal(createDecimalFormatter = js.Any.fromFunction2(createDecimalFormatter))
    __obj.asInstanceOf[IDecimalFormatterFactory]
  }
  
  @scala.inline
  implicit class IDecimalFormatterFactoryOps[Self <: IDecimalFormatterFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateDecimalFormatter(value: (IIterable[String], String) => DecimalFormatter): Self = this.set("createDecimalFormatter", js.Any.fromFunction2(value))
  }
}
