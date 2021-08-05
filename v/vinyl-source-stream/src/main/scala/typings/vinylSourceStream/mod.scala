package typings.vinylSourceStream

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filename: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("vinyl-source-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
