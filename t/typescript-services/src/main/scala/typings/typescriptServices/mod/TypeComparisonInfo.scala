package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "TypeComparisonInfo")
@js.native
open class TypeComparisonInfo ()
  extends StObject
     with typings.typescriptServices.TypeScript.TypeComparisonInfo {
  def this(sourceComparisonInfo: typings.typescriptServices.TypeScript.TypeComparisonInfo) = this()
  def this(sourceComparisonInfo: Unit, useSameIndent: Boolean) = this()
  def this(
    sourceComparisonInfo: typings.typescriptServices.TypeScript.TypeComparisonInfo,
    useSameIndent: Boolean
  ) = this()
  
  /* CompleteClass */
  override def addMessage(message: String): Unit = js.native
  
  /* CompleteClass */
  var flags: typings.typescriptServices.TypeScript.TypeRelationshipFlags = js.native
  
  /* private */ /* CompleteClass */
  var indent: Any = js.native
  
  /* private */ /* CompleteClass */
  override def indentString(): Any = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var onlyCaptureFirstError: Boolean = js.native
  
  /* CompleteClass */
  var stringConstantVal: typings.typescriptServices.TypeScript.AST = js.native
}
