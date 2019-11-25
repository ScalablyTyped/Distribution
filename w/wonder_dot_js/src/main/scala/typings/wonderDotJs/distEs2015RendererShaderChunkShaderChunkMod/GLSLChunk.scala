package typings.wonderDotJs.distEs2015RendererShaderChunkShaderChunkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GLSLChunk extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var define: js.UndefOr[String] = js.undefined
  var funcDeclare: js.UndefOr[String] = js.undefined
  var funcDefine: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[String] = js.undefined
  var varDeclare: js.UndefOr[String] = js.undefined
}

object GLSLChunk {
  @scala.inline
  def apply(
    body: String = null,
    define: String = null,
    funcDeclare: String = null,
    funcDefine: String = null,
    top: String = null,
    varDeclare: String = null
  ): GLSLChunk = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (define != null) __obj.updateDynamic("define")(define.asInstanceOf[js.Any])
    if (funcDeclare != null) __obj.updateDynamic("funcDeclare")(funcDeclare.asInstanceOf[js.Any])
    if (funcDefine != null) __obj.updateDynamic("funcDefine")(funcDefine.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (varDeclare != null) __obj.updateDynamic("varDeclare")(varDeclare.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLSLChunk]
  }
}

