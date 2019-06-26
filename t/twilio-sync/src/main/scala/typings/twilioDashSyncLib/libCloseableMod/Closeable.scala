package typings
package twilioDashSyncLib.libCloseableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/closeable", "Closeable")
@js.native
abstract class Closeable ()
  extends nodeLib.eventsMod.EventEmitter {
  var closed: js.Any = js.native
  val listenerUuid: java.lang.String = js.native
  val uuid: js.Any = js.native
  /* protected */ def close(): scala.Unit = js.native
  /* protected */ def ensureNotClosed(): scala.Unit = js.native
}

