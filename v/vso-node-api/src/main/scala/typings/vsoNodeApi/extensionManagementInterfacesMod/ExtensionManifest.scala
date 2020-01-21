package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionManifest extends js.Object {
  /**
    * Uri used as base for other relative uri's defined in extension
    */
  var baseUri: String
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
  var demands: js.Array[String]
  /**
    * Collection of endpoints that get called when particular extension events occur
    */
  var eventCallbacks: ExtensionEventCallbackCollection
  /**
    * Secondary location that can be used as base for other relative uri's defined in extension
    */
  var fallbackBaseUri: String
  /**
    * Language Culture Name set by the Gallery
    */
  var language: String
  /**
    * How this extension behaves with respect to licensing
    */
  var licensing: ExtensionLicensing
  /**
    * Version of the extension manifest format/content
    */
  var manifestVersion: Double
  /**
    * Default user claims applied to all contributions (except the ones which have been speficied restrictedTo explicitly) to control the visibility of a contribution.
    */
  var restrictedTo: js.Array[String]
  /**
    * List of all oauth scopes required by this extension
    */
  var scopes: js.Array[String]
  /**
    * The ServiceInstanceType(Guid) of the VSTS service that must be available to an account in order for the extension to be installed
    */
  var serviceInstanceType: String
}

object ExtensionManifest {
  @scala.inline
  def apply(
    baseUri: String,
    constraints: js.Array[ContributionConstraint],
    contributionTypes: js.Array[ContributionType],
    contributions: js.Array[Contribution],
    demands: js.Array[String],
    eventCallbacks: ExtensionEventCallbackCollection,
    fallbackBaseUri: String,
    language: String,
    licensing: ExtensionLicensing,
    manifestVersion: Double,
    restrictedTo: js.Array[String],
    scopes: js.Array[String],
    serviceInstanceType: String
  ): ExtensionManifest = {
    val __obj = js.Dynamic.literal(baseUri = baseUri.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], contributionTypes = contributionTypes.asInstanceOf[js.Any], contributions = contributions.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], eventCallbacks = eventCallbacks.asInstanceOf[js.Any], fallbackBaseUri = fallbackBaseUri.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], licensing = licensing.asInstanceOf[js.Any], manifestVersion = manifestVersion.asInstanceOf[js.Any], restrictedTo = restrictedTo.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], serviceInstanceType = serviceInstanceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionManifest]
  }
}

