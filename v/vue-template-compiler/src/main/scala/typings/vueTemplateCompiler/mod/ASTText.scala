package typings.vueTemplateCompiler.mod

import typings.vueTemplateCompiler.vueTemplateCompilerNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTText extends ASTNode {
  var isComment: js.UndefOr[Boolean] = js.native
  // 2.4 ssr optimization
  var ssrOptimizability: js.UndefOr[SSROptimizability] = js.native
  var static: js.UndefOr[Boolean] = js.native
  var text: String = js.native
  var `type`: `3` = js.native
}

object ASTText {
  @scala.inline
  def apply(text: String, `type`: `3`): ASTText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTText]
  }
  @scala.inline
  implicit class ASTTextOps[Self <: ASTText] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `3`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsComment(value: Boolean): Self = this.set("isComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsComment: Self = this.set("isComment", js.undefined)
    @scala.inline
    def setSsrOptimizability(value: SSROptimizability): Self = this.set("ssrOptimizability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsrOptimizability: Self = this.set("ssrOptimizability", js.undefined)
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
  }
  
}

