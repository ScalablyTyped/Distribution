package typings.winrt.Windows.Storage.AccessCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemRemovedEventArgs extends IItemRemovedEventArgs

object ItemRemovedEventArgs {
  @scala.inline
  def apply(removedEntry: AccessListEntry): ItemRemovedEventArgs = {
    val __obj = js.Dynamic.literal(removedEntry = removedEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRemovedEventArgs]
  }
}

