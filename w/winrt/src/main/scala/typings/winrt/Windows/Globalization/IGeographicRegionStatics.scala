package typings.winrt.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeographicRegionStatics extends StObject {
  
  def isSupported(geographicRegionCode: String): Boolean
}
object IGeographicRegionStatics {
  
  inline def apply(isSupported: String => Boolean): IGeographicRegionStatics = {
    val __obj = js.Dynamic.literal(isSupported = js.Any.fromFunction1(isSupported))
    __obj.asInstanceOf[IGeographicRegionStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGeographicRegionStatics] (val x: Self) extends AnyVal {
    
    inline def setIsSupported(value: String => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction1(value))
  }
}
