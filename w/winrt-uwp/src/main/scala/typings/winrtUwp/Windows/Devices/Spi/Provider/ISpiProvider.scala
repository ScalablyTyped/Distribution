package typings.winrtUwp.Windows.Devices.Spi.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents actions common to SPI controller providers. */
@js.native
trait ISpiProvider extends js.Object {
  
  var getControllersAsync: js.Any = js.native
}
object ISpiProvider {
  
  @scala.inline
  def apply(getControllersAsync: js.Any): ISpiProvider = {
    val __obj = js.Dynamic.literal(getControllersAsync = getControllersAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpiProvider]
  }
  
  @scala.inline
  implicit class ISpiProviderOps[Self <: ISpiProvider] (val x: Self) extends AnyVal {
    
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
    def setGetControllersAsync(value: js.Any): Self = this.set("getControllersAsync", value.asInstanceOf[js.Any])
  }
}
