package typings.unzip

import typings.node.NodeJS.WritableStream
import typings.node.streamMod.PassThrough
import typings.unzip.anon.Path
import typings.unzip.unzipStrings.Directory
import typings.unzip.unzipStrings.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unzip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Extract(options: Path): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(options.asInstanceOf[js.Any]).asInstanceOf[WritableStream]
  
  @scala.inline
  def Parse(): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")().asInstanceOf[WritableStream]
  
  @js.native
  trait Entry extends PassThrough {
    
    def autodrain(): Unit = js.native
    
    var path: String = js.native
    
    var size: Double = js.native
    
    var `type`: Directory | File = js.native
  }
}
