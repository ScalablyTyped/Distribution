package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpProgressStage extends js.Object

/** Indicates the step in the progress for an HTTP connection. */
@JSGlobal("Windows.Web.Http.HttpProgressStage")
@js.native
object HttpProgressStage extends js.Object {
  /** The socket used for the HTTP connection is connecting to the server. */
  @js.native
  sealed trait connectingToServer
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgressStage
  
  /** The system starts to detect a proxy. */
  @js.native
  sealed trait detectingProxy
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgressStage
  
  /** The HTTP connection to the server is negotiating SSL. */
  @js.native
  sealed trait negotiatingSsl
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgressStage
  
  /** A default value that should not be encountered. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgressStage
  
  /** The HTTP client is receiving content from the server. */
  @js.native
  sealed trait receivingContent
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgressStage
  
  /** The HTTP client is receiving headers from the server. */
  @js.native
  sealed trait receivingHeaders
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgressStage
  
  /** The system is resolving the hostname for the HTTP connection. */
  @js.native
  sealed trait resolvingName
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgressStage
  
  /** HTTP content is being sent to the server. */
  @js.native
  sealed trait sendingContent
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgressStage
  
  /** HTTP headers are being sent to the server. */
  @js.native
  sealed trait sendingHeaders
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgressStage
  
  /** The HTTP client is waiting for a response from the server. */
  @js.native
  sealed trait waitingForResponse
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgressStage
  
  /* 3 */ val connectingToServer: connectingToServer with scala.Double = js.native
  /* 1 */ val detectingProxy: detectingProxy with scala.Double = js.native
  /* 4 */ val negotiatingSsl: negotiatingSsl with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 9 */ val receivingContent: receivingContent with scala.Double = js.native
  /* 8 */ val receivingHeaders: receivingHeaders with scala.Double = js.native
  /* 2 */ val resolvingName: resolvingName with scala.Double = js.native
  /* 6 */ val sendingContent: sendingContent with scala.Double = js.native
  /* 5 */ val sendingHeaders: sendingHeaders with scala.Double = js.native
  /* 7 */ val waitingForResponse: waitingForResponse with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgressStage with scala.Double] = js.native
}

