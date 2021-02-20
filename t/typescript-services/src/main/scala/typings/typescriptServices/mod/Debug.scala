package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Debug")
@js.native
class Debug ()
  extends typings.typescriptServices.TypeScript.Debug
object Debug {
  
  @JSImport("typescript-services", "Debug")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Debug.assert")
  @js.native
  def assert(expression: js.Any): Unit = js.native
  @JSImport("typescript-services", "Debug.assert")
  @js.native
  def assert(expression: js.Any, message: js.UndefOr[scala.Nothing], verboseDebugInfo: js.Function0[String]): Unit = js.native
  @JSImport("typescript-services", "Debug.assert")
  @js.native
  def assert(expression: js.Any, message: String): Unit = js.native
  @JSImport("typescript-services", "Debug.assert")
  @js.native
  def assert(expression: js.Any, message: String, verboseDebugInfo: js.Function0[String]): Unit = js.native
  
  /* static member */
  @JSImport("typescript-services", "Debug.currentAssertionLevel")
  @js.native
  def currentAssertionLevel: js.Any = js.native
  @scala.inline
  def currentAssertionLevel_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentAssertionLevel")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("typescript-services", "Debug.fail")
  @js.native
  def fail(): Unit = js.native
  @JSImport("typescript-services", "Debug.fail")
  @js.native
  def fail(message: String): Unit = js.native
  
  /* static member */
  @JSImport("typescript-services", "Debug.shouldAssert")
  @js.native
  def shouldAssert(level: typings.typescriptServices.TypeScript.AssertionLevel): Boolean = js.native
}
