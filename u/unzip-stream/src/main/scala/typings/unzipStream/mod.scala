package typings.unzipStream

import typings.node.streamMod.PassThrough
import typings.std.ReadableStream
import typings.std.WritableStream
import typings.unzipStream.anon.DecodeString
import typings.unzipStream.anon.`0`
import typings.unzipStream.unzipStreamStrings.Directory
import typings.unzipStream.unzipStreamStrings.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unzip-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Extract(options: DecodeString): WritableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(options.asInstanceOf[js.Any]).asInstanceOf[WritableStream[Any]]
  
  inline def Parse(): WritableStream[Any] & ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")().asInstanceOf[WritableStream[Any] & ReadableStream[Any]]
  inline def Parse(options: `0`): WritableStream[Any] & ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(options.asInstanceOf[js.Any]).asInstanceOf[WritableStream[Any] & ReadableStream[Any]]
  
  @js.native
  trait Entry extends PassThrough {
    
    def autodrain(): Unit = js.native
    
    var path: String = js.native
    
    var size: Double = js.native
    
    var `type`: Directory | File = js.native
  }
}
