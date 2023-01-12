package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkPrefetchPreloadPlugin extends StObject {
  
  @JSName("apply")
  def apply(compiler: Compiler): Unit
}
object ChunkPrefetchPreloadPlugin {
  
  inline def apply(apply: Compiler => Unit): ChunkPrefetchPreloadPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[ChunkPrefetchPreloadPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChunkPrefetchPreloadPlugin] (val x: Self) extends AnyVal {
    
    inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
  }
}
