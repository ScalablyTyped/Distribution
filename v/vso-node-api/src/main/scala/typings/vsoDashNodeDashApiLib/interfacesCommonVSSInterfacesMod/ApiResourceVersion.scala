package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApiResourceVersion extends js.Object {
  /**
       * String representation of the Public API version. This is the version that the public sees and is used for a large group of services (e.g. the TFS 1.0 API)
       */
  var apiVersion: java.lang.String
  /**
       * Is the public API version in preview
       */
  var isPreview: scala.Boolean
  /**
       * Internal resource version. This is defined per-resource and is used to support build-to-build compatibility of API changes within a given (in-preview) public api version. For example, within the TFS 1.0 API release cycle, while it is still in preview, a resource's data structure may be changed. This resource can be versioned such that older clients will still work (requests will be sent to the older version) and new/upgraded clients will talk to the new version of the resource.
       */
  var resourceVersion: scala.Double
}

