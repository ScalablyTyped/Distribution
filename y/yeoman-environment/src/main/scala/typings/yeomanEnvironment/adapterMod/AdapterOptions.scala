package typings.yeomanEnvironment.adapterMod

import typings.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for creating an adapter.
  */
@js.native
trait AdapterOptions extends js.Object {
  
  /**
    * A console-object for logging messages.
    */
  var console: js.UndefOr[Console] = js.native
}
object AdapterOptions {
  
  @scala.inline
  def apply(): AdapterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdapterOptions]
  }
  
  @scala.inline
  implicit class AdapterOptionsOps[Self <: AdapterOptions] (val x: Self) extends AnyVal {
    
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
    def setConsole(value: Console): Self = this.set("console", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsole: Self = this.set("console", js.undefined)
  }
}
