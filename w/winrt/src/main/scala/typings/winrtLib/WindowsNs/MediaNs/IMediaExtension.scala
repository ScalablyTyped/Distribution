package typings
package winrtLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaExtension extends js.Object {
  def setProperties(configuration: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet): scala.Unit
}

object IMediaExtension {
  @scala.inline
  def apply(
    setProperties: js.Function1[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet, scala.Unit]
  ): IMediaExtension = {
    val __obj = js.Dynamic.literal(setProperties = setProperties)
  
    __obj.asInstanceOf[IMediaExtension]
  }
}

