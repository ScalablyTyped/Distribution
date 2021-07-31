package typings.vscodeLanguageclient.clientMod

import typings.vscode.mod.FileSystemWatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizeOptions extends StObject {
  
  /**
    * The configuration sections to synchronize. Pushing settings from the
    * client to the server is deprecated in favour of the new pull model
    * that allows servers to query settings scoped on resources. In this
    * model the client can only deliver an empty change event since the
    * actually setting value can vary on the provided resource scope.
    *
    * @deprecated Use the new pull model (`workspace/configuration` request)
    */
  var configurationSection: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    *
    */
  var fileEvents: js.UndefOr[FileSystemWatcher | js.Array[FileSystemWatcher]] = js.undefined
}
object SynchronizeOptions {
  
  @scala.inline
  def apply(): SynchronizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizeOptions]
  }
  
  @scala.inline
  implicit class SynchronizeOptionsMutableBuilder[Self <: SynchronizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSection(value: String | js.Array[String]): Self = StObject.set(x, "configurationSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSectionUndefined: Self = StObject.set(x, "configurationSection", js.undefined)
    
    @scala.inline
    def setConfigurationSectionVarargs(value: String*): Self = StObject.set(x, "configurationSection", js.Array(value :_*))
    
    @scala.inline
    def setFileEvents(value: FileSystemWatcher | js.Array[FileSystemWatcher]): Self = StObject.set(x, "fileEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileEventsUndefined: Self = StObject.set(x, "fileEvents", js.undefined)
    
    @scala.inline
    def setFileEventsVarargs(value: FileSystemWatcher*): Self = StObject.set(x, "fileEvents", js.Array(value :_*))
  }
}
