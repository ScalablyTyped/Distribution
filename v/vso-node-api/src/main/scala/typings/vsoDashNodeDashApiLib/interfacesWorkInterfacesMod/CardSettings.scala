package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardSettings extends js.Object {
  /**
    * A collection of settings related to rendering of fields on cards
    */
  var fields: CardFieldSettings
}

object CardSettings {
  @scala.inline
  def apply(fields: CardFieldSettings): CardSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[CardSettings]
  }
}

