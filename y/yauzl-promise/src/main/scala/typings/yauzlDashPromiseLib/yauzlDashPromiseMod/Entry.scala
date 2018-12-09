package typings
package yauzlDashPromiseLib.yauzlDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl-promise", "Entry")
@js.native
class Entry ()
  extends yauzlLib.yauzlMod.Entry {
  def openReadStream(): js.Promise[nodeLib.streamMod.Readable] = js.native
  def openReadStream(options: yauzlLib.yauzlMod.ZipFileOptions): js.Promise[nodeLib.streamMod.Readable] = js.native
}

