package typings
package winjsLib.WinJSNs.BindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Functions
//#region Interfaces
trait IKeyDataPair[T] extends js.Object {
  var data: T
  var key: java.lang.String
}

object IKeyDataPair {
  @scala.inline
  def apply[T](data: T, key: java.lang.String): IKeyDataPair[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[IKeyDataPair[T]]
  }
}

