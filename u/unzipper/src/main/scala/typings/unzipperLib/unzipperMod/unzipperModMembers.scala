package typings
package unzipperLib.unzipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unzipper", JSImport.Namespace)
@js.native
object unzipperModMembers extends js.Object {
  def BufferStream(entry: Entry): stdLib.Promise[nodeLib.Buffer] = js.native
  def Extract(): ParseStream = js.native
  def Extract(opts: ParseOptions): ParseStream = js.native
  def Parse(): ParseStream = js.native
  def Parse(opts: ParseOptions): ParseStream = js.native
  def ParseOne(`match`: stdLib.RegExp, opts: ParseOptions): nodeLib.streamMod.Duplex = js.native
  def unzip(source: unzipperLib.Anon_Size, offset: scala.Double, _password: java.lang.String): Entry = js.native
}

