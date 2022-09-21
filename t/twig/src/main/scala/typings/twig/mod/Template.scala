package typings.twig.mod

import typings.twig.twigBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Template extends StObject {
  
  def compile(options: Any): String = js.native
  
  def getLoaderMethod(): String = js.native
  
  def importBlocks(file: String): Unit = js.native
  def importBlocks(file: String, `override`: Boolean): Unit = js.native
  
  def importFile(file: String): Template = js.native
  
  def importMacros(file: String): Template = js.native
  
  def render(): String = js.native
  def render(context: Any): String = js.native
  def render(context: Any, params: Any): String = js.native
  def render(context: Any, params: Any, allow_async: Boolean): String | js.Promise[String] = js.native
  def render(context: Any, params: Unit, allow_async: Boolean): String | js.Promise[String] = js.native
  def render(context: Unit, params: Any): String = js.native
  def render(context: Unit, params: Any, allow_async: Boolean): String | js.Promise[String] = js.native
  def render(context: Unit, params: Unit, allow_async: Boolean): String | js.Promise[String] = js.native
  
  def renderAsync(): js.Promise[String] = js.native
  def renderAsync(context: Any): js.Promise[String] = js.native
  def renderAsync(context: Any, params: Any): js.Promise[String] = js.native
  def renderAsync(context: Unit, params: Any): js.Promise[String] = js.native
  
  @JSName("render")
  def render_Union(): String | js.Promise[String] = js.native
  @JSName("render")
  def render_Union(context: Any): String | js.Promise[String] = js.native
  @JSName("render")
  def render_Union(context: Any, params: Any): String | js.Promise[String] = js.native
  @JSName("render")
  def render_Union(context: Unit, params: Any): String | js.Promise[String] = js.native
  @JSName("render")
  def render_false(context: Any, params: Any, allow_async: `false`): String = js.native
  @JSName("render")
  def render_false(context: Any, params: Unit, allow_async: `false`): String = js.native
  @JSName("render")
  def render_false(context: Unit, params: Any, allow_async: `false`): String = js.native
  @JSName("render")
  def render_false(context: Unit, params: Unit, allow_async: `false`): String = js.native
  
  def reset(blocks: Any): Unit = js.native
}
