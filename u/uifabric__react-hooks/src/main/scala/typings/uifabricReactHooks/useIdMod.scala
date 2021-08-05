package typings.uifabricReactHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useIdMod {
  
  @JSImport("@uifabric/react-hooks/lib/useId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]
  inline def useId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def useId(prefix: String, providedId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(prefix.asInstanceOf[js.Any], providedId.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def useId(prefix: Unit, providedId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(prefix.asInstanceOf[js.Any], providedId.asInstanceOf[js.Any])).asInstanceOf[String]
}
