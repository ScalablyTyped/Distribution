package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs

import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceLoaderStatics extends js.Object {
  def getStringForReference(uri: Uri): String
}

object IResourceLoaderStatics {
  @scala.inline
  def apply(getStringForReference: Uri => String): IResourceLoaderStatics = {
    val __obj = js.Dynamic.literal(getStringForReference = js.Any.fromFunction1(getStringForReference))
  
    __obj.asInstanceOf[IResourceLoaderStatics]
  }
}

