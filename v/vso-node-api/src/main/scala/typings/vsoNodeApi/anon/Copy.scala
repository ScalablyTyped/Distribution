package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Copy extends js.Object {
  
  var add: scala.Double = js.native
  
  var copy: scala.Double = js.native
  
  var move: scala.Double = js.native
  
  var remove: scala.Double = js.native
  
  var replace: scala.Double = js.native
  
  var test: scala.Double = js.native
}
object Copy {
  
  @scala.inline
  def apply(
    add: scala.Double,
    copy: scala.Double,
    move: scala.Double,
    remove: scala.Double,
    replace: scala.Double,
    test: scala.Double
  ): Copy = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copy]
  }
  
  @scala.inline
  implicit class CopyOps[Self <: Copy] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: scala.Double): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: scala.Double): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMove(value: scala.Double): Self = this.set("move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: scala.Double): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: scala.Double): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: scala.Double): Self = this.set("test", value.asInstanceOf[js.Any])
  }
}
