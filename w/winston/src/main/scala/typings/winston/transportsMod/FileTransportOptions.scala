package typings.winston.transportsMod

import typings.logform.mod.Format_
import typings.node.NodeJS.WritableStream
import typings.winstonTransport.mod.TransportStreamOptions
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
    format: Format_ = null,
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
    if (dirname != null) __obj.updateDynamic("dirname")(dirname.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (logv != null) __obj.updateDynamic("logv")(js.Any.fromFunction2(logv))
    if (maxFiles != null) __obj.updateDynamic("maxFiles")(maxFiles.asInstanceOf[js.Any])
    if (maxsize != null) __obj.updateDynamic("maxsize")(maxsize.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (rotationFormat != null) __obj.updateDynamic("rotationFormat")(rotationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (!js.isUndefined(tailable)) __obj.updateDynamic("tailable")(tailable.asInstanceOf[js.Any])
    if (!js.isUndefined(zippedArchive)) __obj.updateDynamic("zippedArchive")(zippedArchive.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTransportOptions]
  }
}

