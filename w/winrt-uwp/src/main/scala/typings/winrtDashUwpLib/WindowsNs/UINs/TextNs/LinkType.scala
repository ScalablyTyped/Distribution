package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

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
  sealed trait autoLink
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LinkType
  
  /** An email address that is automatically recognized. */
  @js.native
  sealed trait autoLinkEmail
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LinkType
  
  /** A file name, including the full path, that is automatically recognized. */
  @js.native
  sealed trait autoLinkPath
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LinkType
  
  /** A phone number that is automatically recognized. */
  @js.native
  sealed trait autoLinkPhone
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LinkType
  
  /** A link specified by the client; that is, not an autolink or a friendly-name link. */
  @js.native
  sealed trait clientLink
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LinkType
  
  /** The address URI part of friendly-name link. The address it the part that is sent when the user clicks the name. */
  @js.native
  sealed trait friendlyLinkAddress
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LinkType
  
  /** The name part of a friendly-name link. The name is the part that is displayed. */
  @js.native
  sealed trait friendlyLinkName
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LinkType
  
  /** Not a link. */
  @js.native
  sealed trait notALink
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LinkType
  
  /** A mix of link and nonlink attributes. */
  @js.native
  sealed trait undefined
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LinkType
  
  /* 5 */ val autoLink: autoLink with scala.Double = js.native
  /* 6 */ val autoLinkEmail: autoLinkEmail with scala.Double = js.native
  /* 8 */ val autoLinkPath: autoLinkPath with scala.Double = js.native
  /* 7 */ val autoLinkPhone: autoLinkPhone with scala.Double = js.native
  /* 2 */ val clientLink: clientLink with scala.Double = js.native
  /* 4 */ val friendlyLinkAddress: friendlyLinkAddress with scala.Double = js.native
  /* 3 */ val friendlyLinkName: friendlyLinkName with scala.Double = js.native
  /* 1 */ val notALink: notALink with scala.Double = js.native
  /* 0 */ val undefined: undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.LinkType with scala.Double] = js.native
}

