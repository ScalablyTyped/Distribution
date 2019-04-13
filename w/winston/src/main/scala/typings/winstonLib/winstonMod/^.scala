package typings
package winstonLib.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winston", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Container: winstonLib.winstonMod.Container = js.native
  var ExceptionHandler: winstonLib.winstonMod.ExceptionHandler = js.native
  var add: js.Function1[/* transport */ winstonDashTransportLib.winstonDashTransportMod.^, Logger] = js.native
  var addColors: js.Function1[/* target */ winstonLib.libWinstonConfigMod.AbstractConfigSetColors, js.Any] = js.native
  var clear: js.Function0[Logger] = js.native
  val config: winstonLib.libWinstonConfigMod.Config = js.native
  var configure: js.Function1[/* options */ LoggerOptions, scala.Unit] = js.native
  var createLogger: js.Function1[/* options */ js.UndefOr[LoggerOptions], Logger] = js.native
  var debug: LeveledLogMethod = js.native
  // Pass-through npm level methods routed to the default logger.
  var error: LeveledLogMethod = js.native
  var exceptions: ExceptionHandler = js.native
  var exitOnError: js.Function | scala.Boolean = js.native
  var http: LeveledLogMethod = js.native
  var info: LeveledLogMethod = js.native
  var level: java.lang.String = js.native
  // Other pass-through methods routed to the default logger.
  var log: LogMethod = js.native
  var loggers: Container = js.native
  var profile: js.Function1[/* id */ java.lang.String | scala.Double, Logger] = js.native
  var query: js.Function2[
    /* options */ js.UndefOr[QueryOptions], 
    /* callback */ js.UndefOr[js.Function2[/* err */ stdLib.Error, /* results */ js.Any, scala.Unit]], 
    js.Any
  ] = js.native
  var remove: js.Function1[/* transport */ winstonDashTransportLib.winstonDashTransportMod.^, Logger] = js.native
  var silly: LeveledLogMethod = js.native
  var startTimer: js.Function0[Profiler] = js.native
  var stream: js.Function1[/* options */ js.UndefOr[js.Any], nodeLib.NodeJSNs.ReadableStream] = js.native
  val transports: winstonLib.libWinstonTransportsMod.Transports = js.native
  var verbose: LeveledLogMethod = js.native
  var version: java.lang.String = js.native
  var warn: LeveledLogMethod = js.native
  def format(transform: logformLib.logformMod.TransformFunction): logformLib.logformMod.FormatWrap = js.native
}

