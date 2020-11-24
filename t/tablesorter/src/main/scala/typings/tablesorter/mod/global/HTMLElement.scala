package typings.tablesorter.mod.global

import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLElement extends js.Object {
  
  /**
    * The configuration of the tablesorter.
    */
  var config: TablesorterConfigurationStore[this.type] = js.native
  
  /**
    * A value indicating whether the tablesorter has initialized.
    */
  var hasInitialized: Boolean = js.native
}
object HTMLElement {
  
  @scala.inline
  def apply(config: TablesorterConfigurationStore[HTMLElement], hasInitialized: Boolean): HTMLElement = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], hasInitialized = hasInitialized.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElement]
  }
  
  @scala.inline
  implicit class HTMLElementOps[Self <: HTMLElement] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: TablesorterConfigurationStore[HTMLElement]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasInitialized(value: Boolean): Self = this.set("hasInitialized", value.asInstanceOf[js.Any])
  }
}
