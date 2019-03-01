package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceManagerStatics extends js.Object {
  var current: ResourceManager
  def isResourceReference(resourceReference: java.lang.String): scala.Boolean
}

object IResourceManagerStatics {
  @scala.inline
  def apply(current: ResourceManager, isResourceReference: js.Function1[java.lang.String, scala.Boolean]): IResourceManagerStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("isResourceReference")(isResourceReference)
    __obj.asInstanceOf[IResourceManagerStatics]
  }
}

