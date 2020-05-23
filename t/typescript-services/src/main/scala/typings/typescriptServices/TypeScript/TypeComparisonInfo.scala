package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeComparisonInfo extends js.Object {
  var flags: TypeRelationshipFlags
  var indent: js.Any
  var message: String
  var onlyCaptureFirstError: Boolean
  var stringConstantVal: AST
  def addMessage(message: String): Unit
  /* private */ def indentString(): js.Any
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
}

