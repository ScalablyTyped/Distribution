package typings.xrm.Xrm.Metadata

import typings.xrm.Xrm.Collection.StringIndexableItemCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Types returned by a call to getEntityMetadata
  */
@js.native
trait EntityMetadata extends js.Object {
  var ActivityTypeMask: Double = js.native
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var Attributes: StringIndexableItemCollection[AttributeMetadata] = js.native
  var AutoRouteToOwnerQueue: Boolean = js.native
  var CanBeInManyToMany: Boolean = js.native
  var CanBePrimaryEntityInRelationship: Boolean = js.native
  var CanBeRelatedEntityInRelationship: Boolean = js.native
  var CanCreateAttributes: Boolean = js.native
  var CanCreateCharts: Boolean = js.native
  var CanCreateForms: Boolean = js.native
  var CanCreateViews: Boolean = js.native
  var CanEnableSyncToExternalSearchIndex: Boolean = js.native
  var CanModifyAdditionalSettings: Boolean = js.native
  var CanTriggerWorkflow: Boolean = js.native
  var Description: Label = js.native
  var DisplayCollectionName: Label = js.native
  var DisplayName: Label = js.native
  var EntityColor: String = js.native
  var EntitySetName: String = js.native
  var IconLargeName: String = js.native
  var IconMediumName: String = js.native
  var IconSmallName: String = js.native
  var IsActivity: Boolean = js.native
  var IsActivityParty: Boolean = js.native
  var IsAuditEnabled: Boolean = js.native
  var IsAvailableOffline: Boolean = js.native
  var IsBPFEntity: Boolean = js.native
  var IsChildEntity: Boolean = js.native
  var IsConnectionsEnabled: Boolean = js.native
  var IsCustomEntity: Boolean = js.native
  var IsCustomizable: Boolean = js.native
  var IsDocumentManagementEnabled: Boolean = js.native
  var IsDuplicateDetectionEnabled: Boolean = js.native
  var IsEnabledForCharts: Boolean = js.native
  var IsImportable: Boolean = js.native
  var IsIntersect: Boolean = js.native
  var IsMailMergeEnabled: Boolean = js.native
  var IsManaged: Boolean = js.native
  var IsMappable: Boolean = js.native
  var IsOneNotIntegrationEnabled: Boolean = js.native
  var IsOptimisitcConcurrencyEnabled: Boolean = js.native
  var IsQuickCreateEnabled: Boolean = js.native
  var IsReadingPaneEnabled: Boolean = js.native
  var IsRenameable: Boolean = js.native
  var IsStateModelAware: Boolean = js.native
  var IsValidForAdvancedFind: Boolean = js.native
  var IsValidForQueue: Boolean = js.native
  var IsVisibleInMobileClient: Boolean = js.native
  var LogicalCollectionName: String = js.native
  var LogicalName: String = js.native
  var ObjectTypeCode: Double = js.native
  var OwnershipTypeCode: Double = js.native
  var PrimaryIdAttribute: String = js.native
  var PrimaryImageAttribute: String = js.native
  var PrimaryNameAttribute: String = js.native
  var RecurrenceBaseEntityLogicalName: String = js.native
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
  @scala.inline
  implicit class EntityMetadataOps[Self <: EntityMetadata] (val x: Self) extends AnyVal {
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
    def setActivityTypeMask(value: Double): Self = this.set("ActivityTypeMask", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: StringIndexableItemCollection[AttributeMetadata]): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoRouteToOwnerQueue(value: Boolean): Self = this.set("AutoRouteToOwnerQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanBeInManyToMany(value: Boolean): Self = this.set("CanBeInManyToMany", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanBePrimaryEntityInRelationship(value: Boolean): Self = this.set("CanBePrimaryEntityInRelationship", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanBeRelatedEntityInRelationship(value: Boolean): Self = this.set("CanBeRelatedEntityInRelationship", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanCreateAttributes(value: Boolean): Self = this.set("CanCreateAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanCreateCharts(value: Boolean): Self = this.set("CanCreateCharts", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanCreateForms(value: Boolean): Self = this.set("CanCreateForms", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanCreateViews(value: Boolean): Self = this.set("CanCreateViews", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanEnableSyncToExternalSearchIndex(value: Boolean): Self = this.set("CanEnableSyncToExternalSearchIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanModifyAdditionalSettings(value: Boolean): Self = this.set("CanModifyAdditionalSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanTriggerWorkflow(value: Boolean): Self = this.set("CanTriggerWorkflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Label): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayCollectionName(value: Label): Self = this.set("DisplayCollectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: Label): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityColor(value: String): Self = this.set("EntityColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntitySetName(value: String): Self = this.set("EntitySetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconLargeName(value: String): Self = this.set("IconLargeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconMediumName(value: String): Self = this.set("IconMediumName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconSmallName(value: String): Self = this.set("IconSmallName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActivity(value: Boolean): Self = this.set("IsActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActivityParty(value: Boolean): Self = this.set("IsActivityParty", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAuditEnabled(value: Boolean): Self = this.set("IsAuditEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAvailableOffline(value: Boolean): Self = this.set("IsAvailableOffline", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBPFEntity(value: Boolean): Self = this.set("IsBPFEntity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsChildEntity(value: Boolean): Self = this.set("IsChildEntity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsConnectionsEnabled(value: Boolean): Self = this.set("IsConnectionsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCustomEntity(value: Boolean): Self = this.set("IsCustomEntity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCustomizable(value: Boolean): Self = this.set("IsCustomizable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDocumentManagementEnabled(value: Boolean): Self = this.set("IsDocumentManagementEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDuplicateDetectionEnabled(value: Boolean): Self = this.set("IsDuplicateDetectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabledForCharts(value: Boolean): Self = this.set("IsEnabledForCharts", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsImportable(value: Boolean): Self = this.set("IsImportable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIntersect(value: Boolean): Self = this.set("IsIntersect", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMailMergeEnabled(value: Boolean): Self = this.set("IsMailMergeEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsManaged(value: Boolean): Self = this.set("IsManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMappable(value: Boolean): Self = this.set("IsMappable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOneNotIntegrationEnabled(value: Boolean): Self = this.set("IsOneNotIntegrationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOptimisitcConcurrencyEnabled(value: Boolean): Self = this.set("IsOptimisitcConcurrencyEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsQuickCreateEnabled(value: Boolean): Self = this.set("IsQuickCreateEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsReadingPaneEnabled(value: Boolean): Self = this.set("IsReadingPaneEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRenameable(value: Boolean): Self = this.set("IsRenameable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStateModelAware(value: Boolean): Self = this.set("IsStateModelAware", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValidForAdvancedFind(value: Boolean): Self = this.set("IsValidForAdvancedFind", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValidForQueue(value: Boolean): Self = this.set("IsValidForQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVisibleInMobileClient(value: Boolean): Self = this.set("IsVisibleInMobileClient", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogicalCollectionName(value: String): Self = this.set("LogicalCollectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogicalName(value: String): Self = this.set("LogicalName", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectTypeCode(value: Double): Self = this.set("ObjectTypeCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnershipTypeCode(value: Double): Self = this.set("OwnershipTypeCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryIdAttribute(value: String): Self = this.set("PrimaryIdAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryImageAttribute(value: String): Self = this.set("PrimaryImageAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryNameAttribute(value: String): Self = this.set("PrimaryNameAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecurrenceBaseEntityLogicalName(value: String): Self = this.set("RecurrenceBaseEntityLogicalName", value.asInstanceOf[js.Any])
  }
  
}

