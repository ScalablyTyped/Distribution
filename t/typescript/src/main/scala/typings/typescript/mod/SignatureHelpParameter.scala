package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpParameter extends js.Object {
  var displayParts: js.Array[SymbolDisplayPart] = js.native
  var documentation: js.Array[SymbolDisplayPart] = js.native
  var isOptional: Boolean = js.native
  var name: java.lang.String = js.native
}

object SignatureHelpParameter {
  @scala.inline
  def apply(
    displayParts: js.Array[SymbolDisplayPart],
    documentation: js.Array[SymbolDisplayPart],
    isOptional: Boolean,
    name: java.lang.String
  ): SignatureHelpParameter = {
    val __obj = js.Dynamic.literal(displayParts = displayParts.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpParameter]
  }
  @scala.inline
  implicit class SignatureHelpParameterOps[Self <: SignatureHelpParameter] (val x: Self) extends AnyVal {
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
    def setDisplayPartsVarargs(value: SymbolDisplayPart*): Self = this.set("displayParts", js.Array(value :_*))
    @scala.inline
    def setDisplayParts(value: js.Array[SymbolDisplayPart]): Self = this.set("displayParts", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentationVarargs(value: SymbolDisplayPart*): Self = this.set("documentation", js.Array(value :_*))
    @scala.inline
    def setDocumentation(value: js.Array[SymbolDisplayPart]): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOptional(value: Boolean): Self = this.set("isOptional", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

