package typings.vanillaColorful

import typings.std.ShadowRoot
import typings.vanillaColorful.libComponentsSliderMod.Slider
import typings.vanillaColorful.libTypesMod.HsvaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAlphaMod {
  
  @JSImport("vanilla-colorful/lib/components/alpha", "Alpha")
  @js.native
  open class Alpha protected () extends Slider {
    def this(root: ShadowRoot) = this()
    
    var hsva: HsvaColor = js.native
  }
}
