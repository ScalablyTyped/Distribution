package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependenciesBlockLike extends StObject {
  
  var blocks: js.Array[AsyncDependenciesBlock]
  
  var dependencies: js.Array[Dependency]
}
object DependenciesBlockLike {
  
  inline def apply(blocks: js.Array[AsyncDependenciesBlock], dependencies: js.Array[Dependency]): DependenciesBlockLike = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependenciesBlockLike]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DependenciesBlockLike] (val x: Self) extends AnyVal {
    
    inline def setBlocks(value: js.Array[AsyncDependenciesBlock]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksVarargs(value: AsyncDependenciesBlock*): Self = StObject.set(x, "blocks", js.Array(value*))
    
    inline def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
  }
}
