package typings.winrt

import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstSecondIMapViewString extends js.Object {
  var first: IMapView[String, String]
  var second: IMapView[String, String]
}

object Anon_FirstSecondIMapViewString {
  @scala.inline
  def apply(first: IMapView[String, String], second: IMapView[String, String]): Anon_FirstSecondIMapViewString = {
    val __obj = js.Dynamic.literal(first = first, second = second)
  
    __obj.asInstanceOf[Anon_FirstSecondIMapViewString]
  }
}

