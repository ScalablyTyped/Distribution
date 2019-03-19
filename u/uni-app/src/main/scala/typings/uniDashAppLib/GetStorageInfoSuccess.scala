package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageInfoSuccess extends js.Object {
  /**
    * 当前占用的空间大小, 单位kb
    */
  var currentSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * 当前storage中所有的key
    */
  var keys: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
  /**
    * 限制的空间大小，单位kb
    */
  var limitSize: js.UndefOr[scala.Double] = js.undefined
}

object GetStorageInfoSuccess {
  @scala.inline
  def apply(
    currentSize: scala.Int | scala.Double = null,
    keys: java.lang.String | js.Array[_] = null,
    limitSize: scala.Int | scala.Double = null
  ): GetStorageInfoSuccess = {
    val __obj = js.Dynamic.literal()
    if (currentSize != null) __obj.updateDynamic("currentSize")(currentSize.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (limitSize != null) __obj.updateDynamic("limitSize")(limitSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorageInfoSuccess]
  }
}

