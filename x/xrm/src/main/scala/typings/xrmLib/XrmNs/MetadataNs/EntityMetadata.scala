package typings
package xrmLib.XrmNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Types returned by a call to getEntityMetadata
  */
trait EntityMetadata extends js.Object {
  var ActivityTypeMask: scala.Double
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var Attributes: xrmLib.XrmNs.CollectionNs.StringIndexableItemCollection[AttributeMetadata]
  var AutoRouteToOwnerQueue: scala.Boolean
  var CanBeInManyToMany: scala.Boolean
  var CanBePrimaryEntityInRelationship: scala.Boolean
  var CanBeRelatedEntityInRelationship: scala.Boolean
  var CanCreateAttributes: scala.Boolean
  var CanCreateCharts: scala.Boolean
  var CanCreateForms: scala.Boolean
  var CanCreateViews: scala.Boolean
  var CanEnableSyncToExternalSearchIndex: scala.Boolean
  var CanModifyAdditionalSettings: scala.Boolean
  var CanTriggerWorkflow: scala.Boolean
  var Description: Label
  var DisplayCollectionName: Label
  var DisplayName: Label
  var EntityColor: java.lang.String
  var EntitySetName: java.lang.String
  var IconLargeName: java.lang.String
  var IconMediumName: java.lang.String
  var IconSmallName: java.lang.String
  var IsActivity: scala.Boolean
  var IsActivityParty: scala.Boolean
  var IsAuditEnabled: scala.Boolean
  var IsAvailableOffline: scala.Boolean
  var IsBPFEntity: scala.Boolean
  var IsChildEntity: scala.Boolean
  var IsConnectionsEnabled: scala.Boolean
  var IsCustomEntity: scala.Boolean
  var IsCustomizable: scala.Boolean
  var IsDocumentManagementEnabled: scala.Boolean
  var IsDuplicateDetectionEnabled: scala.Boolean
  var IsEnabledForCharts: scala.Boolean
  var IsImportable: scala.Boolean
  var IsIntersect: scala.Boolean
  var IsMailMergeEnabled: scala.Boolean
  var IsManaged: scala.Boolean
  var IsMappable: scala.Boolean
  var IsOneNotIntegrationEnabled: scala.Boolean
  var IsOptimisitcConcurrencyEnabled: scala.Boolean
  var IsQuickCreateEnabled: scala.Boolean
  var IsReadingPaneEnabled: scala.Boolean
  var IsRenameable: scala.Boolean
  var IsStateModelAware: scala.Boolean
  var IsValidForAdvancedFind: scala.Boolean
  var IsValidForQueue: scala.Boolean
  var IsVisibleInMobileClient: scala.Boolean
  var LogicalCollectionName: java.lang.String
  var LogicalName: java.lang.String
  var ObjectTypeCode: scala.Double
  var OwnershipTypeCode: scala.Double
  var PrimaryIdAttribute: java.lang.String
  var PrimaryImageAttribute: java.lang.String
  var PrimaryNameAttribute: java.lang.String
  var RecurrenceBaseEntityLogicalName: java.lang.String
}

