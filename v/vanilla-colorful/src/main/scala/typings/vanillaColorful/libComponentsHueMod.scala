package typings.vanillaColorful

import typings.std.ShadowRoot
import typings.vanillaColorful.libComponentsSliderMod.Slider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsHueMod {
  
  @JSImport("vanilla-colorful/lib/components/hue", "Hue")
  @js.native
  open class Hue protected () extends Slider {
    def this(root: ShadowRoot) = this()
    
    var h: Double = js.native
  }
}
