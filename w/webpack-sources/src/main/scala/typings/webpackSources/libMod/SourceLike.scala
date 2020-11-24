package typings.webpackSources.libMod

import typings.node.Buffer
import typings.node.cryptoMod.Hash
import typings.sourceMap.mod.RawSourceMap
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<webpack-sources.webpack-sources/lib.Source, 'source' | 'buffer' | 'size' | 'map' | 'sourceAndMap' | 'updateHash'>> */
@js.native
trait SourceLike extends js.Object {
  
  var buffer: js.UndefOr[js.Function0[Buffer]] = js.native
  
  var map: js.UndefOr[js.Function1[/* options */ js.UndefOr[MapOptions], RawSourceMap | Null]] = js.native
  
  var size: js.UndefOr[js.Function0[Double]] = js.native
  
  var source: js.UndefOr[js.Function0[String | ArrayBuffer]] = js.native
  
  var sourceAndMap: js.UndefOr[js.Function1[/* options */ js.UndefOr[MapOptions], SourceAndMapResult]] = js.native
  
  var updateHash: js.UndefOr[js.Function1[/* hash */ Hash, Unit]] = js.native
}
object SourceLike {
  
  @scala.inline
  def apply(): SourceLike = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceLike]
  }
  
  @scala.inline
  implicit class SourceLikeOps[Self <: SourceLike] (val x: Self) extends AnyVal {
    
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
    def setBuffer(value: () => Buffer): Self = this.set("buffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setMap(value: /* options */ js.UndefOr[MapOptions] => RawSourceMap | Null): Self = this.set("map", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSource(value: () => String | ArrayBuffer): Self = this.set("source", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceAndMap(value: /* options */ js.UndefOr[MapOptions] => SourceAndMapResult): Self = this.set("sourceAndMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSourceAndMap: Self = this.set("sourceAndMap", js.undefined)
    
    @scala.inline
    def setUpdateHash(value: /* hash */ Hash => Unit): Self = this.set("updateHash", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateHash: Self = this.set("updateHash", js.undefined)
  }
}
