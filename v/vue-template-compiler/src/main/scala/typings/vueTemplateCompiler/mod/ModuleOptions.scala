package typings.vueTemplateCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleOptions extends js.Object {
  var staticKeys: js.UndefOr[js.Array[String]] = js.native
  var transformCode: js.UndefOr[js.Function2[/* el */ ASTElement, /* code */ String, String]] = js.native
  def genData(el: ASTElement): String = js.native
  def postTransformNode(el: ASTElement): Unit = js.native
  def preTransformNode(el: ASTElement): js.UndefOr[ASTElement] = js.native
  def transformNode(el: ASTElement): js.UndefOr[ASTElement] = js.native
}

object ModuleOptions {
  @scala.inline
  def apply(
    genData: ASTElement => String,
    postTransformNode: ASTElement => Unit,
    preTransformNode: ASTElement => js.UndefOr[ASTElement],
    transformNode: ASTElement => js.UndefOr[ASTElement]
  ): ModuleOptions = {
    val __obj = js.Dynamic.literal(genData = js.Any.fromFunction1(genData), postTransformNode = js.Any.fromFunction1(postTransformNode), preTransformNode = js.Any.fromFunction1(preTransformNode), transformNode = js.Any.fromFunction1(transformNode))
    __obj.asInstanceOf[ModuleOptions]
  }
  @scala.inline
  implicit class ModuleOptionsOps[Self <: ModuleOptions] (val x: Self) extends AnyVal {
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
    def setGenData(value: ASTElement => String): Self = this.set("genData", js.Any.fromFunction1(value))
    @scala.inline
    def setPostTransformNode(value: ASTElement => Unit): Self = this.set("postTransformNode", js.Any.fromFunction1(value))
    @scala.inline
    def setPreTransformNode(value: ASTElement => js.UndefOr[ASTElement]): Self = this.set("preTransformNode", js.Any.fromFunction1(value))
    @scala.inline
    def setTransformNode(value: ASTElement => js.UndefOr[ASTElement]): Self = this.set("transformNode", js.Any.fromFunction1(value))
    @scala.inline
    def setStaticKeysVarargs(value: String*): Self = this.set("staticKeys", js.Array(value :_*))
    @scala.inline
    def setStaticKeys(value: js.Array[String]): Self = this.set("staticKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticKeys: Self = this.set("staticKeys", js.undefined)
    @scala.inline
    def setTransformCode(value: (/* el */ ASTElement, /* code */ String) => String): Self = this.set("transformCode", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTransformCode: Self = this.set("transformCode", js.undefined)
  }
  
}

