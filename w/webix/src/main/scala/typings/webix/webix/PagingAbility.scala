package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagingAbility extends StObject {
  
  def getPage(): Double
  
  def getPager(): js.Any
  
  def setPage(page: Double): Unit
}
object PagingAbility {
  
  inline def apply(getPage: () => Double, getPager: () => js.Any, setPage: Double => Unit): PagingAbility = {
    val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction0(getPage), getPager = js.Any.fromFunction0(getPager), setPage = js.Any.fromFunction1(setPage))
    __obj.asInstanceOf[PagingAbility]
  }
  
  extension [Self <: PagingAbility](x: Self) {
    
    inline def setGetPage(value: () => Double): Self = StObject.set(x, "getPage", js.Any.fromFunction0(value))
    
    inline def setGetPager(value: () => js.Any): Self = StObject.set(x, "getPager", js.Any.fromFunction0(value))
    
    inline def setSetPage(value: Double => Unit): Self = StObject.set(x, "setPage", js.Any.fromFunction1(value))
  }
}
