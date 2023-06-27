package typings.velocityjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compile
  extends StObject
     with Instantiable1[/* asts */ js.Array[VELOCITY_AST], Compile]
     with Instantiable2[/* asts */ js.Array[VELOCITY_AST], /* config */ CompileConfig, Compile] {
  
  var cost: Double = js.native
  
  def render(): String = js.native
  def render(context: Unit, macros: Unit, silence: Boolean): String = js.native
  def render(context: Unit, macros: Macros): String = js.native
  def render(context: Unit, macros: Macros, silence: Boolean): String = js.native
  def render(context: RenderContext): String = js.native
  def render(context: RenderContext, macros: Unit, silence: Boolean): String = js.native
  def render(context: RenderContext, macros: Macros): String = js.native
  def render(context: RenderContext, macros: Macros, silence: Boolean): String = js.native
}
