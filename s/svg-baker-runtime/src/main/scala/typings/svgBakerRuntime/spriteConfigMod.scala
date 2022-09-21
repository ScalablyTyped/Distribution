package typings.svgBakerRuntime

import org.scalablytyped.runtime.Shortcut
import typings.svgBakerRuntime.anon.Ariahidden
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spriteConfigMod extends Shortcut {
  
  @JSImport("svg-baker-runtime/src/sprite.config", JSImport.Default)
  @js.native
  val default: SpriteConfig = js.native
  
  trait SpriteConfig extends StObject {
    
    var attrs: js.UndefOr[Ariahidden] = js.undefined
  }
  object SpriteConfig {
    
    inline def apply(): SpriteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpriteConfig]
    }
    
    extension [Self <: SpriteConfig](x: Self) {
      
      inline def setAttrs(value: Ariahidden): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    }
  }
  
  type _To = SpriteConfig
  
  /* This means you don't have to write `default`, but can instead just say `spriteConfigMod.foo` */
  override def _to: SpriteConfig = default
}
