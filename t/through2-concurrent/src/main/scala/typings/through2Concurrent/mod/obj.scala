package typings.through2Concurrent.mod

import typings.node.streamMod.Transform
import typings.through2.mod.FlushCallback
import typings.through2.mod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("through2-concurrent", "obj")
@js.native
object obj extends js.Object {
  def apply(): Transform = js.native
  def apply(opts: Through2ConcurrentOptions): Transform = js.native
  def apply(opts: Through2ConcurrentOptions, transform: TransformFunction): Transform = js.native
  def apply(opts: Through2ConcurrentOptions, transform: TransformFunction, flush: FlushCallback): Transform = js.native
  def apply(transform: TransformFunction): Transform = js.native
  def apply(transform: TransformFunction, flush: FlushCallback): Transform = js.native
}

