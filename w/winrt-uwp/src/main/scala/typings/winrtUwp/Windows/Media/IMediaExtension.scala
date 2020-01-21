package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the method needed to set the configuration properties on a registered media parser or codec. */
trait IMediaExtension extends js.Object {
  /**
    * Sets the configuration properties that were supplied when the media parser or codec was registered.
    * @param configuration The configuration properties for the media parser or codec.
    */
  def setProperties(configuration: IPropertySet): Unit
}

object IMediaExtension {
  @scala.inline
  def apply(setProperties: IPropertySet => Unit): IMediaExtension = {
    val __obj = js.Dynamic.literal(setProperties = js.Any.fromFunction1(setProperties))
  
    __obj.asInstanceOf[IMediaExtension]
  }
}

