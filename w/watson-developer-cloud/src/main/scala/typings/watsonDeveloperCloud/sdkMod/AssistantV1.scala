package typings.watsonDeveloperCloud.sdkMod

import typings.watsonDeveloperCloud.assistantV1Mod.Options
import typings.watsonDeveloperCloud.assistantV1Mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The IBM Watson&trade; Assistant service combines machine learning, natural language understanding, and integrated dialog tools to create conversation flows between your apps and your users.
  */
@JSImport("watson-developer-cloud/sdk", "AssistantV1")
@js.native
open class AssistantV1 protected () extends ^ {
  /**
    * Construct a AssistantV1 object.
    *
    * @param {Object} options - Options for the service.
    * @param {string} options.version - The API version date to use with the service, in "YYYY-MM-DD" format. Whenever the API is changed in a backwards incompatible way, a new minor version of the API is released. The service uses the API version for the date you specify, or the most recent version before that date. Note that you should not programmatically specify the current date at runtime, in case the API has been updated since your application's release. Instead, specify a version date that is compatible with your application, and don't change it until your application is ready for a later version.
    * @param {string} [options.url] - The base url to use when contacting the service (e.g. 'https://gateway.watsonplatform.net/assistant/api'). The base url may differ between Bluemix regions.
    * @param {string} [options.username] - The username used to authenticate with the service. Username and password credentials are only required to run your application locally or outside of Bluemix. When running on Bluemix, the credentials will be automatically loaded from the `VCAP_SERVICES` environment variable.
    * @param {string} [options.password] - The password used to authenticate with the service. Username and password credentials are only required to run your application locally or outside of Bluemix. When running on Bluemix, the credentials will be automatically loaded from the `VCAP_SERVICES` environment variable.
    * @param {string} [options.iam_access_token] - An IAM access token fully managed by the application. Responsibility falls on the application to refresh the token, either before it expires or reactively upon receiving a 401 from the service, as any requests made with an expired token will fail.
    * @param {string} [options.iam_apikey] - An API key that can be used to request IAM tokens. If this API key is provided, the SDK will manage the token and handle the refreshing.
    * @param {string} [options.iam_url] - An optional URL for the IAM service API. Defaults to 'https://iam.bluemix.net/identity/token'.
    * @param {boolean} [options.use_unauthenticated] - Set to `true` to avoid including an authorization header. This option may be useful for requests that are proxied.
    * @param {Object} [options.headers] - Default headers that shall be included with every request to the service.
    * @param {boolean} [options.headers.X-Watson-Learning-Opt-Out] - Set to `true` to opt-out of data collection. By default, all IBM Watson services log requests and their results. Logging is done only to improve the services for future users. The logged data is not shared or made public. If you are concerned with protecting the privacy of users' personal information or otherwise do not want your requests to be logged, you can opt out of logging.
    * @constructor
    * @returns {AssistantV1}
    * @throws {Error}
    */
  def this(options: Options) = this()
}
object AssistantV1 {
  
  @JSImport("watson-developer-cloud/sdk", "AssistantV1")
  @js.native
  val ^ : js.Any = js.native
  
  /** Constants for the `createDialogNode` operation. */
  object CreateDialogNodeConstants {
    
    /** Whether this top-level dialog node can be digressed into. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateDialogNodeConstants.DigressIn")
    @js.native
    object DigressIn extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressIn & String
          ] = js.native
      
      /* "does_not_return" */ val DOES_NOT_RETURN: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressIn.DOES_NOT_RETURN & String = js.native
      
      /* "not_available" */ val NOT_AVAILABLE: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressIn.NOT_AVAILABLE & String = js.native
      
      /* "returns" */ val RETURNS: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressIn.RETURNS & String = js.native
    }
    
    /** Whether this dialog node can be returned to after a digression. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateDialogNodeConstants.DigressOut")
    @js.native
    object DigressOut extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOut & String
          ] = js.native
      
      /* "allow_all" */ val ALLOW_ALL: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL & String = js.native
      
      /* "allow_all_never_return" */ val ALLOW_ALL_NEVER_RETURN: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL_NEVER_RETURN & String = js.native
      
