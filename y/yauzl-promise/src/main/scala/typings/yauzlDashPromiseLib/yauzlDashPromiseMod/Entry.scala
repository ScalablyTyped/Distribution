package typings
package yauzlDashPromiseLib.yauzlDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl-promise", "Entry")
@js.native
class Entry ()
  extends yauzlLib.yauzlMod.Entry {
  def openReadStream(): stdLib.Promise[nodeLib.streamMod.Readable] = js.native
  def openReadStream(options: yauzlLib.yauzlMod.ZipFileOptions): stdLib.Promise[nodeLib.streamMod.Readable] = js.native
}

