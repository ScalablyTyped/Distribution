package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceLoaderFactory extends js.Object {
  def createResourceLoaderByName(name: String): ResourceLoader
}

object IResourceLoaderFactory {
  @scala.inline
  def apply(createResourceLoaderByName: String => ResourceLoader): IResourceLoaderFactory = {
    val __obj = js.Dynamic.literal(createResourceLoaderByName = js.Any.fromFunction1(createResourceLoaderByName))
  
    __obj.asInstanceOf[IResourceLoaderFactory]
  }
}

