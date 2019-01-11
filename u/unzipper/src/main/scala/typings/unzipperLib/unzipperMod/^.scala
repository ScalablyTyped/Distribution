package typings
package unzipperLib.unzipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unzipper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def BufferStream(entry: unzipperLib.unzipperMod.Entry): js.Promise[nodeLib.Buffer] = js.native
  def Extract(): unzipperLib.unzipperMod.ParseStream = js.native
  def Extract(opts: unzipperLib.unzipperMod.ParseOptions): unzipperLib.unzipperMod.ParseStream = js.native
  def Parse(): unzipperLib.unzipperMod.ParseStream = js.native
  def Parse(opts: unzipperLib.unzipperMod.ParseOptions): unzipperLib.unzipperMod.ParseStream = js.native
  def ParseOne(`match`: stdLib.RegExp, opts: unzipperLib.unzipperMod.ParseOptions): nodeLib.streamMod.Duplex = js.native
  def unzip(source: unzipperLib.Anon_Size, offset: scala.Double, _password: java.lang.String): unzipperLib.unzipperMod.Entry = js.native
}

