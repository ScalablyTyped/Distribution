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
    val __obj = js.Dynamic.literal(ContainerItemStatus = ContainerItemStatus, ContainerItemType = ContainerItemType, ContainerOptions = ContainerOptions, FileContainer = FileContainer, FileContainerItem = FileContainerItem)
  
    __obj.asInstanceOf[Anon_ContainerItemStatus]
  }
}

