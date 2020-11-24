package typings.yandexMaps.anon

import typings.yandexMaps.yandexMapsStrings.ifMercator
import typings.yandexMaps.yandexMapsStrings.off
import typings.yandexMaps.yandexMapsStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramasItemMode extends js.Object {
  
  var panoramasItemMode: on | off | ifMercator = js.native
}
object PanoramasItemMode {
  
  @scala.inline
  def apply(panoramasItemMode: on | off | ifMercator): PanoramasItemMode = {
    val __obj = js.Dynamic.literal(panoramasItemMode = panoramasItemMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramasItemMode]
  }
  
  @scala.inline
  implicit class PanoramasItemModeOps[Self <: PanoramasItemMode] (val x: Self) extends AnyVal {
    
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
    def setPanoramasItemMode(value: on | off | ifMercator): Self = this.set("panoramasItemMode", value.asInstanceOf[js.Any])
  }
}
