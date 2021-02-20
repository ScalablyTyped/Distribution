package typings.typedoc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "Renderer")
@js.native
class Renderer protected ()
  extends typings.typedoc.rendererMod.Renderer {
  def this(owner: js.Symbol) = this()
  def this(owner: typings.typedoc.applicationMod.Application) = this()
}
/* static members */
object Renderer {
  
  @JSImport("typedoc", "Renderer.getDefaultTheme")
  @js.native
  def getDefaultTheme(): String = js.native
  
  @JSImport("typedoc", "Renderer.getThemeDirectory")
  @js.native
  def getThemeDirectory(): String = js.native
}
