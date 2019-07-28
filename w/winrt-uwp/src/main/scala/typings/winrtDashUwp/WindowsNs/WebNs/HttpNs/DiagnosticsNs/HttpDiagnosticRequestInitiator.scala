package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs

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
  
  /* 7 */ val htmlDownload: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator.htmlDownload with Double = js.native
  /* 2 */ val image: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator.image with Double = js.native
  /* 3 */ val link: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator.link with Double = js.native
  /* 6 */ val media: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator.media with Double = js.native
  /* 9 */ val other: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator.other with Double = js.native
  /* 0 */ val parsedElement: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator.parsedElement with Double = js.native
  /* 8 */ val prefetch: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator.prefetch with Double = js.native
  /* 1 */ val script: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator.script with Double = js.native
  /* 4 */ val style: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator.style with Double = js.native
  /* 5 */ val xmlHttpRequest: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator.xmlHttpRequest with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpDiagnosticRequestInitiator with Double] = js.native
}

