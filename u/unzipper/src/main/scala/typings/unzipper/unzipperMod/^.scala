package typings.unzipper.unzipperMod

import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.std.RegExp
import typings.unzipper.Anon_Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unzipper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def BufferStream(entry: Entry): js.Promise[Buffer] = js.native
  def Extract(): ParseStream = js.native
  def Extract(opts: ParseOptions): ParseStream = js.native
  def Parse(): ParseStream = js.native
  def Parse(opts: ParseOptions): ParseStream = js.native
  def ParseOne(`match`: RegExp, opts: ParseOptions): Duplex = js.native
  def unzip(source: Anon_Size, offset: Double, _password: String): Entry = js.native
}

