package typings.sunriseSunsetJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sunrise-sunset-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSunrise(latitude: Double, longitude: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getSunrise")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def getSunrise(latitude: Double, longitude: Double, date: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getSunrise")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getSunset(latitude: Double, longitude: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getSunset")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def getSunset(latitude: Double, longitude: Double, date: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getSunset")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
}
