package typings.winston.transportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transports extends js.Object {
  var Console: ConsoleTransportInstance = js.native
  var ConsoleTransportOptions: typings.winston.transportsMod.ConsoleTransportOptions = js.native
  var File: FileTransportInstance = js.native
  var FileTransportOptions: typings.winston.transportsMod.FileTransportOptions = js.native
  var Http: HttpTransportInstance = js.native
  var HttpTransportOptions: typings.winston.transportsMod.HttpTransportOptions = js.native
  var Stream: StreamTransportInstance = js.native
  var StreamTransportOptions: typings.winston.transportsMod.StreamTransportOptions = js.native
}

object Transports {
  @scala.inline
  def apply(
    Console: ConsoleTransportInstance,
    ConsoleTransportOptions: ConsoleTransportOptions,
    File: FileTransportInstance,
    FileTransportOptions: FileTransportOptions,
    Http: HttpTransportInstance,
    HttpTransportOptions: HttpTransportOptions,
    Stream: StreamTransportInstance,
    StreamTransportOptions: StreamTransportOptions
  ): Transports = {
    val __obj = js.Dynamic.literal(Console = Console.asInstanceOf[js.Any], ConsoleTransportOptions = ConsoleTransportOptions.asInstanceOf[js.Any], File = File.asInstanceOf[js.Any], FileTransportOptions = FileTransportOptions.asInstanceOf[js.Any], Http = Http.asInstanceOf[js.Any], HttpTransportOptions = HttpTransportOptions.asInstanceOf[js.Any], Stream = Stream.asInstanceOf[js.Any], StreamTransportOptions = StreamTransportOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transports]
  }
  @scala.inline
  implicit class TransportsOps[Self <: Transports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConsole(value: ConsoleTransportInstance): Self = this.set("Console", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsoleTransportOptions(value: ConsoleTransportOptions): Self = this.set("ConsoleTransportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: FileTransportInstance): Self = this.set("File", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileTransportOptions(value: FileTransportOptions): Self = this.set("FileTransportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttp(value: HttpTransportInstance): Self = this.set("Http", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpTransportOptions(value: HttpTransportOptions): Self = this.set("HttpTransportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setStream(value: StreamTransportInstance): Self = this.set("Stream", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamTransportOptions(value: StreamTransportOptions): Self = this.set("StreamTransportOptions", value.asInstanceOf[js.Any])
  }
  
}

