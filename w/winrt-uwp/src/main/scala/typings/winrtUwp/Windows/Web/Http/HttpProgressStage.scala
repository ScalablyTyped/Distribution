package typings.winrtUwp.Windows.Web.Http

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpProgressStage extends StObject
/** Indicates the step in the progress for an HTTP connection. */
@JSGlobal("Windows.Web.Http.HttpProgressStage")
@js.native
object HttpProgressStage extends StObject {
  
  /** The socket used for the HTTP connection is connecting to the server. */
  @js.native
  sealed trait connectingToServer
    extends StObject
       with HttpProgressStage
  
  /** The system starts to detect a proxy. */
  @js.native
  sealed trait detectingProxy
    extends StObject
       with HttpProgressStage
  
  /** The HTTP connection to the server is negotiating SSL. */
  @js.native
  sealed trait negotiatingSsl
    extends StObject
       with HttpProgressStage
  
  /** A default value that should not be encountered. */
  @js.native
  sealed trait none
    extends StObject
       with HttpProgressStage
  
  /** The HTTP client is receiving content from the server. */
  @js.native
  sealed trait receivingContent
    extends StObject
       with HttpProgressStage
  
  /** The HTTP client is receiving headers from the server. */
  @js.native
  sealed trait receivingHeaders
    extends StObject
       with HttpProgressStage
  
  /** The system is resolving the hostname for the HTTP connection. */
  @js.native
  sealed trait resolvingName
    extends StObject
       with HttpProgressStage
  
  /** HTTP content is being sent to the server. */
  @js.native
  sealed trait sendingContent
    extends StObject
       with HttpProgressStage
  
  /** HTTP headers are being sent to the server. */
  @js.native
  sealed trait sendingHeaders
    extends StObject
       with HttpProgressStage
  
  /** The HTTP client is waiting for a response from the server. */
  @js.native
  sealed trait waitingForResponse
    extends StObject
       with HttpProgressStage
}
