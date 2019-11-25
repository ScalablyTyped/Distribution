package typings.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupKeyDataPair[T] extends IKeyDataPair[T] {
  var firstItemIndexHint: Double
  var firstItemKey: String
  var groupSize: Double
}

object IGroupKeyDataPair {
  @scala.inline
  def apply[T](data: T, firstItemIndexHint: Double, firstItemKey: String, groupSize: Double, key: String): IGroupKeyDataPair[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], firstItemIndexHint = firstItemIndexHint.asInstanceOf[js.Any], firstItemKey = firstItemKey.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGroupKeyDataPair[T]]
  }
}

