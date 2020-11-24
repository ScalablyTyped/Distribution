package typings.vueNiceDates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleClickDate extends js.Object {
  
  def changeLastValidDate(date: String): Unit = js.native
  
  def handleClickDate(date: typings.std.Date, `type`: String): Unit = js.native
  
  def initDate(): Unit = js.native
  
  def isValidAndSelectable(date: typings.std.Date): Boolean = js.native
}
object HandleClickDate {
  
  @scala.inline
  def apply(
    changeLastValidDate: String => Unit,
    handleClickDate: (typings.std.Date, String) => Unit,
    initDate: () => Unit,
    isValidAndSelectable: typings.std.Date => Boolean
  ): HandleClickDate = {
    val __obj = js.Dynamic.literal(changeLastValidDate = js.Any.fromFunction1(changeLastValidDate), handleClickDate = js.Any.fromFunction2(handleClickDate), initDate = js.Any.fromFunction0(initDate), isValidAndSelectable = js.Any.fromFunction1(isValidAndSelectable))
    __obj.asInstanceOf[HandleClickDate]
  }
  
  @scala.inline
  implicit class HandleClickDateOps[Self <: HandleClickDate] (val x: Self) extends AnyVal {
    
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
    def setChangeLastValidDate(value: String => Unit): Self = this.set("changeLastValidDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleClickDate(value: (typings.std.Date, String) => Unit): Self = this.set("handleClickDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInitDate(value: () => Unit): Self = this.set("initDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValidAndSelectable(value: typings.std.Date => Boolean): Self = this.set("isValidAndSelectable", js.Any.fromFunction1(value))
  }
}
