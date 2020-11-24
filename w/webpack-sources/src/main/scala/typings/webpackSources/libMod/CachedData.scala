package typings.webpackSources.libMod

import typings.node.Buffer
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachedData extends js.Object {
  
  var buffer: js.UndefOr[Buffer] = js.native
  
  var cachedData: js.UndefOr[Map[_, _]] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[String | Boolean] = js.native
}
object CachedData {
  
  @scala.inline
  def apply(): CachedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CachedData]
  }
  
  @scala.inline
  implicit class CachedDataOps[Self <: CachedData] (val x: Self) extends AnyVal {
    
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
    def setBuffer(value: Buffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setCachedData(value: Map[_, _]): Self = this.set("cachedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachedData: Self = this.set("cachedData", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSource(value: String | Boolean): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
