package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadLocation_ extends StObject {
  
  var downloadLocation: String
}
object DownloadLocation_ {
  
  inline def apply(downloadLocation: String): DownloadLocation_ = {
    val __obj = js.Dynamic.literal(downloadLocation = downloadLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadLocation_]
  }
  
  extension [Self <: DownloadLocation_](x: Self) {
    
    inline def setDownloadLocation(value: String): Self = StObject.set(x, "downloadLocation", value.asInstanceOf[js.Any])
  }
}
