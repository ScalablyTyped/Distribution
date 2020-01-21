package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A static class that enables installing command sets from a Voice Command Definition (VCD) file, and getting installed command sets. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinitionManager")
@js.native
abstract class VoiceCommandDefinitionManager () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinitionManager")
@js.native
object VoiceCommandDefinitionManager extends js.Object {
  /** A dictionary that contains all installed command sets that have a Name attribute set in the Voice Command Definition (VCD) file. */
  var installedCommandDefinitions: IMapView[String, VoiceCommandDefinition] = js.native
  /**
    * Installs the CommandSet elements in a Voice Command Definition (VCD) file.
    * @param file An object representing a VCD file.
    * @return An asynchronous handler called when the operation is complete.
    */
  def installCommandDefinitionsFromStorageFileAsync(file: StorageFile): IPromiseWithIAsyncAction = js.native
}

