package typings.vscodeLanguageclient

import typings.vscode.mod.FileSystemWatcher
import typings.vscodeLanguageclient.featuresMod.DynamicFeature
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageserverProtocol.mod.RegistrationType
import typings.vscodeLanguageserverProtocol.protocolMod.DidChangeWatchedFilesRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.FileEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSystemWatcherMod {
  
  @JSImport("vscode-languageclient/lib/common/fileSystemWatcher", "FileSystemWatcherFeature")
  @js.native
  open class FileSystemWatcherFeature protected ()
    extends StObject
       with DynamicFeature[DidChangeWatchedFilesRegistrationOptions] {
    def this(
      client: FeatureClient[js.Object, js.Object],
      notifyFileEvent: js.Function1[/* event */ FileEvent, Unit]
    ) = this()
    
    /* private */ val _client: Any = js.native
    
    /* private */ val _notifyFileEvent: Any = js.native
    
    /* private */ val _watchers: Any = js.native
    
    /* private */ var hookListeners: Any = js.native
    
    def registerRaw(id: String, fileSystemWatchers: js.Array[FileSystemWatcher]): Unit = js.native
    
    @JSName("registrationType")
    def registrationType_MFileSystemWatcherFeature: RegistrationType[DidChangeWatchedFilesRegistrationOptions] = js.native
  }
}
