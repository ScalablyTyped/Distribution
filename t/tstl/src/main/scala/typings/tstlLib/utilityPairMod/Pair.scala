package typings
package tstlLib.utilityPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/utility/Pair", "Pair")
@js.native
class Pair[First, Second] protected ()
  extends tstlLib.utilityIPairMod.IPair[First, Second]
     with tstlLib.functionalIComparableMod.IComparable[Pair[First, Second]] {
  /**
    * Initializer Constructor.
    *
    * @param first The first element.
    * @param second The second element.
    */
  def this(first: First, second: Second) = this()
  /**
    * The first element.
    */
  /* CompleteClass */
  override var first: First = js.native
  /**
    * The second element.
    */
  /* CompleteClass */
  override var second: Second = js.native
  /**
    * Test whether less than some object.
    *
    * @param obj The object to compare.
    * @return Whether less or not.
    */
  /* CompleteClass */
  override def less(obj: Pair[First, Second]): scala.Boolean = js.native
}

