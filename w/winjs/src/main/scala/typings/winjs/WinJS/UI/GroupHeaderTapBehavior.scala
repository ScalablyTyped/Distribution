package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupHeaderTapBehavior extends js.Object
/**
  * Specifies how group headers in a ListView respond to the tap interaction.
  **/
@JSGlobal("WinJS.UI.GroupHeaderTapBehavior")
@js.native
object GroupHeaderTapBehavior extends js.Object {
  
  /**
    * The group is invoked.
    **/
  @js.native
  sealed trait invoke extends GroupHeaderTapBehavior
  
  /**
    * Nothing happens.
    **/
  @js.native
  sealed trait none extends GroupHeaderTapBehavior
}
