package typings.wixUiTestUtils

import org.scalablytyped.runtime.StringDictionary
import typings.wixUiTestUtils.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUnidriverLegacyStylableTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixUiTestUtils.srcUnidriverLegacyStylableTypesMod.LegacyStylesheet
    - typings.wixUiTestUtils.srcUnidriverLegacyStylableTypesMod.CompatStylesheet
    - typings.wixUiTestUtils.srcUnidriverLegacyStylableTypesMod.StylesheetV2
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
