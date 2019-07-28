package typings.winrt.WindowsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StorageNs {
  type ApplicationDataSetVersionHandler = js.Function1[/* setVersionRequest */ SetVersionRequest, Unit]
  type StreamedFileDataRequestedHandler = js.Function1[/* stream */ StreamedFileDataRequest, Unit]
}
