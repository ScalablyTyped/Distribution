package typings.yauzlDashPromise.yauzlDashPromiseMod

import typings.node.streamMod.Readable
import typings.yauzl.yauzlMod.ZipFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl-promise", "Entry")
@js.native
class Entry ()
  extends typings.yauzl.yauzlMod.Entry {
  def openReadStream(): js.Promise[Readable] = js.native
  def openReadStream(options: ZipFileOptions): js.Promise[Readable] = js.native
}

