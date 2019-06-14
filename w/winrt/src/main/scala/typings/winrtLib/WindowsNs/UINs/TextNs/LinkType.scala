package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkType extends js.Object

@JSGlobal("Windows.UI.Text.LinkType")
@js.native
object LinkType extends js.Object {
  @js.native
  sealed trait autoLink
    extends winrtLib.WindowsNs.UINs.TextNs.LinkType
  
  @js.native
  sealed trait autoLinkEmail
    extends winrtLib.WindowsNs.UINs.TextNs.LinkType
  
  @js.native
  sealed trait autoLinkPath
    extends winrtLib.WindowsNs.UINs.TextNs.LinkType
  
  @js.native
  sealed trait autoLinkPhone
    extends winrtLib.WindowsNs.UINs.TextNs.LinkType
  
  @js.native
  sealed trait clientLink
    extends winrtLib.WindowsNs.UINs.TextNs.LinkType
  
  @js.native
  sealed trait friendlyLinkAddress
    extends winrtLib.WindowsNs.UINs.TextNs.LinkType
  
  @js.native
  sealed trait friendlyLinkName
    extends winrtLib.WindowsNs.UINs.TextNs.LinkType
  
  @js.native
  sealed trait notALink
    extends winrtLib.WindowsNs.UINs.TextNs.LinkType
  
  @js.native
  sealed trait undefined
    extends winrtLib.WindowsNs.UINs.TextNs.LinkType
  
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
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.LinkType with scala.Double] = js.native
}

