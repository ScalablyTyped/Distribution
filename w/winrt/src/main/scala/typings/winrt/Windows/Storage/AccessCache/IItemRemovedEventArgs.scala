package typings.winrt.Windows.Storage.AccessCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemRemovedEventArgs extends js.Object {
  var removedEntry: AccessListEntry
}

object IItemRemovedEventArgs {
  @scala.inline
  def apply(removedEntry: AccessListEntry): IItemRemovedEventArgs = {
    val __obj = js.Dynamic.literal(removedEntry = removedEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemRemovedEventArgs]
  }
}

