package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupHeaderTapBehavior with Double] = js.native
  /* 0 */ @js.native
  object invoke extends TopLevel[invoke with Double]
  
  /* 1 */ @js.native
  object none extends TopLevel[none with Double]
  
}

