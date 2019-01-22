package typings
package tstlLib.utilityEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/utility/Entry", "Entry")
@js.native
class Entry[Key, T] protected ()
  extends tstlLib.utilityIPairMod.IPair[Key, T]
     with tstlLib.functionalIComparableMod.IComparable[Entry[Key, T]] {
  /**
    * Intializer Constructor.
    *
    * @param first The first, key element.
    * @param second The second, mapped element.
    */
  def this(first: Key, second: T) = this()
  /**
    * The first element.
    */
  /* CompleteClass */
  override var first: Key = js.native
  /**
    * The second element.
    */
  /* CompleteClass */
  override var second: T = js.native
  /**
    * Test whether less than some object.
    *
    * @param obj The object to compare.
    * @return Whether less or not.
    */
  /* CompleteClass */
  override def less(obj: Entry[Key, T]): scala.Boolean = js.native
}

