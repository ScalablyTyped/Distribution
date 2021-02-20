package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.AppService.AppServiceTriggerDetails
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for handling voice commands in Cortana, entered by speech or text, to access features and functionality from a background app. When an app handles a voice command in the background it can display feedback on the Cortana canvas and communicate with the user using the Cortana voice. */
object VoiceCommands {
  
  /** The command given to Cortana, using either speech or text, and routed to a background app. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommand")
  @js.native
  abstract class VoiceCommand ()
    extends typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommand
  
  /** Contains event data for the VoiceCommandCompleted event. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletedEventArgs")
  @js.native
  abstract class VoiceCommandCompletedEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletedEventArgs
  
  /** Specifies the possible reasons the voice command completed. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason")
  @js.native
  object VoiceCommandCompletionReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason with Double
      ] = js.native
    
    /* 5 */ val appLaunched: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.appLaunched with Double = js.native
    
    /* 3 */ val canceled: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.canceled with Double = js.native
    
    /* 1 */ val communicationFailed: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.communicationFailed with Double = js.native
    
    /* 6 */ val completed: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.completed with Double = js.native
    
    /* 2 */ val resourceLimitsExceeded: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.resourceLimitsExceeded with Double = js.native
    
    /* 4 */ val timeoutExceeded: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.timeoutExceeded with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.unknown with Double = js.native
  }
  
  /** The response to the question specified by the background app and shown on the Cortana confirmation screen. This screen is displayed when the background app service calls RequestConfirmationAsync . */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandConfirmationResult")
  @js.native
  abstract class VoiceCommandConfirmationResult ()
    extends typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandConfirmationResult
  
  /** An asset, containing image, text, and link data, provided by the background app service for display on the Cortana canvas. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile")
  @js.native
  /** Creates an instance of the VoiceCommandContentTile class. */
  class VoiceCommandContentTile ()
    extends typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile
  
  /** The layout template used to display a content tile on the Cortana canvas. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType")
  @js.native
  object VoiceCommandContentTileType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType with Double
      ] = js.native
    
    /* 0 */ val titleOnly: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleOnly with Double = js.native
    
    /* 6 */ val titleWith280x140Icon: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith280x140Icon with Double = js.native
    
    /* 7 */ val titleWith280x140IconAndText: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith280x140IconAndText with Double = js.native
    
    /* 2 */ val titleWith68x68Icon: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x68Icon with Double = js.native
    
    /* 3 */ val titleWith68x68IconAndText: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x68IconAndText with Double = js.native
    
    /* 4 */ val titleWith68x92Icon: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x92Icon with Double = js.native
    
    /* 5 */ val titleWith68x92IconAndText: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x92IconAndText with Double = js.native
    
    /* 1 */ val titleWithText: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWithText with Double = js.native
  }
  
  /** Enables operations on a specific installed command set. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinition")
  @js.native
  abstract class VoiceCommandDefinition ()
    extends typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinition
  
  /** A static class that enables installing command sets from a Voice Command Definition (VCD) file, and getting installed command sets. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinitionManager")
  @js.native
  abstract class VoiceCommandDefinitionManager ()
    extends typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinitionManager
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
    @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinitionManager.installCommandDefinitionsFromStorageFileAsync")
    @js.native
    def installCommandDefinitionsFromStorageFileAsync(file: StorageFile): IPromiseWithIAsyncAction = js.native
    
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
    extends typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandDisambiguationResult
  
  /** The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse")
  @js.native
  abstract class VoiceCommandResponse ()
    extends typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse
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
    @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse.createResponse")
    @js.native
    def createResponse(
      message: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage,
      contentTiles: IIterable[typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile]
    ): typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse = js.native
    /**
      * Creates a VoiceCommandResponse object used in calls to ReportProgressAsync , ReportSuccessAsync or ReportFailureAsync .
      * @param userMessage The message that is spoken by Cortana and shown on the Cortana canvas.
      * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse.createResponse")
    @js.native
    def createResponse(userMessage: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage): typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse = js.native
    
    /**
      * Creates a VoiceCommandResponse object used in calls to RequestConfirmationAsync or RequestDisambiguationAsync .
      * @param message The initial message that is spoken by Cortana and shown on the Cortana canvas.
      * @param repeatMessage The secondary message that is spoken by Cortana and shown on the Cortana canvas, if a response was not understood.
      * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse.createResponseForPrompt")
    @js.native
    def createResponseForPrompt(
      message: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage,
      repeatMessage: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage
    ): typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse = js.native
    /**
      * Creates a VoiceCommandResponse object used in calls to RequestConfirmationAsync or RequestDisambiguationAsync .
      * @param message The initial message that is spoken by Cortana and shown on the Cortana canvas.
      * @param repeatMessage The secondary message that is spoken by Cortana and shown on the Cortana canvas, if a response was not understood.
      * @param contentTiles The collection of assets, containing image and text data, shown on the Cortana canvas.
      * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse.createResponseForPrompt")
    @js.native
    def createResponseForPrompt(
      message: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage,
      repeatMessage: typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage,
      contentTiles: IIterable[typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile]
    ): typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse = js.native
    
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
    extends typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection
  object VoiceCommandServiceConnection {
    
    /**
      * Retrieves a VoiceCommandServiceConnection object from the AppServiceTriggerDetails that contains info associated with the background task for the app service.
      * @param triggerDetails Contains info associated with the background task for the app service.
      * @return The background app service connection to Cortana.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection.fromAppServiceTriggerDetails")
    @js.native
    def fromAppServiceTriggerDetails(triggerDetails: AppServiceTriggerDetails): typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection = js.native
  }
  
  /** The message that is spoken by Cortana and shown on the Cortana canvas. */
  @JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage")
  @js.native
  /** Creates an instance of the VoiceCommandUserMessage class. */
  class VoiceCommandUserMessage ()
    extends typings.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage
}
