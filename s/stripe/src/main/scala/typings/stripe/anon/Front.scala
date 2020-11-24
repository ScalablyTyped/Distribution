package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Front extends js.Object {
  
  /**
    * The back of a document returned by a file upload with a purpose value of identity_document.
    */
  var back: String = js.native
  
  /**
    * The front of a document returned by a file upload with a purpose value of identity_document.
    */
  var front: String = js.native
}
object Front {
  
  @scala.inline
  def apply(back: String, front: String): Front = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
    __obj.asInstanceOf[Front]
  }
  
  @scala.inline
  implicit class FrontOps[Self <: Front] (val x: Self) extends AnyVal {
    
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
    def setBack(value: String): Self = this.set("back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFront(value: String): Self = this.set("front", value.asInstanceOf[js.Any])
  }
}
