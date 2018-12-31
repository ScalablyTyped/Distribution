package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A static class that enables installing command sets from a Voice Command Definition (VCD) file, and getting installed command sets. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinitionManager")
@js.native
abstract class VoiceCommandDefinitionManager () extends js.Object

/** A static class that enables installing command sets from a Voice Command Definition (VCD) file, and getting installed command sets. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinitionManager")
@js.native
object VoiceCommandDefinitionManager extends js.Object {
  /** A dictionary that contains all installed command sets that have a Name attribute set in the Voice Command Definition (VCD) file. */
  var installedCommandDefinitions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
    java.lang.String, 
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandDefinition
  ] = js.native
  /**
    * Installs the CommandSet elements in a Voice Command Definition (VCD) file.
    * @param file An object representing a VCD file.
    * @return An asynchronous handler called when the operation is complete.
    */
  def installCommandDefinitionsFromStorageFileAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

