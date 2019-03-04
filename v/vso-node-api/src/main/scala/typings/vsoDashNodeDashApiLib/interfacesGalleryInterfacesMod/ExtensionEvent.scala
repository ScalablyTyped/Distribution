package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionEvent extends js.Object {
  /**
    * Id which identifies each data point uniquely
    */
  var id: scala.Double
  var properties: js.Any
  /**
    * Timestamp of when the event occurred
    */
  var statisticDate: stdLib.Date
  /**
    * Version of the extension
    */
  var version: java.lang.String
}

object ExtensionEvent {
  @scala.inline
  def apply(id: scala.Double, properties: js.Any, statisticDate: stdLib.Date, version: java.lang.String): ExtensionEvent = {
    val __obj = js.Dynamic.literal(id = id, properties = properties, statisticDate = statisticDate, version = version)
  
    __obj.asInstanceOf[ExtensionEvent]
  }
}

