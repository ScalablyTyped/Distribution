package typings.ws.anon

import typings.node.Buffer
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkSize extends js.Object {
  
  var chunkSize: js.UndefOr[Double] = js.native
  
  var dictionary: js.UndefOr[Buffer | js.Array[Buffer] | DataView] = js.native
  
  var finishFlush: js.UndefOr[Double] = js.native
  
  var flush: js.UndefOr[Double] = js.native
  
  var info: js.UndefOr[Boolean] = js.native
  
  var level: js.UndefOr[Double] = js.native
  
  var memLevel: js.UndefOr[Double] = js.native
  
  var strategy: js.UndefOr[Double] = js.native
  
  var windowBits: js.UndefOr[Double] = js.native
}
object ChunkSize {
  
  @scala.inline
  def apply(): ChunkSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkSize]
  }
  
  @scala.inline
  implicit class ChunkSizeOps[Self <: ChunkSize] (val x: Self) extends AnyVal {
    
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
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setDictionaryVarargs(value: Buffer*): Self = this.set("dictionary", js.Array(value :_*))
    
    @scala.inline
    def setDictionary(value: Buffer | js.Array[Buffer] | DataView): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionary: Self = this.set("dictionary", js.undefined)
    
    @scala.inline
    def setFinishFlush(value: Double): Self = this.set("finishFlush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinishFlush: Self = this.set("finishFlush", js.undefined)
    
    @scala.inline
    def setFlush(value: Double): Self = this.set("flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    
    @scala.inline
    def setInfo(value: Boolean): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMemLevel(value: Double): Self = this.set("memLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemLevel: Self = this.set("memLevel", js.undefined)
    
    @scala.inline
    def setStrategy(value: Double): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    
    @scala.inline
    def setWindowBits(value: Double): Self = this.set("windowBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowBits: Self = this.set("windowBits", js.undefined)
  }
}
