package typings.tensorflow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Graph_ extends js.Object {
  
  def createSession(): Session = js.native
  
  def delete(): js.Any = js.native
}
object Graph_ {
  
  @scala.inline
  def apply(createSession: () => Session, delete: () => js.Any): Graph_ = {
    val __obj = js.Dynamic.literal(createSession = js.Any.fromFunction0(createSession), delete = js.Any.fromFunction0(delete))
    __obj.asInstanceOf[Graph_]
  }
  
  @scala.inline
  implicit class Graph_Ops[Self <: Graph_] (val x: Self) extends AnyVal {
    
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
    def setCreateSession(value: () => Session): Self = this.set("createSession", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = this.set("delete", js.Any.fromFunction0(value))
  }
}
