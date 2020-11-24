package typings.unlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Neighbours_ extends js.Object {
  
  var e: String = js.native
  
  var n: String = js.native
  
  @JSName("ne")
  var ne_FNeighbours_ : String = js.native
  
  var nw: String = js.native
  
  var s: String = js.native
  
  var se: String = js.native
  
  var sw: String = js.native
  
  var w: String = js.native
}
object Neighbours_ {
  
  @scala.inline
  def apply(e: String, n: String, ne: String, nw: String, s: String, se: String, sw: String, w: String): Neighbours_ = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], ne = ne.asInstanceOf[js.Any], nw = nw.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Neighbours_]
  }
  
  @scala.inline
  implicit class Neighbours_Ops[Self <: Neighbours_] (val x: Self) extends AnyVal {
    
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
    def setE(value: String): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNe(value: String): Self = this.set("ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNw(value: String): Self = this.set("nw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSe(value: String): Self = this.set("se", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSw(value: String): Self = this.set("sw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: String): Self = this.set("w", value.asInstanceOf[js.Any])
  }
}
