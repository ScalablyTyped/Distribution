package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoardCardSettings extends StObject {
  
  var cards: StringDictionary[js.Array[FieldSetting]] = js.native
}
object BoardCardSettings {
  
  @scala.inline
  def apply(cards: StringDictionary[js.Array[FieldSetting]]): BoardCardSettings = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardCardSettings]
  }
  
  @scala.inline
  implicit class BoardCardSettingsMutableBuilder[Self <: BoardCardSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCards(value: StringDictionary[js.Array[FieldSetting]]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
  }
}
