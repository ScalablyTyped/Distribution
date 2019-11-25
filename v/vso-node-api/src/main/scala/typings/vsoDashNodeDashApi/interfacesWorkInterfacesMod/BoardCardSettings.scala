package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardCardSettings extends js.Object {
  var cards: StringDictionary[js.Array[FieldSetting]]
}

object BoardCardSettings {
  @scala.inline
  def apply(cards: StringDictionary[js.Array[FieldSetting]]): BoardCardSettings = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoardCardSettings]
  }
}

