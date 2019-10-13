package typings.unzip

import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Transform
import typings.unzip.unzipStrings.Directory
import typings.unzip.unzipStrings.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unzip", JSImport.Namespace)
@js.native
object unzipMod extends js.Object {
  @js.native
  trait Entry extends Transform {
    var path: String = js.native
    var size: Double = js.native
    var `type`: Directory | File = js.native
    def autodrain(): Unit = js.native
  }
  
  def Extract(options: Anon_Path): WritableStream = js.native
  def Parse(): WritableStream = js.native
}

