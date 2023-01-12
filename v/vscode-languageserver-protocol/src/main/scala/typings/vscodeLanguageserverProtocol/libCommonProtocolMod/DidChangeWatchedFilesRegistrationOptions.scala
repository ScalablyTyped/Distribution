package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidChangeWatchedFilesRegistrationOptions extends StObject {
  
  /**
    * The watchers to register.
    */
  var watchers: js.Array[FileSystemWatcher]
}
object DidChangeWatchedFilesRegistrationOptions {
  
  inline def apply(watchers: js.Array[FileSystemWatcher]): DidChangeWatchedFilesRegistrationOptions = {
    val __obj = js.Dynamic.literal(watchers = watchers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeWatchedFilesRegistrationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DidChangeWatchedFilesRegistrationOptions] (val x: Self) extends AnyVal {
    
    inline def setWatchers(value: js.Array[FileSystemWatcher]): Self = StObject.set(x, "watchers", value.asInstanceOf[js.Any])
    
    inline def setWatchersVarargs(value: FileSystemWatcher*): Self = StObject.set(x, "watchers", js.Array(value*))
  }
}
