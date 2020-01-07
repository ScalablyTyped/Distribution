package typings.tstl.tstlMod

import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "VectorBoolean")
@js.native
/**
  * Default Constructor.
  */
class VectorBoolean ()
  extends typings.tstl.containerMod.VectorBoolean {
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
  def this(obj: typings.tstl.containerVectorBooleanMod.VectorBoolean) = this()
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

@JSImport("tstl", "VectorBoolean")
@js.native
object VectorBoolean extends js.Object {
  val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
  val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
  val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
  val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
}

