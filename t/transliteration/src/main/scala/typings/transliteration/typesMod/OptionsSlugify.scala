package typings.transliteration.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.transliteration.typesMod.Options because Already inherited */ @js.native
trait OptionsSlugify extends OptionsTransliterate {
  
  /**
    * Allowed characters.
    * When `allowedChars` is set to `'abc'`, then only characters match `/[abc]/g` will be preserved.
    * Other characters will all be converted to `separator`
    * @default 'a-zA-Z0-9-_.~''
    */
  var allowedChars: js.UndefOr[String] = js.native
  
  /**
    * Whether the result need to be converted into lowercase
    * @default true
    */
  var lowercase: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom separator string
    * @default '-'
    */
  var separator: js.UndefOr[String] = js.native
  
  /**
    * Whether the result need to be converted into uppercase
    * @default false
    */
  var uppercase: js.UndefOr[Boolean] = js.native
}
object OptionsSlugify {
  
  @scala.inline
  def apply(): OptionsSlugify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSlugify]
  }
  
  @scala.inline
  implicit class OptionsSlugifyOps[Self <: OptionsSlugify] (val x: Self) extends AnyVal {
    
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
    def setAllowedChars(value: String): Self = this.set("allowedChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedChars: Self = this.set("allowedChars", js.undefined)
    
    @scala.inline
    def setLowercase(value: Boolean): Self = this.set("lowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowercase: Self = this.set("lowercase", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setUppercase(value: Boolean): Self = this.set("uppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUppercase: Self = this.set("uppercase", js.undefined)
  }
}
