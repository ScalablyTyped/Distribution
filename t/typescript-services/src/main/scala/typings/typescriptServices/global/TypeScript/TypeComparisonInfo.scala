package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeComparisonInfo")
@js.native
class TypeComparisonInfo ()
  extends typings.typescriptServices.TypeScript.TypeComparisonInfo {
  def this(sourceComparisonInfo: typings.typescriptServices.TypeScript.TypeComparisonInfo) = this()
  def this(
    sourceComparisonInfo: typings.typescriptServices.TypeScript.TypeComparisonInfo,
    useSameIndent: Boolean
  ) = this()
  /* CompleteClass */
  override var flags: typings.typescriptServices.TypeScript.TypeRelationshipFlags = js.native
  /* CompleteClass */
  override var indent: js.Any = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var onlyCaptureFirstError: Boolean = js.native
  /* CompleteClass */
  override var stringConstantVal: typings.typescriptServices.TypeScript.AST = js.native
  /* CompleteClass */
  override def addMessage(message: String): Unit = js.native
  /* CompleteClass */
  /* private */ override def indentString(): js.Any = js.native
}

