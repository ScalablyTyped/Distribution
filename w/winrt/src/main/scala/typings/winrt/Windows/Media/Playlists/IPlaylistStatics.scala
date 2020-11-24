package typings.winrt.Windows.Media.Playlists

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlaylistStatics extends js.Object {
  
  def loadAsync(file: IStorageFile): IAsyncOperation[Playlist] = js.native
}
object IPlaylistStatics {
  
  @scala.inline
  def apply(loadAsync: IStorageFile => IAsyncOperation[Playlist]): IPlaylistStatics = {
    val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction1(loadAsync))
    __obj.asInstanceOf[IPlaylistStatics]
  }
  
  @scala.inline
  implicit class IPlaylistStaticsOps[Self <: IPlaylistStatics] (val x: Self) extends AnyVal {
    
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
    def setLoadAsync(value: IStorageFile => IAsyncOperation[Playlist]): Self = this.set("loadAsync", js.Any.fromFunction1(value))
  }
}
