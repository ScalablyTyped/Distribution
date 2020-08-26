package typings.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupKeyDataPair[T] extends IKeyDataPair[T] {
  var firstItemIndexHint: Double = js.native
  var firstItemKey: String = js.native
  var groupSize: Double = js.native
}

object IGroupKeyDataPair {
  @scala.inline
  def apply[T](data: T, firstItemIndexHint: Double, firstItemKey: String, groupSize: Double, key: String): IGroupKeyDataPair[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], firstItemIndexHint = firstItemIndexHint.asInstanceOf[js.Any], firstItemKey = firstItemKey.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupKeyDataPair[T]]
  }
  @scala.inline
  implicit class IGroupKeyDataPairOps[Self <: IGroupKeyDataPair[_], T] (val x: Self with IGroupKeyDataPair[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFirstItemIndexHint(value: Double): Self = this.set("firstItemIndexHint", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstItemKey(value: String): Self = this.set("firstItemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupSize(value: Double): Self = this.set("groupSize", value.asInstanceOf[js.Any])
  }
  
}

