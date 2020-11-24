package typings.unzip

import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Transform
import typings.unzip.anon.Path
import typings.unzip.unzipStrings.Directory
import typings.unzip.unzipStrings.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("unzip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def Extract(options: Path): WritableStream = js.native
  
  def Parse(): WritableStream = js.native
  
  @js.native
  trait Entry extends Transform {
    
    def autodrain(): Unit = js.native
    
    var path: String = js.native
    
    var size: Double = js.native
    
    var `type`: Directory | File = js.native
  }
}
