package typings.testingLibraryReact.mod

import typings.prettyFormat.typesMod.NewPlugin
import typings.prettyFormat.typesMod.OptionsReceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/react", "prettyFormat")
@js.native
object prettyFormat extends js.Object {
  
  /**
    * Returns a presentation string of your `val` object
    * @param val any potential JavaScript object
    * @param options Custom settings
    */
  def apply(`val`: js.Any): String = js.native
  def apply(`val`: js.Any, options: OptionsReceived): String = js.native
  
  @js.native
  object plugins extends js.Object {
    
    var AsymmetricMatcher: NewPlugin = js.native
    
    var ConvertAnsi: NewPlugin = js.native
    
    var DOMCollection: NewPlugin = js.native
    
    var DOMElement: NewPlugin = js.native
    
    var Immutable: NewPlugin = js.native
    
    var ReactElement: NewPlugin = js.native
    
    var ReactTestComponent: NewPlugin = js.native
  }
}
