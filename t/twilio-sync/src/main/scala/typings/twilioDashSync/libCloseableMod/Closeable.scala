package typings.twilioDashSync.libCloseableMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/closeable", "Closeable")
@js.native
abstract class Closeable () extends EventEmitter {
  var closed: js.Any = js.native
  val listenerUuid: String = js.native
  val uuid: js.Any = js.native
  /* protected */ def close(): Unit = js.native
  /* protected */ def ensureNotClosed(): Unit = js.native
}

