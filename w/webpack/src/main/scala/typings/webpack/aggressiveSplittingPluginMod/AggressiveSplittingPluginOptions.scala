package typings.webpack.aggressiveSplittingPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggressiveSplittingPluginOptions extends js.Object {
  
  /**
  	 * Default: 0
  	 */
  var chunkOverhead: js.UndefOr[Double] = js.native
  
  /**
  	 * Default: 1
  	 */
  var entryChunkMultiplicator: js.UndefOr[Double] = js.native
  
  /**
  	 * Byte, maxsize of per file. Default: 51200
  	 */
  var maxSize: js.UndefOr[Double] = js.native
  
  /**
  	 * Byte, split point. Default: 30720
  	 */
  var minSize: js.UndefOr[Double] = js.native
}
object AggressiveSplittingPluginOptions {
  
  @scala.inline
  def apply(): AggressiveSplittingPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggressiveSplittingPluginOptions]
  }
  
  @scala.inline
  implicit class AggressiveSplittingPluginOptionsOps[Self <: AggressiveSplittingPluginOptions] (val x: Self) extends AnyVal {
    
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
    def setChunkOverhead(value: Double): Self = this.set("chunkOverhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkOverhead: Self = this.set("chunkOverhead", js.undefined)
    
    @scala.inline
    def setEntryChunkMultiplicator(value: Double): Self = this.set("entryChunkMultiplicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryChunkMultiplicator: Self = this.set("entryChunkMultiplicator", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
  }
}
