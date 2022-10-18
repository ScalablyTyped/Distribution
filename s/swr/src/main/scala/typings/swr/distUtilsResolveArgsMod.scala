package typings.swr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsResolveArgsMod {
  
  @JSImport("swr/dist/utils/resolve-args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withArgs[SWRType](hook: Any): SWRType = ^.asInstanceOf[js.Dynamic].applyDynamic("withArgs")(hook.asInstanceOf[js.Any]).asInstanceOf[SWRType]
}
