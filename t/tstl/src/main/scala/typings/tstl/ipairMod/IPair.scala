package typings.tstl.ipairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPair[First, Second] extends js.Object {
  
  /**
    * The first element.
    */
  var first: First = js.native
  
  /**
    * The second element.
    */
  var second: Second = js.native
}
object IPair {
  
  @scala.inline
  def apply[First, Second](first: First, second: Second): IPair[First, Second] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPair[First, Second]]
  }
  
  @scala.inline
  implicit class IPairOps[Self <: IPair[_, _], First, Second] (val x: Self with (IPair[First, Second])) extends AnyVal {
    
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
    def setFirst(value: First): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: Second): Self = this.set("second", value.asInstanceOf[js.Any])
  }
}
