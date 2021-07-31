package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TapBehavior extends StObject
/**
  * Specifies how items in a ListView respond to the tap interaction.
  **/
@JSGlobal("WinJS.UI.TapBehavior")
@js.native
object TapBehavior extends StObject {
  
  /**
    * The item is selected and invoked.
    **/
  @js.native
  sealed trait directSelect
    extends StObject
       with TapBehavior
  
  /**
    * The item is invoked but not selected.
    **/
  @js.native
  sealed trait invokeOnly
    extends StObject
       with TapBehavior
  
  /**
    * Nothing happens.
    **/
  @js.native
  sealed trait none
    extends StObject
       with TapBehavior
  
  /**
    * The item is selected if was not already selected, and its deselected if it was already selected.
    **/
  @js.native
  sealed trait toggleSelect
    extends StObject
       with TapBehavior
}
