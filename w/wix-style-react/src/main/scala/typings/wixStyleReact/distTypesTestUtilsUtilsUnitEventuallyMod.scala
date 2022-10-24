package typings.wixStyleReact

import typings.wixStyleReact.anon.Interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestUtilsUtilsUnitEventuallyMod {
  
  @JSImport("wix-style-react/dist/types/test-utils/utils/unit/eventually", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventually(fn: Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def eventually(fn: Any, param1: Interval): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(fn.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
