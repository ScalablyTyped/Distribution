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
  
  val connectingToServer: connectingToServer with java.lang.String = js.native
  val detectingProxy: detectingProxy with java.lang.String = js.native
  val negotiatingSsl: negotiatingSsl with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val receivingContent: receivingContent with java.lang.String = js.native
  val receivingHeaders: receivingHeaders with java.lang.String = js.native
  val resolvingName: resolvingName with java.lang.String = js.native
  val sendingContent: sendingContent with java.lang.String = js.native
  val sendingHeaders: sendingHeaders with java.lang.String = js.native
  val waitingForResponse: waitingForResponse with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpProgressStage with java.lang.String] = js.native
}

