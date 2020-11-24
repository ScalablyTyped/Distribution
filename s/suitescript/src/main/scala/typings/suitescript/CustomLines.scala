package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLines extends js.Object {
  
  def addNewLine(): CustomLine = js.native
  
  def getCount(): Double = js.native
  
  def getLine(index: Double): CustomLine = js.native
}
object CustomLines {
  
  @scala.inline
  def apply(addNewLine: () => CustomLine, getCount: () => Double, getLine: Double => CustomLine): CustomLines = {
    val __obj = js.Dynamic.literal(addNewLine = js.Any.fromFunction0(addNewLine), getCount = js.Any.fromFunction0(getCount), getLine = js.Any.fromFunction1(getLine))
    __obj.asInstanceOf[CustomLines]
  }
  
  @scala.inline
  implicit class CustomLinesOps[Self <: CustomLines] (val x: Self) extends AnyVal {
    
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
    def setAddNewLine(value: () => CustomLine): Self = this.set("addNewLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLine(value: Double => CustomLine): Self = this.set("getLine", js.Any.fromFunction1(value))
  }
}
