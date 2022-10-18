package typings.unzipStream

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.PassThrough
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
  
  inline def Extract(options: DecodeString): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(options.asInstanceOf[js.Any]).asInstanceOf[WritableStream]
  
  inline def Parse(): WritableStream & ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")().asInstanceOf[WritableStream & ReadableStream]
  inline def Parse(options: `0`): WritableStream & ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(options.asInstanceOf[js.Any]).asInstanceOf[WritableStream & ReadableStream]
  
  @js.native
  trait Entry extends PassThrough {
    
    def autodrain(): Unit = js.native
    
    var path: String = js.native
    
    var size: Double = js.native
    
    var `type`: Directory | File = js.native
  }
}
