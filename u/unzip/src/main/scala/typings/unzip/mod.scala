package typings.unzip

import typings.node.streamMod.PassThrough
import typings.std.WritableStream
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
  
  inline def Extract(options: Path): WritableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(options.asInstanceOf[js.Any]).asInstanceOf[WritableStream[Any]]
  
  inline def Parse(): WritableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")().asInstanceOf[WritableStream[Any]]
  
  @js.native
  trait Entry extends PassThrough {
    
    def autodrain(): Unit = js.native
    
    var path: String = js.native
    
    var size: Double = js.native
    
    var `type`: Directory | File = js.native
  }
}
