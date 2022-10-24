package typings.wixStyleReact

import typings.wixStyleReact.anon.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestUtilsUtilsE2eHelpersMod {
  
  @JSImport("wix-style-react/dist/types/test-utils/utils/e2e-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def navigateToTestUrl(param0: Category): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateToTestUrl")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setupBeforeEach(testName: Any, settings: Any, createTestkit: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setupBeforeEach")(testName.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], createTestkit.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setupForTest(testName: Any, settings: Any, createTestkit: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setupForTest")(testName.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], createTestkit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
