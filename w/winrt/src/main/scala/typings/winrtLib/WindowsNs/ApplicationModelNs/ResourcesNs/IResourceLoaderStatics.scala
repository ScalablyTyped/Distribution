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
  def apply(getStringForReference: js.Function1[winrtLib.WindowsNs.FoundationNs.Uri, java.lang.String]): IResourceLoaderStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStringForReference")(getStringForReference)
    __obj.asInstanceOf[IResourceLoaderStatics]
  }
}

