package typings.upngJs.mod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuantizeResult extends js.Object {
  
  var abuf: ArrayBuffer = js.native
  
  var inds: Uint8Array = js.native
  
  // Type is complicated and I am too lazy to work it out right now, sorry!
  var plte: js.Array[_] = js.native
}
object QuantizeResult {
  
  @scala.inline
  def apply(abuf: ArrayBuffer, inds: Uint8Array, plte: js.Array[_]): QuantizeResult = {
    val __obj = js.Dynamic.literal(abuf = abuf.asInstanceOf[js.Any], inds = inds.asInstanceOf[js.Any], plte = plte.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantizeResult]
  }
  
  @scala.inline
  implicit class QuantizeResultOps[Self <: QuantizeResult] (val x: Self) extends AnyVal {
    
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
    def setAbuf(value: ArrayBuffer): Self = this.set("abuf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInds(value: Uint8Array): Self = this.set("inds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlteVarargs(value: js.Any*): Self = this.set("plte", js.Array(value :_*))
    
    @scala.inline
    def setPlte(value: js.Array[_]): Self = this.set("plte", value.asInstanceOf[js.Any])
  }
}
