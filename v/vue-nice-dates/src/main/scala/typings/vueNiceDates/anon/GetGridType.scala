package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGridType extends StObject {
  
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
  implicit class GetGridTypeMutableBuilder[Self <: GetGridType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGridType(value: (String, Boolean) => String): Self = StObject.set(x, "getGridType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHandleClickDate(value: (typings.std.Date, String) => Unit): Self = StObject.set(x, "handleClickDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHandleClickTitle(value: () => Unit): Self = StObject.set(x, "handleClickTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleMouseEnterDate(value: typings.std.Date => Unit): Self = StObject.set(x, "handleMouseEnterDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleMouseLeaveDates(value: () => Unit): Self = StObject.set(x, "handleMouseLeaveDates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleNavigate(value: typings.std.Date => Unit): Self = StObject.set(x, "handleNavigate", js.Any.fromFunction1(value))
  }
}
