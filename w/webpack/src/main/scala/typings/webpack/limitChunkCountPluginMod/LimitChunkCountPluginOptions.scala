package typings.webpack.limitChunkCountPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LimitChunkCountPluginOptions extends js.Object {
  
  /**
  	 * Limit the maximum number of chunks using a value greater greater than or equal to 1
  	 */
  var maxChunks: js.UndefOr[Double] = js.native
  
  /**
  	 * Set a minimum chunk size
  	 */
  var minChunkSize: js.UndefOr[Double] = js.native
}
object LimitChunkCountPluginOptions {
  
  @scala.inline
  def apply(): LimitChunkCountPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LimitChunkCountPluginOptions]
  }
  
  @scala.inline
  implicit class LimitChunkCountPluginOptionsOps[Self <: LimitChunkCountPluginOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxChunks(value: Double): Self = this.set("maxChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxChunks: Self = this.set("maxChunks", js.undefined)
    
    @scala.inline
    def setMinChunkSize(value: Double): Self = this.set("minChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinChunkSize: Self = this.set("minChunkSize", js.undefined)
  }
}
