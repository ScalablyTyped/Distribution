package typings
package unzipperLib.unzipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry
  extends nodeLib.streamMod.PassThrough {
  var extra: unzipperLib.Anon_CompressedSizeDisknum = js.native
  var path: java.lang.String = js.native
  var props: unzipperLib.Anon_Path = js.native
  var `type`: java.lang.String = js.native
  var vars: unzipperLib.Anon_CompressedSize = js.native
  def autodrain(): nodeLib.streamMod.Transform with unzipperLib.Anon_Promise = js.native
  def buffer(): js.Promise[nodeLib.Buffer] = js.native
}

