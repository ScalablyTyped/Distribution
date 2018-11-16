package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileStat
  extends nodeLib.streamMod.Readable
     with Fields {
  var blockRemain: scala.Double = js.native
  var header: HeaderProperties = js.native
  var ignore: scala.Boolean = js.native
  var meta: scala.Boolean = js.native
  var remain: scala.Double = js.native
  var startBlockSize: scala.Double = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
}

