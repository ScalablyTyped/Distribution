package typings.tstl

import typings.tstl.containerVectorBooleanMod.VectorBoolean.Iterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/VectorBoolean", JSImport.Namespace)
@js.native
object containerVectorBooleanMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayContainer<boolean, VectorBoolean, VectorBoolean, VectorBoolean.Iterator, VectorBoolean.ReverseIterator, boolean> * / any */ @js.native
  /**
    * Default Constructor.
    */
  class VectorBoolean () extends js.Object {
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      */
    def this(array: js.Array[Boolean]) = this()
    /**
      * Copy Constructor
      *
      * @param obj Object to copy.
      */
    def this(obj: VectorBoolean) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iteartor of the last position.
      */
    def this(
      first: IForwardIterator[Boolean, IForwardIterator[Boolean, _]],
      last: IForwardIterator[Boolean, IForwardIterator[Boolean, _]]
    ) = this()
    /**
      * Fill Constructor.
      *
      * @param size Initial size.
      * @param val Value to fill.
      */
    def this(n: Double, `val`: Boolean) = this()
    /**
      * @hidden
      */
    var _Find_node: js.Any = js.native
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
    var data_ : js.Any = js.native
    /**
      * @hidden
      */
    var size_ : js.Any = js.native
    /**
      * @hidden
      */
    /* protected */ def _Erase_by_range(first: Iterator, last: Iterator): Iterator = js.native
    /**
      * @hidden
      */
    /* protected */ def _Insert_by_range[InputIterator /* <: IForwardIterator[Boolean, InputIterator] */](pos: Iterator, first: InputIterator, last: InputIterator): Iterator = js.native
    /**
      * @hidden
      */
    /* protected */ def _Insert_by_repeating_val(pos: Iterator, n: Double, `val`: Boolean): Iterator = js.native
    /**
      * @inheritDoc
      */
    def assign(n: Double, `val`: Boolean): Unit = js.native
    /**
      * @inheritDoc
      */
    def assign[InputIterator /* <: IForwardIterator[Boolean, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * @inheritDoc
      */
    def at(index: Double): Boolean = js.native
    /**
      * @inheritDoc
      */
    def clear(): Unit = js.native
    /**
      * Flip all values.
      */
    def flip(): Unit = js.native
    /**
      * @hidden
      */
    def nth(index: Double): Iterator = js.native
    /**
      * @inheritDoc
      */
    def pop_back(): Unit = js.native
    /**
      * @inheritDoc
      */
    def push(items: Boolean*): Double = js.native
    /**
      * @inheritDoc
      */
    def push_back(`val`: Boolean): Unit = js.native
    /**
      * @inheritDoc
      */
    def resize(n: Double): Unit = js.native
    /**
      * @inheritDoc
      */
    def set(index: Double, `val`: Boolean): Unit = js.native
    /**
      * @inheritDoc
      */
    def size(): Double = js.native
    /**
      * @inheritDoc
      */
    def swap(obj: VectorBoolean): Unit = js.native
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class vetor_bool () extends VectorBoolean {
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      */
    def this(array: js.Array[Boolean]) = this()
    /**
      * Copy Constructor
      *
      * @param obj Object to copy.
      */
    def this(obj: VectorBoolean) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iteartor of the last position.
      */
    def this(
      first: IForwardIterator[Boolean, IForwardIterator[Boolean, _]],
      last: IForwardIterator[Boolean, IForwardIterator[Boolean, _]]
    ) = this()
    /**
      * Fill Constructor.
      *
      * @param size Initial size.
      * @param val Value to fill.
      */
    def this(n: Double, `val`: Boolean) = this()
  }
  
  @js.native
  object VectorBoolean extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
    type Iterator = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayIterator<boolean, VectorBoolean> */ js.Any
    type ReverseIterator = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayReverseIterator<boolean, VectorBoolean> */ js.Any
    type iterator = typings.tstl.containerVectorBooleanMod.VectorBoolean.Iterator
    type reverse_iterator = typings.tstl.containerVectorBooleanMod.VectorBoolean.ReverseIterator
  }
  
  @js.native
  object vetor_bool extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
  }
  
}

