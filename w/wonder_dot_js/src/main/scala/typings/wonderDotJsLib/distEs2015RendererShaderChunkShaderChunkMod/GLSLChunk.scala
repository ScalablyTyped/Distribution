package typings
package wonderDotJsLib.distEs2015RendererShaderChunkShaderChunkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GLSLChunk extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var define: js.UndefOr[java.lang.String] = js.undefined
  var funcDeclare: js.UndefOr[java.lang.String] = js.undefined
  var funcDefine: js.UndefOr[java.lang.String] = js.undefined
  var top: js.UndefOr[java.lang.String] = js.undefined
  var varDeclare: js.UndefOr[java.lang.String] = js.undefined
}

object GLSLChunk {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    define: java.lang.String = null,
    funcDeclare: java.lang.String = null,
    funcDefine: java.lang.String = null,
    top: java.lang.String = null,
    varDeclare: java.lang.String = null
  ): GLSLChunk = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (define != null) __obj.updateDynamic("define")(define)
    if (funcDeclare != null) __obj.updateDynamic("funcDeclare")(funcDeclare)
    if (funcDefine != null) __obj.updateDynamic("funcDefine")(funcDefine)
    if (top != null) __obj.updateDynamic("top")(top)
    if (varDeclare != null) __obj.updateDynamic("varDeclare")(varDeclare)
    __obj.asInstanceOf[GLSLChunk]
  }
}

