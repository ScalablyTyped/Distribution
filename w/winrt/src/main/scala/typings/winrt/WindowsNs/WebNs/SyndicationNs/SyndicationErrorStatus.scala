package typings.winrt.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyndicationErrorStatus extends js.Object

@JSGlobal("Windows.Web.Syndication.SyndicationErrorStatus")
@js.native
object SyndicationErrorStatus extends js.Object {
  @js.native
  sealed trait invalidXml extends SyndicationErrorStatus
  
  @js.native
  sealed trait missingRequiredAttribute extends SyndicationErrorStatus
  
  @js.native
  sealed trait missingRequiredElement extends SyndicationErrorStatus
  
  @js.native
  sealed trait unexpectedContent extends SyndicationErrorStatus
  
  @js.native
  sealed trait unknown extends SyndicationErrorStatus
  
  @js.native
  sealed trait unsupportedFormat extends SyndicationErrorStatus
  
  /* 3 */ val invalidXml: typings.winrt.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus.invalidXml with Double = js.native
  /* 2 */ val missingRequiredAttribute: typings.winrt.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus.missingRequiredAttribute with Double = js.native
  /* 1 */ val missingRequiredElement: typings.winrt.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus.missingRequiredElement with Double = js.native
  /* 4 */ val unexpectedContent: typings.winrt.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus.unexpectedContent with Double = js.native
  /* 0 */ val unknown: typings.winrt.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus.unknown with Double = js.native
  /* 5 */ val unsupportedFormat: typings.winrt.WindowsNs.WebNs.SyndicationNs.SyndicationErrorStatus.unsupportedFormat with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyndicationErrorStatus with Double] = js.native
}

