package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagingAbility extends js.Object {
  
  def getPage(): Double = js.native
  
  def getPager(): js.Any = js.native
  
  def setPage(page: Double): Unit = js.native
}
object PagingAbility {
  
  @scala.inline
  def apply(getPage: () => Double, getPager: () => js.Any, setPage: Double => Unit): PagingAbility = {
    val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction0(getPage), getPager = js.Any.fromFunction0(getPager), setPage = js.Any.fromFunction1(setPage))
    __obj.asInstanceOf[PagingAbility]
  }
  
  @scala.inline
  implicit class PagingAbilityOps[Self <: PagingAbility] (val x: Self) extends AnyVal {
    
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
    def setGetPage(value: () => Double): Self = this.set("getPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPager(value: () => js.Any): Self = this.set("getPager", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPage(value: Double => Unit): Self = this.set("setPage", js.Any.fromFunction1(value))
  }
}
