package typings.svgBakerRuntime

import typings.svgBakerRuntime.browserSpriteConfigMod.BrowserSpriteConfig
import typings.svgBakerRuntime.spriteConfigMod.SpriteConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg-baker-runtime", JSImport.Default)
  @js.native
  open class default ()
    extends typings.svgBakerRuntime.browserSpriteMod.default {
    def this(cfg: SpriteConfig & BrowserSpriteConfig) = this()
  }
}
