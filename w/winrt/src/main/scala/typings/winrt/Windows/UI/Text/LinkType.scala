package typings.winrt.Windows.UI.Text

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
  
  /* 5 */ val autoLink: typings.winrt.Windows.UI.Text.LinkType.autoLink with Double = js.native
  /* 6 */ val autoLinkEmail: typings.winrt.Windows.UI.Text.LinkType.autoLinkEmail with Double = js.native
  /* 8 */ val autoLinkPath: typings.winrt.Windows.UI.Text.LinkType.autoLinkPath with Double = js.native
  /* 7 */ val autoLinkPhone: typings.winrt.Windows.UI.Text.LinkType.autoLinkPhone with Double = js.native
  /* 2 */ val clientLink: typings.winrt.Windows.UI.Text.LinkType.clientLink with Double = js.native
  /* 4 */ val friendlyLinkAddress: typings.winrt.Windows.UI.Text.LinkType.friendlyLinkAddress with Double = js.native
  /* 3 */ val friendlyLinkName: typings.winrt.Windows.UI.Text.LinkType.friendlyLinkName with Double = js.native
  /* 1 */ val notALink: typings.winrt.Windows.UI.Text.LinkType.notALink with Double = js.native
  /* 0 */ val undefined: typings.winrt.Windows.UI.Text.LinkType.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkType with Double] = js.native
}

