package typings.tstl

import typings.tstl.icomparableMod.IComparable
import typings.tstl.ipairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/utility/Pair", JSImport.Namespace)
@js.native
object pairMod extends js.Object {
  
  @JSName("make_pair")
  def makePair[First, Second](first: First, second: Second): Pair[First, Second] = js.native
  
  @js.native
  class Pair[First, Second] protected ()
    extends IPair[First, Second]
       with IComparable[Pair[First, Second]] {
    /**
      * Initializer Constructor.
      *
      * @param first The first element.
      * @param second The second element.
      */
    def this(first: First, second: Second) = this()
  }
}
