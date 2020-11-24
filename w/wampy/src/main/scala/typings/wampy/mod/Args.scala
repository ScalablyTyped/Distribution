package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Args extends js.Object {
  
  var argsDict: Dict = js.native
  
  var argsList: js.Array[_] = js.native
}
object Args {
  
  @scala.inline
  def apply(argsDict: Dict, argsList: js.Array[_]): Args = {
    val __obj = js.Dynamic.literal(argsDict = argsDict.asInstanceOf[js.Any], argsList = argsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    
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
    def setArgsDict(value: Dict): Self = this.set("argsDict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsListVarargs(value: js.Any*): Self = this.set("argsList", js.Array(value :_*))
    
    @scala.inline
    def setArgsList(value: js.Array[_]): Self = this.set("argsList", value.asInstanceOf[js.Any])
  }
}
