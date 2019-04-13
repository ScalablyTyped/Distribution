package typings
package through2Lib.through2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("through2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): nodeLib.streamMod.Transform = js.native
  def apply(opts: nodeLib.streamMod.DuplexOptions): nodeLib.streamMod.Transform = js.native
  def apply(opts: nodeLib.streamMod.DuplexOptions, transform: TransformFunction): nodeLib.streamMod.Transform = js.native
  def apply(opts: nodeLib.streamMod.DuplexOptions, transform: TransformFunction, flush: FlushCallback): nodeLib.streamMod.Transform = js.native
  def apply(transform: TransformFunction): nodeLib.streamMod.Transform = js.native
  def apply(transform: TransformFunction, flush: FlushCallback): nodeLib.streamMod.Transform = js.native
  /**
  	 * Creates a constructor for a custom Transform. This is useful when you
  	 * want to use the same transform logic in multiple instances.
  	 */
  def ctor(): Through2Constructor = js.native
  def ctor(opts: nodeLib.streamMod.DuplexOptions): Through2Constructor = js.native
  def ctor(opts: nodeLib.streamMod.DuplexOptions, transform: TransformFunction): Through2Constructor = js.native
  def ctor(opts: nodeLib.streamMod.DuplexOptions, transform: TransformFunction, flush: FlushCallback): Through2Constructor = js.native
  def ctor(transform: TransformFunction): Through2Constructor = js.native
  def ctor(transform: TransformFunction, flush: FlushCallback): Through2Constructor = js.native
  /**
  	 * Convenvience method for creating object streams
  	 */
  def obj(): nodeLib.streamMod.Transform = js.native
  def obj(transform: TransformFunction): nodeLib.streamMod.Transform = js.native
  def obj(transform: TransformFunction, flush: FlushCallback): nodeLib.streamMod.Transform = js.native
}

