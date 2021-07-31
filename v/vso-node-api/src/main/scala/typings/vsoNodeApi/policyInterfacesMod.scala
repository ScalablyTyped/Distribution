package typings.vsoNodeApi

import typings.std.Date
import typings.vsoNodeApi.anon.EnumValuesBroken
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyInterfacesMod {
  
  @js.native
  sealed trait PolicyEvaluationStatus extends StObject
  @JSImport("vso-node-api/interfaces/PolicyInterfaces", "PolicyEvaluationStatus")
  @js.native
  object PolicyEvaluationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PolicyEvaluationStatus & Double] = js.native
    
    /**
      * The policy has been fulfilled for this pull request.
      */
    @js.native
    sealed trait Approved
      extends StObject
         with PolicyEvaluationStatus
    /* 2 */ val Approved: typings.vsoNodeApi.policyInterfacesMod.PolicyEvaluationStatus.Approved & Double = js.native
    
    /**
      * The policy has encountered an unexpected error.
      */
    @js.native
    sealed trait Broken
      extends StObject
         with PolicyEvaluationStatus
    /* 5 */ val Broken: typings.vsoNodeApi.policyInterfacesMod.PolicyEvaluationStatus.Broken & Double = js.native
    
    /**
      * The policy does not apply to this pull request.
      */
    @js.native
    sealed trait NotApplicable
      extends StObject
         with PolicyEvaluationStatus
    /* 4 */ val NotApplicable: typings.vsoNodeApi.policyInterfacesMod.PolicyEvaluationStatus.NotApplicable & Double = js.native
    
    /**
      * The policy is either queued to run, or is waiting for some event before progressing.
      */
    @js.native
    sealed trait Queued
      extends StObject
         with PolicyEvaluationStatus
    /* 0 */ val Queued: typings.vsoNodeApi.policyInterfacesMod.PolicyEvaluationStatus.Queued & Double = js.native
    
    /**
      * The policy has rejected this pull request.
      */
    @js.native
    sealed trait Rejected
      extends StObject
         with PolicyEvaluationStatus
    /* 3 */ val Rejected: typings.vsoNodeApi.policyInterfacesMod.PolicyEvaluationStatus.Rejected & Double = js.native
    
    /**
      * The policy is currently running.
      */
    @js.native
    sealed trait Running
      extends StObject
         with PolicyEvaluationStatus
    /* 1 */ val Running: typings.vsoNodeApi.policyInterfacesMod.PolicyEvaluationStatus.Running & Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/PolicyInterfaces", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/PolicyInterfaces", "TypeInfo.PolicyConfiguration")
    @js.native
    def PolicyConfiguration: js.Any = js.native
    @scala.inline
    def PolicyConfiguration_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PolicyConfiguration")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/PolicyInterfaces", "TypeInfo.PolicyEvaluationRecord")
    @js.native
    def PolicyEvaluationRecord: js.Any = js.native
    @scala.inline
    def PolicyEvaluationRecord_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PolicyEvaluationRecord")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/PolicyInterfaces", "TypeInfo.PolicyEvaluationStatus")
    @js.native
    def PolicyEvaluationStatus: EnumValuesBroken = js.native
    @scala.inline
    def PolicyEvaluationStatus_=(x: EnumValuesBroken): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PolicyEvaluationStatus")(x.asInstanceOf[js.Any])
  }
  
  trait PolicyConfiguration
    extends StObject
       with VersionedPolicyConfigurationRef {
    
    /**
      * The links to other objects related to this object.
      */
    var _links: js.Any
    
    /**
      * A reference to the identity that created the policy.
      */
    var createdBy: IdentityRef
    
    /**
      * The date and time when the policy was created.
      */
    var createdDate: Date
    
    /**
      * Indicates whether the policy is blocking.
      */
    var isBlocking: Boolean
    
    /**
      * Indicates whether the policy has been (soft) deleted.
      */
    var isDeleted: Boolean
    
    /**
      * Indicates whether the policy is enabled.
      */
    var isEnabled: Boolean
    
    /**
      * The policy configuration settings.
      */
    var settings: js.Any
  }
  object PolicyConfiguration {
    
    @scala.inline
    def apply(
      _links: js.Any,
      createdBy: IdentityRef,
      createdDate: Date,
      id: Double,
      isBlocking: Boolean,
      isDeleted: Boolean,
      isEnabled: Boolean,
      revision: Double,
      settings: js.Any,
      `type`: PolicyTypeRef,
      url: String
    ): PolicyConfiguration = {
      val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBlocking = isBlocking.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyConfiguration]
    }
    
    @scala.inline
    implicit class PolicyConfigurationMutableBuilder[Self <: PolicyConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBlocking(value: Boolean): Self = StObject.set(x, "isBlocking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettings(value: js.Any): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyConfigurationRef extends StObject {
    
    /**
      * The policy configuration ID.
      */
    var id: Double
    
    /**
      * The policy configuration type.
      */
    var `type`: PolicyTypeRef
    
    /**
      * The URL where the policy configuration can be retrieved.
      */
    var url: String
  }
  object PolicyConfigurationRef {
    
    @scala.inline
    def apply(id: Double, `type`: PolicyTypeRef, url: String): PolicyConfigurationRef = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyConfigurationRef]
    }
    
    @scala.inline
    implicit class PolicyConfigurationRefMutableBuilder[Self <: PolicyConfigurationRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PolicyTypeRef): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyEvaluationRecord extends StObject {
    
    /**
      * Links to other related objects
      */
    var _links: js.Any
    
    /**
      * A string which uniquely identifies the target of a policy evaluation.
      */
    var artifactId: String
    
    /**
      * Time when this policy finished evaluating on this pull request.
      */
    var completedDate: Date
    
    /**
      * Contains all configuration data for the policy which is being evaluated.
      */
    var configuration: PolicyConfiguration
    
    /**
      * Internal context data of this policy evaluation.
      */
    var context: js.Any
    
    /**
      * Guid which uniquely identifies this evaluation record (one policy running on one pull request).
      */
    var evaluationId: String
    
    /**
      * Time when this policy was first evaluated on this pull request.
      */
    var startedDate: Date
    
    /**
      * Status of the policy (Running, Approved, Failed, etc.)
      */
    var status: PolicyEvaluationStatus
  }
  object PolicyEvaluationRecord {
    
    @scala.inline
    def apply(
      _links: js.Any,
      artifactId: String,
      completedDate: Date,
      configuration: PolicyConfiguration,
      context: js.Any,
      evaluationId: String,
      startedDate: Date,
      status: PolicyEvaluationStatus
    ): PolicyEvaluationRecord = {
      val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], artifactId = artifactId.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], evaluationId = evaluationId.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyEvaluationRecord]
    }
    
    @scala.inline
    implicit class PolicyEvaluationRecordMutableBuilder[Self <: PolicyEvaluationRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtifactId(value: String): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletedDate(value: Date): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfiguration(value: PolicyConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvaluationId(value: String): Self = StObject.set(x, "evaluationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartedDate(value: Date): Self = StObject.set(x, "startedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: PolicyEvaluationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyType
    extends StObject
       with PolicyTypeRef {
    
    /**
      * The links to other objects related to this object.
      */
    var _links: js.Any
    
    /**
      * Detailed description of the policy type.
      */
    var description: String
  }
  object PolicyType {
    
    @scala.inline
    def apply(_links: js.Any, description: String, displayName: String, id: String, url: String): PolicyType = {
      val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyType]
    }
    
    @scala.inline
    implicit class PolicyTypeMutableBuilder[Self <: PolicyType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyTypeRef extends StObject {
    
    /**
      * Display name of the policy type.
      */
    var displayName: String
    
    /**
      * The policy type ID.
      */
    var id: String
    
    /**
      * The URL where the policy type can be retrieved.
      */
    var url: String
  }
  object PolicyTypeRef {
    
    @scala.inline
    def apply(displayName: String, id: String, url: String): PolicyTypeRef = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyTypeRef]
    }
    
    @scala.inline
    implicit class PolicyTypeRefMutableBuilder[Self <: PolicyTypeRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait VersionedPolicyConfigurationRef
    extends StObject
       with PolicyConfigurationRef {
    
    /**
      * The policy configuration revision ID.
      */
    var revision: Double
  }
  object VersionedPolicyConfigurationRef {
    
    @scala.inline
    def apply(id: Double, revision: Double, `type`: PolicyTypeRef, url: String): VersionedPolicyConfigurationRef = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VersionedPolicyConfigurationRef]
    }
    
    @scala.inline
    implicit class VersionedPolicyConfigurationRefMutableBuilder[Self <: VersionedPolicyConfigurationRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    }
  }
}
