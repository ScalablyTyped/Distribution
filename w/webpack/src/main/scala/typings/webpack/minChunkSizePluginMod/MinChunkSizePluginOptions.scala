package typings.webpack.minChunkSizePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinChunkSizePluginOptions extends js.Object {
  
  /**
  	 * Minimum number of characters
  	 */
  var minChunkSize: Double = js.native
}
object MinChunkSizePluginOptions {
  
  @scala.inline
  def apply(minChunkSize: Double): MinChunkSizePluginOptions = {
    val __obj = js.Dynamic.literal(minChunkSize = minChunkSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinChunkSizePluginOptions]
  }
  
  @scala.inline
  implicit class MinChunkSizePluginOptionsOps[Self <: MinChunkSizePluginOptions] (val x: Self) extends AnyVal {
    
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
    def setMinChunkSize(value: Double): Self = this.set("minChunkSize", value.asInstanceOf[js.Any])
  }
}
