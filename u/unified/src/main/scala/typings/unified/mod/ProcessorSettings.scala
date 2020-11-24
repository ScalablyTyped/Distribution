package typings.unified.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings can be passed directly to the processor
  *
  * @typeParam P Settings applied to a processor. Useful when packaging unified with a preset parser and compiler.
  */
@js.native
trait ProcessorSettings[P] extends js.Object {
  
  var settings: P = js.native
}
object ProcessorSettings {
  
  @scala.inline
  def apply[P](settings: P): ProcessorSettings[P] = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessorSettings[P]]
  }
  
  @scala.inline
  implicit class ProcessorSettingsOps[Self <: ProcessorSettings[_], P] (val x: Self with ProcessorSettings[P]) extends AnyVal {
    
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
    def setSettings(value: P): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
}
