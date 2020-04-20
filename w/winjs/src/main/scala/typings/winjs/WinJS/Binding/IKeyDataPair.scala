package typings.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Functions
//#region Interfaces
trait IKeyDataPair[T] extends js.Object {
  var data: T
  var key: String
}

object IKeyDataPair {
  @scala.inline
  def apply[T](data: T, key: String): IKeyDataPair[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyDataPair[T]]
  }
}

