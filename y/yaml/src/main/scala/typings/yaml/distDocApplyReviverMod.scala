package typings.yaml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocApplyReviverMod {
  
  @JSImport("yaml/dist/doc/applyReviver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyReviver(reviver: Reviver, obj: Any, key: Any, `val`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("applyReviver")(reviver.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type Reviver = js.Function2[/* key */ Any, /* value */ Any, Any]
}
