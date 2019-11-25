package typings.xrm.Xrm.Metadata

import typings.xrm.Xrm.Collection.StringIndexableItemCollection
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
    val __obj = js.Dynamic.literal(ActivityTypeMask = ActivityTypeMask.asInstanceOf[js.Any], Attributes = Attributes.asInstanceOf[js.Any], AutoRouteToOwnerQueue = AutoRouteToOwnerQueue.asInstanceOf[js.Any], CanBeInManyToMany = CanBeInManyToMany.asInstanceOf[js.Any], CanBePrimaryEntityInRelationship = CanBePrimaryEntityInRelationship.asInstanceOf[js.Any], CanBeRelatedEntityInRelationship = CanBeRelatedEntityInRelationship.asInstanceOf[js.Any], CanCreateAttributes = CanCreateAttributes.asInstanceOf[js.Any], CanCreateCharts = CanCreateCharts.asInstanceOf[js.Any], CanCreateForms = CanCreateForms.asInstanceOf[js.Any], CanCreateViews = CanCreateViews.asInstanceOf[js.Any], CanEnableSyncToExternalSearchIndex = CanEnableSyncToExternalSearchIndex.asInstanceOf[js.Any], CanModifyAdditionalSettings = CanModifyAdditionalSettings.asInstanceOf[js.Any], CanTriggerWorkflow = CanTriggerWorkflow.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayCollectionName = DisplayCollectionName.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], EntityColor = EntityColor.asInstanceOf[js.Any], EntitySetName = EntitySetName.asInstanceOf[js.Any], IconLargeName = IconLargeName.asInstanceOf[js.Any], IconMediumName = IconMediumName.asInstanceOf[js.Any], IconSmallName = IconSmallName.asInstanceOf[js.Any], IsActivity = IsActivity.asInstanceOf[js.Any], IsActivityParty = IsActivityParty.asInstanceOf[js.Any], IsAuditEnabled = IsAuditEnabled.asInstanceOf[js.Any], IsAvailableOffline = IsAvailableOffline.asInstanceOf[js.Any], IsBPFEntity = IsBPFEntity.asInstanceOf[js.Any], IsChildEntity = IsChildEntity.asInstanceOf[js.Any], IsConnectionsEnabled = IsConnectionsEnabled.asInstanceOf[js.Any], IsCustomEntity = IsCustomEntity.asInstanceOf[js.Any], IsCustomizable = IsCustomizable.asInstanceOf[js.Any], IsDocumentManagementEnabled = IsDocumentManagementEnabled.asInstanceOf[js.Any], IsDuplicateDetectionEnabled = IsDuplicateDetectionEnabled.asInstanceOf[js.Any], IsEnabledForCharts = IsEnabledForCharts.asInstanceOf[js.Any], IsImportable = IsImportable.asInstanceOf[js.Any], IsIntersect = IsIntersect.asInstanceOf[js.Any], IsMailMergeEnabled = IsMailMergeEnabled.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], IsMappable = IsMappable.asInstanceOf[js.Any], IsOneNotIntegrationEnabled = IsOneNotIntegrationEnabled.asInstanceOf[js.Any], IsOptimisitcConcurrencyEnabled = IsOptimisitcConcurrencyEnabled.asInstanceOf[js.Any], IsQuickCreateEnabled = IsQuickCreateEnabled.asInstanceOf[js.Any], IsReadingPaneEnabled = IsReadingPaneEnabled.asInstanceOf[js.Any], IsRenameable = IsRenameable.asInstanceOf[js.Any], IsStateModelAware = IsStateModelAware.asInstanceOf[js.Any], IsValidForAdvancedFind = IsValidForAdvancedFind.asInstanceOf[js.Any], IsValidForQueue = IsValidForQueue.asInstanceOf[js.Any], IsVisibleInMobileClient = IsVisibleInMobileClient.asInstanceOf[js.Any], LogicalCollectionName = LogicalCollectionName.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], ObjectTypeCode = ObjectTypeCode.asInstanceOf[js.Any], OwnershipTypeCode = OwnershipTypeCode.asInstanceOf[js.Any], PrimaryIdAttribute = PrimaryIdAttribute.asInstanceOf[js.Any], PrimaryImageAttribute = PrimaryImageAttribute.asInstanceOf[js.Any], PrimaryNameAttribute = PrimaryNameAttribute.asInstanceOf[js.Any], RecurrenceBaseEntityLogicalName = RecurrenceBaseEntityLogicalName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityMetadata]
  }
}

