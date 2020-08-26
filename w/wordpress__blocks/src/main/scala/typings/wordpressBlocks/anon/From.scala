package typings.wordpressBlocks.anon

import typings.std.Record
import typings.wordpressBlocks.mod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait From[T /* <: Record[String, _] */] extends js.Object {
  /**
    * Transforms from another block type to this block type.
    */
  val from: js.UndefOr[js.Array[Transform[T]]] = js.native
  /**
    * Transforms from this block type to another block type.
    */
  val to: js.UndefOr[js.Array[Transform[Record[String, _]]]] = js.native
}

object From {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](): From[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From[T]]
  }
  @scala.inline
  implicit class FromOps[Self <: From[_], /* <: typings.std.Record[java.lang.String, _] */ T] (val x: Self with From[T]) extends AnyVal {
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
    def setFromVarargs(value: Transform[T]*): Self = this.set("from", js.Array(value :_*))
    @scala.inline
    def setFrom(value: js.Array[Transform[T]]): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setToVarargs(value: (Transform[Record[String, js.Any]])*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: js.Array[Transform[Record[String, _]]]): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

