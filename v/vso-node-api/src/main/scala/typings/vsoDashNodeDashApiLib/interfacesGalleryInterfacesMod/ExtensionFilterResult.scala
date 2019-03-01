package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionFilterResult extends js.Object {
  /**
    * This is the set of appplications that matched the query filter supplied.
    */
  var extensions: js.Array[PublishedExtension]
  /**
    * The PagingToken is returned from a request when more records exist that match the result than were requested or could be returned. A follow-up query with this paging token can be used to retrieve more results.
    */
  var pagingToken: java.lang.String
  /**
    * This is the additional optional metadata for the given result. E.g. Total count of results which is useful in case of paged results
    */
  var resultMetadata: js.Array[ExtensionFilterResultMetadata]
}

object ExtensionFilterResult {
  @scala.inline
  def apply(
    extensions: js.Array[PublishedExtension],
    pagingToken: java.lang.String,
    resultMetadata: js.Array[ExtensionFilterResultMetadata]
  ): ExtensionFilterResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extensions")(extensions)
    __obj.updateDynamic("pagingToken")(pagingToken)
    __obj.updateDynamic("resultMetadata")(resultMetadata)
    __obj.asInstanceOf[ExtensionFilterResult]
  }
}

