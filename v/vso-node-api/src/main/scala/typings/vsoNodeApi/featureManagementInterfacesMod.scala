package typings.vsoNodeApi

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.anon.EnumValuesEnabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureManagementInterfacesMod {
  
  @js.native
  sealed trait ContributedFeatureEnabledValue extends StObject
  @JSImport("vso-node-api/interfaces/FeatureManagementInterfaces", "ContributedFeatureEnabledValue")
  @js.native
  object ContributedFeatureEnabledValue extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContributedFeatureEnabledValue with Double] = js.native
    
    /**
      * The feature is disabled at the specified scope
      */
    @js.native
    sealed trait Disabled extends ContributedFeatureEnabledValue
    /* 0 */ val Disabled: typings.vsoNodeApi.featureManagementInterfacesMod.ContributedFeatureEnabledValue.Disabled with Double = js.native
    
    /**
      * The feature is enabled at the specified scope
      */
    @js.native
    sealed trait Enabled extends ContributedFeatureEnabledValue
    /* 1 */ val Enabled: typings.vsoNodeApi.featureManagementInterfacesMod.ContributedFeatureEnabledValue.Enabled with Double = js.native
    
    /**
      * The state of the feature is not set for the specified scope
      */
    @js.native
    sealed trait Undefined extends ContributedFeatureEnabledValue
    /* -1 */ val Undefined: typings.vsoNodeApi.featureManagementInterfacesMod.ContributedFeatureEnabledValue.Undefined with Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/FeatureManagementInterfaces", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/FeatureManagementInterfaces", "TypeInfo.ContributedFeatureEnabledValue")
    @js.native
    def ContributedFeatureEnabledValue: EnumValuesEnabled = js.native
    @scala.inline
    def ContributedFeatureEnabledValue_=(x: EnumValuesEnabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContributedFeatureEnabledValue")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/FeatureManagementInterfaces", "TypeInfo.ContributedFeatureState")
    @js.native
    def ContributedFeatureState: js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/FeatureManagementInterfaces", "TypeInfo.ContributedFeatureStateQuery")
    @js.native
    def ContributedFeatureStateQuery: js.Any = js.native
    @scala.inline
    def ContributedFeatureStateQuery_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContributedFeatureStateQuery")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ContributedFeatureState_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContributedFeatureState")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ContributedFeature extends StObject {
    
    /**
      * Named links describing the feature
      */
    var _links: js.Any = js.native
    
    /**
      * If true, the feature is enabled unless overridden at some scope
      */
    var defaultState: Boolean = js.native
    
    /**
      * Rules for setting the default value if not specified by any setting/scope. Evaluated in order until a rule returns an Enabled or Disabled state (not Undefined)
      */
    var defaultValueRules: js.Array[ContributedFeatureValueRule] = js.native
    
    /**
      * The description of the feature
      */
    var description: String = js.native
    
    /**
      * The full contribution id of the feature
      */
    var id: String = js.native
    
    /**
      * The friendly name of the feature
      */
    var name: String = js.native
    
    /**
      * Rules for overriding a feature value. These rules are run before explicit user/host state values are checked. They are evaluated in order until a rule returns an Enabled or Disabled state (not Undefined)
      */
    var overrideRules: js.Array[ContributedFeatureValueRule] = js.native
    
    /**
      * The scopes/levels at which settings can set the enabled/disabled state of this feature
      */
    var scopes: js.Array[ContributedFeatureSettingScope] = js.native
    
    /**
      * The service instance id of the service that owns this feature
      */
    var serviceInstanceType: String = js.native
  }
  object ContributedFeature {
    
    @scala.inline
    def apply(
      _links: js.Any,
      defaultState: Boolean,
      defaultValueRules: js.Array[ContributedFeatureValueRule],
      description: String,
      id: String,
      name: String,
      overrideRules: js.Array[ContributedFeatureValueRule],
      scopes: js.Array[ContributedFeatureSettingScope],
      serviceInstanceType: String
    ): ContributedFeature = {
      val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], defaultState = defaultState.asInstanceOf[js.Any], defaultValueRules = defaultValueRules.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overrideRules = overrideRules.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], serviceInstanceType = serviceInstanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContributedFeature]
    }
    
    @scala.inline
    implicit class ContributedFeatureMutableBuilder[Self <: ContributedFeature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultState(value: Boolean): Self = StObject.set(x, "defaultState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueRules(value: js.Array[ContributedFeatureValueRule]): Self = StObject.set(x, "defaultValueRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueRulesVarargs(value: ContributedFeatureValueRule*): Self = StObject.set(x, "defaultValueRules", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideRules(value: js.Array[ContributedFeatureValueRule]): Self = StObject.set(x, "overrideRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideRulesVarargs(value: ContributedFeatureValueRule*): Self = StObject.set(x, "overrideRules", js.Array(value :_*))
      
      @scala.inline
      def setScopes(value: js.Array[ContributedFeatureSettingScope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesVarargs(value: ContributedFeatureSettingScope*): Self = StObject.set(x, "scopes", js.Array(value :_*))
      
      @scala.inline
      def setServiceInstanceType(value: String): Self = StObject.set(x, "serviceInstanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContributedFeatureSettingScope extends StObject {
    
    /**
      * The name of the settings scope to use when reading/writing the setting
      */
    var settingScope: String = js.native
    
    /**
      * Whether this is a user-scope or this is a host-wide (all users) setting
      */
    var userScoped: Boolean = js.native
  }
  object ContributedFeatureSettingScope {
    
    @scala.inline
    def apply(settingScope: String, userScoped: Boolean): ContributedFeatureSettingScope = {
      val __obj = js.Dynamic.literal(settingScope = settingScope.asInstanceOf[js.Any], userScoped = userScoped.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContributedFeatureSettingScope]
    }
    
    @scala.inline
    implicit class ContributedFeatureSettingScopeMutableBuilder[Self <: ContributedFeatureSettingScope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSettingScope(value: String): Self = StObject.set(x, "settingScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserScoped(value: Boolean): Self = StObject.set(x, "userScoped", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContributedFeatureState extends StObject {
    
    /**
      * The full contribution id of the feature
      */
    var featureId: String = js.native
    
    /**
      * True if the effective state was set by an override rule (indicating that the state cannot be managed by the end user)
      */
    var overridden: Boolean = js.native
    
    /**
      * Reason that the state was set (by a plugin/rule).
      */
    var reason: String = js.native
    
    /**
      * The scope at which this state applies
      */
    var scope: ContributedFeatureSettingScope = js.native
    
    /**
      * The current state of this feature
      */
    var state: ContributedFeatureEnabledValue = js.native
  }
  object ContributedFeatureState {
    
    @scala.inline
    def apply(
      featureId: String,
      overridden: Boolean,
      reason: String,
      scope: ContributedFeatureSettingScope,
      state: ContributedFeatureEnabledValue
    ): ContributedFeatureState = {
      val __obj = js.Dynamic.literal(featureId = featureId.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContributedFeatureState]
    }
    
    @scala.inline
    implicit class ContributedFeatureStateMutableBuilder[Self <: ContributedFeatureState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureId(value: String): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridden(value: Boolean): Self = StObject.set(x, "overridden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: ContributedFeatureSettingScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: ContributedFeatureEnabledValue): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContributedFeatureStateQuery extends StObject {
    
    /**
      * The list of feature ids to query
      */
    var featureIds: js.Array[String] = js.native
    
    /**
      * The query result containing the current feature states for each of the queried feature ids
      */
    var featureStates: StringDictionary[ContributedFeatureState] = js.native
    
    /**
      * A dictionary of scope values (project name, etc.) to use in the query (if querying across scopes)
      */
    var scopeValues: StringDictionary[String] = js.native
  }
  object ContributedFeatureStateQuery {
    
    @scala.inline
    def apply(
      featureIds: js.Array[String],
      featureStates: StringDictionary[ContributedFeatureState],
      scopeValues: StringDictionary[String]
    ): ContributedFeatureStateQuery = {
      val __obj = js.Dynamic.literal(featureIds = featureIds.asInstanceOf[js.Any], featureStates = featureStates.asInstanceOf[js.Any], scopeValues = scopeValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContributedFeatureStateQuery]
    }
    
    @scala.inline
    implicit class ContributedFeatureStateQueryMutableBuilder[Self <: ContributedFeatureStateQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureIds(value: js.Array[String]): Self = StObject.set(x, "featureIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureIdsVarargs(value: String*): Self = StObject.set(x, "featureIds", js.Array(value :_*))
      
      @scala.inline
      def setFeatureStates(value: StringDictionary[ContributedFeatureState]): Self = StObject.set(x, "featureStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeValues(value: StringDictionary[String]): Self = StObject.set(x, "scopeValues", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContributedFeatureValueRule extends StObject {
    
    /**
      * Name of the IContributedFeatureValuePlugin to run
      */
    var name: String = js.native
    
    /**
      * Properties to feed to the IContributedFeatureValuePlugin
      */
    var properties: StringDictionary[js.Any] = js.native
  }
  object ContributedFeatureValueRule {
    
    @scala.inline
    def apply(name: String, properties: StringDictionary[js.Any]): ContributedFeatureValueRule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContributedFeatureValueRule]
    }
    
    @scala.inline
    implicit class ContributedFeatureValueRuleMutableBuilder[Self <: ContributedFeatureValueRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
}
