package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStorageInfoSuccess extends js.Object {
  /**
    * 当前占用的空间大小, 单位 kb
    */
  var currentSize: js.UndefOr[Double] = js.native
  /**
    * 当前storage中所有的 key
    */
  var keys: js.UndefOr[js.Array[String]] = js.native
  /**
    * 限制的空间大小，单位kb
    */
  var limitSize: js.UndefOr[Double] = js.native
}

object GetStorageInfoSuccess {
  @scala.inline
  def apply(): GetStorageInfoSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStorageInfoSuccess]
  }
  @scala.inline
  implicit class GetStorageInfoSuccessOps[Self <: GetStorageInfoSuccess] (val x: Self) extends AnyVal {
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
    def setCurrentSize(value: Double): Self = this.set("currentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentSize: Self = this.set("currentSize", js.undefined)
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setLimitSize(value: Double): Self = this.set("limitSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitSize: Self = this.set("limitSize", js.undefined)
  }
  
}

