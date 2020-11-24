package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginPrefixIds extends PluginConfig {
  
  /** prefix IDs and classes with the SVG filename or an arbitrary string     */
  var prefixIds: Boolean | js.Object = js.native
}
object PluginPrefixIds {
  
  @scala.inline
  def apply(prefixIds: Boolean | js.Object): PluginPrefixIds = {
    val __obj = js.Dynamic.literal(prefixIds = prefixIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginPrefixIds]
  }
  
  @scala.inline
  implicit class PluginPrefixIdsOps[Self <: PluginPrefixIds] (val x: Self) extends AnyVal {
    
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
    def setPrefixIds(value: Boolean | js.Object): Self = this.set("prefixIds", value.asInstanceOf[js.Any])
  }
}
