package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionManifest extends js.Object {
  /**
    * Uri used as base for other relative uri's defined in extension
    */
  var baseUri: String = js.native
  /**
    * List of shared constraints defined by this extension
    */
  var constraints: js.Array[ContributionConstraint] = js.native
  /**
    * List of contribution types defined by this extension
    */
  var contributionTypes: js.Array[ContributionType] = js.native
  /**
    * List of contributions made by this extension
    */
  var contributions: js.Array[Contribution] = js.native
  /**
    * List of explicit demands required by this extension
    */
  var demands: js.Array[String] = js.native
  /**
    * Collection of endpoints that get called when particular extension events occur
    */
  var eventCallbacks: ExtensionEventCallbackCollection = js.native
  /**
    * Secondary location that can be used as base for other relative uri's defined in extension
    */
  var fallbackBaseUri: String = js.native
  /**
    * Language Culture Name set by the Gallery
    */
  var language: String = js.native
  /**
    * How this extension behaves with respect to licensing
    */
  var licensing: ExtensionLicensing = js.native
  /**
    * Version of the extension manifest format/content
    */
  var manifestVersion: Double = js.native
  /**
    * Default user claims applied to all contributions (except the ones which have been speficied restrictedTo explicitly) to control the visibility of a contribution.
    */
  var restrictedTo: js.Array[String] = js.native
  /**
    * List of all oauth scopes required by this extension
    */
  var scopes: js.Array[String] = js.native
  /**
    * The ServiceInstanceType(Guid) of the VSTS service that must be available to an account in order for the extension to be installed
    */
  var serviceInstanceType: String = js.native
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
  @scala.inline
  implicit class ExtensionManifestOps[Self <: ExtensionManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseUri(value: String): Self = this.set("baseUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstraintsVarargs(value: ContributionConstraint*): Self = this.set("constraints", js.Array(value :_*))
    @scala.inline
    def setConstraints(value: js.Array[ContributionConstraint]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def setContributionTypesVarargs(value: ContributionType*): Self = this.set("contributionTypes", js.Array(value :_*))
    @scala.inline
    def setContributionTypes(value: js.Array[ContributionType]): Self = this.set("contributionTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setContributionsVarargs(value: Contribution*): Self = this.set("contributions", js.Array(value :_*))
    @scala.inline
    def setContributions(value: js.Array[Contribution]): Self = this.set("contributions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDemandsVarargs(value: String*): Self = this.set("demands", js.Array(value :_*))
    @scala.inline
    def setDemands(value: js.Array[String]): Self = this.set("demands", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventCallbacks(value: ExtensionEventCallbackCollection): Self = this.set("eventCallbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def setFallbackBaseUri(value: String): Self = this.set("fallbackBaseUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLicensing(value: ExtensionLicensing): Self = this.set("licensing", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifestVersion(value: Double): Self = this.set("manifestVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestrictedToVarargs(value: String*): Self = this.set("restrictedTo", js.Array(value :_*))
    @scala.inline
    def setRestrictedTo(value: js.Array[String]): Self = this.set("restrictedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceInstanceType(value: String): Self = this.set("serviceInstanceType", value.asInstanceOf[js.Any])
  }
  
}

