package typings.vueNiceDates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGridType extends js.Object {
  
  def getGridType(`type`: String, isReverse: Boolean): String = js.native
  
  def handleClickDate(date: typings.std.Date, `type`: String): Unit = js.native
  
  def handleClickTitle(): Unit = js.native
  
  def handleMouseEnterDate(date: typings.std.Date): Unit = js.native
  
  def handleMouseLeaveDates(): Unit = js.native
  
  def handleNavigate(date: typings.std.Date): Unit = js.native
}
object GetGridType {
  
  @scala.inline
  def apply(
    getGridType: (String, Boolean) => String,
    handleClickDate: (typings.std.Date, String) => Unit,
    handleClickTitle: () => Unit,
    handleMouseEnterDate: typings.std.Date => Unit,
    handleMouseLeaveDates: () => Unit,
    handleNavigate: typings.std.Date => Unit
  ): GetGridType = {
    val __obj = js.Dynamic.literal(getGridType = js.Any.fromFunction2(getGridType), handleClickDate = js.Any.fromFunction2(handleClickDate), handleClickTitle = js.Any.fromFunction0(handleClickTitle), handleMouseEnterDate = js.Any.fromFunction1(handleMouseEnterDate), handleMouseLeaveDates = js.Any.fromFunction0(handleMouseLeaveDates), handleNavigate = js.Any.fromFunction1(handleNavigate))
    __obj.asInstanceOf[GetGridType]
  }
  
  @scala.inline
  implicit class GetGridTypeOps[Self <: GetGridType] (val x: Self) extends AnyVal {
    
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
    def setGetGridType(value: (String, Boolean) => String): Self = this.set("getGridType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHandleClickDate(value: (typings.std.Date, String) => Unit): Self = this.set("handleClickDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHandleClickTitle(value: () => Unit): Self = this.set("handleClickTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleMouseEnterDate(value: typings.std.Date => Unit): Self = this.set("handleMouseEnterDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleMouseLeaveDates(value: () => Unit): Self = this.set("handleMouseLeaveDates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleNavigate(value: typings.std.Date => Unit): Self = this.set("handleNavigate", js.Any.fromFunction1(value))
  }
}
