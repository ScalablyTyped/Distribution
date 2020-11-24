package typings.winston.anon

import typings.winston.configMod.NpmConfigSetColors
import typings.winston.configMod.NpmConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Levels extends js.Object {
  
  var colors: NpmConfigSetColors = js.native
  
  var levels: NpmConfigSetLevels = js.native
}
object Levels {
  
  @scala.inline
  def apply(colors: NpmConfigSetColors, levels: NpmConfigSetLevels): Levels = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Levels]
  }
  
  @scala.inline
  implicit class LevelsOps[Self <: Levels] (val x: Self) extends AnyVal {
    
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
    def setColors(value: NpmConfigSetColors): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevels(value: NpmConfigSetLevels): Self = this.set("levels", value.asInstanceOf[js.Any])
  }
}
