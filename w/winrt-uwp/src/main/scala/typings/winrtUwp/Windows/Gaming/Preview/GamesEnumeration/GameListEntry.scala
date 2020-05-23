package typings.winrtUwp.Windows.Gaming.Preview.GamesEnumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameListEntry extends js.Object {
  var category: js.Any
   /* unmapped type */ var displayInfo: js.Any
   /* unmapped type */ var launchAsync: js.Any
   /* unmapped type */ var properties: js.Any
   /* unmapped type */ var setCategoryAsync: js.Any
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
}

