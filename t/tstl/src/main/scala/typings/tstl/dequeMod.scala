package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.arrayContainerMod.ArrayContainer
import typings.tstl.arrayIteratorMod.ArrayIterator
import typings.tstl.arrayReverseIteratorMod.ArrayReverseIterator
import typings.tstl.dequeMod.Deque.Iterator
import typings.tstl.dequeMod.Deque.ReverseIterator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ifrontMod.IFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/container/Deque", JSImport.Namespace)
@js.native
object dequeMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.tstl.isizeMod.ISize because Already inherited
  - typings.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typings.tstl.ipushMod.IPush because Already inherited
  - typings.tstl.iemptyMod.IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.ipushbackMod.IPushBack because Already inherited
  - typings.tstl.icontainerMod.IContainer because Already inherited
  - typings.tstl.ilinearcontainerbaseMod.ILinearContainerBase because Already inherited
  - typings.tstl.ilinearcontainerMod.ILinearContainer because var conflicts: iterator. Inlined 
  - typings.tstl.iarraycontainerMod.IArrayContainer because var conflicts: iterator. Inlined  */ @js.native
  /**
    * Default Constructor.
    */
  class Deque[T] ()
    extends ArrayContainer[T, Deque[T], Deque[T], Iterator[T], ReverseIterator[T], T]
       with IFront[T] {
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      */
    def this(items: js.Array[T]) = this()
    /**
      * Copy Constructor
      *
      * @param obj Object to copy.
      */
    def this(obj: Deque[T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      */
    def this(
      first: IForwardIterator[T, IForwardIterator[T, _]],
      last: IForwardIterator[T, IForwardIterator[T, _]]
    ) = this()
    /**
      * Fill Constructor.
      *
      * @param size Initial size.
      * @param val Value to fill.
      */
    def this(size: Double, `val`: T) = this()
    
    var _Compute_col_size: js.Any = js.native
    
    var _Fetch_index: js.Any = js.native
    
    var _Insert_to_end: js.Any = js.native
    
    var _Insert_to_middle: js.Any = js.native
    
    var _Reserve: js.Any = js.native
    
    var _Swap: js.Any = js.native
    
    var _Try_add_row_at_back: js.Any = js.native
    
    var _Try_add_row_at_front: js.Any = js.native
    
    var _Try_expand_capacity: js.Any = js.native
    
    /**
      * @inheritDoc
      */
    def assign(n: Double, `val`: T): Unit = js.native
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    
    /**
      * The capacity to store elements.
      *
      * @return The capacity.
      */
    def capacity(): Double = js.native
    
    var capacity_ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
    
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(pos: Iterator[T]): Iterator[T] = js.native
    
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def front(): T = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def front(`val`: T): Unit = js.native
    
    var matrix_ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    def pop_front(): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def push_front(`val`: T): Unit = js.native
    
    /**
      * Reserve {@link capacity} enable to store *n* elements.
      *
      * @param n The capacity to reserve.
      */
    def reserve(n: Double): Unit = js.native
    
    /**
      * Shrink {@link capacity} to actual {@link size}.
      */
    def shrink_to_fit(): Unit = js.native
    
    var size_ : js.Any = js.native
    
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: Deque[T]): Unit = js.native
    
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[T] = js.native
  }
  /* static members */
  @js.native
  object Deque extends js.Object {
    
    val Iterator: Instantiable0[
        ArrayIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
          ]
        ]
      ] = js.native
    
    /**
      * Expansion ratio.
      */
    val MAGNIFIER: /* 1.5 */ Double = js.native
    
    /**
      * Minimum {@link Deque.capacity}.
      *
      * Although a {@link Deque} has few elements, even no element is belonged to, the {@link Deque}
      * keeps the minimum {@link Deque.capacity} at least.
      */
    val MIN_CAPACITY: /* 36 */ Double = js.native
    
    /**
      * Row size of the {@link Deque.matrix_ matrix} which contains elements.
      *
      * Note that the {@link ROW_SIZE} affects on time complexity of accessing and inserting element.
      * Accessing element is {@link ROW_SIZE} times slower than ordinary {@link Vector} and inserting element
      * in middle position is {@link ROW_SIZE} times faster than ordinary {@link Vector}.
      *
      * When the {@link ROW_SIZE} returns 8, time complexity of accessing element is O(8) and inserting
      * element in middle position is O(N/8). ({@link Vector}'s time complexity of accessement is O(1)
      * and inserting element is O(N)).
      */
    val ROW_SIZE: /* 8 */ Double = js.native
    
    val ReverseIterator: Instantiable0[
        ArrayReverseIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
          ]
        ]
      ] = js.native
    
    var _Emend: js.Any = js.native
    
    /**
      * Iterator of {@link Deque}
      */
    type Iterator[T] = ArrayIterator[T, Deque[T]]
    
    /**
      * Reverse iterator of {@link Deque}
      */
    type ReverseIterator[T] = ArrayReverseIterator[T, Deque[T]]
  }
}
