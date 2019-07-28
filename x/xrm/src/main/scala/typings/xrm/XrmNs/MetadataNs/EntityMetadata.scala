package typings.xrm.XrmNs.MetadataNs

import typings.xrm.XrmNs.CollectionNs.StringIndexableItemCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Types returned by a call to getEntityMetadata
  */
trait EntityMetadata extends js.Object {
  var ActivityTypeMask: Double
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var Attributes: StringIndexableItemCollection[AttributeMetadata]
  var AutoRouteToOwnerQueue: Boolean
  var CanBeInManyToMany: Boolean
  var CanBePrimaryEntityInRelationship: Boolean
  var CanBeRelatedEntityInRelationship: Boolean
  var CanCreateAttributes: Boolean
  var CanCreateCharts: Boolean
  var CanCreateForms: Boolean
  var CanCreateViews: Boolean
  var CanEnableSyncToExternalSearchIndex: Boolean
  var CanModifyAdditionalSettings: Boolean
  var CanTriggerWorkflow: Boolean
  var Description: Label
  var DisplayCollectionName: Label
  var DisplayName: Label
  var EntityColor: String
  var EntitySetName: String
  var IconLargeName: String
  var IconMediumName: String
  var IconSmallName: String
  var IsActivity: Boolean
  var IsActivityParty: Boolean
  var IsAuditEnabled: Boolean
  var IsAvailableOffline: Boolean
  var IsBPFEntity: Boolean
  var IsChildEntity: Boolean
  var IsConnectionsEnabled: Boolean
  var IsCustomEntity: Boolean
  var IsCustomizable: Boolean
  var IsDocumentManagementEnabled: Boolean
  var IsDuplicateDetectionEnabled: Boolean
  var IsEnabledForCharts: Boolean
  var IsImportable: Boolean
  var IsIntersect: Boolean
  var IsMailMergeEnabled: Boolean
  var IsManaged: Boolean
  var IsMappable: Boolean
  var IsOneNotIntegrationEnabled: Boolean
  var IsOptimisitcConcurrencyEnabled: Boolean
  var IsQuickCreateEnabled: Boolean
  var IsReadingPaneEnabled: Boolean
  var IsRenameable: Boolean
  var IsStateModelAware: Boolean
  var IsValidForAdvancedFind: Boolean
  var IsValidForQueue: Boolean
  var IsVisibleInMobileClient: Boolean
  var LogicalCollectionName: String
  var LogicalName: String
  var ObjectTypeCode: Double
  var OwnershipTypeCode: Double
  var PrimaryIdAttribute: String
  var PrimaryImageAttribute: String
  var PrimaryNameAttribute: String
  var RecurrenceBaseEntityLogicalName: String
}

