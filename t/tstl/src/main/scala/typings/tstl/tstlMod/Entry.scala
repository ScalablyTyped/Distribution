package typings.tstl.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "Entry")
@js.native
class Entry[Key, T] protected ()
  extends typings.tstl.utilityMod.Entry[Key, T] {
  /**
    * Intializer Constructor.
    *
    * @param first The first, key element.
    * @param second The second, mapped element.
    */
  def this(first: Key, second: T) = this()
}

