package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyndicationErrorStatus extends StObject
@JSGlobal("Windows.Web.Syndication.SyndicationErrorStatus")
@js.native
object SyndicationErrorStatus extends StObject {
  
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
}
