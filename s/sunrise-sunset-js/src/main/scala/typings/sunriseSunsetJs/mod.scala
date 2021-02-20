package typings.sunriseSunsetJs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sunrise-sunset-js", "getSunrise")
  @js.native
  def getSunrise(latitude: Double, longitude: Double): Date = js.native
  @JSImport("sunrise-sunset-js", "getSunrise")
  @js.native
  def getSunrise(latitude: Double, longitude: Double, date: Date): Date = js.native
  
  @JSImport("sunrise-sunset-js", "getSunset")
  @js.native
  def getSunset(latitude: Double, longitude: Double): Date = js.native
  @JSImport("sunrise-sunset-js", "getSunset")
  @js.native
  def getSunset(latitude: Double, longitude: Double, date: Date): Date = js.native
}
