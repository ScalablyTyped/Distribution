package typings.tcomb

import typings.tcomb.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isSubsetOfMod {
  
  @JSImport("tcomb/lib/isSubsetOf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(subset: Type[js.Any], superset: Type[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(subset.asInstanceOf[js.Any], superset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
