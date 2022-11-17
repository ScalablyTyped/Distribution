package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramasItemMode extends StObject {
  
  var panoramasItemMode: "on" | "off" | "ifMercator"
}
object PanoramasItemMode {
  
  inline def apply(panoramasItemMode: "on" | "off" | "ifMercator"): PanoramasItemMode = {
    val __obj = js.Dynamic.literal(panoramasItemMode = panoramasItemMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramasItemMode]
  }
  
  extension [Self <: PanoramasItemMode](x: Self) {
    
    inline def setPanoramasItemMode(value: "on" | "off" | "ifMercator"): Self = StObject.set(x, "panoramasItemMode", value.asInstanceOf[js.Any])
  }
}
