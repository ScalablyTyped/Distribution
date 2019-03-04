package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormLayout extends js.Object {
  /**
    * Gets and sets extensions list
    */
  var extensions: js.Array[Extension]
  /**
    * Top level tabs of the layout.
    */
  var pages: js.Array[Page]
  /**
    * Headers controls of the layout.
    */
  var systemControls: js.Array[Control]
}

object FormLayout {
  @scala.inline
  def apply(extensions: js.Array[Extension], pages: js.Array[Page], systemControls: js.Array[Control]): FormLayout = {
    val __obj = js.Dynamic.literal(extensions = extensions, pages = pages, systemControls = systemControls)
  
    __obj.asInstanceOf[FormLayout]
  }
}

