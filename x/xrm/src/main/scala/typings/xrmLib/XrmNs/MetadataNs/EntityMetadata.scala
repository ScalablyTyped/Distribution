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

object EntityMetadata {
  @scala.inline
  def apply(
    ActivityTypeMask: scala.Double,
    Attributes: xrmLib.XrmNs.CollectionNs.StringIndexableItemCollection[AttributeMetadata],
    AutoRouteToOwnerQueue: scala.Boolean,
    CanBeInManyToMany: scala.Boolean,
    CanBePrimaryEntityInRelationship: scala.Boolean,
    CanBeRelatedEntityInRelationship: scala.Boolean,
    CanCreateAttributes: scala.Boolean,
    CanCreateCharts: scala.Boolean,
    CanCreateForms: scala.Boolean,
    CanCreateViews: scala.Boolean,
    CanEnableSyncToExternalSearchIndex: scala.Boolean,
    CanModifyAdditionalSettings: scala.Boolean,
    CanTriggerWorkflow: scala.Boolean,
    Description: Label,
    DisplayCollectionName: Label,
    DisplayName: Label,
    EntityColor: java.lang.String,
    EntitySetName: java.lang.String,
    IconLargeName: java.lang.String,
    IconMediumName: java.lang.String,
    IconSmallName: java.lang.String,
    IsActivity: scala.Boolean,
    IsActivityParty: scala.Boolean,
    IsAuditEnabled: scala.Boolean,
    IsAvailableOffline: scala.Boolean,
    IsBPFEntity: scala.Boolean,
    IsChildEntity: scala.Boolean,
    IsConnectionsEnabled: scala.Boolean,
    IsCustomEntity: scala.Boolean,
    IsCustomizable: scala.Boolean,
    IsDocumentManagementEnabled: scala.Boolean,
    IsDuplicateDetectionEnabled: scala.Boolean,
    IsEnabledForCharts: scala.Boolean,
    IsImportable: scala.Boolean,
    IsIntersect: scala.Boolean,
    IsMailMergeEnabled: scala.Boolean,
    IsManaged: scala.Boolean,
    IsMappable: scala.Boolean,
    IsOneNotIntegrationEnabled: scala.Boolean,
    IsOptimisitcConcurrencyEnabled: scala.Boolean,
    IsQuickCreateEnabled: scala.Boolean,
    IsReadingPaneEnabled: scala.Boolean,
    IsRenameable: scala.Boolean,
    IsStateModelAware: scala.Boolean,
    IsValidForAdvancedFind: scala.Boolean,
    IsValidForQueue: scala.Boolean,
    IsVisibleInMobileClient: scala.Boolean,
    LogicalCollectionName: java.lang.String,
    LogicalName: java.lang.String,
    ObjectTypeCode: scala.Double,
    OwnershipTypeCode: scala.Double,
    PrimaryIdAttribute: java.lang.String,
    PrimaryImageAttribute: java.lang.String,
    PrimaryNameAttribute: java.lang.String,
    RecurrenceBaseEntityLogicalName: java.lang.String
  ): EntityMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActivityTypeMask")(ActivityTypeMask)
    __obj.updateDynamic("Attributes")(Attributes)
    __obj.updateDynamic("AutoRouteToOwnerQueue")(AutoRouteToOwnerQueue)
    __obj.updateDynamic("CanBeInManyToMany")(CanBeInManyToMany)
    __obj.updateDynamic("CanBePrimaryEntityInRelationship")(CanBePrimaryEntityInRelationship)
    __obj.updateDynamic("CanBeRelatedEntityInRelationship")(CanBeRelatedEntityInRelationship)
    __obj.updateDynamic("CanCreateAttributes")(CanCreateAttributes)
    __obj.updateDynamic("CanCreateCharts")(CanCreateCharts)
    __obj.updateDynamic("CanCreateForms")(CanCreateForms)
    __obj.updateDynamic("CanCreateViews")(CanCreateViews)
    __obj.updateDynamic("CanEnableSyncToExternalSearchIndex")(CanEnableSyncToExternalSearchIndex)
    __obj.updateDynamic("CanModifyAdditionalSettings")(CanModifyAdditionalSettings)
    __obj.updateDynamic("CanTriggerWorkflow")(CanTriggerWorkflow)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("DisplayCollectionName")(DisplayCollectionName)
    __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.updateDynamic("EntityColor")(EntityColor)
    __obj.updateDynamic("EntitySetName")(EntitySetName)
    __obj.updateDynamic("IconLargeName")(IconLargeName)
    __obj.updateDynamic("IconMediumName")(IconMediumName)
    __obj.updateDynamic("IconSmallName")(IconSmallName)
    __obj.updateDynamic("IsActivity")(IsActivity)
    __obj.updateDynamic("IsActivityParty")(IsActivityParty)
    __obj.updateDynamic("IsAuditEnabled")(IsAuditEnabled)
    __obj.updateDynamic("IsAvailableOffline")(IsAvailableOffline)
    __obj.updateDynamic("IsBPFEntity")(IsBPFEntity)
    __obj.updateDynamic("IsChildEntity")(IsChildEntity)
    __obj.updateDynamic("IsConnectionsEnabled")(IsConnectionsEnabled)
    __obj.updateDynamic("IsCustomEntity")(IsCustomEntity)
    __obj.updateDynamic("IsCustomizable")(IsCustomizable)
    __obj.updateDynamic("IsDocumentManagementEnabled")(IsDocumentManagementEnabled)
    __obj.updateDynamic("IsDuplicateDetectionEnabled")(IsDuplicateDetectionEnabled)
    __obj.updateDynamic("IsEnabledForCharts")(IsEnabledForCharts)
    __obj.updateDynamic("IsImportable")(IsImportable)
    __obj.updateDynamic("IsIntersect")(IsIntersect)
    __obj.updateDynamic("IsMailMergeEnabled")(IsMailMergeEnabled)
    __obj.updateDynamic("IsManaged")(IsManaged)
    __obj.updateDynamic("IsMappable")(IsMappable)
    __obj.updateDynamic("IsOneNotIntegrationEnabled")(IsOneNotIntegrationEnabled)
    __obj.updateDynamic("IsOptimisitcConcurrencyEnabled")(IsOptimisitcConcurrencyEnabled)
    __obj.updateDynamic("IsQuickCreateEnabled")(IsQuickCreateEnabled)
    __obj.updateDynamic("IsReadingPaneEnabled")(IsReadingPaneEnabled)
    __obj.updateDynamic("IsRenameable")(IsRenameable)
    __obj.updateDynamic("IsStateModelAware")(IsStateModelAware)
    __obj.updateDynamic("IsValidForAdvancedFind")(IsValidForAdvancedFind)
    __obj.updateDynamic("IsValidForQueue")(IsValidForQueue)
    __obj.updateDynamic("IsVisibleInMobileClient")(IsVisibleInMobileClient)
    __obj.updateDynamic("LogicalCollectionName")(LogicalCollectionName)
    __obj.updateDynamic("LogicalName")(LogicalName)
    __obj.updateDynamic("ObjectTypeCode")(ObjectTypeCode)
    __obj.updateDynamic("OwnershipTypeCode")(OwnershipTypeCode)
    __obj.updateDynamic("PrimaryIdAttribute")(PrimaryIdAttribute)
    __obj.updateDynamic("PrimaryImageAttribute")(PrimaryImageAttribute)
    __obj.updateDynamic("PrimaryNameAttribute")(PrimaryNameAttribute)
    __obj.updateDynamic("RecurrenceBaseEntityLogicalName")(RecurrenceBaseEntityLogicalName)
    __obj.asInstanceOf[EntityMetadata]
  }
}

