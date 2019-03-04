package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionQuery extends js.Object {
  /**
    * When retrieving extensions with a query; frequently the caller only needs a small subset of the assets. The caller may specify a list of asset types that should be returned if the extension contains it. All other assets will not be returned.
    */
  var assetTypes: js.Array[java.lang.String]
  /**
    * Each filter is a unique query and will have matching set of extensions returned from the request. Each result will have the same index in the resulting array that the filter had in the incoming query.
    */
  var filters: js.Array[QueryFilter]
  /**
    * The Flags are used to deterine which set of information the caller would like returned for the matched extensions.
    */
  var flags: ExtensionQueryFlags
}

object ExtensionQuery {
  @scala.inline
  def apply(assetTypes: js.Array[java.lang.String], filters: js.Array[QueryFilter], flags: ExtensionQueryFlags): ExtensionQuery = {
    val __obj = js.Dynamic.literal(assetTypes = assetTypes, filters = filters, flags = flags)
  
    __obj.asInstanceOf[ExtensionQuery]
  }
}

