package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkType extends js.Object

@JSGlobal("Windows.UI.Text.LinkType")
@js.native
object LinkType extends js.Object {
  @js.native
  sealed trait autoLink extends LinkType
  
  @js.native
  sealed trait autoLinkEmail extends LinkType
  
  @js.native
  sealed trait autoLinkPath extends LinkType
  
  @js.native
  sealed trait autoLinkPhone extends LinkType
  
  @js.native
  sealed trait clientLink extends LinkType
  
  @js.native
  sealed trait friendlyLinkAddress extends LinkType
  
  @js.native
  sealed trait friendlyLinkName extends LinkType
  
  @js.native
  sealed trait notALink extends LinkType
  
  @js.native
  sealed trait undefined extends LinkType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkType with Double] = js.native
  /* 5 */ @js.native
  object autoLink extends TopLevel[autoLink with Double]
  
  /* 6 */ @js.native
  object autoLinkEmail extends TopLevel[autoLinkEmail with Double]
  
  /* 8 */ @js.native
  object autoLinkPath extends TopLevel[autoLinkPath with Double]
  
  /* 7 */ @js.native
  object autoLinkPhone extends TopLevel[autoLinkPhone with Double]
  
  /* 2 */ @js.native
  object clientLink extends TopLevel[clientLink with Double]
  
  /* 4 */ @js.native
  object friendlyLinkAddress extends TopLevel[friendlyLinkAddress with Double]
  
  /* 3 */ @js.native
  object friendlyLinkName extends TopLevel[friendlyLinkName with Double]
  
  /* 1 */ @js.native
  object notALink extends TopLevel[notALink with Double]
  
  /* 0 */ @js.native
  object undefined extends TopLevel[undefined with Double]
  
}

