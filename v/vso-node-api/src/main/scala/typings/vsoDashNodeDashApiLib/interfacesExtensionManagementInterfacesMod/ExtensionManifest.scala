package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionManifest extends js.Object {
  /**
    * Uri used as base for other relative uri's defined in extension
    */
  var baseUri: java.lang.String
  /**
    * List of shared constraints defined by this extension
    */
  var constraints: js.Array[ContributionConstraint]
  /**
    * List of contribution types defined by this extension
    */
  var contributionTypes: js.Array[ContributionType]
  /**
    * List of contributions made by this extension
    */
  var contributions: js.Array[Contribution]
  /**
    * List of explicit demands required by this extension
    */
  var demands: js.Array[java.lang.String]
  /**
    * Collection of endpoints that get called when particular extension events occur
    */
  var eventCallbacks: ExtensionEventCallbackCollection
  /**
    * Secondary location that can be used as base for other relative uri's defined in extension
    */
  var fallbackBaseUri: java.lang.String
  /**
    * Language Culture Name set by the Gallery
    */
  var language: java.lang.String
  /**
    * How this extension behaves with respect to licensing
    */
  var licensing: ExtensionLicensing
  /**
    * Version of the extension manifest format/content
    */
  var manifestVersion: scala.Double
  /**
    * Default user claims applied to all contributions (except the ones which have been speficied restrictedTo explicitly) to control the visibility of a contribution.
    */
  var restrictedTo: js.Array[java.lang.String]
  /**
    * List of all oauth scopes required by this extension
    */
  var scopes: js.Array[java.lang.String]
  /**
    * The ServiceInstanceType(Guid) of the VSTS service that must be available to an account in order for the extension to be installed
    */
  var serviceInstanceType: java.lang.String
}

object ExtensionManifest {
  @scala.inline
  def apply(
    baseUri: java.lang.String,
    constraints: js.Array[ContributionConstraint],
    contributionTypes: js.Array[ContributionType],
    contributions: js.Array[Contribution],
    demands: js.Array[java.lang.String],
    eventCallbacks: ExtensionEventCallbackCollection,
    fallbackBaseUri: java.lang.String,
    language: java.lang.String,
    licensing: ExtensionLicensing,
    manifestVersion: scala.Double,
    restrictedTo: js.Array[java.lang.String],
    scopes: js.Array[java.lang.String],
    serviceInstanceType: java.lang.String
  ): ExtensionManifest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseUri")(baseUri)
    __obj.updateDynamic("constraints")(constraints)
    __obj.updateDynamic("contributionTypes")(contributionTypes)
    __obj.updateDynamic("contributions")(contributions)
    __obj.updateDynamic("demands")(demands)
    __obj.updateDynamic("eventCallbacks")(eventCallbacks)
    __obj.updateDynamic("fallbackBaseUri")(fallbackBaseUri)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("licensing")(licensing)
    __obj.updateDynamic("manifestVersion")(manifestVersion)
    __obj.updateDynamic("restrictedTo")(restrictedTo)
    __obj.updateDynamic("scopes")(scopes)
    __obj.updateDynamic("serviceInstanceType")(serviceInstanceType)
    __obj.asInstanceOf[ExtensionManifest]
  }
}

