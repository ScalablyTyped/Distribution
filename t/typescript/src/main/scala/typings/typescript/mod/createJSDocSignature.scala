package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createJSDocSignature")
@js.native
object createJSDocSignature extends js.Object {
  
  def apply(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[JSDocParameterTag]): JSDocSignature = js.native
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[JSDocParameterTag],
    `type`: JSDocReturnTag
  ): JSDocSignature = js.native
  /** @deprecated Use `factory.createJSDocSignature` or the factory supplied by your transformation context instead. */
  def apply(typeParameters: js.Array[JSDocTemplateTag], parameters: js.Array[JSDocParameterTag]): JSDocSignature = js.native
  def apply(
    typeParameters: js.Array[JSDocTemplateTag],
    parameters: js.Array[JSDocParameterTag],
    `type`: JSDocReturnTag
  ): JSDocSignature = js.native
}
