package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeModule extends Module {
  
  def attach(compilation: Compilation, chunk: Chunk): Unit = js.native
  def attach(compilation: Compilation, chunk: Chunk, chunkGraph: ChunkGraph): Unit = js.native
  
  var chunk: Chunk = js.native
  
  var chunkGraph: ChunkGraph = js.native
  
  var compilation: Compilation = js.native
  
  var dependentHash: Boolean = js.native
  
  var fullHash: Boolean = js.native
  
  def generate(): String = js.native
  
  def getGeneratedCode(): String = js.native
  
  var name: String = js.native
  
  def shouldIsolate(): Boolean = js.native
  
  var stage: Double = js.native
}
