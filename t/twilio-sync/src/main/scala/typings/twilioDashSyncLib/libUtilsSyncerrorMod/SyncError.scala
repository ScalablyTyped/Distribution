package typings
package twilioDashSyncLib.libUtilsSyncerrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/utils/syncerror", "SyncError")
@js.native
class SyncError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, status: scala.Double) = this()
  def this(message: java.lang.String, status: scala.Double, code: scala.Double) = this()
  var code: scala.Double = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var status: scala.Double = js.native
}

