package typings.tstl.utilityMod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/utility", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val pair: Instantiable2[
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam First */ /* first */ js.Any, 
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam Second */ /* second */ js.Any, 
    typings.tstl.utilityPairMod.Pair[js.Object, js.Object]
  ] = js.native
  def is_node(): Boolean = js.native
  def make_pair[First, Second](first: First, second: Second): typings.tstl.utilityPairMod.Pair[First, Second] = js.native
}

