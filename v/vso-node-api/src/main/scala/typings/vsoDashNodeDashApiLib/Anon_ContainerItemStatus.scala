package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerItemStatus extends js.Object {
  var ContainerItemStatus: Anon_EnumValuesAnonCreated
  var ContainerItemType: Anon_EnumValuesAnonAny
  var ContainerOptions: Anon_EnumValuesAnonNone
  var FileContainer: js.Any
  var FileContainerItem: js.Any
}

object Anon_ContainerItemStatus {
  @scala.inline
  def apply(
    ContainerItemStatus: Anon_EnumValuesAnonCreated,
    ContainerItemType: Anon_EnumValuesAnonAny,
    ContainerOptions: Anon_EnumValuesAnonNone,
    FileContainer: js.Any,
    FileContainerItem: js.Any
  ): Anon_ContainerItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContainerItemStatus")(ContainerItemStatus)
    __obj.updateDynamic("ContainerItemType")(ContainerItemType)
    __obj.updateDynamic("ContainerOptions")(ContainerOptions)
    __obj.updateDynamic("FileContainer")(FileContainer)
    __obj.updateDynamic("FileContainerItem")(FileContainerItem)
    __obj.asInstanceOf[Anon_ContainerItemStatus]
  }
}

