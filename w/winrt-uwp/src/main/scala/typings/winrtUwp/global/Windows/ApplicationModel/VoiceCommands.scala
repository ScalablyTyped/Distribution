package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceTriggerDetails
import typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason
import typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for handling voice commands in Cortana, entered by speech or text, to access features and functionality from a background app. When an app handles a voice command in the background it can display feedback on the Cortana canvas and communicate with the user using the Cortana voice. */
object VoiceCommands {
  
  /** The command given to Cortana, using either speech or text, and routed to a background app. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommand")
  @js.native
  abstract class VoiceCommand ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommand {
    
    /** Gets the value of the Name attribute for the Command element declared in the Voice Command Definition (VCD) file. */
    /* CompleteClass */
    var commandName: String = js.native
    
    /** Gets a dictionary containing the semantic properties of the recognized phrase in the voice command. */
    /* CompleteClass */
    var properties: IMapView[String, IVectorView[js.Any]] = js.native
    
    /** Gets the SpeechRecognitionResult object representing the results returned by the voice command. */
    /* CompleteClass */
    var speechRecognitionResult: SpeechRecognitionResult = js.native
  }
  
  /** Contains event data for the VoiceCommandCompleted event. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletedEventArgs")
  @js.native
  abstract class VoiceCommandCompletedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletedEventArgs {
    
    /** The reason the voice command completed. */
    /* CompleteClass */
    var reason: VoiceCommandCompletionReason = js.native
  }
  
  /** Specifies the possible reasons the voice command completed. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason")
  @js.native
  object VoiceCommandCompletionReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason & Double
      ] = js.native
    
    /* 5 */ val appLaunched: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.appLaunched & Double = js.native
    
    /* 3 */ val canceled: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.canceled & Double = js.native
    
    /* 1 */ val communicationFailed: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.communicationFailed & Double = js.native
    
    /* 6 */ val completed: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.completed & Double = js.native
    
    /* 2 */ val resourceLimitsExceeded: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.resourceLimitsExceeded & Double = js.native
    
    /* 4 */ val timeoutExceeded: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.timeoutExceeded & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.unknown & Double = js.native
  }
  
  /** The response to the question specified by the background app and shown on the Cortana confirmation screen. This screen is displayed when the background app service calls RequestConfirmationAsync . */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandConfirmationResult")
  @js.native
  abstract class VoiceCommandConfirmationResult ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandConfirmationResult {
    
    /** Gets the response to the question specified by the background app and shown on the Cortana confirmation screen. */
    /* CompleteClass */
    var confirmed: Boolean = js.native
  }
  
  /** An asset, containing image, text, and link data, provided by the background app service for display on the Cortana canvas. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile")
  @js.native
  /** Creates an instance of the VoiceCommandContentTile class. */
  class VoiceCommandContentTile ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile {
    
    /** Gets or sets supplementary information the background app service can associate with the content tile. This information is not used by Cortana. */
    /* CompleteClass */
    var appContext: js.Any = js.native
    
    /** Gets or sets a string as a launch parameter that can be associated with the response by the background app service. */
    /* CompleteClass */
    var appLaunchArgument: String = js.native
    
    /** Gets or sets the layout template used to display the content tile on the Cortana canvas. */
    /* CompleteClass */
    var contentTileType: VoiceCommandContentTileType = js.native
    
    /** Gets or sets an image the background app service can associate with the content tile. */
    /* CompleteClass */
    var image: IStorageFile = js.native
    
    /** Gets or sets the first line of text the background app service can associate with the content tile. */
    /* CompleteClass */
    var textLine1: String = js.native
    
    /** Gets or sets the second line of text the background app service can associate with the content tile. */
    /* CompleteClass */
    var textLine2: String = js.native
    
    /** Gets or sets the third line of text the background app service can associate with the content tile. */
    /* CompleteClass */
    var textLine3: String = js.native
    
    /** Gets or sets the title the background app service can associate with the content tile. */
    /* CompleteClass */
    var title: String = js.native
  }
  
  /** The layout template used to display a content tile on the Cortana canvas. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType")
  @js.native
  object VoiceCommandContentTileType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType & Double
      ] = js.native
    
    /* 0 */ val titleOnly: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleOnly & Double = js.native
    
    /* 6 */ val titleWith280x140Icon: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith280x140Icon & Double = js.native
    
    /* 7 */ val titleWith280x140IconAndText: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith280x140IconAndText & Double = js.native
    
    /* 2 */ val titleWith68x68Icon: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x68Icon & Double = js.native
    
    /* 3 */ val titleWith68x68IconAndText: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x68IconAndText & Double = js.native
    
    /* 4 */ val titleWith68x92Icon: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x92Icon & Double = js.native
    
    /* 5 */ val titleWith68x92IconAndText: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x92IconAndText & Double = js.native
    
    /* 1 */ val titleWithText: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWithText & Double = js.native
  }
  
  /** Enables operations on a specific installed command set. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinition")
  @js.native
  abstract class VoiceCommandDefinition ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinition {
    
    /** Gets the language ( xml:lang ) value of the CommandSet element in the Voice Command Definition (VCD) file. */
    /* CompleteClass */
    var language: String = js.native
    
    /** Gets the Name attribute value of the CommandSet element in the Voice Command Definition (VCD) file. */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Populates a PhraseList element with an array of Item elements.
      * @param phraseListName The string that corresponds to the label attribute of the PhraseList element.
      * @param phraseList A string array of values that will be added to the PhraseList element as Item elements.
      * @return A string array of values that will be added to the PhraseList element as Item elements.
      */
    /* CompleteClass */
    override def setPhraseListAsync(phraseListName: String, phraseList: IIterable[String]): IPromiseWithIAsyncAction = js.native
  }
  
  /** A static class that enables installing command sets from a Voice Command Definition (VCD) file, and getting installed command sets. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinitionManager")
  @js.native
  abstract class VoiceCommandDefinitionManager ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinitionManager
  object VoiceCommandDefinitionManager {
    
    @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinitionManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Installs the CommandSet elements in a Voice Command Definition (VCD) file.
      * @param file An object representing a VCD file.
      * @return An asynchronous handler called when the operation is complete.
      */
    /* static member */
    @scala.inline
    def installCommandDefinitionsFromStorageFileAsync(file: StorageFile): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("installCommandDefinitionsFromStorageFileAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncAction]
    
    /** A dictionary that contains all installed command sets that have a Name attribute set in the Voice Command Definition (VCD) file. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinitionManager.installedCommandDefinitions")
    @js.native
    def installedCommandDefinitions: IMapView[
        String, 
        typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinition
      ] = js.native
    @scala.inline
    def installedCommandDefinitions_=(
      x: IMapView[
          String, 
          typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinition
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("installedCommandDefinitions")(x.asInstanceOf[js.Any])
  }
  
  /** The result obtained from the disambiguation screen displayed on the Cortana canvas. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandDisambiguationResult")
  @js.native
  abstract class VoiceCommandDisambiguationResult ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandDisambiguationResult {
    
    /** The item selected from the list of items displayed on the Cortana disambiguation screen. */
    /* CompleteClass */
    var selectedItem: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile = js.native
  }
  
  /** The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse")
  @js.native
  abstract class VoiceCommandResponse ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse {
    
    /** Gets or sets a string as a launch parameter that can be associated with the response by the background app service. */
    /* CompleteClass */
    var appLaunchArgument: String = js.native
    
    /** The initial message that is spoken by Cortana and shown on the Cortana canvas. */
    /* CompleteClass */
    var message: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage = js.native
    
    /** The secondary message (for disambiguation and confirmation screens only) that is spoken by Cortana and shown on the Cortana canvas, if a response was not understood. */
    /* CompleteClass */
    var repeatMessage: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage = js.native
    
    /** The collection of assets, containing image and text data, provided by the background app service for display on the Cortana canvas. */
    /* CompleteClass */
    var voiceCommandContentTiles: IVector[typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile] = js.native
  }
  object VoiceCommandResponse {
    
    @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a VoiceCommandResponse object used in calls to ReportProgressAsync , ReportSuccessAsync or ReportFailureAsync .
      * @param message The message that is spoken by Cortana and shown on the Cortana canvas.
      * @param contentTiles The collection of assets, containing image and text data, shown on the Cortana canvas.
      * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
      */
    /* static member */
    @scala.inline
    def createResponse(
      message: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage,
      contentTiles: IIterable[typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile]
    ): typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("createResponse")(message.asInstanceOf[js.Any], contentTiles.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse]
    /**
      * Creates a VoiceCommandResponse object used in calls to ReportProgressAsync , ReportSuccessAsync or ReportFailureAsync .
      * @param userMessage The message that is spoken by Cortana and shown on the Cortana canvas.
      * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
      */
    /* static member */
    @scala.inline
    def createResponse(userMessage: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage): typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("createResponse")(userMessage.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse]
    
    /**
      * Creates a VoiceCommandResponse object used in calls to RequestConfirmationAsync or RequestDisambiguationAsync .
      * @param message The initial message that is spoken by Cortana and shown on the Cortana canvas.
      * @param repeatMessage The secondary message that is spoken by Cortana and shown on the Cortana canvas, if a response was not understood.
      * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
      */
    /* static member */
    @scala.inline
    def createResponseForPrompt(
      message: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage,
      repeatMessage: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage
    ): typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("createResponseForPrompt")(message.asInstanceOf[js.Any], repeatMessage.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse]
    /**
      * Creates a VoiceCommandResponse object used in calls to RequestConfirmationAsync or RequestDisambiguationAsync .
      * @param message The initial message that is spoken by Cortana and shown on the Cortana canvas.
      * @param repeatMessage The secondary message that is spoken by Cortana and shown on the Cortana canvas, if a response was not understood.
      * @param contentTiles The collection of assets, containing image and text data, shown on the Cortana canvas.
      * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
      */
    /* static member */
    @scala.inline
    def createResponseForPrompt(
      message: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage,
      repeatMessage: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage,
      contentTiles: IIterable[typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile]
    ): typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("createResponseForPrompt")(message.asInstanceOf[js.Any], repeatMessage.asInstanceOf[js.Any], contentTiles.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse]
    
    /** Gets the maximum number of content tiles the background app service can display on the Cortana canvas. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse.maxSupportedVoiceCommandContentTiles")
    @js.native
    def maxSupportedVoiceCommandContentTiles: Double = js.native
    @scala.inline
    def maxSupportedVoiceCommandContentTiles_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxSupportedVoiceCommandContentTiles")(x.asInstanceOf[js.Any])
  }
  
  /** The background app service connection to Cortana. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection")
  @js.native
  abstract class VoiceCommandServiceConnection ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection
  object VoiceCommandServiceConnection {
    
    @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Retrieves a VoiceCommandServiceConnection object from the AppServiceTriggerDetails that contains info associated with the background task for the app service.
      * @param triggerDetails Contains info associated with the background task for the app service.
      * @return The background app service connection to Cortana.
      */
    /* static member */
    @scala.inline
    def fromAppServiceTriggerDetails(triggerDetails: AppServiceTriggerDetails): typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAppServiceTriggerDetails")(triggerDetails.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection]
  }
  
  /** The message that is spoken by Cortana and shown on the Cortana canvas. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage")
  @js.native
  /** Creates an instance of the VoiceCommandUserMessage class. */
  class VoiceCommandUserMessage ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage {
    
    /** Gets or sets the message that is shown on the Cortana canvas. */
    /* CompleteClass */
    var displayMessage: String = js.native
    
    /** The message that is spoken by Cortana. */
    /* CompleteClass */
    var spokenMessage: String = js.native
  }
}
