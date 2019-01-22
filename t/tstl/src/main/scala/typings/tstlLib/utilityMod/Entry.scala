package typings
package tstlLib.utilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/utility", "Entry")
@js.native
class Entry[Key, T] protected ()
  extends tstlLib.utilityEntryMod.Entry[Key, T] {
  /**
    * Intializer Constructor.
    *
    * @param first The first, key element.
    * @param second The second, mapped element.
    */
  def this(first: Key, second: T) = this()
}

