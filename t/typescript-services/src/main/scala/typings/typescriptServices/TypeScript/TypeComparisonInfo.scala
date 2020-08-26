package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeComparisonInfo extends js.Object {
  var flags: TypeRelationshipFlags = js.native
  var indent: js.Any = js.native
  var message: String = js.native
  var onlyCaptureFirstError: Boolean = js.native
  var stringConstantVal: AST = js.native
  def addMessage(message: String): Unit = js.native
  /* private */ def indentString(): js.Any = js.native
}

object TypeComparisonInfo {
  @scala.inline
  def apply(
    addMessage: String => Unit,
    flags: TypeRelationshipFlags,
    indent: js.Any,
    indentString: () => js.Any,
    message: String,
    onlyCaptureFirstError: Boolean,
    stringConstantVal: AST
  ): TypeComparisonInfo = {
    val __obj = js.Dynamic.literal(addMessage = js.Any.fromFunction1(addMessage), flags = flags.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], indentString = js.Any.fromFunction0(indentString), message = message.asInstanceOf[js.Any], onlyCaptureFirstError = onlyCaptureFirstError.asInstanceOf[js.Any], stringConstantVal = stringConstantVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeComparisonInfo]
  }
  @scala.inline
  implicit class TypeComparisonInfoOps[Self <: TypeComparisonInfo] (val x: Self) extends AnyVal {
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
    def setAddMessage(value: String => Unit): Self = this.set("addMessage", js.Any.fromFunction1(value))
    @scala.inline
    def setFlags(value: TypeRelationshipFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndent(value: js.Any): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndentString(value: () => js.Any): Self = this.set("indentString", js.Any.fromFunction0(value))
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlyCaptureFirstError(value: Boolean): Self = this.set("onlyCaptureFirstError", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringConstantVal(value: AST): Self = this.set("stringConstantVal", value.asInstanceOf[js.Any])
  }
  
}

