package typings
package winstonLib.libWinstonTransportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTransportOptions
  extends winstonDashTransportLib.winstonDashTransportMod.TransportStreamOptions {
  var dirname: js.UndefOr[java.lang.String] = js.undefined
  var eol: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var maxFiles: js.UndefOr[scala.Double] = js.undefined
  var maxsize: js.UndefOr[scala.Double] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var rotationFormat: js.UndefOr[js.Function] = js.undefined
  var stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var tailable: js.UndefOr[scala.Boolean] = js.undefined
  var zippedArchive: js.UndefOr[scala.Boolean] = js.undefined
}

object FileTransportOptions {
  @scala.inline
  def apply(
    close: () => scala.Unit = null,
    dirname: java.lang.String = null,
    eol: java.lang.String = null,
    filename: java.lang.String = null,
    format: logformLib.logformMod.Format = null,
    handleExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    level: java.lang.String = null,
    log: (/* info */ js.Any, /* next */ js.Function0[scala.Unit]) => _ = null,
    logv: (/* info */ js.Any, /* next */ js.Function0[scala.Unit]) => _ = null,
    maxFiles: scala.Int | scala.Double = null,
    maxsize: scala.Int | scala.Double = null,
    options: js.Object = null,
    rotationFormat: js.Function = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    stream: nodeLib.NodeJSNs.WritableStream = null,
    tailable: js.UndefOr[scala.Boolean] = js.undefined,
    zippedArchive: js.UndefOr[scala.Boolean] = js.undefined
  ): FileTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (dirname != null) __obj.updateDynamic("dirname")(dirname)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions)
    if (level != null) __obj.updateDynamic("level")(level)
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (logv != null) __obj.updateDynamic("logv")(js.Any.fromFunction2(logv))
    if (maxFiles != null) __obj.updateDynamic("maxFiles")(maxFiles.asInstanceOf[js.Any])
    if (maxsize != null) __obj.updateDynamic("maxsize")(maxsize.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (rotationFormat != null) __obj.updateDynamic("rotationFormat")(rotationFormat)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (!js.isUndefined(tailable)) __obj.updateDynamic("tailable")(tailable)
    if (!js.isUndefined(zippedArchive)) __obj.updateDynamic("zippedArchive")(zippedArchive)
    __obj.asInstanceOf[FileTransportOptions]
  }
}

