package typings.winrtUwp.Windows.Gaming.Preview.GamesEnumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameListEntry extends js.Object {
  
  var category: js.Any = js.native
  
   /* unmapped type */ var displayInfo: js.Any = js.native
  
   /* unmapped type */ var launchAsync: js.Any = js.native
  
   /* unmapped type */ var properties: js.Any = js.native
  
   /* unmapped type */ var setCategoryAsync: js.Any = js.native
}
object GameListEntry {
  
  @scala.inline
  def apply(
    category: js.Any,
    displayInfo: js.Any,
    launchAsync: js.Any,
    properties: js.Any,
    setCategoryAsync: js.Any
  ): GameListEntry = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], displayInfo = displayInfo.asInstanceOf[js.Any], launchAsync = launchAsync.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], setCategoryAsync = setCategoryAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameListEntry]
  }
  
  @scala.inline
  implicit class GameListEntryOps[Self <: GameListEntry] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: js.Any): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayInfo(value: js.Any): Self = this.set("displayInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchAsync(value: js.Any): Self = this.set("launchAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCategoryAsync(value: js.Any): Self = this.set("setCategoryAsync", value.asInstanceOf[js.Any])
  }
}
