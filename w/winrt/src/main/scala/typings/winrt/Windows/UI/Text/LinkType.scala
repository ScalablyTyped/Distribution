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
  
}

