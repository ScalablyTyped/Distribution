package typings.symbolTree

import typings.std.IterableIterator
import typings.symbolTree.symbolTreeInts.`1`
import typings.symbolTree.symbolTreeInts.`2`
import typings.symbolTree.symbolTreeInts.`3`
import typings.symbolTree.symbolTreeInts.`4`
import typings.symbolTree.symbolTreeInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTreeIteratorMod {
  
  @JSImport("symbol-tree/lib/TreeIterator", JSImport.Namespace)
  @js.native
  open class ^[T /* <: js.Object */] protected ()
    extends StObject
       with TreeIterator[T] {
    def this(
      tree: typings.symbolTree.libSymbolTreeMod.^[Any],
      root: T,
      firstResult: T,
      iterateFunction: IterateFunction
    ) = this()
  }
  
  /** Iterate all tree-inclusive following nodes. */
  /* static member */
  @JSImport("symbol-tree/lib/TreeIterator", "FOLLOWING")
  @js.native
  val FOLLOWING: `5` = js.native
  
  /** Iterate next sibling nodes. */
  /* static member */
  @JSImport("symbol-tree/lib/TreeIterator", "NEXT")
  @js.native
  val NEXT: `2` = js.native
  
  /** Iterate ancestor nodes. */
  /* static member */
  @JSImport("symbol-tree/lib/TreeIterator", "PARENT")
  @js.native
  val PARENT: `3` = js.native
  
  /** Iterate all tree-inclusive preceding nodes. */
  /* static member */
  @JSImport("symbol-tree/lib/TreeIterator", "PRECEDING")
  @js.native
  val PRECEDING: `4` = js.native
  
  /** Iterate previous sibling nodes. */
  /* static member */
  @JSImport("symbol-tree/lib/TreeIterator", "PREV")
  @js.native
  val PREV: `1` = js.native
  
  /**
    * The iteration function to use.
    *
    * - `1`: Iterate previous sibling nodes.
    * - `2`: Iterate next sibling nodes.
    * - `3`: Iterate ancestor nodes.
    * - `4`: Iterate all tree-inclusive preceding nodes.
    * - `5`: Iterate all tree-inclusive following nodes.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.symbolTree.symbolTreeInts.`1`
    - typings.symbolTree.symbolTreeInts.`2`
    - typings.symbolTree.symbolTreeInts.`3`
    - typings.symbolTree.symbolTreeInts.`4`
    - typings.symbolTree.symbolTreeInts.`5`
  */
  trait IterateFunction extends StObject
  object IterateFunction {
    
    inline def `1`: typings.symbolTree.symbolTreeInts.`1` = 1.asInstanceOf[typings.symbolTree.symbolTreeInts.`1`]
    
    inline def `2`: typings.symbolTree.symbolTreeInts.`2` = 2.asInstanceOf[typings.symbolTree.symbolTreeInts.`2`]
    
    inline def `3`: typings.symbolTree.symbolTreeInts.`3` = 3.asInstanceOf[typings.symbolTree.symbolTreeInts.`3`]
    
    inline def `4`: typings.symbolTree.symbolTreeInts.`4` = 4.asInstanceOf[typings.symbolTree.symbolTreeInts.`4`]
    
    inline def `5`: typings.symbolTree.symbolTreeInts.`5` = 5.asInstanceOf[typings.symbolTree.symbolTreeInts.`5`]
  }
  
  @js.native
  trait TreeIterator[T /* <: js.Object */]
    extends StObject
       with IterableIterator[T] {
    
    @JSName(js.Symbol.iterator)
    var iterator_TreeIterator: js.Function0[this.type] = js.native
    
    def next(): TreeIteratorResult[T] = js.native
  }
  
  trait TreeIteratorResult[T] extends StObject {
    
    var done: Boolean
    
    var value: T
  }
  object TreeIteratorResult {
    
    inline def apply[T](done: Boolean, value: T): TreeIteratorResult[T] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeIteratorResult[T]]
    }
    
    extension [Self <: TreeIteratorResult[?], T](x: Self & TreeIteratorResult[T]) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
