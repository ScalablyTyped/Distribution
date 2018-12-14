package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VariableGroup extends js.Object {
  /**
       * Gets or sets the identity who created.
       */
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * Gets date on which it got created.
       */
  var createdOn: stdLib.Date
  /**
       * Gets or sets description.
       */
  var description: java.lang.String
  /**
       * Gets the unique identifier of this field.
       */
  var id: scala.Double
  /**
       * Gets or sets the identity who modified.
       */
  var modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * Gets date on which it got modified.
       */
  var modifiedOn: stdLib.Date
  /**
       * Gets or sets name.
       */
  var name: java.lang.String
  /**
       * Gets or sets provider data.
       */
  var providerData: VariableGroupProviderData
  /**
       * Gets or sets type.
       */
  var `type`: java.lang.String
  var variables: org.scalablytyped.runtime.StringDictionary[VariableValue]
}

