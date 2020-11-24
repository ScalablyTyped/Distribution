package typings.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _EM extends js.Object {
  
  @JSName("_$endMarker$_")
  var _DollarendMarkerDollar_ : Double = js.native
}
object _EM {
  
  @scala.inline
  def apply(_DollarendMarkerDollar_ : Double): _EM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_$endMarker$_")(_DollarendMarkerDollar_.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EM]
  }
  
  @scala.inline
  implicit class _EMOps[Self <: _EM] (val x: Self) extends AnyVal {
    
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
    def set_DollarendMarkerDollar_(value: Double): Self = this.set("_$endMarker$_", value.asInstanceOf[js.Any])
  }
}
