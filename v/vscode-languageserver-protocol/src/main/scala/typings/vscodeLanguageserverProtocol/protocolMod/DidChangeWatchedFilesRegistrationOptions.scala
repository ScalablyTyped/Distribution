package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DidChangeWatchedFilesRegistrationOptions extends js.Object {
  
  /**
    * The watchers to register.
    */
  var watchers: js.Array[FileSystemWatcher] = js.native
}
object DidChangeWatchedFilesRegistrationOptions {
  
  @scala.inline
  def apply(watchers: js.Array[FileSystemWatcher]): DidChangeWatchedFilesRegistrationOptions = {
    val __obj = js.Dynamic.literal(watchers = watchers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeWatchedFilesRegistrationOptions]
  }
  
  @scala.inline
  implicit class DidChangeWatchedFilesRegistrationOptionsOps[Self <: DidChangeWatchedFilesRegistrationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWatchersVarargs(value: FileSystemWatcher*): Self = this.set("watchers", js.Array(value :_*))
    
    @scala.inline
    def setWatchers(value: js.Array[FileSystemWatcher]): Self = this.set("watchers", value.asInstanceOf[js.Any])
  }
}
