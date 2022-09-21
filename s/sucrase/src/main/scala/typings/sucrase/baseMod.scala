package typings.sucrase

import typings.sucrase.stateMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("sucrase/dist/types/parser/traverser/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sucrase/dist/types/parser/traverser/base", "Loc")
  @js.native
  open class Loc protected () extends StObject {
    def this(line: Double, column: Double) = this()
    
    var column: Double = js.native
    
    var line: Double = js.native
  }
  
  inline def augmentError(error: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("augmentError")(error.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getNextContextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextContextId")().asInstanceOf[Double]
  
  inline def initParser(
    inputCode: String,
    isJSXEnabledArg: Boolean,
    isTypeScriptEnabledArg: Boolean,
    isFlowEnabledArg: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initParser")(inputCode.asInstanceOf[js.Any], isJSXEnabledArg.asInstanceOf[js.Any], isTypeScriptEnabledArg.asInstanceOf[js.Any], isFlowEnabledArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sucrase/dist/types/parser/traverser/base", "input")
  @js.native
  def input: String = js.native
  inline def input_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
  
  @JSImport("sucrase/dist/types/parser/traverser/base", "isFlowEnabled")
  @js.native
  def isFlowEnabled: Boolean = js.native
  inline def isFlowEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFlowEnabled")(x.asInstanceOf[js.Any])
  
  @JSImport("sucrase/dist/types/parser/traverser/base", "isJSXEnabled")
  @js.native
  def isJSXEnabled: Boolean = js.native
  inline def isJSXEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isJSXEnabled")(x.asInstanceOf[js.Any])
  
  @JSImport("sucrase/dist/types/parser/traverser/base", "isTypeScriptEnabled")
  @js.native
  def isTypeScriptEnabled: Boolean = js.native
  inline def isTypeScriptEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTypeScriptEnabled")(x.asInstanceOf[js.Any])
  
  inline def locationForIndex(pos: Double): Loc = ^.asInstanceOf[js.Dynamic].applyDynamic("locationForIndex")(pos.asInstanceOf[js.Any]).asInstanceOf[Loc]
  
  @JSImport("sucrase/dist/types/parser/traverser/base", "nextContextId")
  @js.native
  def nextContextId: Double = js.native
  inline def nextContextId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextContextId")(x.asInstanceOf[js.Any])
  
  @JSImport("sucrase/dist/types/parser/traverser/base", "state")
  @js.native
  def state: default = js.native
  inline def state_=(x: default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
}
