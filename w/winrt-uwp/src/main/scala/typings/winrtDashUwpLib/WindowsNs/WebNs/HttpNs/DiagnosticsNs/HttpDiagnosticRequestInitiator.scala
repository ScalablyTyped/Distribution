package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs

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
  sealed trait htmlDownload
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator
  
  /** An image resource. */
  @js.native
  sealed trait image
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator
  
  /** A link. */
  @js.native
  sealed trait link
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator
  
  /** A media resource. */
  @js.native
  sealed trait media
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator
  
  /** An other resource. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator
  
  /** A parsed element. */
  @js.native
  sealed trait parsedElement
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator
  
  /** A pre-fetch request. */
  @js.native
  sealed trait prefetch
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator
  
  /** A script resource. */
  @js.native
  sealed trait script
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator
  
  /** A CSS element. */
  @js.native
  sealed trait style
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator
  
  /** An XML HTTP request. */
  @js.native
  sealed trait xmlHttpRequest
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator
  
  /* 7 */ val htmlDownload: htmlDownload with scala.Double = js.native
  /* 2 */ val image: image with scala.Double = js.native
  /* 3 */ val link: link with scala.Double = js.native
  /* 6 */ val media: media with scala.Double = js.native
  /* 9 */ val other: other with scala.Double = js.native
  /* 0 */ val parsedElement: parsedElement with scala.Double = js.native
  /* 8 */ val prefetch: prefetch with scala.Double = js.native
  /* 1 */ val script: script with scala.Double = js.native
  /* 4 */ val style: style with scala.Double = js.native
  /* 5 */ val xmlHttpRequest: xmlHttpRequest with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator with scala.Double
  ] = js.native
}

