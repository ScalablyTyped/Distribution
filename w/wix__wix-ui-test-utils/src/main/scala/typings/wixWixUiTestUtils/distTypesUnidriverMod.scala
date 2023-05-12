package typings.wixWixUiTestUtils

import org.scalablytyped.runtime.Instantiable1
import typings.unidriverCore.mod.UniDriver
import typings.wixWixUiTestUtils.distTypesBaseDriverMod.BaseUniDriver
import typings.wixWixUiTestUtils.distTypesUnidriverStylableUnidriverUtilLegacyMod.CommonStylesheet
import typings.wixWixUiTestUtils.distTypesUnidriverStylableUnidriverUtilLegacyMod.StylableCompatUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUnidriverMod {
  
  @JSImport("@wix/wix-ui-test-utils/dist/types/unidriver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@wix/wix-ui-test-utils/dist/types/unidriver", "StylableUnidriverUtil")
  @js.native
  open class StylableUnidriverUtil protected () extends StylableCompatUniDriver {
    def this(style: CommonStylesheet) = this()
  }
  @JSImport("@wix/wix-ui-test-utils/dist/types/unidriver", "StylableUnidriverUtil")
  @js.native
  val StylableUnidriverUtil: Instantiable1[/* style */ CommonStylesheet, StylableCompatUniDriver] = js.native
  
  inline def baseUniDriverFactory(base: UniDriver[Any]): BaseUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[BaseUniDriver]
}
