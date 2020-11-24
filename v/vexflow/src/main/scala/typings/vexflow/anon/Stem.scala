package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stem extends js.Object {
  
  var clef: String = js.native
  
  var stem: String = js.native
  
  var time: String = js.native
}
object Stem {
  
  @scala.inline
  def apply(clef: String, stem: String, time: String): Stem = {
    val __obj = js.Dynamic.literal(clef = clef.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stem]
  }
  
  @scala.inline
  implicit class StemOps[Self <: Stem] (val x: Self) extends AnyVal {
    
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
    def setClef(value: String): Self = this.set("clef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStem(value: String): Self = this.set("stem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
