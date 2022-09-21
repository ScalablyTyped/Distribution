package typings.three.fflateModuleMinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/libs/fflate.module.min", "Compress")
@js.native
/**
  * Creates a GZIP stream
  * @param cb The callback to call whenever data is deflated
  */
open class Compress_ () extends Gzip_ {
  def this(cb: FlateStreamHandler) = this()
  /**
    * Creates a GZIP stream
    * @param opts The compression options
    * @param cb The callback to call whenever data is deflated
    */
  def this(opts: GzipOptions) = this()
  def this(opts: GzipOptions, cb: FlateStreamHandler) = this()
}
