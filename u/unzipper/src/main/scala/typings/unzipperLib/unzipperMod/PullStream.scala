package typings
package unzipperLib.unzipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullStream
  extends nodeLib.streamMod.Duplex {
  def pull(eof: java.lang.String, includeEof: scala.Boolean): js.Promise[nodeLib.Buffer] = js.native
  def pull(eof: scala.Double, includeEof: scala.Boolean): js.Promise[nodeLib.Buffer] = js.native
  def stream(eof: java.lang.String, includeEof: scala.Boolean): nodeLib.streamMod.PassThrough = js.native
  def stream(eof: scala.Double, includeEof: scala.Boolean): nodeLib.streamMod.PassThrough = js.native
}

