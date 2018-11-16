package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for specifying web resources to be prefetched. Windows will use heuristics to attempt to download the specified resources in advance of your app being launched by the user. */
@JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher")
@js.native
abstract class ContentPrefetcher () extends js.Object

/** Provides properties for specifying web resources to be prefetched. Windows will use heuristics to attempt to download the specified resources in advance of your app being launched by the user. */
@JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher")
@js.native
object ContentPrefetcher extends js.Object {
  /** Array of URIs to download when prefetch is performed for the app. */
  var contentUris: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.FoundationNs.Uri] = js.native
  /** Specifies the location of a well-formed XML file that contains a list of resources to be prefetched. */
  var indirectContentUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the date and time of the last successful content prefetch operation. */
  var lastSuccessfulPrefetchTime: stdLib.Date = js.native
}

