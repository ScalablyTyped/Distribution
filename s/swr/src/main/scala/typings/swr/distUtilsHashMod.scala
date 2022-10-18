package typings.swr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsHashMod {
  
  @JSImport("swr/dist/utils/hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stableHash(arg: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stableHash")(arg.asInstanceOf[js.Any]).asInstanceOf[String]
}
