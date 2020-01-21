package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.winrt.AnonFirst
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataPackagePropertySetView
  extends IMapView[String, js.Any] {
  var applicationListingUri: Uri
  var applicationName: String
  var description: String
  var fileTypes: IVectorView[String]
  var thumbnail: RandomAccessStreamReference
  var title: String
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
    split: () => AnonFirst[String, js.Any],
    thumbnail: RandomAccessStreamReference,
    title: String
  ): IDataPackagePropertySetView = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split), thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDataPackagePropertySetView]
  }
}

