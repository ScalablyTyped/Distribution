package typings.stripeV3.stripe

import typings.stripeV3.stripeV3Strings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T] extends js.Object {
  /**
    * An array containing the actual response elements, paginated by any request parameters.
    */
  var data: js.Array[T] = js.native
  /**
    * Whether or not there are more elements available after this set. If false, this set comprises the end of the list.
    */
  var has_more: Boolean = js.native
  /**
    * Value is 'list'
    */
  var `object`: list = js.native
  /**
    * The URL for accessing this list.
    */
  var url: String = js.native
}

object List {
  @scala.inline
  def apply[T](data: js.Array[T], has_more: Boolean, `object`: list, url: String): List[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], has_more = has_more.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List[T]]
  }
  @scala.inline
  implicit class ListOps[Self <: List[_], T] (val x: Self with List[T]) extends AnyVal {
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
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHas_more(value: Boolean): Self = this.set("has_more", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: list): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

