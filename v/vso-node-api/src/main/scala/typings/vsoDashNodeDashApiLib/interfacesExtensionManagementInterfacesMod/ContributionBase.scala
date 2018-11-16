package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContributionBase extends js.Object {
  /**
       * Description of the contribution/type
       */
  var description: java.lang.String
  /**
       * Fully qualified identifier of the contribution/type
       */
  var id: java.lang.String
  /**
       * VisibleTo can be used to restrict whom can reference a given contribution/type. This value should be a list of publishers or extensions access is restricted too.  Examples: "ms" - Means only the "ms" publisher can reference this. "ms.vss-web" - Means only the "vss-web" extension from the "ms" publisher can reference this.
       */
  var visibleTo: js.Array[java.lang.String]
}

