package typings.word.fibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [MS-DOC] 2.5.11 FibRgCswNew
  */
@js.native
trait FibRgCswNew extends js.Object {
  
  /**
    * nFibNew (2 bytes): An unsigned integer that specifies the version number
    * of the file format that is used. This value MUST be one of the following.
    * 0x00D9, 0x0101, 0x010C, 0x0112.
    */
  var nFibNew: Double = js.native
}
object FibRgCswNew {
  
  @scala.inline
  def apply(nFibNew: Double): FibRgCswNew = {
    val __obj = js.Dynamic.literal(nFibNew = nFibNew.asInstanceOf[js.Any])
    __obj.asInstanceOf[FibRgCswNew]
  }
  
  @scala.inline
  implicit class FibRgCswNewOps[Self <: FibRgCswNew] (val x: Self) extends AnyVal {
    
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
    def setNFibNew(value: Double): Self = this.set("nFibNew", value.asInstanceOf[js.Any])
  }
}
