package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkType extends StObject
/** Indicates the link type of a range of text. */
@JSGlobal("Windows.UI.Text.LinkType")
@js.native
object LinkType extends StObject {
  
  /** A URI that is automatically recognized. */
  @js.native
  sealed trait autoLink
    extends StObject
       with LinkType
  
  /** An email address that is automatically recognized. */
  @js.native
  sealed trait autoLinkEmail
    extends StObject
       with LinkType
  
  /** A file name, including the full path, that is automatically recognized. */
  @js.native
  sealed trait autoLinkPath
    extends StObject
       with LinkType
  
  /** A phone number that is automatically recognized. */
  @js.native
  sealed trait autoLinkPhone
    extends StObject
       with LinkType
  
  /** A link specified by the client; that is, not an autolink or a friendly-name link. */
  @js.native
  sealed trait clientLink
    extends StObject
       with LinkType
  
  /** The address URI part of friendly-name link. The address it the part that is sent when the user clicks the name. */
  @js.native
  sealed trait friendlyLinkAddress
    extends StObject
       with LinkType
  
  /** The name part of a friendly-name link. The name is the part that is displayed. */
  @js.native
  sealed trait friendlyLinkName
    extends StObject
       with LinkType
  
  /** Not a link. */
  @js.native
  sealed trait notALink
    extends StObject
       with LinkType
  
  /** A mix of link and nonlink attributes. */
  @js.native
  sealed trait undefined
    extends StObject
       with LinkType
}
