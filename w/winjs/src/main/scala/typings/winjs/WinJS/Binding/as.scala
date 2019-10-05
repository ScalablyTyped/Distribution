package typings.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Binding.as")
@js.native
object as extends js.Object {
  /**
    * Returns an observable object. This may be an observable proxy for the specified object, an existing proxy, or the specified object itself if it directly supports observation.
    * @param data The object to observe.
    * @returns The observable object.
    **/
  def apply[U](data: U): U = js.native
}

