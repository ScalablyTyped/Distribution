package typings
package winstonLib.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winston", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Container: winstonLib.winstonMod.winstonNs.Container = js.native
  var ExceptionHandler: winstonLib.winstonMod.winstonNs.ExceptionHandler = js.native
  var add: js.Function1[
    /* transport */ winstonDashTransportLib.winstonDashTransportMod.namespaced, 
    winstonLib.winstonMod.winstonNs.Logger
  ] = js.native
  var addColors: js.Function1[
    /* target */ winstonLib.libWinstonConfigMod.winstonNs.AbstractConfigSetColors, 
    js.Any
  ] = js.native
  var clear: js.Function0[winstonLib.winstonMod.winstonNs.Logger] = js.native
  val config: winstonLib.libWinstonConfigMod.winstonNs.Config = js.native
  var configure: js.Function1[/* options */ winstonLib.winstonMod.winstonNs.LoggerOptions, scala.Unit] = js.native
  var createLogger: js.Function1[
    /* options */ js.UndefOr[winstonLib.winstonMod.winstonNs.LoggerOptions], 
    winstonLib.winstonMod.winstonNs.Logger
  ] = js.native
  var debug: winstonLib.winstonMod.winstonNs.LeveledLogMethod = js.native
  // Pass-through npm level methods routed to the default logger.
  var error: winstonLib.winstonMod.winstonNs.LeveledLogMethod = js.native
  var exceptions: winstonLib.winstonMod.winstonNs.ExceptionHandler = js.native
  var exitOnError: js.Function | scala.Boolean = js.native
  var http: winstonLib.winstonMod.winstonNs.LeveledLogMethod = js.native
  var info: winstonLib.winstonMod.winstonNs.LeveledLogMethod = js.native
  var level: java.lang.String = js.native
  // Other pass-through methods routed to the default logger.
  var log: winstonLib.winstonMod.winstonNs.LogMethod = js.native
  var loggers: winstonLib.winstonMod.winstonNs.Container = js.native
  var profile: js.Function1[/* id */ java.lang.String | scala.Double, winstonLib.winstonMod.winstonNs.Logger] = js.native
  var query: js.Function2[
    /* options */ js.UndefOr[winstonLib.winstonMod.winstonNs.QueryOptions], 
    /* callback */ js.UndefOr[js.Function2[/* err */ nodeLib.Error, /* results */ js.Any, scala.Unit]], 
    js.Any
  ] = js.native
  var remove: js.Function1[
    /* transport */ winstonDashTransportLib.winstonDashTransportMod.namespaced, 
    winstonLib.winstonMod.winstonNs.Logger
  ] = js.native
  var silly: winstonLib.winstonMod.winstonNs.LeveledLogMethod = js.native
  var startTimer: js.Function0[winstonLib.winstonMod.winstonNs.Profiler] = js.native
  var stream: js.Function1[/* options */ js.UndefOr[js.Any], nodeLib.NodeJSNs.ReadableStream] = js.native
  val transports: winstonLib.libWinstonTransportsMod.winstonNs.Transports = js.native
  var verbose: winstonLib.winstonMod.winstonNs.LeveledLogMethod = js.native
  var version: java.lang.String = js.native
  var warn: winstonLib.winstonMod.winstonNs.LeveledLogMethod = js.native
  def format(transform: logformLib.logformMod.TransformFunction): logformLib.logformMod.FormatWrap = js.native
}

