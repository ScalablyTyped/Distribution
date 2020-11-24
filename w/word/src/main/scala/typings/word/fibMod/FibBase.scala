package typings.word.fibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [MS-DOC] 2.5.2 FibBase
  */
@js.native
trait FibBase extends js.Object {
  
  /**
    * G - fWhichTblStm (1 bit): Specifies the Table stream to which the FIB
    * refers. When this value is set to 1, use 1Table; when this value is set to
    * 0, use 0Table.
    */
  var fWhichTblStm: Double = js.native
  
  /**
    * nFib (2 bytes): An unsigned integer that specifies the version number of
    * the file format used. Superseded by FibRgCswNew.nFibNew if it is present.
    * This value SHOULD be 0x00C1. Could possibly be 0x00C0 or 0x00C2 but should
    * be treated as if it were 0x00C1.
    */
  var nFib: Double = js.native
}
object FibBase {
  
  @scala.inline
  def apply(fWhichTblStm: Double, nFib: Double): FibBase = {
    val __obj = js.Dynamic.literal(fWhichTblStm = fWhichTblStm.asInstanceOf[js.Any], nFib = nFib.asInstanceOf[js.Any])
    __obj.asInstanceOf[FibBase]
  }
  
  @scala.inline
  implicit class FibBaseOps[Self <: FibBase] (val x: Self) extends AnyVal {
    
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
    def setFWhichTblStm(value: Double): Self = this.set("fWhichTblStm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNFib(value: Double): Self = this.set("nFib", value.asInstanceOf[js.Any])
  }
}
