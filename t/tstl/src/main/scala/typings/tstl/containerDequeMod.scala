package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.baseContainerArrayContainerMod.ArrayContainer
import typings.tstl.baseIteratorArrayIteratorMod.ArrayIterator
import typings.tstl.baseIteratorArrayIteratorMod.ArrayReverseIterator
import typings.tstl.containerDequeMod.Deque.Iterator
import typings.tstl.containerDequeMod.Deque.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/Deque", JSImport.Namespace)
@js.native
object containerDequeMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class Deque[T] () extends ArrayContainer[T, Deque[T], Deque[T], Iterator[T], ReverseIterator[T], T] {
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
    /**
      * @hidden
      */
    var _Compute_col_size: js.Any = js.native
    /**
      * @hidden
      */
    var _Fetch_index: js.Any = js.native
    /**
      * @hidden
      */
    var _Insert_to_end: js.Any = js.native
    /**
      * @hidden
      */
    var _Insert_to_middle: js.Any = js.native
    /**
      * @hidden
      */
    var _Swap: js.Any = js.native
    /**
      * @hidden
      */
    var _Try_add_row_at_back: js.Any = js.native
    /**
      * @hidden
      */
    var _Try_add_row_at_front: js.Any = js.native
    /**
      * @hidden
      */
    var _Try_expand_capacity: js.Any = js.native
    /**
      * @hidden
      */
    var capacity_ : js.Any = js.native
    /**
      * @hidden
      */
    var matrix_ : js.Any = js.native
    /**
      * @hidden
      */
    var size_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    def assign(n: Double, `val`: T): Unit = js.native
    /**
      * The capacity to store elements.
      *
      * @return The capacity.
      */
    def capacity(): Double = js.native
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
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class deque[T] () extends Deque[T] {
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
  }
  
  /* static members */
  @js.native
  object Deque extends js.Object {
    val Iterator: Instantiable0[
        ArrayIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        ArrayReverseIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
          ]
        ]
      ] = js.native
    val iterator: Instantiable0[
        ArrayIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
          ]
        ]
      ] = js.native
    val reverse_iterator: Instantiable0[
        ArrayReverseIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
          ]
        ]
      ] = js.native
    /**
      * @hidden
      */
    /* private */ def MAGNIFIER(): js.Any = js.native
    /**
      * @hidden
      */
    /* private */ def MIN_CAPACITY(): js.Any = js.native
    /**
      * @hidden
      */
    /* private */ def ROW_SIZE(): js.Any = js.native
    type Iterator[T] = ArrayIterator[T, Deque[T]]
    type ReverseIterator[T] = ArrayReverseIterator[T, Deque[T]]
    type iterator[T] = typings.tstl.containerDequeMod.Deque.Iterator[T]
    type reverse_iterator[T] = typings.tstl.containerDequeMod.Deque.ReverseIterator[T]
  }
  
  /* static members */
  @js.native
  object deque extends js.Object {
    val Iterator: Instantiable0[
        ArrayIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        ArrayReverseIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
          ]
        ]
      ] = js.native
    val iterator: Instantiable0[
        ArrayIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
          ]
        ]
      ] = js.native
    val reverse_iterator: Instantiable0[
        ArrayReverseIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
          ]
        ]
      ] = js.native
    /**
      * @hidden
      */
    /* private */ def MAGNIFIER(): js.Any = js.native
    /**
      * @hidden
      */
    /* private */ def MIN_CAPACITY(): js.Any = js.native
    /**
      * @hidden
      */
    /* private */ def ROW_SIZE(): js.Any = js.native
  }
  
}

