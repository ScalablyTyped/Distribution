package typings.wixUiTestUtils

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.legacyStylableTypesMod.CommonStylesheet
import typings.wixUiTestUtils.legacyStylableTypesMod.CompatStylesheet
import typings.wixUiTestUtils.legacyStylableTypesMod.LegacyStylesheet
import typings.wixUiTestUtils.legacyStylableTypesMod.StateValue
import typings.wixUiTestUtils.wixUiTestUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableUnidriverUtilLegacyMod {
  
  @JSImport("wix-ui-test-utils/dist/src/unidriver/stylable-unidriver-util-legacy", "StylableCompatUniDriver")
  @js.native
  class StylableCompatUniDriver protected () extends StObject {
    def this(style: CommonStylesheet) = this()
    
    /**
      * Get style state value
      *
      * @returns state or null if not found
      */
    def getStyleState(base: UniDriver[js.Any], stateName: String): js.Promise[js.Any] = js.native
    
    def hasStyleState(base: UniDriver[js.Any], stateName: String): js.Promise[Boolean] = js.native
    def hasStyleState(base: UniDriver[js.Any], stateName: String, param: StateValue): js.Promise[Boolean] = js.native
    
    var internal: js.Any = js.native
    
    var style: js.Any = js.native
  }
  
  @JSImport("wix-ui-test-utils/dist/src/unidriver/stylable-unidriver-util-legacy", "StylableUnidriverUtilCompat")
  @js.native
  class StylableUnidriverUtilCompat protected () extends StObject {
    def this(style: CompatStylesheet) = this()
    
    var getBaseStateWithParam: js.Any = js.native
    
    def getStateValueFromClassName(cls: String, baseState: String): String = js.native
    
    /**
      * Get style state value
      *
      * @returns state or null if not found
      */
    def getStyleState(base: UniDriver[js.Any], stateName: String): js.Promise[String | `true` | Null] = js.native
    
    def hasStyleState(base: UniDriver[js.Any], stateName: String): js.Promise[Boolean] = js.native
    def hasStyleState(base: UniDriver[js.Any], stateName: String, param: StateValue): js.Promise[Boolean] = js.native
    
    var style: js.Any = js.native
  }
  
  @JSImport("wix-ui-test-utils/dist/src/unidriver/stylable-unidriver-util-legacy", "StylableUnidriverUtilLegacy")
  @js.native
  class StylableUnidriverUtilLegacy protected () extends StObject {
    def this(style: LegacyStylesheet) = this()
    
    var getStateDataAttrKey: js.Any = js.native
    
    /**
      * Get style state value
      *
      * @returns state or null if not found
      */
    def getStyleState(base: UniDriver[js.Any], stateName: String): js.Promise[String | Null] = js.native
    
    def hasStyleState(base: UniDriver[js.Any], stateName: String): js.Promise[Boolean] = js.native
    def hasStyleState(base: UniDriver[js.Any], stateName: String, param: StateValue): js.Promise[Boolean] = js.native
    
    var style: js.Any = js.native
  }
}
