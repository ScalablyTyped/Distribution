package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1ConfigurationMod {
  
  @JSImport("twilio/lib/rest/flexApi/v1/configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/flexApi/v1/configuration", "ConfigurationContext")
  @js.native
  open class ConfigurationContext protected () extends StObject {
    /**
      * Initialize the ConfigurationContext
      *
      * @param version - Version of the resource
      */
    def this(version: typings.twilio.flexApiV1Mod.^) = this()
    
    /**
      * create a ConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[ConfigurationInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ ConfigurationInstance, Any]): js.Promise[ConfigurationInstance] = js.native
    
    /**
      * fetch a ConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConfigurationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConfigurationInstance, Any]): js.Promise[ConfigurationInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConfigurationInstance, Any]
    ): js.Promise[ConfigurationInstance] = js.native
    def fetch(opts: ConfigurationInstanceFetchOptions): js.Promise[ConfigurationInstance] = js.native
    def fetch(
      opts: ConfigurationInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConfigurationInstance, Any]
    ): js.Promise[ConfigurationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConfigurationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConfigurationInstance, Any]): js.Promise[ConfigurationInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/flexApi/v1/configuration", "ConfigurationInstance")
  @js.native
  open class ConfigurationInstance protected () extends SerializableClass {
    /**
      * Initialize the ConfigurationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.flexApiV1Mod.^, payload: ConfigurationPayload) = this()
    
    /* private */ var _proxy: ConfigurationContext = js.native
    
    var accountSid: String = js.native
    
    var attributes: Any = js.native
    
    var callRecordingEnabled: Boolean = js.native
    
    var callRecordingWebhookUrl: String = js.native
    
    var channelConfigs: js.Array[js.Object] = js.native
    
    var chatServiceInstanceSid: String = js.native
    
    /**
      * create a ConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[ConfigurationInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConfigurationInstance] = js.native
    
    var crmAttributes: Any = js.native
    
    var crmCallbackUrl: String = js.native
    
    var crmEnabled: Boolean = js.native
    
    var crmFallbackUrl: String = js.native
    
    var crmType: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var debuggerIntegration: Any = js.native
    
    /**
      * fetch a ConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConfigurationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConfigurationInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConfigurationInstance] = js.native
    def fetch(opts: ConfigurationInstanceFetchOptions): js.Promise[ConfigurationInstance] = js.native
    def fetch(
      opts: ConfigurationInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ConfigurationInstance] = js.native
    
    var flexInsightsDrilldown: Boolean = js.native
    
    var flexInsightsHr: Any = js.native
    
    var flexServiceInstanceSid: String = js.native
    
    var flexUiStatusReport: Any = js.native
    
    var flexUrl: String = js.native
    
    var integrations: js.Array[js.Object] = js.native
    
    var markdown: Any = js.native
    
    var messagingServiceInstanceSid: String = js.native
    
    var notifications: Any = js.native
    
    var outboundCallFlows: Any = js.native
    
    var pluginServiceAttributes: Any = js.native
    
    var pluginServiceEnabled: Boolean = js.native
    
    var publicAttributes: Any = js.native
    
    var queueStatsConfiguration: Any = js.native
    
    var runtimeDomain: String = js.native
    
    var serverlessServiceSids: js.Array[String] = js.native
    
    var serviceVersion: String = js.native
    
    var status: ConfigurationStatus = js.native
    
    var taskrouterOfflineActivitySid: String = js.native
    
    var taskrouterSkills: js.Array[js.Object] = js.native
    
    var taskrouterTargetTaskqueueSid: String = js.native
    
    var taskrouterTargetWorkflowSid: String = js.native
    
    var taskrouterTaskqueues: js.Array[js.Object] = js.native
    
    var taskrouterWorkerAttributes: Any = js.native
    
    var taskrouterWorkerChannels: Any = js.native
    
    var taskrouterWorkspaceSid: String = js.native
    
    var uiAttributes: Any = js.native
    
    var uiDependencies: Any = js.native
    
    var uiLanguage: String = js.native
    
    var uiVersion: String = js.native
    
    /**
      * update a ConfigurationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConfigurationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConfigurationInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ConfigurationList
    *
    * @param version - Version of the resource
    */
  inline def ConfigurationList(version: typings.twilio.flexApiV1Mod.^): ConfigurationListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ConfigurationList")(version.asInstanceOf[js.Any]).asInstanceOf[ConfigurationListInstance]
  
  @JSImport("twilio/lib/rest/flexApi/v1/configuration", "ConfigurationPage")
  @js.native
  open class ConfigurationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.flexApiV1Mod.^, 
          ConfigurationPayload, 
          ConfigurationResource, 
          ConfigurationInstance
        ] {
    /**
      * Initialize the ConfigurationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.flexApiV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ConfigurationSolution
    ) = this()
    
    /**
      * Build an instance of ConfigurationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ConfigurationPayload): ConfigurationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property uiVersion - The Pinned UI version of the Configuration resource to fetch
    */
  trait ConfigurationInstanceFetchOptions extends StObject {
    
    var uiVersion: js.UndefOr[String] = js.undefined
  }
  object ConfigurationInstanceFetchOptions {
    
    inline def apply(): ConfigurationInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationInstanceFetchOptions]
    }
    
    extension [Self <: ConfigurationInstanceFetchOptions](x: Self) {
      
      inline def setUiVersion(value: String): Self = StObject.set(x, "uiVersion", value.asInstanceOf[js.Any])
      
      inline def setUiVersionUndefined: Self = StObject.set(x, "uiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ConfigurationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ConfigurationContext = js.native
    
    /**
      * Constructs a configuration
      */
    def get(): ConfigurationContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait ConfigurationPayload
    extends StObject
       with ConfigurationResource
       with TwilioResponsePayload
  object ConfigurationPayload {
    
    inline def apply(
      account_sid: String,
      attributes: js.Object,
      call_recording_enabled: Boolean,
      call_recording_webhook_url: String,
      channel_configs: js.Array[js.Object],
      chat_service_instance_sid: String,
      crm_attributes: js.Object,
      crm_callback_url: String,
      crm_enabled: Boolean,
      crm_fallback_url: String,
      crm_type: String,
      date_created: js.Date,
      date_updated: js.Date,
      debugger_integration: js.Object,
      first_page_uri: String,
      flex_insights_drilldown: Boolean,
      flex_insights_hr: js.Object,
      flex_service_instance_sid: String,
      flex_ui_status_report: js.Object,
      flex_url: String,
      integrations: js.Array[js.Object],
      markdown: js.Object,
      messaging_service_instance_sid: String,
      next_page_uri: String,
      notifications: js.Object,
      outbound_call_flows: js.Object,
      page: Double,
      page_size: Double,
      plugin_service_attributes: js.Object,
      plugin_service_enabled: Boolean,
      previous_page_uri: String,
      public_attributes: js.Object,
      queue_stats_configuration: js.Object,
      runtime_domain: String,
      serverless_service_sids: js.Array[String],
      service_version: String,
      status: ConfigurationStatus,
      taskrouter_offline_activity_sid: String,
      taskrouter_skills: js.Array[js.Object],
      taskrouter_target_taskqueue_sid: String,
      taskrouter_target_workflow_sid: String,
      taskrouter_taskqueues: js.Array[js.Object],
      taskrouter_worker_attributes: js.Object,
      taskrouter_worker_channels: js.Object,
      taskrouter_workspace_sid: String,
      ui_attributes: js.Object,
      ui_dependencies: js.Object,
      ui_language: String,
      ui_version: String,
      uri: String,
      url: String
    ): ConfigurationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], call_recording_enabled = call_recording_enabled.asInstanceOf[js.Any], call_recording_webhook_url = call_recording_webhook_url.asInstanceOf[js.Any], channel_configs = channel_configs.asInstanceOf[js.Any], chat_service_instance_sid = chat_service_instance_sid.asInstanceOf[js.Any], crm_attributes = crm_attributes.asInstanceOf[js.Any], crm_callback_url = crm_callback_url.asInstanceOf[js.Any], crm_enabled = crm_enabled.asInstanceOf[js.Any], crm_fallback_url = crm_fallback_url.asInstanceOf[js.Any], crm_type = crm_type.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], debugger_integration = debugger_integration.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], flex_insights_drilldown = flex_insights_drilldown.asInstanceOf[js.Any], flex_insights_hr = flex_insights_hr.asInstanceOf[js.Any], flex_service_instance_sid = flex_service_instance_sid.asInstanceOf[js.Any], flex_ui_status_report = flex_ui_status_report.asInstanceOf[js.Any], flex_url = flex_url.asInstanceOf[js.Any], integrations = integrations.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], messaging_service_instance_sid = messaging_service_instance_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], outbound_call_flows = outbound_call_flows.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], plugin_service_attributes = plugin_service_attributes.asInstanceOf[js.Any], plugin_service_enabled = plugin_service_enabled.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], public_attributes = public_attributes.asInstanceOf[js.Any], queue_stats_configuration = queue_stats_configuration.asInstanceOf[js.Any], runtime_domain = runtime_domain.asInstanceOf[js.Any], serverless_service_sids = serverless_service_sids.asInstanceOf[js.Any], service_version = service_version.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskrouter_offline_activity_sid = taskrouter_offline_activity_sid.asInstanceOf[js.Any], taskrouter_skills = taskrouter_skills.asInstanceOf[js.Any], taskrouter_target_taskqueue_sid = taskrouter_target_taskqueue_sid.asInstanceOf[js.Any], taskrouter_target_workflow_sid = taskrouter_target_workflow_sid.asInstanceOf[js.Any], taskrouter_taskqueues = taskrouter_taskqueues.asInstanceOf[js.Any], taskrouter_worker_attributes = taskrouter_worker_attributes.asInstanceOf[js.Any], taskrouter_worker_channels = taskrouter_worker_channels.asInstanceOf[js.Any], taskrouter_workspace_sid = taskrouter_workspace_sid.asInstanceOf[js.Any], ui_attributes = ui_attributes.asInstanceOf[js.Any], ui_dependencies = ui_dependencies.asInstanceOf[js.Any], ui_language = ui_language.asInstanceOf[js.Any], ui_version = ui_version.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationPayload]
    }
  }
  
  trait ConfigurationResource extends StObject {
    
    var account_sid: String
    
    var attributes: js.Object
    
    var call_recording_enabled: Boolean
    
    var call_recording_webhook_url: String
    
    var channel_configs: js.Array[js.Object]
    
    var chat_service_instance_sid: String
    
    var crm_attributes: js.Object
    
    var crm_callback_url: String
    
    var crm_enabled: Boolean
    
    var crm_fallback_url: String
    
    var crm_type: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var debugger_integration: js.Object
    
    var flex_insights_drilldown: Boolean
    
    var flex_insights_hr: js.Object
    
    var flex_service_instance_sid: String
    
    var flex_ui_status_report: js.Object
    
    var flex_url: String
    
    var integrations: js.Array[js.Object]
    
    var markdown: js.Object
    
    var messaging_service_instance_sid: String
    
    var notifications: js.Object
    
    var outbound_call_flows: js.Object
    
    var plugin_service_attributes: js.Object
    
    var plugin_service_enabled: Boolean
    
    var public_attributes: js.Object
    
    var queue_stats_configuration: js.Object
    
    var runtime_domain: String
    
    var serverless_service_sids: js.Array[String]
    
    var service_version: String
    
    var status: ConfigurationStatus
    
    var taskrouter_offline_activity_sid: String
    
    var taskrouter_skills: js.Array[js.Object]
    
    var taskrouter_target_taskqueue_sid: String
    
    var taskrouter_target_workflow_sid: String
    
    var taskrouter_taskqueues: js.Array[js.Object]
    
    var taskrouter_worker_attributes: js.Object
    
    var taskrouter_worker_channels: js.Object
    
    var taskrouter_workspace_sid: String
    
    var ui_attributes: js.Object
    
    var ui_dependencies: js.Object
    
    var ui_language: String
    
    var ui_version: String
    
    var url: String
  }
  object ConfigurationResource {
    
    inline def apply(
      account_sid: String,
      attributes: js.Object,
      call_recording_enabled: Boolean,
      call_recording_webhook_url: String,
      channel_configs: js.Array[js.Object],
      chat_service_instance_sid: String,
      crm_attributes: js.Object,
      crm_callback_url: String,
      crm_enabled: Boolean,
      crm_fallback_url: String,
      crm_type: String,
      date_created: js.Date,
      date_updated: js.Date,
      debugger_integration: js.Object,
      flex_insights_drilldown: Boolean,
      flex_insights_hr: js.Object,
      flex_service_instance_sid: String,
      flex_ui_status_report: js.Object,
      flex_url: String,
      integrations: js.Array[js.Object],
      markdown: js.Object,
      messaging_service_instance_sid: String,
      notifications: js.Object,
      outbound_call_flows: js.Object,
      plugin_service_attributes: js.Object,
      plugin_service_enabled: Boolean,
      public_attributes: js.Object,
      queue_stats_configuration: js.Object,
      runtime_domain: String,
      serverless_service_sids: js.Array[String],
      service_version: String,
      status: ConfigurationStatus,
      taskrouter_offline_activity_sid: String,
      taskrouter_skills: js.Array[js.Object],
      taskrouter_target_taskqueue_sid: String,
      taskrouter_target_workflow_sid: String,
      taskrouter_taskqueues: js.Array[js.Object],
      taskrouter_worker_attributes: js.Object,
      taskrouter_worker_channels: js.Object,
      taskrouter_workspace_sid: String,
      ui_attributes: js.Object,
      ui_dependencies: js.Object,
      ui_language: String,
      ui_version: String,
      url: String
    ): ConfigurationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], call_recording_enabled = call_recording_enabled.asInstanceOf[js.Any], call_recording_webhook_url = call_recording_webhook_url.asInstanceOf[js.Any], channel_configs = channel_configs.asInstanceOf[js.Any], chat_service_instance_sid = chat_service_instance_sid.asInstanceOf[js.Any], crm_attributes = crm_attributes.asInstanceOf[js.Any], crm_callback_url = crm_callback_url.asInstanceOf[js.Any], crm_enabled = crm_enabled.asInstanceOf[js.Any], crm_fallback_url = crm_fallback_url.asInstanceOf[js.Any], crm_type = crm_type.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], debugger_integration = debugger_integration.asInstanceOf[js.Any], flex_insights_drilldown = flex_insights_drilldown.asInstanceOf[js.Any], flex_insights_hr = flex_insights_hr.asInstanceOf[js.Any], flex_service_instance_sid = flex_service_instance_sid.asInstanceOf[js.Any], flex_ui_status_report = flex_ui_status_report.asInstanceOf[js.Any], flex_url = flex_url.asInstanceOf[js.Any], integrations = integrations.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], messaging_service_instance_sid = messaging_service_instance_sid.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], outbound_call_flows = outbound_call_flows.asInstanceOf[js.Any], plugin_service_attributes = plugin_service_attributes.asInstanceOf[js.Any], plugin_service_enabled = plugin_service_enabled.asInstanceOf[js.Any], public_attributes = public_attributes.asInstanceOf[js.Any], queue_stats_configuration = queue_stats_configuration.asInstanceOf[js.Any], runtime_domain = runtime_domain.asInstanceOf[js.Any], serverless_service_sids = serverless_service_sids.asInstanceOf[js.Any], service_version = service_version.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskrouter_offline_activity_sid = taskrouter_offline_activity_sid.asInstanceOf[js.Any], taskrouter_skills = taskrouter_skills.asInstanceOf[js.Any], taskrouter_target_taskqueue_sid = taskrouter_target_taskqueue_sid.asInstanceOf[js.Any], taskrouter_target_workflow_sid = taskrouter_target_workflow_sid.asInstanceOf[js.Any], taskrouter_taskqueues = taskrouter_taskqueues.asInstanceOf[js.Any], taskrouter_worker_attributes = taskrouter_worker_attributes.asInstanceOf[js.Any], taskrouter_worker_channels = taskrouter_worker_channels.asInstanceOf[js.Any], taskrouter_workspace_sid = taskrouter_workspace_sid.asInstanceOf[js.Any], ui_attributes = ui_attributes.asInstanceOf[js.Any], ui_dependencies = ui_dependencies.asInstanceOf[js.Any], ui_language = ui_language.asInstanceOf[js.Any], ui_version = ui_version.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationResource]
    }
    
    extension [Self <: ConfigurationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setCall_recording_enabled(value: Boolean): Self = StObject.set(x, "call_recording_enabled", value.asInstanceOf[js.Any])
      
      inline def setCall_recording_webhook_url(value: String): Self = StObject.set(x, "call_recording_webhook_url", value.asInstanceOf[js.Any])
      
      inline def setChannel_configs(value: js.Array[js.Object]): Self = StObject.set(x, "channel_configs", value.asInstanceOf[js.Any])
      
      inline def setChannel_configsVarargs(value: js.Object*): Self = StObject.set(x, "channel_configs", js.Array(value*))
      
      inline def setChat_service_instance_sid(value: String): Self = StObject.set(x, "chat_service_instance_sid", value.asInstanceOf[js.Any])
      
      inline def setCrm_attributes(value: js.Object): Self = StObject.set(x, "crm_attributes", value.asInstanceOf[js.Any])
      
      inline def setCrm_callback_url(value: String): Self = StObject.set(x, "crm_callback_url", value.asInstanceOf[js.Any])
      
      inline def setCrm_enabled(value: Boolean): Self = StObject.set(x, "crm_enabled", value.asInstanceOf[js.Any])
      
      inline def setCrm_fallback_url(value: String): Self = StObject.set(x, "crm_fallback_url", value.asInstanceOf[js.Any])
      
      inline def setCrm_type(value: String): Self = StObject.set(x, "crm_type", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDebugger_integration(value: js.Object): Self = StObject.set(x, "debugger_integration", value.asInstanceOf[js.Any])
      
      inline def setFlex_insights_drilldown(value: Boolean): Self = StObject.set(x, "flex_insights_drilldown", value.asInstanceOf[js.Any])
      
      inline def setFlex_insights_hr(value: js.Object): Self = StObject.set(x, "flex_insights_hr", value.asInstanceOf[js.Any])
      
      inline def setFlex_service_instance_sid(value: String): Self = StObject.set(x, "flex_service_instance_sid", value.asInstanceOf[js.Any])
      
      inline def setFlex_ui_status_report(value: js.Object): Self = StObject.set(x, "flex_ui_status_report", value.asInstanceOf[js.Any])
      
      inline def setFlex_url(value: String): Self = StObject.set(x, "flex_url", value.asInstanceOf[js.Any])
      
      inline def setIntegrations(value: js.Array[js.Object]): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsVarargs(value: js.Object*): Self = StObject.set(x, "integrations", js.Array(value*))
      
      inline def setMarkdown(value: js.Object): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      inline def setMessaging_service_instance_sid(value: String): Self = StObject.set(x, "messaging_service_instance_sid", value.asInstanceOf[js.Any])
      
      inline def setNotifications(value: js.Object): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setOutbound_call_flows(value: js.Object): Self = StObject.set(x, "outbound_call_flows", value.asInstanceOf[js.Any])
      
      inline def setPlugin_service_attributes(value: js.Object): Self = StObject.set(x, "plugin_service_attributes", value.asInstanceOf[js.Any])
      
      inline def setPlugin_service_enabled(value: Boolean): Self = StObject.set(x, "plugin_service_enabled", value.asInstanceOf[js.Any])
      
      inline def setPublic_attributes(value: js.Object): Self = StObject.set(x, "public_attributes", value.asInstanceOf[js.Any])
      
      inline def setQueue_stats_configuration(value: js.Object): Self = StObject.set(x, "queue_stats_configuration", value.asInstanceOf[js.Any])
      
      inline def setRuntime_domain(value: String): Self = StObject.set(x, "runtime_domain", value.asInstanceOf[js.Any])
      
      inline def setServerless_service_sids(value: js.Array[String]): Self = StObject.set(x, "serverless_service_sids", value.asInstanceOf[js.Any])
      
      inline def setServerless_service_sidsVarargs(value: String*): Self = StObject.set(x, "serverless_service_sids", js.Array(value*))
      
      inline def setService_version(value: String): Self = StObject.set(x, "service_version", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ConfigurationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTaskrouter_offline_activity_sid(value: String): Self = StObject.set(x, "taskrouter_offline_activity_sid", value.asInstanceOf[js.Any])
      
      inline def setTaskrouter_skills(value: js.Array[js.Object]): Self = StObject.set(x, "taskrouter_skills", value.asInstanceOf[js.Any])
      
      inline def setTaskrouter_skillsVarargs(value: js.Object*): Self = StObject.set(x, "taskrouter_skills", js.Array(value*))
      
      inline def setTaskrouter_target_taskqueue_sid(value: String): Self = StObject.set(x, "taskrouter_target_taskqueue_sid", value.asInstanceOf[js.Any])
      
      inline def setTaskrouter_target_workflow_sid(value: String): Self = StObject.set(x, "taskrouter_target_workflow_sid", value.asInstanceOf[js.Any])
      
      inline def setTaskrouter_taskqueues(value: js.Array[js.Object]): Self = StObject.set(x, "taskrouter_taskqueues", value.asInstanceOf[js.Any])
      
      inline def setTaskrouter_taskqueuesVarargs(value: js.Object*): Self = StObject.set(x, "taskrouter_taskqueues", js.Array(value*))
      
      inline def setTaskrouter_worker_attributes(value: js.Object): Self = StObject.set(x, "taskrouter_worker_attributes", value.asInstanceOf[js.Any])
      
      inline def setTaskrouter_worker_channels(value: js.Object): Self = StObject.set(x, "taskrouter_worker_channels", value.asInstanceOf[js.Any])
      
      inline def setTaskrouter_workspace_sid(value: String): Self = StObject.set(x, "taskrouter_workspace_sid", value.asInstanceOf[js.Any])
      
      inline def setUi_attributes(value: js.Object): Self = StObject.set(x, "ui_attributes", value.asInstanceOf[js.Any])
      
      inline def setUi_dependencies(value: js.Object): Self = StObject.set(x, "ui_dependencies", value.asInstanceOf[js.Any])
      
      inline def setUi_language(value: String): Self = StObject.set(x, "ui_language", value.asInstanceOf[js.Any])
      
      inline def setUi_version(value: String): Self = StObject.set(x, "ui_version", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigurationSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.ok
    - typings.twilio.twilioStrings.inprogress
    - typings.twilio.twilioStrings.notstarted
  */
  trait ConfigurationStatus extends StObject
  object ConfigurationStatus {
    
    inline def inprogress: typings.twilio.twilioStrings.inprogress = "inprogress".asInstanceOf[typings.twilio.twilioStrings.inprogress]
    
    inline def notstarted: typings.twilio.twilioStrings.notstarted = "notstarted".asInstanceOf[typings.twilio.twilioStrings.notstarted]
    
    inline def ok: typings.twilio.twilioStrings.ok = "ok".asInstanceOf[typings.twilio.twilioStrings.ok]
  }
}
