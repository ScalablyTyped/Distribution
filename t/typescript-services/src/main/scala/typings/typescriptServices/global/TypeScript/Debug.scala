package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Debug")
@js.native
open class Debug ()
  extends StObject
     with typings.typescriptServices.TypeScript.Debug
object Debug {
  
  @JSGlobal("TypeScript.Debug")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def assert(expression: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(expression.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def assert(expression: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(expression.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assert(expression: Any, message: String, verboseDebugInfo: js.Function0[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(expression.asInstanceOf[js.Any], message.asInstanceOf[js.Any], verboseDebugInfo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assert(expression: Any, message: Unit, verboseDebugInfo: js.Function0[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(expression.asInstanceOf[js.Any], message.asInstanceOf[js.Any], verboseDebugInfo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @JSGlobal("TypeScript.Debug.currentAssertionLevel")
  @js.native
  def currentAssertionLevel: Any = js.native
  inline def currentAssertionLevel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentAssertionLevel")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def fail(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[Unit]
  inline def fail(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def shouldAssert(level: typings.typescriptServices.TypeScript.AssertionLevel): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldAssert")(level.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
