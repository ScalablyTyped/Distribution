package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.distDataTypesMod.HashTableMap
import typings.tensorflowTfjsConverter.distDataTypesMod.NamedTensorMap
import typings.tensorflowTfjsConverter.distExecutorHashTableMod.HashTable
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExecutorResourceManagerMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/resource_manager", "ResourceManager")
  @js.native
  open class ResourceManager () extends StObject {
    def this(hashTableNameToHandle: NamedTensorMap) = this()
    def this(hashTableNameToHandle: Unit, hashTableMap: HashTableMap) = this()
    def this(hashTableNameToHandle: NamedTensorMap, hashTableMap: HashTableMap) = this()
    
    /**
      * Register a `HashTable` in the resource manager.
      *
      * The `HashTable` can be retrieved by `resourceManager.getHashTableById`,
      * where id is the table handle tensor's id.
      *
      * @param name Op node name that creates the `HashTable`.
      * @param hashTable The `HashTable` to be added to resource manager.
      */
    def addHashTable(name: String, hashTable: HashTable): Unit = js.native
    
    /**
      * Dispose `ResourceManager`, including its hashTables and tensors in them.
      */
    def dispose(): Unit = js.native
    
    /**
      * Get the actual `HashTable` by its handle tensor's id.
      * @param id The id of the handle tensor.
      */
    def getHashTableById(id: Double): HashTable = js.native
    
    /**
      * Get the table handle by node name.
      * @param name Op node name that creates the `HashTable`. This name is also
      *     used in the inputs list of lookup and import `HashTable` ops.
      */
    def getHashTableHandleByName(name: String): Tensor[Rank] = js.native
    
    val hashTableMap: HashTableMap = js.native
    
    val hashTableNameToHandle: NamedTensorMap = js.native
  }
}
