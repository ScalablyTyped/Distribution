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
  
  val htmlDownload: htmlDownload with java.lang.String = js.native
  val image: image with java.lang.String = js.native
  val link: link with java.lang.String = js.native
  val media: media with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val parsedElement: parsedElement with java.lang.String = js.native
  val prefetch: prefetch with java.lang.String = js.native
  val script: script with java.lang.String = js.native
  val style: style with java.lang.String = js.native
  val xmlHttpRequest: xmlHttpRequest with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.WebNs.HttpNs.DiagnosticsNs.HttpDiagnosticRequestInitiator with java.lang.String
  ] = js.native
}

