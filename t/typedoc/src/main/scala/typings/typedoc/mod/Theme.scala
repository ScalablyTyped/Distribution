package typings.typedoc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "Theme")
@js.native
abstract class Theme protected ()
  extends typings.typedoc.outputMod.Theme {
  /**
    * Create a new BaseTheme instance.
    *
    * @param renderer  The renderer this theme is attached to.
    */
  def this(renderer: typings.typedoc.rendererMod.Renderer) = this()
}
