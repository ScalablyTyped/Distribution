package typings.winston.transportsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTransportInstance
  extends typings.winstonTransport.mod.^
     with Instantiable0[FileTransportInstance]
     with Instantiable1[/* options */ FileTransportOptions, FileTransportInstance] {
  var dirname: String = js.native
  var eol: String = js.native
  var filename: String = js.native
  var maxFiles: Double | Null = js.native
  var maxsize: Double | Null = js.native
  var name: String = js.native
  var options: js.Object = js.native
  var rotationFormat: js.Function | Boolean = js.native
  var tailable: Boolean = js.native
  var zippedArchive: Boolean = js.native
}