object EntityMetadata {
  @scala.inline
  def apply(
    ActivityTypeMask: Double,
    Attributes: StringIndexableItemCollection[AttributeMetadata],
    AutoRouteToOwnerQueue: Boolean,
    CanBeInManyToMany: Boolean,
    CanBePrimaryEntityInRelationship: Boolean,
    CanBeRelatedEntityInRelationship: Boolean,
    CanCreateAttributes: Boolean,
    CanCreateCharts: Boolean,
    CanCreateForms: Boolean,
    CanCreateViews: Boolean,
    CanEnableSyncToExternalSearchIndex: Boolean,
    CanModifyAdditionalSettings: Boolean,
    CanTriggerWorkflow: Boolean,
    Description: Label,
    DisplayCollectionName: Label,
    DisplayName: Label,
    EntityColor: String,
    EntitySetName: String,
    IconLargeName: String,
    IconMediumName: String,
    IconSmallName: String,
    IsActivity: Boolean,
    IsActivityParty: Boolean,
    IsAuditEnabled: Boolean,
    IsAvailableOffline: Boolean,
    IsBPFEntity: Boolean,
    IsChildEntity: Boolean,
    IsConnectionsEnabled: Boolean,
    IsCustomEntity: Boolean,
    IsCustomizable: Boolean,
    IsDocumentManagementEnabled: Boolean,
    IsDuplicateDetectionEnabled: Boolean,
    IsEnabledForCharts: Boolean,
    IsImportable: Boolean,
    IsIntersect: Boolean,
    IsMailMergeEnabled: Boolean,
    IsManaged: Boolean,
    IsMappable: Boolean,
    IsOneNotIntegrationEnabled: Boolean,
    IsOptimisitcConcurrencyEnabled: Boolean,
    IsQuickCreateEnabled: Boolean,
    IsReadingPaneEnabled: Boolean,
    IsRenameable: Boolean,
    IsStateModelAware: Boolean,
    IsValidForAdvancedFind: Boolean,
    IsValidForQueue: Boolean,
    IsVisibleInMobileClient: Boolean,
    LogicalCollectionName: String,
    LogicalName: String,
    ObjectTypeCode: Double,
    OwnershipTypeCode: Double,
    PrimaryIdAttribute: String,
    PrimaryImageAttribute: String,
    PrimaryNameAttribute: String,
    RecurrenceBaseEntityLogicalName: String
  ): EntityMetadata = {
    val __obj = js.Dynamic.literal(ActivityTypeMask = ActivityTypeMask, Attributes = Attributes, AutoRouteToOwnerQueue = AutoRouteToOwnerQueue, CanBeInManyToMany = CanBeInManyToMany, CanBePrimaryEntityInRelationship = CanBePrimaryEntityInRelationship, CanBeRelatedEntityInRelationship = CanBeRelatedEntityInRelationship, CanCreateAttributes = CanCreateAttributes, CanCreateCharts = CanCreateCharts, CanCreateForms = CanCreateForms, CanCreateViews = CanCreateViews, CanEnableSyncToExternalSearchIndex = CanEnableSyncToExternalSearchIndex, CanModifyAdditionalSettings = CanModifyAdditionalSettings, CanTriggerWorkflow = CanTriggerWorkflow, Description = Description, DisplayCollectionName = DisplayCollectionName, DisplayName = DisplayName, EntityColor = EntityColor, EntitySetName = EntitySetName, IconLargeName = IconLargeName, IconMediumName = IconMediumName, IconSmallName = IconSmallName, IsActivity = IsActivity, IsActivityParty = IsActivityParty, IsAuditEnabled = IsAuditEnabled, IsAvailableOffline = IsAvailableOffline, IsBPFEntity = IsBPFEntity, IsChildEntity = IsChildEntity, IsConnectionsEnabled = IsConnectionsEnabled, IsCustomEntity = IsCustomEntity, IsCustomizable = IsCustomizable, IsDocumentManagementEnabled = IsDocumentManagementEnabled, IsDuplicateDetectionEnabled = IsDuplicateDetectionEnabled, IsEnabledForCharts = IsEnabledForCharts, IsImportable = IsImportable, IsIntersect = IsIntersect, IsMailMergeEnabled = IsMailMergeEnabled, IsManaged = IsManaged, IsMappable = IsMappable, IsOneNotIntegrationEnabled = IsOneNotIntegrationEnabled, IsOptimisitcConcurrencyEnabled = IsOptimisitcConcurrencyEnabled, IsQuickCreateEnabled = IsQuickCreateEnabled, IsReadingPaneEnabled = IsReadingPaneEnabled, IsRenameable = IsRenameable, IsStateModelAware = IsStateModelAware, IsValidForAdvancedFind = IsValidForAdvancedFind, IsValidForQueue = IsValidForQueue, IsVisibleInMobileClient = IsVisibleInMobileClient, LogicalCollectionName = LogicalCollectionName, LogicalName = LogicalName, ObjectTypeCode = ObjectTypeCode, OwnershipTypeCode = OwnershipTypeCode, PrimaryIdAttribute = PrimaryIdAttribute, PrimaryImageAttribute = PrimaryImageAttribute, PrimaryNameAttribute = PrimaryNameAttribute, RecurrenceBaseEntityLogicalName = RecurrenceBaseEntityLogicalName)
  
    __obj.asInstanceOf[EntityMetadata]
  }
}

