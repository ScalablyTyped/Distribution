package typings.word.fibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [MS-DOC] 2.5.6 FibRgFcLcb97
  */
@js.native
trait FibRgFcLcb extends js.Object {
  
  /**
    * fcClx (4 bytes):  An unsigned integer that specifies an offset in the
    * Table Stream. A Clx begins at this offset.
    */
  var fcClx: Double = js.native
  
  /**
    * fcPlcfBtePapx (4 bytes): An unsigned integer that specifies an offset in
    * the Table Stream. A PlcBtePapx begins at the offset. fcPlcfBtePapx MUST be
    * greater than zero, and MUST be a valid offset in the Table Stream.
    */
  var fcPlcfBtePapx: Double = js.native
  
  /**
    * lcbClx (4 bytes):  An unsigned integer that specifies the size, in bytes,
    * of the Clx at offset fcClx in the Table Stream. This value MUST be greater
    * than zero.
    */
  var lcbClx: Double = js.native
  
  /**
    * lcbPlcfBtePapx (4 bytes): An unsigned integer that specifies the size, in
    * bytes, of the PlcBtePapx at offset fcPlcfBtePapx in the Table Stream.
    * lcbPlcfBteChpx MUST be greater than zero.
    */
  var lcbPlcfBtePapx: Double = js.native
}
object FibRgFcLcb {
  
  @scala.inline
  def apply(fcClx: Double, fcPlcfBtePapx: Double, lcbClx: Double, lcbPlcfBtePapx: Double): FibRgFcLcb = {
    val __obj = js.Dynamic.literal(fcClx = fcClx.asInstanceOf[js.Any], fcPlcfBtePapx = fcPlcfBtePapx.asInstanceOf[js.Any], lcbClx = lcbClx.asInstanceOf[js.Any], lcbPlcfBtePapx = lcbPlcfBtePapx.asInstanceOf[js.Any])
    __obj.asInstanceOf[FibRgFcLcb]
  }
  
  @scala.inline
  implicit class FibRgFcLcbOps[Self <: FibRgFcLcb] (val x: Self) extends AnyVal {
    
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
    def setFcClx(value: Double): Self = this.set("fcClx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcPlcfBtePapx(value: Double): Self = this.set("fcPlcfBtePapx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLcbClx(value: Double): Self = this.set("lcbClx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLcbPlcfBtePapx(value: Double): Self = this.set("lcbPlcfBtePapx", value.asInstanceOf[js.Any])
  }
}
