package typings.typedoc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("typedoc", "Renderer")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDefaultTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTheme")().asInstanceOf[String]
  
  @scala.inline
  def getThemeDirectory(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeDirectory")().asInstanceOf[String]
}
