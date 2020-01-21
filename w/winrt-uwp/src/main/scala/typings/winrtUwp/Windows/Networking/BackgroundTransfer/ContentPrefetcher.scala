package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for specifying web resources to be prefetched. Windows will use heuristics to attempt to download the specified resources in advance of your app being launched by the user. */
@JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher")
@js.native
abstract class ContentPrefetcher () extends js.Object

/* static members */
@JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher")
@js.native
object ContentPrefetcher extends js.Object {
  /** Array of URIs to download when prefetch is performed for the app. */
  var contentUris: IVector[Uri] = js.native
  /** Specifies the location of a well-formed XML file that contains a list of resources to be prefetched. */
  var indirectContentUri: Uri = js.native
  /** Gets the date and time of the last successful content prefetch operation. */
  var lastSuccessfulPrefetchTime: Date = js.native
}

