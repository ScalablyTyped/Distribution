package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyndicationFormat extends StObject
@JSGlobal("Windows.Web.Syndication.SyndicationFormat")
@js.native
object SyndicationFormat extends StObject {
  
  @js.native
  sealed trait atom03
    extends StObject
       with SyndicationFormat
  
  @js.native
  sealed trait atom10
    extends StObject
       with SyndicationFormat
  
  @js.native
  sealed trait rss091
    extends StObject
       with SyndicationFormat
  
  @js.native
  sealed trait rss092
    extends StObject
       with SyndicationFormat
  
  @js.native
  sealed trait rss10
    extends StObject
       with SyndicationFormat
  
  @js.native
  sealed trait rss20
    extends StObject
       with SyndicationFormat
}
