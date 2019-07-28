package typings.webpagetest

import typings.webpagetest.webpagetestMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location extends js.Object {
  var location: js.Array[Location]
}

object Anon_Location {
  @scala.inline
  def apply(location: js.Array[Location]): Anon_Location = {
    val __obj = js.Dynamic.literal(location = location)
  
    __obj.asInstanceOf[Anon_Location]
  }
}

