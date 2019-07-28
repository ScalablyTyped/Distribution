package typings.winston.libWinstonTransportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transports extends js.Object {
  var Console: ConsoleTransportInstance
  var ConsoleTransportOptions: typings.winston.libWinstonTransportsMod.ConsoleTransportOptions
  var File: FileTransportInstance
  var FileTransportOptions: typings.winston.libWinstonTransportsMod.FileTransportOptions
  var Http: HttpTransportInstance
  var HttpTransportOptions: typings.winston.libWinstonTransportsMod.HttpTransportOptions
  var Stream: StreamTransportInstance
  var StreamTransportOptions: typings.winston.libWinstonTransportsMod.StreamTransportOptions
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
    val __obj = js.Dynamic.literal(Console = Console, ConsoleTransportOptions = ConsoleTransportOptions, File = File, FileTransportOptions = FileTransportOptions, Http = Http, HttpTransportOptions = HttpTransportOptions, Stream = Stream, StreamTransportOptions = StreamTransportOptions)
  
    __obj.asInstanceOf[Transports]
  }
}

