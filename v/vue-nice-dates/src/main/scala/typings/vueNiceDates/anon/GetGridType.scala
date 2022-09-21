package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGridType extends StObject {
  
  def getGridType(`type`: String, isReverse: Boolean): String
  
  def handleClickDate(date: js.Date, `type`: String): Unit
  
  def handleClickTitle(): Unit
  
  def handleMouseEnterDate(date: js.Date): Unit
  
  def handleMouseLeaveDates(): Unit
  
  def handleNavigate(date: js.Date): Unit
}
object GetGridType {
  
  inline def apply(
    getGridType: (String, Boolean) => String,
    handleClickDate: (js.Date, String) => Unit,
    handleClickTitle: () => Unit,
    handleMouseEnterDate: js.Date => Unit,
    handleMouseLeaveDates: () => Unit,
    handleNavigate: js.Date => Unit
  ): GetGridType = {
    val __obj = js.Dynamic.literal(getGridType = js.Any.fromFunction2(getGridType), handleClickDate = js.Any.fromFunction2(handleClickDate), handleClickTitle = js.Any.fromFunction0(handleClickTitle), handleMouseEnterDate = js.Any.fromFunction1(handleMouseEnterDate), handleMouseLeaveDates = js.Any.fromFunction0(handleMouseLeaveDates), handleNavigate = js.Any.fromFunction1(handleNavigate))
    __obj.asInstanceOf[GetGridType]
  }
  
  extension [Self <: GetGridType](x: Self) {
    
    inline def setGetGridType(value: (String, Boolean) => String): Self = StObject.set(x, "getGridType", js.Any.fromFunction2(value))
    
    inline def setHandleClickDate(value: (js.Date, String) => Unit): Self = StObject.set(x, "handleClickDate", js.Any.fromFunction2(value))
    
    inline def setHandleClickTitle(value: () => Unit): Self = StObject.set(x, "handleClickTitle", js.Any.fromFunction0(value))
    
    inline def setHandleMouseEnterDate(value: js.Date => Unit): Self = StObject.set(x, "handleMouseEnterDate", js.Any.fromFunction1(value))
    
    inline def setHandleMouseLeaveDates(value: () => Unit): Self = StObject.set(x, "handleMouseLeaveDates", js.Any.fromFunction0(value))
    
    inline def setHandleNavigate(value: js.Date => Unit): Self = StObject.set(x, "handleNavigate", js.Any.fromFunction1(value))
  }
}
