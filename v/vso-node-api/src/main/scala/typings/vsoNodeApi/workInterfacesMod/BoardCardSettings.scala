package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoardCardSettings extends js.Object {
  
  var cards: StringDictionary[js.Array[FieldSetting]] = js.native
}
object BoardCardSettings {
  
  @scala.inline
  def apply(cards: StringDictionary[js.Array[FieldSetting]]): BoardCardSettings = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardCardSettings]
  }
  
  @scala.inline
  implicit class BoardCardSettingsOps[Self <: BoardCardSettings] (val x: Self) extends AnyVal {
    
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
    def setCards(value: StringDictionary[js.Array[FieldSetting]]): Self = this.set("cards", value.asInstanceOf[js.Any])
  }
}
