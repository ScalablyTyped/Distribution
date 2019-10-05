package typings.winrtDashUwp.Windows.Web.Http

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
  sealed trait connectingToServer extends HttpProgressStage
  
  /** The system starts to detect a proxy. */
  @js.native
  sealed trait detectingProxy extends HttpProgressStage
  
  /** The HTTP connection to the server is negotiating SSL. */
  @js.native
  sealed trait negotiatingSsl extends HttpProgressStage
  
  /** A default value that should not be encountered. */
  @js.native
  sealed trait none extends HttpProgressStage
  
  /** The HTTP client is receiving content from the server. */
  @js.native
  sealed trait receivingContent extends HttpProgressStage
  
  /** The HTTP client is receiving headers from the server. */
  @js.native
  sealed trait receivingHeaders extends HttpProgressStage
  
  /** The system is resolving the hostname for the HTTP connection. */
  @js.native
  sealed trait resolvingName extends HttpProgressStage
  
  /** HTTP content is being sent to the server. */
  @js.native
  sealed trait sendingContent extends HttpProgressStage
  
  /** HTTP headers are being sent to the server. */
  @js.native
  sealed trait sendingHeaders extends HttpProgressStage
  
  /** The HTTP client is waiting for a response from the server. */
  @js.native
  sealed trait waitingForResponse extends HttpProgressStage
  
  /* 3 */ val connectingToServer: typings.winrtDashUwp.Windows.Web.Http.HttpProgressStage.connectingToServer with Double = js.native
  /* 1 */ val detectingProxy: typings.winrtDashUwp.Windows.Web.Http.HttpProgressStage.detectingProxy with Double = js.native
  /* 4 */ val negotiatingSsl: typings.winrtDashUwp.Windows.Web.Http.HttpProgressStage.negotiatingSsl with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Web.Http.HttpProgressStage.none with Double = js.native
  /* 9 */ val receivingContent: typings.winrtDashUwp.Windows.Web.Http.HttpProgressStage.receivingContent with Double = js.native
  /* 8 */ val receivingHeaders: typings.winrtDashUwp.Windows.Web.Http.HttpProgressStage.receivingHeaders with Double = js.native
  /* 2 */ val resolvingName: typings.winrtDashUwp.Windows.Web.Http.HttpProgressStage.resolvingName with Double = js.native
  /* 6 */ val sendingContent: typings.winrtDashUwp.Windows.Web.Http.HttpProgressStage.sendingContent with Double = js.native
  /* 5 */ val sendingHeaders: typings.winrtDashUwp.Windows.Web.Http.HttpProgressStage.sendingHeaders with Double = js.native
  /* 7 */ val waitingForResponse: typings.winrtDashUwp.Windows.Web.Http.HttpProgressStage.waitingForResponse with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpProgressStage with Double] = js.native
}

