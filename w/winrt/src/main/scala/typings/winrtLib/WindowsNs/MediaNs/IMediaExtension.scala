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
  def apply(setProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet => scala.Unit): IMediaExtension = {
    val __obj = js.Dynamic.literal(setProperties = js.Any.fromFunction1(setProperties))
  
    __obj.asInstanceOf[IMediaExtension]
  }
}

