package typings.tstl.tstlModuleMod

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.arrayContainerMod.ArrayContainer
import typings.tstl.arrayIteratorMod.ArrayIterator
import typings.tstl.arrayReverseIteratorMod.ArrayReverseIterator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/module", "Vector")
@js.native
/**
  * Default Constructor.
  */
class Vector[T] ()
  extends typings.tstl.tstlMod.Vector[T] {
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
  def this(obj: typings.tstl.vectorMod.Vector[T]) = this()
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
@JSImport("tstl/module", "Vector")
@js.native
object Vector extends js.Object {
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
  /**
    * Wrap an array into a vector.
    *
    * @param data Target array to be wrapped
    * @return A vector wrapping the parametric array.
    */
  def wrap[T](data: js.Array[T]): typings.tstl.vectorMod.Vector[T] = js.native
}

