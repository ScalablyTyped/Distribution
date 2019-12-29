package typings.winrtDashUwp.Windows.Web.Http

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpProgressStage with Double] = js.native
  /* 3 */ @js.native
  object connectingToServer extends TopLevel[connectingToServer with Double]
  
  /* 1 */ @js.native
  object detectingProxy extends TopLevel[detectingProxy with Double]
  
  /* 4 */ @js.native
  object negotiatingSsl extends TopLevel[negotiatingSsl with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 9 */ @js.native
  object receivingContent extends TopLevel[receivingContent with Double]
  
  /* 8 */ @js.native
  object receivingHeaders extends TopLevel[receivingHeaders with Double]
  
  /* 2 */ @js.native
  object resolvingName extends TopLevel[resolvingName with Double]
  
  /* 6 */ @js.native
  object sendingContent extends TopLevel[sendingContent with Double]
  
  /* 5 */ @js.native
  object sendingHeaders extends TopLevel[sendingHeaders with Double]
  
  /* 7 */ @js.native
  object waitingForResponse extends TopLevel[waitingForResponse with Double]
  
}

