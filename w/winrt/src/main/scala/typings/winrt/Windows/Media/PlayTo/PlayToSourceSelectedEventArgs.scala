package typings.winrt.Windows.Media.PlayTo

import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.PlayTo.PlayToSourceSelectedEventArgs")
@js.native
class PlayToSourceSelectedEventArgs () extends IPlayToSourceSelectedEventArgs {
  /* CompleteClass */
  override var friendlyName: String = js.native
  /* CompleteClass */
  override var icon: IRandomAccessStreamWithContentType = js.native
  /* CompleteClass */
  override var supportsAudio: Boolean = js.native
  /* CompleteClass */
  override var supportsImage: Boolean = js.native
  /* CompleteClass */
  override var supportsVideo: Boolean = js.native
}

