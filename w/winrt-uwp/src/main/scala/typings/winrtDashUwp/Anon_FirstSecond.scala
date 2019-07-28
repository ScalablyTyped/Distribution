package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstSecond extends js.Object {
  /** The first part of the original map. */ var first: IMapView[String, _]
  /** The second part of the original map. */ var second: IMapView[String, _]
}

object Anon_FirstSecond {
  @scala.inline
  def apply(first: IMapView[String, _], second: IMapView[String, _]): Anon_FirstSecond = {
    val __obj = js.Dynamic.literal(first = first, second = second)
  
    __obj.asInstanceOf[Anon_FirstSecond]
  }
}

