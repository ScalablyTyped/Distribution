package typings.velocityjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Velocity extends StObject {
  
  var Compile: typings.velocityjs.Compile = js.native
  
  var Helper: typings.velocityjs.Helper = js.native
  
  def parse(vmString: String): js.Array[VELOCITY_AST] = js.native
  def parse(vmString: String, blocks: StringDictionary[Boolean]): js.Array[VELOCITY_AST] = js.native
  def parse(vmString: String, blocks: StringDictionary[Boolean], ignoreSpace: Boolean): js.Array[VELOCITY_AST] = js.native
  def parse(vmString: String, blocks: Unit, ignoreSpace: Boolean): js.Array[VELOCITY_AST] = js.native
  
  def render(vmString: String): String = js.native
  def render(vmString: String, context: Unit, macros: Unit, config: CompileConfig): String = js.native
  def render(vmString: String, context: Unit, macros: Macros): String = js.native
  def render(vmString: String, context: Unit, macros: Macros, config: CompileConfig): String = js.native
  def render(vmString: String, context: RenderContext): String = js.native
  def render(vmString: String, context: RenderContext, macros: Unit, config: CompileConfig): String = js.native
  def render(vmString: String, context: RenderContext, macros: Macros): String = js.native
  def render(vmString: String, context: RenderContext, macros: Macros, config: CompileConfig): String = js.native
}
