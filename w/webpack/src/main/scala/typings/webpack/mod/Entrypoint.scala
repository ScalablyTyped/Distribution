package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entrypoint
  extends StObject
     with ChunkGroup {
  
  /**
  	 * Returns the chunk which contains the entrypoint modules
  	 * (or at least the execution of them)
  	 */
  def getEntrypointChunk(): Chunk = js.native
  
  /**
  	 * Fetches the chunk reference containing the webpack bootstrap code
  	 */
  def getRuntimeChunk(): Null | Chunk = js.native
  
  /**
  	 * Sets the chunk with the entrypoint modules for an entrypoint.
  	 */
  def setEntrypointChunk(chunk: Chunk): Unit = js.native
  
  /**
  	 * Sets the runtimeChunk for an entrypoint.
  	 */
  def setRuntimeChunk(chunk: Chunk): Unit = js.native
}
