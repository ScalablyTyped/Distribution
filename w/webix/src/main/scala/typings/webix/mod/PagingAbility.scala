package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagingAbility extends StObject {
  
  def getPage(): Double
  
  def getPager(): js.Any
  
  def setPage(page: Double): Unit
}
object PagingAbility {
  
  @JSImport("webix", "PagingAbility")
  @js.native
  val ^ : PagingAbility = js.native
  
  extension [Self <: PagingAbility](x: Self) {
    
    inline def setGetPage(value: () => Double): Self = StObject.set(x, "getPage", js.Any.fromFunction0(value))
    
    inline def setGetPager(value: () => js.Any): Self = StObject.set(x, "getPager", js.Any.fromFunction0(value))
    
    inline def setSetPage(value: Double => Unit): Self = StObject.set(x, "setPage", js.Any.fromFunction1(value))
  }
}
