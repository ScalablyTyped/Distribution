package typings.typescript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketKey extends js.Object {
  var __bucketKey: js.Any = js.native
}

object BucketKey {
  @scala.inline
  def apply(__bucketKey: js.Any): BucketKey = {
    val __obj = js.Dynamic.literal(__bucketKey = __bucketKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketKey]
  }
  @scala.inline
  implicit class BucketKeyOps[Self <: BucketKey] (val x: Self) extends AnyVal {
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
    def set__bucketKey(value: js.Any): Self = this.set("__bucketKey", value.asInstanceOf[js.Any])
  }
  
}

