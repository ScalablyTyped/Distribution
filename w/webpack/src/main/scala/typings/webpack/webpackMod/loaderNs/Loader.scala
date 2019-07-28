package typings.webpack.webpackMod.loaderNs

import typings.node.Buffer
import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loader
  extends js.Function {
  /**
    * The order of chained loaders are always called from right to left.
    * But, in some cases, loaders do not care about the results of the previous loader or the resource.
    * They only care for metadata. The pitch method on the loaders is called from left to right before the loaders are called (from right to left).
    * If a loader delivers a result in the pitch method the process turns around and skips the remaining loaders,
    * continuing with the calls to the more left loaders. data can be passed between pitch and normal call.
    */
  var pitch: js.UndefOr[
    js.Function3[/* remainingRequest */ String, /* precedingRequest */ String, /* data */ js.Any, _]
  ] = js.native
  /**
    * By default, the resource file is treated as utf-8 string and passed as String to the loader.
    * By setting raw to true the loader is passed the raw Buffer.
    * Every loader is allowed to deliver its result as String or as Buffer.
    * The compiler converts them between loaders.
    */
  var raw: js.UndefOr[Boolean] = js.native
  def apply(`this`: LoaderContext, source: String): js.UndefOr[String | Buffer | Unit] = js.native
  def apply(`this`: LoaderContext, source: String, sourceMap: RawSourceMap): js.UndefOr[String | Buffer | Unit] = js.native
  def apply(`this`: LoaderContext, source: Buffer): js.UndefOr[String | Buffer | Unit] = js.native
  def apply(`this`: LoaderContext, source: Buffer, sourceMap: RawSourceMap): js.UndefOr[String | Buffer | Unit] = js.native
}

