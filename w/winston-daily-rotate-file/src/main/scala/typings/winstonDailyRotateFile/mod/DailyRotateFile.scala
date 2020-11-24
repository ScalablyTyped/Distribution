package typings.winstonDailyRotateFile.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DailyRotateFile
  extends typings.winstonTransport.mod.^ {
  
  var dirname: String = js.native
  
  var filename: String = js.native
  
  var logStream: WritableStream = js.native
  
  var options: DailyRotateFileTransportOptions = js.native
}
