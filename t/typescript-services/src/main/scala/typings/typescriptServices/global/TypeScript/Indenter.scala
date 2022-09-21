package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Indenter")
@js.native
open class Indenter ()
  extends StObject
     with typings.typescriptServices.TypeScript.Indenter {
  
  /* CompleteClass */
  override def decreaseIndent(): Unit = js.native
  
  /* CompleteClass */
  override def getIndent(): String = js.native
  
  /* CompleteClass */
  override def increaseIndent(): Unit = js.native
  
  /* CompleteClass */
  var indentAmt: Double = js.native
}
object Indenter {
  
  @JSGlobal("TypeScript.Indenter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Indenter.indentStep")
  @js.native
  def indentStep: Double = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Indenter.indentStepString")
  @js.native
  def indentStepString: String = js.native
  inline def indentStepString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indentStepString")(x.asInstanceOf[js.Any])
  
  inline def indentStep_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indentStep")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("TypeScript.Indenter.indentStrings")
  @js.native
  def indentStrings: js.Array[String] = js.native
  inline def indentStrings_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indentStrings")(x.asInstanceOf[js.Any])
}
