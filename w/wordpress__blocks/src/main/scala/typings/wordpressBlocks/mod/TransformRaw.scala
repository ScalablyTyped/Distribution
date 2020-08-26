package typings.wordpressBlocks.mod

import typings.std.Node
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformRaw[T /* <: Record[String, _] */] extends Transform[T] {
  var isMatch: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.native
  var priority: js.UndefOr[Double] = js.native
  var schema: js.UndefOr[TransformRawSchema] = js.native
  /**
    * Comma-separated list of selectors, no spaces.
    *
    * @example 'p,div,h1,.css-class,#id'
    */
  var selector: js.UndefOr[String] = js.native
  var transform: js.UndefOr[js.Function1[/* node */ Node, BlockInstance[Partial[T]] | Unit]] = js.native
  var `type`: raw = js.native
}

object TransformRaw {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](`type`: raw): TransformRaw[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformRaw[T]]
  }
  @scala.inline
  implicit class TransformRawOps[Self <: TransformRaw[_], /* <: typings.std.Record[java.lang.String, _] */ T] (val x: Self with TransformRaw[T]) extends AnyVal {
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
    def setType(value: raw): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMatch(value: /* node */ Node => Boolean): Self = this.set("isMatch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsMatch: Self = this.set("isMatch", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setSchema(value: TransformRawSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setTransform(value: /* node */ Node => BlockInstance[Partial[T]] | Unit): Self = this.set("transform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

