package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Milliseconds extends js.Object {
  
  var id: js.Any = js.native
  
  var milliseconds: Double = js.native
}
object Milliseconds {
  
  @scala.inline
  def apply(id: js.Any, milliseconds: Double): Milliseconds = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Milliseconds]
  }
  
  @scala.inline
  implicit class MillisecondsOps[Self <: Milliseconds] (val x: Self) extends AnyVal {
    
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
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilliseconds(value: Double): Self = this.set("milliseconds", value.asInstanceOf[js.Any])
  }
}
