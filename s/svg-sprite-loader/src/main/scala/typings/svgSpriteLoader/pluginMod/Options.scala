package typings.svgSpriteLoader.pluginMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** Render plain sprite without styles and usages */
  var plainSprite: js.UndefOr[Boolean] = js.native
  
  /** Custom tag attributes for the svg */
  var spriteAttrs: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPlainSprite(value: Boolean): Self = this.set("plainSprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlainSprite: Self = this.set("plainSprite", js.undefined)
    
    @scala.inline
    def setSpriteAttrs(value: StringDictionary[js.Any]): Self = this.set("spriteAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpriteAttrs: Self = this.set("spriteAttrs", js.undefined)
  }
}
