package typings
package winstonLib.libWinstonTransportsMod.winstonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transports extends js.Object {
  var Console: ConsoleTransportInstance
  var ConsoleTransportOptions: ConsoleTransportOptions
  var File: FileTransportInstance
  var FileTransportOptions: FileTransportOptions
  var Http: HttpTransportInstance
  var HttpTransportOptions: HttpTransportOptions
  var Stream: StreamTransportInstance
  var StreamTransportOptions: StreamTransportOptions
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

