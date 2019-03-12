package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceLoader extends js.Object {
  def getString(resource: java.lang.String): java.lang.String
}

object IResourceLoader {
  @scala.inline
  def apply(getString: java.lang.String => java.lang.String): IResourceLoader = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction1(getString))
  
    __obj.asInstanceOf[IResourceLoader]
  }
}

