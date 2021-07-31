package typings.thenEos

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(stream: Stream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("then-eos", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Stream = ReadableStream | WritableStream
}
