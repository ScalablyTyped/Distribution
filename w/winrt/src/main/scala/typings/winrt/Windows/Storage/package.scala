package typings.winrt.Windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Storage {
  type ApplicationDataSetVersionHandler = js.Function1[
    /* setVersionRequest */ typings.winrt.Windows.Storage.SetVersionRequest, 
    scala.Unit
  ]
  type StreamedFileDataRequestedHandler = js.Function1[/* stream */ typings.winrt.Windows.Storage.StreamedFileDataRequest, scala.Unit]
}
