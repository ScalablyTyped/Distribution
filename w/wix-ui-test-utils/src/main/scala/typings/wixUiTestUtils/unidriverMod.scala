package typings.wixUiTestUtils

import org.scalablytyped.runtime.Instantiable1
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.legacyStylableTypesMod.CommonStylesheet
import typings.wixUiTestUtils.stylableUnidriverUtilLegacyMod.StylableCompatUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unidriverMod {
  
  @JSImport("wix-ui-test-utils/dist/src/unidriver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-ui-test-utils/dist/src/unidriver", "StylableUnidriverUtil")
  @js.native
  class StylableUnidriverUtil protected () extends StylableCompatUniDriver {
    def this(style: CommonStylesheet) = this()
  }
  @JSImport("wix-ui-test-utils/dist/src/unidriver", "StylableUnidriverUtil")
  @js.native
  val StylableUnidriverUtil: Instantiable1[/* style */ CommonStylesheet, StylableCompatUniDriver] = js.native
  
  @scala.inline
  def baseUniDriverFactory(base: UniDriver[js.Any]): BaseUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[BaseUniDriver]
}
