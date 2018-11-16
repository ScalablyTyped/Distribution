package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyndicationErrorStatus extends js.Object

@JSGlobal("Windows.Web.Syndication.SyndicationErrorStatus")
@js.native
object SyndicationErrorStatus extends js.Object {
  @js.native
  sealed trait invalidXml
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus
  
  @js.native
  sealed trait missingRequiredAttribute
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus
  
  @js.native
  sealed trait missingRequiredElement
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus
  
  @js.native
  sealed trait unexpectedContent
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus
  
  @js.native
  sealed trait unsupportedFormat
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus
  
  val invalidXml: invalidXml with java.lang.String = js.native
  val missingRequiredAttribute: missingRequiredAttribute with java.lang.String = js.native
  val missingRequiredElement: missingRequiredElement with java.lang.String = js.native
  val unexpectedContent: unexpectedContent with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val unsupportedFormat: unsupportedFormat with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus with java.lang.String
  ] = js.native
}

