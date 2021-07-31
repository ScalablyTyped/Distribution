package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashTableMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/hash_table", "HashTable")
  @js.native
  class HashTable protected () extends StObject {
    /**
      * Constructor of HashTable. Creates a hash table.
      *
      * @param keyDType `dtype` of the table keys.
      * @param valueDType `dtype` of the table values.
      */
    def this(keyDType: DataType, valueDType: DataType) = this()
    
    var checkKeyAndValueTensor: js.Any = js.native
    
    /**
      * Dispose the tensors and handle and clear the hashtable.
      */
    def clearAndClose(): Unit = js.native
    
    /**
      * Looks up keys in a hash table, outputs the corresponding values.
      *
      * Performs batch lookups, for every element in the key tensor, `find`
      * stacks the corresponding value into the return tensor.
      *
      * If an element is not present in the table, the given `defaultValue` is
      * used.
      *
      * @param keys Keys to look up. Must have the same type as the keys of the
      *     table.
      * @param defaultValue The scalar `defaultValue` is the value output for keys
      *     not present in the table. It must also be of the same type as the
      *     table values.
      */
    def find(keys: Tensor[Rank], defaultValue: Tensor[Rank]): js.Promise[Tensor[Rank]] = js.native
    
    var findWithDefault: js.Any = js.native
    
    val handle: Tensor[Rank] = js.native
    
    val id: Double = js.native
    
    /**
      * Replaces the contents of the table with the specified keys and values.
      * @param keys Keys to store in the hashtable.
      * @param values Values to store in the hashtable.
      */
    def `import`(keys: Tensor[Rank], values: Tensor[Rank]): js.Promise[Tensor[Rank]] = js.native
    
    val keyDType: DataType = js.native
    
    /**
      * The number of items in the hash table.
      */
    def size(): Double = js.native
    
    var tensorMap: js.Any = js.native
    
    val valueDType: DataType = js.native
  }
}
