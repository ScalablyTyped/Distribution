package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("@uifabric/utilities/lib/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def format(s: String, values: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(s.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
}
