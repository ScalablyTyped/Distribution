package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginCleanupAttrs extends PluginConfig {
  
  var cleanupAttrs: Boolean | js.Object = js.native
}
object PluginCleanupAttrs {
  
  @scala.inline
  def apply(cleanupAttrs: Boolean | js.Object): PluginCleanupAttrs = {
    val __obj = js.Dynamic.literal(cleanupAttrs = cleanupAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupAttrs]
  }
  
  @scala.inline
  implicit class PluginCleanupAttrsOps[Self <: PluginCleanupAttrs] (val x: Self) extends AnyVal {
    
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
    def setCleanupAttrs(value: Boolean | js.Object): Self = this.set("cleanupAttrs", value.asInstanceOf[js.Any])
  }
}
