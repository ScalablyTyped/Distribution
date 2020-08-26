package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
import typings.std.RegExp
import typings.wordpressBlocks.wordpressBlocksStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformEnter[T /* <: Record[String, _] */] extends Transform[T] {
  var priority: js.UndefOr[Double] = js.native
  var regExp: RegExp = js.native
  var `type`: enter = js.native
  def transform(): BlockInstance[Partial[T]] = js.native
}

object TransformEnter {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](regExp: RegExp, transform: () => BlockInstance[Partial[T]], `type`: enter): TransformEnter[T] = {
    val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any], transform = js.Any.fromFunction0(transform))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformEnter[T]]
  }
  @scala.inline
  implicit class TransformEnterOps[Self <: TransformEnter[_], /* <: typings.std.Record[java.lang.String, _] */ T] (val x: Self with TransformEnter[T]) extends AnyVal {
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
    def setRegExp(value: RegExp): Self = this.set("regExp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransform(value: () => BlockInstance[Partial[T]]): Self = this.set("transform", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: enter): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
  
}

