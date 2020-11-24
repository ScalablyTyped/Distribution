package typings.yadda.featureParserMod

import typings.yadda.languageMod.Library
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var language: js.UndefOr[typings.yadda.languageMod.^[Library]] = js.native
  
  var leftPlaceholderChar: String = js.native
  
  var rightPlaceholderChar: String = js.native
}
object Options {
  
  @scala.inline
  def apply(leftPlaceholderChar: String, rightPlaceholderChar: String): Options = {
    val __obj = js.Dynamic.literal(leftPlaceholderChar = leftPlaceholderChar.asInstanceOf[js.Any], rightPlaceholderChar = rightPlaceholderChar.asInstanceOf[js.Any])
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
    def setLeftPlaceholderChar(value: String): Self = this.set("leftPlaceholderChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightPlaceholderChar(value: String): Self = this.set("rightPlaceholderChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: typings.yadda.languageMod.^[Library]): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
}
