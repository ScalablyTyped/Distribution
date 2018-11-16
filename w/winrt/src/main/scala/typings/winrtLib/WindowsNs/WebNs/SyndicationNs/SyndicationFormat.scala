package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyndicationFormat extends js.Object

@JSGlobal("Windows.Web.Syndication.SyndicationFormat")
@js.native
object SyndicationFormat extends js.Object {
  @js.native
  sealed trait atom03
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  @js.native
  sealed trait atom10
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  @js.native
  sealed trait rss091
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  @js.native
  sealed trait rss092
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  @js.native
  sealed trait rss10
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  @js.native
  sealed trait rss20
    extends winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
  
  val atom03: atom03 with java.lang.String = js.native
  val atom10: atom10 with java.lang.String = js.native
  val rss091: rss091 with java.lang.String = js.native
  val rss092: rss092 with java.lang.String = js.native
  val rss10: rss10 with java.lang.String = js.native
  val rss20: rss20 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat with java.lang.String] = js.native
}

