package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstSecondIMapViewString extends js.Object {
  /** One half of the original map. */ var first: IMapView[String, String]
  /** The second half of the original map. */ var second: IMapView[String, String]
}

object Anon_FirstSecondIMapViewString {
  @scala.inline
  def apply(first: IMapView[String, String], second: IMapView[String, String]): Anon_FirstSecondIMapViewString = {
    val __obj = js.Dynamic.literal(first = first, second = second)
  
    __obj.asInstanceOf[Anon_FirstSecondIMapViewString]
  }
}

