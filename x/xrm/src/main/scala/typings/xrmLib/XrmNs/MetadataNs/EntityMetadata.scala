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
    val __obj = js.Dynamic.literal(ActivityTypeMask = ActivityTypeMask, Attributes = Attributes, AutoRouteToOwnerQueue = AutoRouteToOwnerQueue, CanBeInManyToMany = CanBeInManyToMany, CanBePrimaryEntityInRelationship = CanBePrimaryEntityInRelationship, CanBeRelatedEntityInRelationship = CanBeRelatedEntityInRelationship, CanCreateAttributes = CanCreateAttributes, CanCreateCharts = CanCreateCharts, CanCreateForms = CanCreateForms, CanCreateViews = CanCreateViews, CanEnableSyncToExternalSearchIndex = CanEnableSyncToExternalSearchIndex, CanModifyAdditionalSettings = CanModifyAdditionalSettings, CanTriggerWorkflow = CanTriggerWorkflow, Description = Description, DisplayCollectionName = DisplayCollectionName, DisplayName = DisplayName, EntityColor = EntityColor, EntitySetName = EntitySetName, IconLargeName = IconLargeName, IconMediumName = IconMediumName, IconSmallName = IconSmallName, IsActivity = IsActivity, IsActivityParty = IsActivityParty, IsAuditEnabled = IsAuditEnabled, IsAvailableOffline = IsAvailableOffline, IsBPFEntity = IsBPFEntity, IsChildEntity = IsChildEntity, IsConnectionsEnabled = IsConnectionsEnabled, IsCustomEntity = IsCustomEntity, IsCustomizable = IsCustomizable, IsDocumentManagementEnabled = IsDocumentManagementEnabled, IsDuplicateDetectionEnabled = IsDuplicateDetectionEnabled, IsEnabledForCharts = IsEnabledForCharts, IsImportable = IsImportable, IsIntersect = IsIntersect, IsMailMergeEnabled = IsMailMergeEnabled, IsManaged = IsManaged, IsMappable = IsMappable, IsOneNotIntegrationEnabled = IsOneNotIntegrationEnabled, IsOptimisitcConcurrencyEnabled = IsOptimisitcConcurrencyEnabled, IsQuickCreateEnabled = IsQuickCreateEnabled, IsReadingPaneEnabled = IsReadingPaneEnabled, IsRenameable = IsRenameable, IsStateModelAware = IsStateModelAware, IsValidForAdvancedFind = IsValidForAdvancedFind, IsValidForQueue = IsValidForQueue, IsVisibleInMobileClient = IsVisibleInMobileClient, LogicalCollectionName = LogicalCollectionName, LogicalName = LogicalName, ObjectTypeCode = ObjectTypeCode, OwnershipTypeCode = OwnershipTypeCode, PrimaryIdAttribute = PrimaryIdAttribute, PrimaryImageAttribute = PrimaryImageAttribute, PrimaryNameAttribute = PrimaryNameAttribute, RecurrenceBaseEntityLogicalName = RecurrenceBaseEntityLogicalName)
  
    __obj.asInstanceOf[EntityMetadata]
  }
}

