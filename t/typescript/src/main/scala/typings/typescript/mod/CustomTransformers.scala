package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTransformers extends js.Object {
  /** Custom transformers to evaluate after built-in .js transformations. */
  var after: js.UndefOr[js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]] = js.native
  /** Custom transformers to evaluate after built-in .d.ts transformations. */
  var afterDeclarations: js.UndefOr[js.Array[(TransformerFactory[Bundle | SourceFile]) | CustomTransformerFactory]] = js.native
  /** Custom transformers to evaluate before built-in .js transformations. */
  var before: js.UndefOr[js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]] = js.native
}

object CustomTransformers {
  @scala.inline
  def apply(): CustomTransformers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTransformers]
  }
  @scala.inline
  implicit class CustomTransformersOps[Self <: CustomTransformers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterVarargs(value: (TransformerFactory[SourceFile] | CustomTransformerFactory)*): Self = this.set("after", js.Array(value :_*))
    @scala.inline
    def setAfter(value: js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setAfterDeclarationsVarargs(value: ((TransformerFactory[Bundle | SourceFile]) | CustomTransformerFactory)*): Self = this.set("afterDeclarations", js.Array(value :_*))
    @scala.inline
    def setAfterDeclarations(value: js.Array[(TransformerFactory[Bundle | SourceFile]) | CustomTransformerFactory]): Self = this.set("afterDeclarations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterDeclarations: Self = this.set("afterDeclarations", js.undefined)
    @scala.inline
    def setBeforeVarargs(value: (TransformerFactory[SourceFile] | CustomTransformerFactory)*): Self = this.set("before", js.Array(value :_*))
    @scala.inline
    def setBefore(value: js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
  }
  
}

