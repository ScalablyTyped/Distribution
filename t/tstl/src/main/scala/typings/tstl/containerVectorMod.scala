package typings.tstl

import typings.tstl.containerVectorMod.Vector.Iterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/Vector", JSImport.Namespace)
@js.native
object containerVectorMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VectorContainer<T, Vector<T>, Vector<T>, Vector.Iterator<T>, Vector.ReverseIterator<T>, T> * / any */ @js.native
  /**
    * Default Constructor.
    */
  class Vector[T] () extends js.Object {
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
    def this(obj: Vector[T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iteartor of the last position.
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
    def this(n: Double, `val`: T) = this()
    /**
      * @hidden
      */
    def nth(index: Double): Iterator[T] = js.native
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class vector[T] () extends Vector[T] {
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
    def this(obj: Vector[T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iteartor of the last position.
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
    def this(n: Double, `val`: T) = this()
  }
  
  /* static members */
  @js.native
  object Vector extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
    /**
      * Wrap an array into a vector.
      *
      * @param data Target array to be wrapped
      * @return A vector wrapping the parametric array.
      */
    def wrap[T](data: js.Array[T]): Vector[T] = js.native
    type Iterator[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayIterator<T, Vector<T>> */ js.Any
    type ReverseIterator[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayReverseIterator<T, Vector<T>> */ js.Any
    type iterator[T] = typings.tstl.containerVectorMod.Vector.Iterator[T]
    type reverse_iterator[T] = typings.tstl.containerVectorMod.Vector.ReverseIterator[T]
  }
  
  /* static members */
  @js.native
  object vector extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
    /**
      * Wrap an array into a vector.
      *
      * @param data Target array to be wrapped
      * @return A vector wrapping the parametric array.
      */
    def wrap[T](data: js.Array[T]): Vector[T] = js.native
  }
  
}

