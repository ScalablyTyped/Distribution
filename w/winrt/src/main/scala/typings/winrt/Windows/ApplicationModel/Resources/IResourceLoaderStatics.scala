package typings.winrt.Windows.ApplicationModel.Resources

import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceLoaderStatics extends js.Object {
  def getStringForReference(uri: Uri): String = js.native
}

object IResourceLoaderStatics {
  @scala.inline
  def apply(getStringForReference: Uri => String): IResourceLoaderStatics = {
    val __obj = js.Dynamic.literal(getStringForReference = js.Any.fromFunction1(getStringForReference))
    __obj.asInstanceOf[IResourceLoaderStatics]
  }
  @scala.inline
  implicit class IResourceLoaderStaticsOps[Self <: IResourceLoaderStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetStringForReference(value: Uri => String): Self = this.set("getStringForReference", js.Any.fromFunction1(value))
  }
  
}

