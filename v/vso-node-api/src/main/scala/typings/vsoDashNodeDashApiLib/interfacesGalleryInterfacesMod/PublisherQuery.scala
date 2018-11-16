package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PublisherQuery extends js.Object {
  /**
       * Each filter is a unique query and will have matching set of publishers returned from the request. Each result will have the same index in the resulting array that the filter had in the incoming query.
       */
  var filters: js.Array[QueryFilter]
  /**
       * The Flags are used to deterine which set of information the caller would like returned for the matched publishers.
       */
  var flags: PublisherQueryFlags
}

