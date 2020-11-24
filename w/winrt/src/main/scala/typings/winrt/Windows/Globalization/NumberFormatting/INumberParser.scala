package typings.winrt.Windows.Globalization.NumberFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INumberParser extends js.Object {
  
  def parseDouble(text: String): Double = js.native
  
  def parseInt(text: String): Double = js.native
  
  def parseUInt(text: String): Double = js.native
}
object INumberParser {
  
  @scala.inline
  def apply(parseDouble: String => Double, parseInt: String => Double, parseUInt: String => Double): INumberParser = {
    val __obj = js.Dynamic.literal(parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt))
    __obj.asInstanceOf[INumberParser]
  }
  
  @scala.inline
  implicit class INumberParserOps[Self <: INumberParser] (val x: Self) extends AnyVal {
    
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
    def setParseDouble(value: String => Double): Self = this.set("parseDouble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseInt(value: String => Double): Self = this.set("parseInt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseUInt(value: String => Double): Self = this.set("parseUInt", js.Any.fromFunction1(value))
  }
}
