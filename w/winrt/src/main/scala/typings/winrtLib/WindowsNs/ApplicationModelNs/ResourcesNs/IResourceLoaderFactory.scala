package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceLoaderFactory extends js.Object {
  def createResourceLoaderByName(name: java.lang.String): ResourceLoader
}

object IResourceLoaderFactory {
  @scala.inline
  def apply(createResourceLoaderByName: java.lang.String => ResourceLoader): IResourceLoaderFactory = {
    val __obj = js.Dynamic.literal(createResourceLoaderByName = js.Any.fromFunction1(createResourceLoaderByName))
  
    __obj.asInstanceOf[IResourceLoaderFactory]
  }
}

