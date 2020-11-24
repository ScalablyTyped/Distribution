package typings.xstate.registryMod

import typings.xstate.actorMod.Actor
import typings.xstate.typesMod.AnyEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Registry_ extends js.Object {
  
  def bookId(): String = js.native
  
  def free(id: String): Unit = js.native
  
  def get(id: String): js.UndefOr[Actor[_, AnyEventObject]] = js.native
  
  def register(id: String, actor: Actor[_, AnyEventObject]): String = js.native
}
object Registry_ {
  
  @scala.inline
  def apply(
    bookId: () => String,
    free: String => Unit,
    get: String => js.UndefOr[Actor[_, AnyEventObject]],
    register: (String, Actor[_, AnyEventObject]) => String
  ): Registry_ = {
    val __obj = js.Dynamic.literal(bookId = js.Any.fromFunction0(bookId), free = js.Any.fromFunction1(free), get = js.Any.fromFunction1(get), register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Registry_]
  }
  
  @scala.inline
  implicit class Registry_Ops[Self <: Registry_] (val x: Self) extends AnyVal {
    
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
    def setBookId(value: () => String): Self = this.set("bookId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFree(value: String => Unit): Self = this.set("free", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.UndefOr[Actor[_, AnyEventObject]]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegister(value: (String, Actor[_, AnyEventObject]) => String): Self = this.set("register", js.Any.fromFunction2(value))
  }
}
