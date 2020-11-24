package typings.webpack.occurrenceOrderChunkIdsPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OccurrenceOrderChunkIdsPluginOptions extends js.Object {
  
  /**
  	 * Prioritise initial size over total size
  	 */
  var prioritiseInitial: js.UndefOr[Boolean] = js.native
}
object OccurrenceOrderChunkIdsPluginOptions {
  
  @scala.inline
  def apply(): OccurrenceOrderChunkIdsPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OccurrenceOrderChunkIdsPluginOptions]
  }
  
  @scala.inline
  implicit class OccurrenceOrderChunkIdsPluginOptionsOps[Self <: OccurrenceOrderChunkIdsPluginOptions] (val x: Self) extends AnyVal {
    
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
    def setPrioritiseInitial(value: Boolean): Self = this.set("prioritiseInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrioritiseInitial: Self = this.set("prioritiseInitial", js.undefined)
  }
}
