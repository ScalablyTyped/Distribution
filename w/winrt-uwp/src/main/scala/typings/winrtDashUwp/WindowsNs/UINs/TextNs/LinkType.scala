package typings.winrtDashUwp.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkType extends js.Object

/** Indicates the link type of a range of text. */
@JSGlobal("Windows.UI.Text.LinkType")
@js.native
object LinkType extends js.Object {
  /** A URI that is automatically recognized. */
  @js.native
  sealed trait autoLink extends LinkType
  
  /** An email address that is automatically recognized. */
  @js.native
  sealed trait autoLinkEmail extends LinkType
  
  /** A file name, including the full path, that is automatically recognized. */
  @js.native
  sealed trait autoLinkPath extends LinkType
  
  /** A phone number that is automatically recognized. */
  @js.native
  sealed trait autoLinkPhone extends LinkType
  
  /** A link specified by the client; that is, not an autolink or a friendly-name link. */
  @js.native
  sealed trait clientLink extends LinkType
  
  /** The address URI part of friendly-name link. The address it the part that is sent when the user clicks the name. */
  @js.native
  sealed trait friendlyLinkAddress extends LinkType
  
  /** The name part of a friendly-name link. The name is the part that is displayed. */
  @js.native
  sealed trait friendlyLinkName extends LinkType
  
  /** Not a link. */
  @js.native
  sealed trait notALink extends LinkType
  
  /** A mix of link and nonlink attributes. */
  @js.native
  sealed trait undefined extends LinkType
  
  /* 5 */ val autoLink: typings.winrtDashUwp.WindowsNs.UINs.TextNs.LinkType.autoLink with Double = js.native
  /* 6 */ val autoLinkEmail: typings.winrtDashUwp.WindowsNs.UINs.TextNs.LinkType.autoLinkEmail with Double = js.native
  /* 8 */ val autoLinkPath: typings.winrtDashUwp.WindowsNs.UINs.TextNs.LinkType.autoLinkPath with Double = js.native
  /* 7 */ val autoLinkPhone: typings.winrtDashUwp.WindowsNs.UINs.TextNs.LinkType.autoLinkPhone with Double = js.native
  /* 2 */ val clientLink: typings.winrtDashUwp.WindowsNs.UINs.TextNs.LinkType.clientLink with Double = js.native
  /* 4 */ val friendlyLinkAddress: typings.winrtDashUwp.WindowsNs.UINs.TextNs.LinkType.friendlyLinkAddress with Double = js.native
  /* 3 */ val friendlyLinkName: typings.winrtDashUwp.WindowsNs.UINs.TextNs.LinkType.friendlyLinkName with Double = js.native
  /* 1 */ val notALink: typings.winrtDashUwp.WindowsNs.UINs.TextNs.LinkType.notALink with Double = js.native
  /* 0 */ val undefined: typings.winrtDashUwp.WindowsNs.UINs.TextNs.LinkType.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkType with Double] = js.native
}

