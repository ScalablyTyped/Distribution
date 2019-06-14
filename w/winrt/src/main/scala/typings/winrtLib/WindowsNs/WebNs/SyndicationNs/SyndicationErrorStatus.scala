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
  
  /* 3 */ val invalidXml: invalidXml with scala.Double = js.native
  /* 2 */ val missingRequiredAttribute: missingRequiredAttribute with scala.Double = js.native
  /* 1 */ val missingRequiredElement: missingRequiredElement with scala.Double = js.native
  /* 4 */ val unexpectedContent: unexpectedContent with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 5 */ val unsupportedFormat: unsupportedFormat with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus with scala.Double] = js.native
}

