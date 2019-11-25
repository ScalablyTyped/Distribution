package typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleOptions extends js.Object {
  var staticKeys: js.UndefOr[js.Array[String]] = js.undefined
  var transformCode: js.UndefOr[js.Function2[/* el */ ASTElement, /* code */ String, String]] = js.undefined
  def genData(el: ASTElement): String
  def postTransformNode(el: ASTElement): Unit
  def preTransformNode(el: ASTElement): js.UndefOr[ASTElement]
  def transformNode(el: ASTElement): js.UndefOr[ASTElement]
}

object ModuleOptions {
  @scala.inline
  def apply(
    genData: ASTElement => String,
    postTransformNode: ASTElement => Unit,
    preTransformNode: ASTElement => js.UndefOr[ASTElement],
    transformNode: ASTElement => js.UndefOr[ASTElement],
    staticKeys: js.Array[String] = null,
    transformCode: (/* el */ ASTElement, /* code */ String) => String = null
  ): ModuleOptions = {
    val __obj = js.Dynamic.literal(genData = js.Any.fromFunction1(genData), postTransformNode = js.Any.fromFunction1(postTransformNode), preTransformNode = js.Any.fromFunction1(preTransformNode), transformNode = js.Any.fromFunction1(transformNode))
    if (staticKeys != null) __obj.updateDynamic("staticKeys")(staticKeys.asInstanceOf[js.Any])
    if (transformCode != null) __obj.updateDynamic("transformCode")(js.Any.fromFunction2(transformCode))
    __obj.asInstanceOf[ModuleOptions]
  }
}

