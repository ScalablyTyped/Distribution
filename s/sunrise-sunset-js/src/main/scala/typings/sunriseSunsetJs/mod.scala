package typings.sunriseSunsetJs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sunrise-sunset-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSunrise(latitude: Double, longitude: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getSunrise")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getSunrise(latitude: Double, longitude: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getSunrise")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def getSunset(latitude: Double, longitude: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getSunset")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getSunset(latitude: Double, longitude: Double, date: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getSunset")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Date]
}
