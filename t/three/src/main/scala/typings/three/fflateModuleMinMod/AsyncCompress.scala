package typings.three.fflateModuleMinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/libs/fflate.module.min", "AsyncCompress")
@js.native
/**
  * Creates an asynchronous GZIP stream
  * @param cb The callback to call whenever data is deflated
  */
open class AsyncCompress () extends AsyncGzip {
  def this(cb: AsyncFlateStreamHandler) = this()
  /**
    * Creates an asynchronous GZIP stream
    * @param opts The compression options
    * @param cb The callback to call whenever data is deflated
    */
  def this(opts: GzipOptions) = this()
  def this(opts: GzipOptions, cb: AsyncFlateStreamHandler) = this()
}
