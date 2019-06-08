package typings
package atWordpressDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetItem extends js.Object {
  var storage: js.UndefOr[
    (stdLib.Pick[
      stdLib.Storage, 
      atWordpressDataLib.atWordpressDataLibStrings.getItem | atWordpressDataLib.atWordpressDataLibStrings.setItem
    ]) with stdLib.Partial[stdLib.Storage]
  ] = js.undefined
  var storageKey: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_GetItem {
  @scala.inline
  def apply(
    storage: (stdLib.Pick[
      stdLib.Storage, 
      atWordpressDataLib.atWordpressDataLibStrings.getItem | atWordpressDataLib.atWordpressDataLibStrings.setItem
    ]) with stdLib.Partial[stdLib.Storage] = null,
    storageKey: java.lang.String = null
  ): Anon_GetItem = {
    val __obj = js.Dynamic.literal()
    if (storage != null) __obj.updateDynamic("storage")(storage)
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey)
    __obj.asInstanceOf[Anon_GetItem]
  }
}

