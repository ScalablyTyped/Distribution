package typings.tstl.tstlMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "Pair")
@js.native
class Pair[First, Second] protected ()
  extends typings.tstl.utilityMod.Pair[First, Second] {
  /**
    * Initializer Constructor.
    *
    * @param first The first element.
    * @param second The second element.
    */
  def this(first: First, second: Second) = this()
}

@JSImport("tstl", "pair")
@js.native
object pair
  extends TopLevel[
      Instantiable2[
        /* import warning: RewrittenClass.unapply cls was tparam First */ /* first */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Second */ /* second */ js.Any, 
        typings.tstl.utilityPairMod.Pair[js.Object, js.Object]
      ]
    ]

