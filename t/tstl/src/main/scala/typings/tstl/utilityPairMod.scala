package typings.tstl

import org.scalablytyped.runtime.Instantiable2
import typings.tstl.functionalIComparableMod.IComparable
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/utility/Pair", JSImport.Namespace)
@js.native
object utilityPairMod extends js.Object {
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
    override def less(obj: Pair[First, Second]): Boolean = js.native
  }
  
  val pair: Instantiable2[
    /* import warning: RewrittenClass.unapply cls was tparam First */ /* first */ js.Any, 
    /* import warning: RewrittenClass.unapply cls was tparam Second */ /* second */ js.Any, 
    Pair[js.Object, js.Object]
  ] = js.native
  def make_pair[First, Second](first: First, second: Second): Pair[First, Second] = js.native
  type pair[First, Second] = Pair[First, Second]
}

