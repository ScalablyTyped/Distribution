package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagingAbility extends StObject {
  
  def getPage(): Double
  
  def getPager(): obj
  
  def setPage(page: Double): Unit
}
object PagingAbility {
  
  inline def apply(getPage: () => Double, getPager: () => obj, setPage: Double => Unit): PagingAbility = {
    val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction0(getPage), getPager = js.Any.fromFunction0(getPager), setPage = js.Any.fromFunction1(setPage))
    __obj.asInstanceOf[PagingAbility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PagingAbility] (val x: Self) extends AnyVal {
    
    inline def setGetPage(value: () => Double): Self = StObject.set(x, "getPage", js.Any.fromFunction0(value))
    
    inline def setGetPager(value: () => obj): Self = StObject.set(x, "getPager", js.Any.fromFunction0(value))
    
    inline def setSetPage(value: Double => Unit): Self = StObject.set(x, "setPage", js.Any.fromFunction1(value))
  }
}
