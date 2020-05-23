package typings.winrtUwp.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyndicationFormat extends js.Object

/** Specifies the syndication formats supported by the API. */
@JSGlobal("Windows.Web.Syndication.SyndicationFormat")
@js.native
object SyndicationFormat extends js.Object {
  /** The API supports the Atom 0.3 format. */
  @js.native
  sealed trait atom03 extends SyndicationFormat
  
  /** The API supports the Atom 1.0 format. */
  @js.native
  sealed trait atom10 extends SyndicationFormat
  
  /** The API supports the RSS 0.91 format. */
  @js.native
  sealed trait rss091 extends SyndicationFormat
  
  /** The API supports the RSS 0.92 format. */
  @js.native
  sealed trait rss092 extends SyndicationFormat
  
  /** The API supports the RSS 1.0 format. */
  @js.native
  sealed trait rss10 extends SyndicationFormat
  
  /** The API supports the RSS 2.0 format. */
  @js.native
  sealed trait rss20 extends SyndicationFormat
  
}

