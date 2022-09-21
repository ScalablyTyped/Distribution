package typings.svgBakerRuntime

import typings.svgBakerRuntime.browserSpriteConfigMod.BrowserSpriteConfig
import typings.svgBakerRuntime.mod.default
import typings.svgBakerRuntime.spriteConfigMod.SpriteConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("BrowserSprite")
  @js.native
  open class BrowserSprite () extends default {
    def this(cfg: SpriteConfig & BrowserSpriteConfig) = this()
  }
}
