package typings.winstonTransport.mod

import typings.logform.mod.Format_
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransportStream extends Writable {
  
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  
  var format: js.UndefOr[Format_] = js.native
  
  var handleExceptions: js.UndefOr[Boolean] = js.native
  
  var level: js.UndefOr[String] = js.native
  
  var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
  
  var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
}
