package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import typings.winrt.anon.First
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataPackagePropertySetView
  extends IMapView[String, js.Any] {
  var applicationListingUri: Uri = js.native
  var applicationName: String = js.native
  var description: String = js.native
  var fileTypes: IVectorView[String] = js.native
  var thumbnail: RandomAccessStreamReference = js.native
  var title: String = js.native
}

object IDataPackagePropertySetView {
  @scala.inline
  def apply(
    applicationListingUri: Uri,
    applicationName: String,
    description: String,
    fileTypes: IVectorView[String],
    first: () => IIterator[IKeyValuePair[String, js.Any]],
    hasKey: String => Boolean,
    lookup: String => js.Any,
    size: Double,
    split: () => First[String, js.Any],
    thumbnail: RandomAccessStreamReference,
    title: String
  ): IDataPackagePropertySetView = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split), thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataPackagePropertySetView]
  }
  @scala.inline
  implicit class IDataPackagePropertySetViewOps[Self <: IDataPackagePropertySetView] (val x: Self) extends AnyVal {
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
    def setApplicationListingUri(value: Uri): Self = this.set("applicationListingUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationName(value: String): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileTypes(value: IVectorView[String]): Self = this.set("fileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: RandomAccessStreamReference): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

