package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  /**
    * The custom display name for the identity (if any). Setting this property to an empty string will clear the existing custom display name. Setting this property to null will not affect the existing persisted value (since null values do not get sent over the wire or to the database)
    */
  var customDisplayName: java.lang.String
  var descriptor: IdentityDescriptor
  var id: java.lang.String
  var isActive: scala.Boolean
  var isContainer: scala.Boolean
  var masterId: java.lang.String
  var memberIds: js.Array[java.lang.String]
  var memberOf: js.Array[IdentityDescriptor]
  var members: js.Array[IdentityDescriptor]
  var metaTypeId: scala.Double
  var properties: js.Any
  /**
    * The display name for the identity as specified by the source identity provider.
    */
  var providerDisplayName: java.lang.String
  var resourceVersion: scala.Double
  var subjectDescriptor: java.lang.String
  var uniqueUserId: scala.Double
}

object Identity {
  @scala.inline
  def apply(
    customDisplayName: java.lang.String,
    descriptor: IdentityDescriptor,
    id: java.lang.String,
    isActive: scala.Boolean,
    isContainer: scala.Boolean,
    masterId: java.lang.String,
    memberIds: js.Array[java.lang.String],
    memberOf: js.Array[IdentityDescriptor],
    members: js.Array[IdentityDescriptor],
    metaTypeId: scala.Double,
    properties: js.Any,
    providerDisplayName: java.lang.String,
    resourceVersion: scala.Double,
    subjectDescriptor: java.lang.String,
    uniqueUserId: scala.Double
  ): Identity = {
    val __obj = js.Dynamic.literal(customDisplayName = customDisplayName, descriptor = descriptor, id = id, isActive = isActive, isContainer = isContainer, masterId = masterId, memberIds = memberIds, memberOf = memberOf, members = members, metaTypeId = metaTypeId, properties = properties, providerDisplayName = providerDisplayName, resourceVersion = resourceVersion, subjectDescriptor = subjectDescriptor, uniqueUserId = uniqueUserId)
  
    __obj.asInstanceOf[Identity]
  }
}

