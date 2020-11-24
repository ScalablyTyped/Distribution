package typings.umzug.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Down extends js.Object {
  
  var down: js.UndefOr[js.Function0[js.Thenable[_]]] = js.native
  
  def up(): js.Thenable[_] = js.native
}
object Down {
  
  @scala.inline
  def apply(up: () => js.Thenable[_]): Down = {
    val __obj = js.Dynamic.literal(up = js.Any.fromFunction0(up))
    __obj.asInstanceOf[Down]
  }
  
  @scala.inline
  implicit class DownOps[Self <: Down] (val x: Self) extends AnyVal {
    
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
    def setUp(value: () => js.Thenable[_]): Self = this.set("up", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDown(value: () => js.Thenable[_]): Self = this.set("down", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
  }
}
