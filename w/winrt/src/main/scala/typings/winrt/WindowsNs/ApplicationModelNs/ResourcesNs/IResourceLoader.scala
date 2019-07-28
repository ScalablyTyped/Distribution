package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceLoader extends js.Object {
  def getString(resource: String): String
}

object IResourceLoader {
  @scala.inline
  def apply(getString: String => String): IResourceLoader = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction1(getString))
  
    __obj.asInstanceOf[IResourceLoader]
  }
}

