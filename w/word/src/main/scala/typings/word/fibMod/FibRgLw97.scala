package typings.word.fibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [MS-DOC] 2.5.4 FibRgLw97
  */
@js.native
trait FibRgLw97 extends js.Object {
  
  /**
    * ccpAtn (4 bytes): A signed integer that specifies the count of CPs in the
    * comment subdocument. This value MUST be zero, 1, or greater.
    */
  var ccpAtn: Double = js.native
  
  /**
    * ccpEdn (4 bytes): A signed integer that specifies the count of CPs in the
    * endnote subdocument. This value MUST be zero, 1, or greater.
    */
  var ccpEdn: Double = js.native
  
  /**
    * ccpFtn (4 bytes): A signed integer that specifies the count of CPs in the
    * footnote subdocument. This value MUST be zero, 1, or greater.
    */
  var ccpFtn: Double = js.native
  
  /**
    * ccpHdd (4 bytes): A signed integer that specifies the count of CPs in the
    * header subdocument. This value MUST be zero, 1, or greater.
    */
  var ccpHdd: Double = js.native
  
  /**
    * ccpHdrTxbx (4 bytes): A signed integer that specifies the count of CPs in
    * the textbox subdocument of the header. This value MUST be zero, 1, or
    * greater.
    */
  var ccpHdrTxbx: Double = js.native
  
  /**
    * ccpText (4 bytes): A signed integer that specifies the count of CPs in the
    * main document. This value MUST be zero, 1, or greater.
    */
  var ccpText: Double = js.native
  
  /**
    * ccpTxbx (4 bytes): A signed integer that specifies the count of CPs in the
    * textbox subdocument of the main document. This value MUST be zero, 1, or
    * greater.
    */
  var ccpTxbx: Double = js.native
}
object FibRgLw97 {
  
  @scala.inline
  def apply(
    ccpAtn: Double,
    ccpEdn: Double,
    ccpFtn: Double,
    ccpHdd: Double,
    ccpHdrTxbx: Double,
    ccpText: Double,
    ccpTxbx: Double
  ): FibRgLw97 = {
    val __obj = js.Dynamic.literal(ccpAtn = ccpAtn.asInstanceOf[js.Any], ccpEdn = ccpEdn.asInstanceOf[js.Any], ccpFtn = ccpFtn.asInstanceOf[js.Any], ccpHdd = ccpHdd.asInstanceOf[js.Any], ccpHdrTxbx = ccpHdrTxbx.asInstanceOf[js.Any], ccpText = ccpText.asInstanceOf[js.Any], ccpTxbx = ccpTxbx.asInstanceOf[js.Any])
    __obj.asInstanceOf[FibRgLw97]
  }
  
  @scala.inline
  implicit class FibRgLw97Ops[Self <: FibRgLw97] (val x: Self) extends AnyVal {
    
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
    def setCcpAtn(value: Double): Self = this.set("ccpAtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcpEdn(value: Double): Self = this.set("ccpEdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcpFtn(value: Double): Self = this.set("ccpFtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcpHdd(value: Double): Self = this.set("ccpHdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcpHdrTxbx(value: Double): Self = this.set("ccpHdrTxbx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcpText(value: Double): Self = this.set("ccpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcpTxbx(value: Double): Self = this.set("ccpTxbx", value.asInstanceOf[js.Any])
  }
}
