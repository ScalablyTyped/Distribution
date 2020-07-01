package typings.tstl.mod.default

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.arrayContainerMod.ArrayContainer
import typings.tstl.arrayIteratorMod.ArrayIterator
import typings.tstl.arrayReverseIteratorMod.ArrayReverseIterator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "Deque")
@js.native
/**
  * Default Constructor.
  */
class Deque[T] ()
  extends typings.tstl.tstlModuleMod.Deque[T] {
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
  def this(obj: typings.tstl.dequeMod.Deque[T]) = this()
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
@JSImport("tstl", "Deque")
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
}

