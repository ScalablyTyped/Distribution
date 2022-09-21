package typings.tensorflowTfjsData

import typings.std.RequestInfo
import typings.tensorflowTfjsData.fileChunkIteratorMod.FileChunkIterator
import typings.tensorflowTfjsData.fileChunkIteratorMod.FileChunkIteratorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlChunkIteratorMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/iterators/url_chunk_iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def urlChunkIterator(url: RequestInfo): js.Promise[FileChunkIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlChunkIterator")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileChunkIterator]]
  inline def urlChunkIterator(url: RequestInfo, options: Unit, fetchFunc: js.Function): js.Promise[FileChunkIterator] = (^.asInstanceOf[js.Dynamic].applyDynamic("urlChunkIterator")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fetchFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileChunkIterator]]
  inline def urlChunkIterator(url: RequestInfo, options: FileChunkIteratorOptions): js.Promise[FileChunkIterator] = (^.asInstanceOf[js.Dynamic].applyDynamic("urlChunkIterator")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileChunkIterator]]
  inline def urlChunkIterator(url: RequestInfo, options: FileChunkIteratorOptions, fetchFunc: js.Function): js.Promise[FileChunkIterator] = (^.asInstanceOf[js.Dynamic].applyDynamic("urlChunkIterator")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fetchFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileChunkIterator]]
}
