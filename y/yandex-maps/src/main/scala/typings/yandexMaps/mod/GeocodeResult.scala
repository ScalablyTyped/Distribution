package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "GeocodeResult")
@js.native
open class GeocodeResult ()
  extends StObject
     with IGeoObject[IGeometry] {
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  
  def getAddressLine(): String = js.native
  
  def getAdministrativeAreas(): js.Array[String] = js.native
  
  def getCountry(): String | Null = js.native
  
  def getCountryCode(): String | Null = js.native
  
  def getLocalities(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def getMap(): Map_ = js.native
  
  def getPremise(): String | Null = js.native
  
  def getPremiseNumber(): String | Null = js.native
  
  def getThoroughfare(): String | Null = js.native
}
