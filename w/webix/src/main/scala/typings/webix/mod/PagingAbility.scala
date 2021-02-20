package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagingAbility extends StObject {
  
  def getPage(): Double = js.native
  
  def getPager(): js.Any = js.native
  
  def setPage(page: Double): Unit = js.native
}
object PagingAbility {
  
  @JSImport("webix", "PagingAbility")
  @js.native
  val ^ : PagingAbility = js.native
  
  @scala.inline
  implicit class PagingAbilityMutableBuilder[Self <: PagingAbility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPage(value: () => Double): Self = StObject.set(x, "getPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPager(value: () => js.Any): Self = StObject.set(x, "getPager", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPage(value: Double => Unit): Self = StObject.set(x, "setPage", js.Any.fromFunction1(value))
  }
}
