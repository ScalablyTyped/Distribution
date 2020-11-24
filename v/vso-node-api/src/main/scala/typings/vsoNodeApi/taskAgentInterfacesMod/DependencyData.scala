package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.vsoNodeApi.anon.KeyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependencyData extends js.Object {
  
  var input: String = js.native
  
  var map: js.Array[KeyString] = js.native
}
object DependencyData {
  
  @scala.inline
  def apply(input: String, map: js.Array[KeyString]): DependencyData = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyData]
  }
  
  @scala.inline
  implicit class DependencyDataOps[Self <: DependencyData] (val x: Self) extends AnyVal {
    
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
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapVarargs(value: KeyString*): Self = this.set("map", js.Array(value :_*))
    
    @scala.inline
    def setMap(value: js.Array[KeyString]): Self = this.set("map", value.asInstanceOf[js.Any])
  }
}
