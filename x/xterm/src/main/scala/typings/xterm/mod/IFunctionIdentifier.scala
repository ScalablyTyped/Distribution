package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFunctionIdentifier extends js.Object {
  
  /**
    * Final byte, must be in range \x40 .. \x7e for CSI and DCS,
    * \x30 .. \x7e for ESC.
    */
  var `final`: String = js.native
  
  /**
    * Optional intermediate bytes, must be in range \x20 .. \x2f.
    * Usable in CSI, DCS and ESC.
    */
  var intermediates: js.UndefOr[String] = js.native
  
  /**
    * Optional prefix byte, must be in range \x3c .. \x3f.
    * Usable in CSI and DCS.
    */
  var prefix: js.UndefOr[String] = js.native
}
object IFunctionIdentifier {
  
  @scala.inline
  def apply(`final`: String): IFunctionIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFunctionIdentifier]
  }
  
  @scala.inline
  implicit class IFunctionIdentifierOps[Self <: IFunctionIdentifier] (val x: Self) extends AnyVal {
    
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
    def setFinal(value: String): Self = this.set("final", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntermediates(value: String): Self = this.set("intermediates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntermediates: Self = this.set("intermediates", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
