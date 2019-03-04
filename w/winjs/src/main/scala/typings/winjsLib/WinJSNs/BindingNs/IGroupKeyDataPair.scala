package typings
package winjsLib.WinJSNs.BindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupKeyDataPair[T] extends IKeyDataPair[T] {
  var firstItemIndexHint: scala.Double
  var firstItemKey: java.lang.String
  var groupSize: scala.Double
}

object IGroupKeyDataPair {
  @scala.inline
  def apply[T](
    data: T,
    firstItemIndexHint: scala.Double,
    firstItemKey: java.lang.String,
    groupSize: scala.Double,
    key: java.lang.String
  ): IGroupKeyDataPair[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], firstItemIndexHint = firstItemIndexHint, firstItemKey = firstItemKey, groupSize = groupSize, key = key)
  
    __obj.asInstanceOf[IGroupKeyDataPair[T]]
  }
}

