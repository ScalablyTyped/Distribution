package typings.word.fibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fib extends js.Object {
  
  var base: FibBase = js.native
  
  var fibRgCswNew: js.UndefOr[FibRgCswNew] = js.native
  
  var fibRgFcLcbBlob: FibRgFcLcb = js.native
  
  var fibRgLw: FibRgLw97 = js.native
}
object Fib {
  
  @scala.inline
  def apply(base: FibBase, fibRgFcLcbBlob: FibRgFcLcb, fibRgLw: FibRgLw97): Fib = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], fibRgFcLcbBlob = fibRgFcLcbBlob.asInstanceOf[js.Any], fibRgLw = fibRgLw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fib]
  }
  
  @scala.inline
  implicit class FibOps[Self <: Fib] (val x: Self) extends AnyVal {
    
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
    def setBase(value: FibBase): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFibRgFcLcbBlob(value: FibRgFcLcb): Self = this.set("fibRgFcLcbBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFibRgLw(value: FibRgLw97): Self = this.set("fibRgLw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFibRgCswNew(value: FibRgCswNew): Self = this.set("fibRgCswNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFibRgCswNew: Self = this.set("fibRgCswNew", js.undefined)
  }
}
