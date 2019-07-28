package typings.twilioDashSync.libUtilsSyncerrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/utils/syncerror", "SyncError")
@js.native
class SyncError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, status: Double) = this()
  def this(message: String, status: Double, code: Double) = this()
  var code: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var status: Double = js.native
}

