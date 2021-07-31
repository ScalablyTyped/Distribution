package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyndicationErrorStatus extends StObject
@JSGlobal("Windows.Web.Syndication.SyndicationErrorStatus")
@js.native
object SyndicationErrorStatus extends StObject {
  
  @js.native
  sealed trait invalidXml
    extends StObject
       with SyndicationErrorStatus
  
  @js.native
  sealed trait missingRequiredAttribute
    extends StObject
       with SyndicationErrorStatus
  
  @js.native
  sealed trait missingRequiredElement
    extends StObject
       with SyndicationErrorStatus
  
  @js.native
  sealed trait unexpectedContent
    extends StObject
       with SyndicationErrorStatus
  
  @js.native
  sealed trait unknown
    extends StObject
       with SyndicationErrorStatus
  
  @js.native
  sealed trait unsupportedFormat
    extends StObject
       with SyndicationErrorStatus
}
