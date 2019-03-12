package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceLoaderStatics extends js.Object {
  def getStringForReference(uri: winrtLib.WindowsNs.FoundationNs.Uri): java.lang.String
}

object IResourceLoaderStatics {
  @scala.inline
  def apply(getStringForReference: winrtLib.WindowsNs.FoundationNs.Uri => java.lang.String): IResourceLoaderStatics = {
    val __obj = js.Dynamic.literal(getStringForReference = js.Any.fromFunction1(getStringForReference))
  
    __obj.asInstanceOf[IResourceLoaderStatics]
  }
}

