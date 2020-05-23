package typings.winrtUwp.Windows.Web.Http.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpDiagnosticRequestInitiator extends js.Object

/** Provides the source of the request. */
@JSGlobal("Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator")
@js.native
object HttpDiagnosticRequestInitiator extends js.Object {
  /** An HTML download. */
  @js.native
  sealed trait htmlDownload extends HttpDiagnosticRequestInitiator
  
  /** An image resource. */
  @js.native
  sealed trait image extends HttpDiagnosticRequestInitiator
  
  /** A link. */
  @js.native
  sealed trait link extends HttpDiagnosticRequestInitiator
  
  /** A media resource. */
  @js.native
  sealed trait media extends HttpDiagnosticRequestInitiator
  
  /** An other resource. */
  @js.native
  sealed trait other extends HttpDiagnosticRequestInitiator
  
  /** A parsed element. */
  @js.native
  sealed trait parsedElement extends HttpDiagnosticRequestInitiator
  
  /** A pre-fetch request. */
  @js.native
  sealed trait prefetch extends HttpDiagnosticRequestInitiator
  
  /** A script resource. */
  @js.native
  sealed trait script extends HttpDiagnosticRequestInitiator
  
  /** A CSS element. */
  @js.native
  sealed trait style extends HttpDiagnosticRequestInitiator
  
  /** An XML HTTP request. */
  @js.native
  sealed trait xmlHttpRequest extends HttpDiagnosticRequestInitiator
  
}

