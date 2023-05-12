package typings.wixWixUiTestUtils

import org.scalablytyped.runtime.StringDictionary
import typings.unidriverCore.mod.UniDriver
import typings.wixWixUiTestUtils.anon.ClassName
import typings.wixWixUiTestUtils.wixWixUiTestUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUnidriverStylableUnidriverUtilLegacyMod {
  
  @JSImport("@wix/wix-ui-test-utils/dist/types/unidriver/stylable-unidriver-util-legacy", "StylableCompatUniDriver")
  @js.native
  open class StylableCompatUniDriver protected () extends StObject {
    def this(style: CommonStylesheet) = this()
    
    /**
      * Get style state value
      *
      * @returns state or null if not found
      */
    def getStyleState(base: UniDriver[Any], stateName: String): js.Promise[Any] = js.native
    
    def hasStyleState(base: UniDriver[Any], stateName: String): js.Promise[Boolean] = js.native
    def hasStyleState(base: UniDriver[Any], stateName: String, param: StateValue): js.Promise[Boolean] = js.native
    
    /* private */ var internal: Any = js.native
    
    /* private */ var style: Any = js.native
  }
  
  @JSImport("@wix/wix-ui-test-utils/dist/types/unidriver/stylable-unidriver-util-legacy", "StylableUnidriverUtilCompat")
  @js.native
  open class StylableUnidriverUtilCompat protected () extends StObject {
    def this(style: CompatStylesheet) = this()
    
    /* private */ var getBaseStateWithParam: Any = js.native
    
    def getStateValueFromClassName(cls: String, baseState: String): String = js.native
    
    /**
      * Get style state value
      *
      * @returns state or null if not found
      */
    def getStyleState(base: UniDriver[Any], stateName: String): js.Promise[String | `true` | Null] = js.native
    
    def hasStyleState(base: UniDriver[Any], stateName: String): js.Promise[Boolean] = js.native
    def hasStyleState(base: UniDriver[Any], stateName: String, param: StateValue): js.Promise[Boolean] = js.native
    
    /* private */ var style: Any = js.native
  }
  
  @JSImport("@wix/wix-ui-test-utils/dist/types/unidriver/stylable-unidriver-util-legacy", "StylableUnidriverUtilLegacy")
  @js.native
  open class StylableUnidriverUtilLegacy protected () extends StObject {
    def this(style: LegacyStylesheet) = this()
    
    /* private */ var getStateDataAttrKey: Any = js.native
    
    /**
      * Get style state value
      *
      * @returns state or null if not found
      */
    def getStyleState(base: UniDriver[Any], stateName: String): js.Promise[String | Null] = js.native
    
    def hasStyleState(base: UniDriver[Any], stateName: String): js.Promise[Boolean] = js.native
    def hasStyleState(base: UniDriver[Any], stateName: String, param: StateValue): js.Promise[Boolean] = js.native
    
    /* private */ var style: Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixWixUiTestUtils.distTypesUnidriverStylableUnidriverUtilLegacyMod.LegacyStylesheet
    - typings.wixWixUiTestUtils.distTypesUnidriverStylableUnidriverUtilLegacyMod.CompatStylesheet
    - typings.wixWixUiTestUtils.distTypesUnidriverStylableUnidriverUtilLegacyMod.StylesheetV2
  */
  trait CommonStylesheet extends StObject
  
  @js.native
  trait CompatStylesheet
    extends StObject
       with CommonStylesheet {
    
    @JSName("$cssStates")
    def $cssStates(): ClassName = js.native
    @JSName("$cssStates")
    def $cssStates(states: StateMap): ClassName = js.native
  }
  
  @js.native
  trait LegacyStylesheet
    extends StObject
       with CommonStylesheet {
    
    @JSName("$cssStates")
    def $cssStates(): StateMap = js.native
    @JSName("$cssStates")
    def $cssStates(states: StateMap): StateMap = js.native
  }
  
  type StateMap = StringDictionary[StateValue]
  
  type StateValue = Boolean | Double | String
  
  @js.native
  trait StylesheetV2
    extends StObject
       with CommonStylesheet {
    
    def cssStates(): String = js.native
    def cssStates(states: StateMap): String = js.native
  }
}
