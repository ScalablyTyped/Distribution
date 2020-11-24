package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyndicationFormat extends js.Object
@JSGlobal("Windows.Web.Syndication.SyndicationFormat")
@js.native
object SyndicationFormat extends js.Object {
  
  @js.native
  sealed trait atom03 extends SyndicationFormat
  
  @js.native
  sealed trait atom10 extends SyndicationFormat
  
  @js.native
  sealed trait rss091 extends SyndicationFormat
  
  @js.native
  sealed trait rss092 extends SyndicationFormat
  
  @js.native
  sealed trait rss10 extends SyndicationFormat
  
  @js.native
  sealed trait rss20 extends SyndicationFormat
}
