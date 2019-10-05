package typings.winston.libWinstonTransportsMod

import typings.logform.logformMod.Format
import typings.node.NodeJS.WritableStream
import typings.winstonDashTransport.winstonDashTransportMod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTransportOptions extends TransportStreamOptions {
  var dirname: js.UndefOr[String] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var maxFiles: js.UndefOr[Double] = js.undefined
  var maxsize: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var rotationFormat: js.UndefOr[js.Function] = js.undefined
  var stream: js.UndefOr[WritableStream] = js.undefined
  var tailable: js.UndefOr[Boolean] = js.undefined
  var zippedArchive: js.UndefOr[Boolean] = js.undefined
}

object FileTransportOptions {
  @scala.inline
  def apply(
    close: () => Unit = null,
    dirname: String = null,
    eol: String = null,
    filename: String = null,
    format: Format = null,
    handleExceptions: js.UndefOr[Boolean] = js.undefined,
    level: String = null,
    log: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    logv: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    maxFiles: Int | Double = null,
    maxsize: Int | Double = null,
    options: js.Object = null,
    rotationFormat: js.Function = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    stream: WritableStream = null,
    tailable: js.UndefOr[Boolean] = js.undefined,
    zippedArchive: js.UndefOr[Boolean] = js.undefined
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

