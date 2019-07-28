package typings.winrt.WindowsNs.MediaNs.ProtectionNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaProtectionManager extends js.Object {
  var oncomponentloadfailed: js.Any
  var onrebootneeded: js.Any
  var onservicerequested: js.Any
  var properties: IPropertySet
}

object IMediaProtectionManager {
  @scala.inline
  def apply(
    oncomponentloadfailed: js.Any,
    onrebootneeded: js.Any,
    onservicerequested: js.Any,
    properties: IPropertySet
  ): IMediaProtectionManager = {
    val __obj = js.Dynamic.literal(oncomponentloadfailed = oncomponentloadfailed, onrebootneeded = onrebootneeded, onservicerequested = onservicerequested, properties = properties)
  
    __obj.asInstanceOf[IMediaProtectionManager]
  }
}

