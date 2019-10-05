package typings.winston.winstonMod

import typings.node.NodeJS.ReadableStream
import typings.std.Error
import typings.winston.libWinstonConfigMod.AbstractConfigSetColors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winston", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Container: typings.winston.winstonMod.Container = js.native
  var ExceptionHandler: typings.winston.winstonMod.ExceptionHandler = js.native
  var add: js.Function1[/* transport */ typings.winstonDashTransport.winstonDashTransportMod.^, Logger] = js.native
  var addColors: js.Function1[/* target */ AbstractConfigSetColors, js.Any] = js.native
  var clear: js.Function0[Logger] = js.native
  var configure: js.Function1[/* options */ LoggerOptions, Unit] = js.native
  var createLogger: js.Function1[/* options */ js.UndefOr[LoggerOptions], Logger] = js.native
  var debug: LeveledLogMethod = js.native
  // Pass-through npm level methods routed to the default logger.
  var error: LeveledLogMethod = js.native
  var exceptions: ExceptionHandler = js.native
  var exitOnError: js.Function | Boolean = js.native
  var http: LeveledLogMethod = js.native
  var info: LeveledLogMethod = js.native
  var level: String = js.native
  // Other pass-through methods routed to the default logger.
  var log: LogMethod = js.native
  var loggers: Container = js.native
  var profile: js.Function1[/* id */ String | Double, Logger] = js.native
  var query: js.Function2[
    /* options */ js.UndefOr[QueryOptions], 
    /* callback */ js.UndefOr[js.Function2[/* err */ Error, /* results */ js.Any, Unit]], 
    js.Any
  ] = js.native
  var remove: js.Function1[/* transport */ typings.winstonDashTransport.winstonDashTransportMod.^, Logger] = js.native
  var silly: LeveledLogMethod = js.native
  var startTimer: js.Function0[Profiler] = js.native
  var stream: js.Function1[/* options */ js.UndefOr[js.Any], ReadableStream] = js.native
  var verbose: LeveledLogMethod = js.native
  var version: String = js.native
  var warn: LeveledLogMethod = js.native
}