      /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOut.ALLOW_RETURNING & String = js.native
    }
    
    /** Whether the user can digress to top-level nodes while filling out slots. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateDialogNodeConstants.DigressOutSlots")
    @js.native
    object DigressOutSlots extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOutSlots & String
          ] = js.native
      
      /* "allow_all" */ val ALLOW_ALL: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOutSlots.ALLOW_ALL & String = js.native
      
      /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOutSlots.ALLOW_RETURNING & String = js.native
      
      /* "not_allowed" */ val NOT_ALLOWED: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.DigressOutSlots.NOT_ALLOWED & String = js.native
    }
    
    /** How an `event_handler` node is processed. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateDialogNodeConstants.EventName")
    @js.native
    object EventName extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName & String
          ] = js.native
      
      /* "digression_return_prompt" */ val DIGRESSION_RETURN_PROMPT: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.DIGRESSION_RETURN_PROMPT & String = js.native
      
      /* "filled" */ val FILLED: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.FILLED & String = js.native
      
      /* "filled_multiple" */ val FILLED_MULTIPLE: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.FILLED_MULTIPLE & String = js.native
      
      /* "focus" */ val FOCUS: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.FOCUS & String = js.native
      
      /* "generic" */ val GENERIC: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.GENERIC & String = js.native
      
      /* "input" */ val INPUT: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.INPUT & String = js.native
      
      /* "nomatch" */ val NOMATCH: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.NOMATCH & String = js.native
      
      /* "nomatch_responses_depleted" */ val NOMATCH_RESPONSES_DEPLETED: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.NOMATCH_RESPONSES_DEPLETED & String = js.native
      
      /* "validate" */ val VALIDATE: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.EventName.VALIDATE & String = js.native
    }
    
    /** How the dialog node is processed. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateDialogNodeConstants.NodeType")
    @js.native
    object NodeType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType & String
          ] = js.native
      
      /* "event_handler" */ val EVENT_HANDLER: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType.EVENT_HANDLER & String = js.native
      
      /* "folder" */ val FOLDER: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType.FOLDER & String = js.native
      
      /* "frame" */ val FRAME: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType.FRAME & String = js.native
      
      /* "response_condition" */ val RESPONSE_CONDITION: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType.RESPONSE_CONDITION & String = js.native
      
      /* "slot" */ val SLOT: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType.SLOT & String = js.native
      
      /* "standard" */ val STANDARD: typings.watsonDeveloperCloud.assistantV1Mod.CreateDialogNodeConstants.NodeType.STANDARD & String = js.native
    }
  }
  
  /** Constants for the `createValue` operation. */
  object CreateValueConstants {
    
    /** Specifies the type of entity value. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateValueConstants.ValueType")
    @js.native
    object ValueType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.CreateValueConstants.ValueType & String
          ] = js.native
      
      /* "patterns" */ val PATTERNS: typings.watsonDeveloperCloud.assistantV1Mod.CreateValueConstants.ValueType.PATTERNS & String = js.native
      
      /* "synonyms" */ val SYNONYMS: typings.watsonDeveloperCloud.assistantV1Mod.CreateValueConstants.ValueType.SYNONYMS & String = js.native
    }
  }
  
  /** Constants for the `getWorkspace` operation. */
  object GetWorkspaceConstants {
    
    /** Indicates how the returned workspace data will be sorted. This parameter is valid only if **export**=`true`. Specify `sort=stable` to sort all workspace objects by unique identifier, in ascending alphabetical order. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.GetWorkspaceConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.assistantV1Mod.GetWorkspaceConstants.Sort & String] = js.native
      
      /* "stable" */ val STABLE: typings.watsonDeveloperCloud.assistantV1Mod.GetWorkspaceConstants.Sort.STABLE & String = js.native
    }
  }
  
  /** Constants for the `listCounterexamples` operation. */
  object ListCounterexamplesConstants {
    
    /** The attribute by which returned counterexamples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListCounterexamplesConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.ListCounterexamplesConstants.Sort & String
          ] = js.native
      
      /* "text" */ val TEXT: typings.watsonDeveloperCloud.assistantV1Mod.ListCounterexamplesConstants.Sort.TEXT & String = js.native
      
      /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.assistantV1Mod.ListCounterexamplesConstants.Sort.UPDATED & String = js.native
    }
  }
  
  /** Constants for the `listDialogNodes` operation. */
  object ListDialogNodesConstants {
    
    /** The attribute by which returned dialog nodes will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListDialogNodesConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.ListDialogNodesConstants.Sort & String
          ] = js.native
      
      /* "dialog_node" */ val DIALOG_NODE: typings.watsonDeveloperCloud.assistantV1Mod.ListDialogNodesConstants.Sort.DIALOG_NODE & String = js.native
      
      /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.assistantV1Mod.ListDialogNodesConstants.Sort.UPDATED & String = js.native
    }
  }
  
  /** Constants for the `listEntities` operation. */
  object ListEntitiesConstants {
    
    /** The attribute by which returned entities will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListEntitiesConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.assistantV1Mod.ListEntitiesConstants.Sort & String] = js.native
      
      /* "entity" */ val ENTITY: typings.watsonDeveloperCloud.assistantV1Mod.ListEntitiesConstants.Sort.ENTITY & String = js.native
      
      /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.assistantV1Mod.ListEntitiesConstants.Sort.UPDATED & String = js.native
    }
  }
  
  /** Constants for the `listExamples` operation. */
  object ListExamplesConstants {
    
    /** The attribute by which returned examples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListExamplesConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.assistantV1Mod.ListExamplesConstants.Sort & String] = js.native
      
      /* "text" */ val TEXT: typings.watsonDeveloperCloud.assistantV1Mod.ListExamplesConstants.Sort.TEXT & String = js.native
      
      /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.assistantV1Mod.ListExamplesConstants.Sort.UPDATED & String = js.native
    }
  }
  
  /** Constants for the `listIntents` operation. */
  object ListIntentsConstants {
    
    /** The attribute by which returned intents will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListIntentsConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.assistantV1Mod.ListIntentsConstants.Sort & String] = js.native
      
      /* "intent" */ val INTENT: typings.watsonDeveloperCloud.assistantV1Mod.ListIntentsConstants.Sort.INTENT & String = js.native
      
      /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.assistantV1Mod.ListIntentsConstants.Sort.UPDATED & String = js.native
    }
  }
  
  /** Constants for the `listSynonyms` operation. */
  object ListSynonymsConstants {
    
    /** The attribute by which returned entity value synonyms will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListSynonymsConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.assistantV1Mod.ListSynonymsConstants.Sort & String] = js.native
      
      /* "synonym" */ val SYNONYM: typings.watsonDeveloperCloud.assistantV1Mod.ListSynonymsConstants.Sort.SYNONYM & String = js.native
      
      /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.assistantV1Mod.ListSynonymsConstants.Sort.UPDATED & String = js.native
    }
  }
  
  /** Constants for the `listValues` operation. */
  object ListValuesConstants {
    
    /** The attribute by which returned entity values will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListValuesConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.assistantV1Mod.ListValuesConstants.Sort & String] = js.native
      
      /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.assistantV1Mod.ListValuesConstants.Sort.UPDATED & String = js.native
      
      /* "value" */ val VALUE: typings.watsonDeveloperCloud.assistantV1Mod.ListValuesConstants.Sort.VALUE & String = js.native
    }
  }
  
  /** Constants for the `listWorkspaces` operation. */
  object ListWorkspacesConstants {
    
    /** The attribute by which returned workspaces will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListWorkspacesConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.ListWorkspacesConstants.Sort & String
          ] = js.native
      
      /* "name" */ val NAME: typings.watsonDeveloperCloud.assistantV1Mod.ListWorkspacesConstants.Sort.NAME & String = js.native
      
      /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.assistantV1Mod.ListWorkspacesConstants.Sort.UPDATED & String = js.native
    }
  }
  
  /* static member */
  @JSImport("watson-developer-cloud/sdk", "AssistantV1.URL")
  @js.native
  def URL: String = js.native
  inline def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
  
  /** Constants for the `updateDialogNode` operation. */
  object UpdateDialogNodeConstants {
    
    /** Whether this top-level dialog node can be digressed into. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.UpdateDialogNodeConstants.DigressIn")
    @js.native
    object DigressIn extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressIn & String
          ] = js.native
      
      /* "does_not_return" */ val DOES_NOT_RETURN: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressIn.DOES_NOT_RETURN & String = js.native
      
      /* "not_available" */ val NOT_AVAILABLE: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressIn.NOT_AVAILABLE & String = js.native
      
      /* "returns" */ val RETURNS: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressIn.RETURNS & String = js.native
    }
    
    /** Whether this dialog node can be returned to after a digression. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.UpdateDialogNodeConstants.DigressOut")
    @js.native
    object DigressOut extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOut & String
          ] = js.native
      
      /* "allow_all" */ val ALLOW_ALL: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOut.ALLOW_ALL & String = js.native
      
      /* "allow_all_never_return" */ val ALLOW_ALL_NEVER_RETURN: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOut.ALLOW_ALL_NEVER_RETURN & String = js.native
      
      /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOut.ALLOW_RETURNING & String = js.native
    }
    
    /** Whether the user can digress to top-level nodes while filling out slots. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.UpdateDialogNodeConstants.DigressOutSlots")
    @js.native
    object DigressOutSlots extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOutSlots & String
          ] = js.native
      
      /* "allow_all" */ val ALLOW_ALL: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOutSlots.ALLOW_ALL & String = js.native
      
      /* "allow_returning" */ val ALLOW_RETURNING: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOutSlots.ALLOW_RETURNING & String = js.native
      
      /* "not_allowed" */ val NOT_ALLOWED: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.DigressOutSlots.NOT_ALLOWED & String = js.native
    }
    
    /** How an `event_handler` node is processed. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.UpdateDialogNodeConstants.EventName")
    @js.native
    object EventName extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName & String
          ] = js.native
      
      /* "digression_return_prompt" */ val DIGRESSION_RETURN_PROMPT: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.DIGRESSION_RETURN_PROMPT & String = js.native
      
      /* "filled" */ val FILLED: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.FILLED & String = js.native
      
      /* "filled_multiple" */ val FILLED_MULTIPLE: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.FILLED_MULTIPLE & String = js.native
      
      /* "focus" */ val FOCUS: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.FOCUS & String = js.native
      
      /* "generic" */ val GENERIC: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.GENERIC & String = js.native
      
      /* "input" */ val INPUT: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.INPUT & String = js.native
      
      /* "nomatch" */ val NOMATCH: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.NOMATCH & String = js.native
      
      /* "nomatch_responses_depleted" */ val NOMATCH_RESPONSES_DEPLETED: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.NOMATCH_RESPONSES_DEPLETED & String = js.native
      
      /* "validate" */ val VALIDATE: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.EventName.VALIDATE & String = js.native
    }
    
    /** How the dialog node is processed. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.UpdateDialogNodeConstants.NodeType")
    @js.native
    object NodeType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType & String
          ] = js.native
      
      /* "event_handler" */ val EVENT_HANDLER: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.EVENT_HANDLER & String = js.native
      
      /* "folder" */ val FOLDER: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.FOLDER & String = js.native
      
      /* "frame" */ val FRAME: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.FRAME & String = js.native
      
      /* "response_condition" */ val RESPONSE_CONDITION: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.RESPONSE_CONDITION & String = js.native
      
      /* "slot" */ val SLOT: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.SLOT & String = js.native
      
      /* "standard" */ val STANDARD: typings.watsonDeveloperCloud.assistantV1Mod.UpdateDialogNodeConstants.NodeType.STANDARD & String = js.native
    }
  }
  
  /** Constants for the `updateValue` operation. */
  object UpdateValueConstants {
    
    /** Specifies the type of entity value. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.UpdateValueConstants.ValueType")
    @js.native
    object ValueType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.assistantV1Mod.UpdateValueConstants.ValueType & String
          ] = js.native
      
      /* "patterns" */ val PATTERNS: typings.watsonDeveloperCloud.assistantV1Mod.UpdateValueConstants.ValueType.PATTERNS & String = js.native
      
      /* "synonyms" */ val SYNONYMS: typings.watsonDeveloperCloud.assistantV1Mod.UpdateValueConstants.ValueType.SYNONYMS & String = js.native
    }
  }
}
