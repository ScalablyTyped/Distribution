package typings.yandexMaps.anon

import typings.yandexMaps.yandexMapsStrings.ifMercator
import typings.yandexMaps.yandexMapsStrings.off
import typings.yandexMaps.yandexMapsStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramasItemMode extends StObject {
  
  var panoramasItemMode: on | off | ifMercator
}
object PanoramasItemMode {
  
  inline def apply(panoramasItemMode: on | off | ifMercator): PanoramasItemMode = {
    val __obj = js.Dynamic.literal(panoramasItemMode = panoramasItemMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramasItemMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PanoramasItemMode] (val x: Self) extends AnyVal {
    
    inline def setPanoramasItemMode(value: on | off | ifMercator): Self = StObject.set(x, "panoramasItemMode", value.asInstanceOf[js.Any])
  }
}
