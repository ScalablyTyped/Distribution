package typings.typescriptCollections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-collections/dist/lib/LinkedDictionary", JSImport.Namespace)
@js.native
object linkedDictionaryMod extends js.Object {
  
  @js.native
  trait LinkedDictionary[K, V]
    extends typings.typescriptCollections.dictionaryMod.default[K, V] {
    
    /**
      * Inserts the new node to the 'tail' of the list, updating the
      * neighbors, and moving 'this.tail' (the End of List indicator) that
      * to the end.
      */
    /* private */ def appendToTail(entry: js.Any): js.Any = js.native
    
    /**
      * Retrieves a linked dictionary from the table internally
      */
    /* private */ def getLinkedDictionaryPair(key: js.Any): js.Any = js.native
    
    var head: js.Any = js.native
    
    /**
      * Internal function used when updating an existing KeyValue pair.
      * It places the new value indexed by key into the table, but maintains
      * its place in the linked ordering.
      */
    /* private */ def replace(oldPair: js.Any, newPair: js.Any): js.Any = js.native
    
    var tail: js.Any = js.native
  }
  
  @js.native
  class default[K, V] () extends LinkedDictionary[K, V] {
    def this(toStrFunction: js.Function1[/* key */ K, String]) = this()
  }
}
