package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceManagerStatics extends js.Object {
  var current: ResourceManager
  def isResourceReference(resourceReference: String): Boolean
}

object IResourceManagerStatics {
  @scala.inline
  def apply(current: ResourceManager, isResourceReference: String => Boolean): IResourceManagerStatics = {
    val __obj = js.Dynamic.literal(current = current, isResourceReference = js.Any.fromFunction1(isResourceReference))
  
    __obj.asInstanceOf[IResourceManagerStatics]
  }
}

