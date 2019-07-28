package typings.winrt.WindowsNs.MediaNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaExtension extends js.Object {
  def setProperties(configuration: IPropertySet): Unit
}

object IMediaExtension {
  @scala.inline
  def apply(setProperties: IPropertySet => Unit): IMediaExtension = {
    val __obj = js.Dynamic.literal(setProperties = js.Any.fromFunction1(setProperties))
  
    __obj.asInstanceOf[IMediaExtension]
  }
}

