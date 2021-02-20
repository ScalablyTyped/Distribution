package typings.thenEos

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("then-eos", JSImport.Namespace)
  @js.native
  def apply(stream: Stream): js.Promise[Unit] = js.native
  
  type Stream = ReadableStream | WritableStream
}
