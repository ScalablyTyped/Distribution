package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependenciesBlock extends StObject {
  
  /**
  	 * Adds a DependencyBlock to DependencyBlock relationship.
  	 * This is used for when a Module has a AsyncDependencyBlock tie (for code-splitting)
  	 */
  def addBlock(block: AsyncDependenciesBlock): Unit
  
  def addDependency(dependency: Dependency): Unit
  
  var blocks: js.Array[AsyncDependenciesBlock]
  
  /**
  	 * Removes all dependencies and blocks
  	 */
  def clearDependenciesAndBlocks(): Unit
  
  var dependencies: js.Array[Dependency]
  
  def deserialize(__0: ObjectDeserializerContext): Unit
  
  def getRootBlock(): DependenciesBlock
  
  var parent: DependenciesBlock
  
  def removeDependency(dependency: Dependency): Unit
  
  def serialize(__0: ObjectSerializerContext): Unit
  
  def updateHash(hash: Hash, context: UpdateHashContextDependency): Unit
}
object DependenciesBlock {
  
  inline def apply(
    addBlock: AsyncDependenciesBlock => Unit,
    addDependency: Dependency => Unit,
    blocks: js.Array[AsyncDependenciesBlock],
    clearDependenciesAndBlocks: () => Unit,
    dependencies: js.Array[Dependency],
    deserialize: ObjectDeserializerContext => Unit,
    getRootBlock: () => DependenciesBlock,
    parent: DependenciesBlock,
    removeDependency: Dependency => Unit,
    serialize: ObjectSerializerContext => Unit,
    updateHash: (Hash, UpdateHashContextDependency) => Unit
  ): DependenciesBlock = {
    val __obj = js.Dynamic.literal(addBlock = js.Any.fromFunction1(addBlock), addDependency = js.Any.fromFunction1(addDependency), blocks = blocks.asInstanceOf[js.Any], clearDependenciesAndBlocks = js.Any.fromFunction0(clearDependenciesAndBlocks), dependencies = dependencies.asInstanceOf[js.Any], deserialize = js.Any.fromFunction1(deserialize), getRootBlock = js.Any.fromFunction0(getRootBlock), parent = parent.asInstanceOf[js.Any], removeDependency = js.Any.fromFunction1(removeDependency), serialize = js.Any.fromFunction1(serialize), updateHash = js.Any.fromFunction2(updateHash))
    __obj.asInstanceOf[DependenciesBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DependenciesBlock] (val x: Self) extends AnyVal {
    
    inline def setAddBlock(value: AsyncDependenciesBlock => Unit): Self = StObject.set(x, "addBlock", js.Any.fromFunction1(value))
    
    inline def setAddDependency(value: Dependency => Unit): Self = StObject.set(x, "addDependency", js.Any.fromFunction1(value))
    
    inline def setBlocks(value: js.Array[AsyncDependenciesBlock]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksVarargs(value: AsyncDependenciesBlock*): Self = StObject.set(x, "blocks", js.Array(value*))
    
    inline def setClearDependenciesAndBlocks(value: () => Unit): Self = StObject.set(x, "clearDependenciesAndBlocks", js.Any.fromFunction0(value))
    
    inline def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDeserialize(value: ObjectDeserializerContext => Unit): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
    
    inline def setGetRootBlock(value: () => DependenciesBlock): Self = StObject.set(x, "getRootBlock", js.Any.fromFunction0(value))
    
    inline def setParent(value: DependenciesBlock): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRemoveDependency(value: Dependency => Unit): Self = StObject.set(x, "removeDependency", js.Any.fromFunction1(value))
    
    inline def setSerialize(value: ObjectSerializerContext => Unit): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    
    inline def setUpdateHash(value: (Hash, UpdateHashContextDependency) => Unit): Self = StObject.set(x, "updateHash", js.Any.fromFunction2(value))
  }
}
