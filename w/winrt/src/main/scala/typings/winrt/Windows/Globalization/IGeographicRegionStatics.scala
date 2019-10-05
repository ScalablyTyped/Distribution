package typings.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeographicRegionStatics extends js.Object {
  def isSupported(geographicRegionCode: String): Boolean
}

object IGeographicRegionStatics {
  @scala.inline
  def apply(isSupported: String => Boolean): IGeographicRegionStatics = {
    val __obj = js.Dynamic.literal(isSupported = js.Any.fromFunction1(isSupported))
  
    __obj.asInstanceOf[IGeographicRegionStatics]
  }
}

