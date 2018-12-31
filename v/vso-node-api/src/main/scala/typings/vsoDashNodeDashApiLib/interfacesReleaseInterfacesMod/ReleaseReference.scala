package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseReference extends js.Object {
  /**
    * Gets links to access the release.
    */
  var _links: js.Any
  /**
    * Gets list of artifacts.
    */
  var artifacts: js.Array[Artifact]
  /**
    * Gets the identity who created.
    */
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets date on which it got created.
    */
  var createdOn: stdLib.Date
  /**
    * Gets description.
    */
  var description: java.lang.String
  /**
    * Gets the unique identifier of this field.
    */
  var id: scala.Double
  /**
    * Gets the identity who modified.
    */
  var modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets name of release.
    */
  var name: java.lang.String
  /**
    * Gets reason for release.
    */
  var reason: ReleaseReason
  /**
    * Gets release definition shallow reference.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference
  var url: java.lang.String
  var webAccessUri: java.lang.String
}

