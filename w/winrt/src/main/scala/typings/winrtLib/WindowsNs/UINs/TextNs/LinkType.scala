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
  
  val autoLink: autoLink with java.lang.String = js.native
  val autoLinkEmail: autoLinkEmail with java.lang.String = js.native
  val autoLinkPath: autoLinkPath with java.lang.String = js.native
  val autoLinkPhone: autoLinkPhone with java.lang.String = js.native
  val clientLink: clientLink with java.lang.String = js.native
  val friendlyLinkAddress: friendlyLinkAddress with java.lang.String = js.native
  val friendlyLinkName: friendlyLinkName with java.lang.String = js.native
  val notALink: notALink with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.LinkType with java.lang.String] = js.native
}

