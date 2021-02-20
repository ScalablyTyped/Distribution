package typings.xrm.Xrm

import typings.xrm.Xrm.Collection.StringIndexableItemCollection
import typings.xrm.XrmEnum.AttributeTypeCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to hold the Metadata types
  */
object Metadata {
  
  /**
    * Type to hold the Attribute metadata as part of the EntityMetadata
    */
  @js.native
  trait AttributeMetadata extends StObject {
    
    var AttributeType: AttributeTypeCode = js.native
    
    var DefaultFormValue: Double = js.native
    
    var DisplayName: String = js.native
    
    var EntityLogicalName: String = js.native
    
    /**
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    var LogicalName: String = js.native
    
    /**
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    var OptionSet: js.Array[OptionMetadata] = js.native
  }
  object AttributeMetadata {
    
    @scala.inline
    def apply(
      AttributeType: AttributeTypeCode,
      DefaultFormValue: Double,
      DisplayName: String,
      EntityLogicalName: String,
      LogicalName: String,
      OptionSet: js.Array[OptionMetadata]
    ): AttributeMetadata = {
      val __obj = js.Dynamic.literal(AttributeType = AttributeType.asInstanceOf[js.Any], DefaultFormValue = DefaultFormValue.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], EntityLogicalName = EntityLogicalName.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], OptionSet = OptionSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeMetadata]
    }
    
    @scala.inline
    implicit class AttributeMetadataMutableBuilder[Self <: AttributeMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeType(value: AttributeTypeCode): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFormValue(value: Double): Self = StObject.set(x, "DefaultFormValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityLogicalName(value: String): Self = StObject.set(x, "EntityLogicalName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogicalName(value: String): Self = StObject.set(x, "LogicalName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionSet(value: js.Array[OptionMetadata]): Self = StObject.set(x, "OptionSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionSetVarargs(value: OptionMetadata*): Self = StObject.set(x, "OptionSet", js.Array(value :_*))
    }
  }
  
  /**
    * Types returned by a call to getEntityMetadata
    */
  @js.native
  trait EntityMetadata extends StObject {
    
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
    implicit class EntityMetadataMutableBuilder[Self <: EntityMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityTypeMask(value: Double): Self = StObject.set(x, "ActivityTypeMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributes(value: StringIndexableItemCollection[AttributeMetadata]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRouteToOwnerQueue(value: Boolean): Self = StObject.set(x, "AutoRouteToOwnerQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanBeInManyToMany(value: Boolean): Self = StObject.set(x, "CanBeInManyToMany", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanBePrimaryEntityInRelationship(value: Boolean): Self = StObject.set(x, "CanBePrimaryEntityInRelationship", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanBeRelatedEntityInRelationship(value: Boolean): Self = StObject.set(x, "CanBeRelatedEntityInRelationship", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanCreateAttributes(value: Boolean): Self = StObject.set(x, "CanCreateAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanCreateCharts(value: Boolean): Self = StObject.set(x, "CanCreateCharts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanCreateForms(value: Boolean): Self = StObject.set(x, "CanCreateForms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanCreateViews(value: Boolean): Self = StObject.set(x, "CanCreateViews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanEnableSyncToExternalSearchIndex(value: Boolean): Self = StObject.set(x, "CanEnableSyncToExternalSearchIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanModifyAdditionalSettings(value: Boolean): Self = StObject.set(x, "CanModifyAdditionalSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanTriggerWorkflow(value: Boolean): Self = StObject.set(x, "CanTriggerWorkflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Label): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayCollectionName(value: Label): Self = StObject.set(x, "DisplayCollectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: Label): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityColor(value: String): Self = StObject.set(x, "EntityColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntitySetName(value: String): Self = StObject.set(x, "EntitySetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconLargeName(value: String): Self = StObject.set(x, "IconLargeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconMediumName(value: String): Self = StObject.set(x, "IconMediumName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSmallName(value: String): Self = StObject.set(x, "IconSmallName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActivity(value: Boolean): Self = StObject.set(x, "IsActivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActivityParty(value: Boolean): Self = StObject.set(x, "IsActivityParty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAuditEnabled(value: Boolean): Self = StObject.set(x, "IsAuditEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAvailableOffline(value: Boolean): Self = StObject.set(x, "IsAvailableOffline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBPFEntity(value: Boolean): Self = StObject.set(x, "IsBPFEntity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChildEntity(value: Boolean): Self = StObject.set(x, "IsChildEntity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsConnectionsEnabled(value: Boolean): Self = StObject.set(x, "IsConnectionsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCustomEntity(value: Boolean): Self = StObject.set(x, "IsCustomEntity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCustomizable(value: Boolean): Self = StObject.set(x, "IsCustomizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDocumentManagementEnabled(value: Boolean): Self = StObject.set(x, "IsDocumentManagementEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDuplicateDetectionEnabled(value: Boolean): Self = StObject.set(x, "IsDuplicateDetectionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabledForCharts(value: Boolean): Self = StObject.set(x, "IsEnabledForCharts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsImportable(value: Boolean): Self = StObject.set(x, "IsImportable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIntersect(value: Boolean): Self = StObject.set(x, "IsIntersect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMailMergeEnabled(value: Boolean): Self = StObject.set(x, "IsMailMergeEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsManaged(value: Boolean): Self = StObject.set(x, "IsManaged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMappable(value: Boolean): Self = StObject.set(x, "IsMappable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOneNotIntegrationEnabled(value: Boolean): Self = StObject.set(x, "IsOneNotIntegrationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOptimisitcConcurrencyEnabled(value: Boolean): Self = StObject.set(x, "IsOptimisitcConcurrencyEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsQuickCreateEnabled(value: Boolean): Self = StObject.set(x, "IsQuickCreateEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsReadingPaneEnabled(value: Boolean): Self = StObject.set(x, "IsReadingPaneEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRenameable(value: Boolean): Self = StObject.set(x, "IsRenameable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStateModelAware(value: Boolean): Self = StObject.set(x, "IsStateModelAware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValidForAdvancedFind(value: Boolean): Self = StObject.set(x, "IsValidForAdvancedFind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValidForQueue(value: Boolean): Self = StObject.set(x, "IsValidForQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisibleInMobileClient(value: Boolean): Self = StObject.set(x, "IsVisibleInMobileClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogicalCollectionName(value: String): Self = StObject.set(x, "LogicalCollectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogicalName(value: String): Self = StObject.set(x, "LogicalName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectTypeCode(value: Double): Self = StObject.set(x, "ObjectTypeCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnershipTypeCode(value: Double): Self = StObject.set(x, "OwnershipTypeCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryIdAttribute(value: String): Self = StObject.set(x, "PrimaryIdAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryImageAttribute(value: String): Self = StObject.set(x, "PrimaryImageAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryNameAttribute(value: String): Self = StObject.set(x, "PrimaryNameAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrenceBaseEntityLogicalName(value: String): Self = StObject.set(x, "RecurrenceBaseEntityLogicalName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Type to hold Labels as part of the EntityMetadata
    */
  @js.native
  trait Label extends StObject {
    
    /**
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    var LocalizedLabels: js.Array[LocalizedLabel] = js.native
    
    var UserLocalizedLabel: LocalizedLabel = js.native
  }
  object Label {
    
    @scala.inline
    def apply(LocalizedLabels: js.Array[LocalizedLabel], UserLocalizedLabel: LocalizedLabel): Label = {
      val __obj = js.Dynamic.literal(LocalizedLabels = LocalizedLabels.asInstanceOf[js.Any], UserLocalizedLabel = UserLocalizedLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalizedLabels(value: js.Array[LocalizedLabel]): Self = StObject.set(x, "LocalizedLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalizedLabelsVarargs(value: LocalizedLabel*): Self = StObject.set(x, "LocalizedLabels", js.Array(value :_*))
      
      @scala.inline
      def setUserLocalizedLabel(value: LocalizedLabel): Self = StObject.set(x, "UserLocalizedLabel", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Type to hold a Label as part of the EntityMetadata
    */
  @js.native
  trait LocalizedLabel extends StObject {
    
    var Label: String = js.native
    
    var LanguageCode: Double = js.native
  }
  object LocalizedLabel {
    
    @scala.inline
    def apply(Label: String, LanguageCode: Double): LocalizedLabel = {
      val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizedLabel]
    }
    
    @scala.inline
    implicit class LocalizedLabelMutableBuilder[Self <: LocalizedLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageCode(value: Double): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Type to hold the optionset metadata as part of the EntityMetadata
    */
  @js.native
  trait OptionMetadata extends StObject {
    
    var Color: String = js.native
    
    var Description: Label = js.native
    
    var ExternalValue: js.Any = js.native
    
    var HasChanged: Boolean = js.native
    
    var IsManaged: Boolean = js.native
    
    var Label: typings.xrm.Xrm.Metadata.Label = js.native
    
    var MetadataId: String = js.native
    
    var State: Double = js.native
    
    var TransitionData: js.Any = js.native
    
    var Value: Double = js.native
  }
  object OptionMetadata {
    
    @scala.inline
    def apply(
      Color: String,
      Description: Label,
      ExternalValue: js.Any,
      HasChanged: Boolean,
      IsManaged: Boolean,
      Label: Label,
      MetadataId: String,
      State: Double,
      TransitionData: js.Any,
      Value: Double
    ): OptionMetadata = {
      val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], ExternalValue = ExternalValue.asInstanceOf[js.Any], HasChanged = HasChanged.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], TransitionData = TransitionData.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionMetadata]
    }
    
    @scala.inline
    implicit class OptionMetadataMutableBuilder[Self <: OptionMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Label): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalValue(value: js.Any): Self = StObject.set(x, "ExternalValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasChanged(value: Boolean): Self = StObject.set(x, "HasChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsManaged(value: Boolean): Self = StObject.set(x, "IsManaged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: Label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataId(value: String): Self = StObject.set(x, "MetadataId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: Double): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionData(value: js.Any): Self = StObject.set(x, "TransitionData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
}
