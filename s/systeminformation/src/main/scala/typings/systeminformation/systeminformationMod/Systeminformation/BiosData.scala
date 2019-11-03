package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BiosData extends js.Object {
  var releaseDate: String
  var revision: String
  var vendor: String
  var version: String
}

object BiosData {
  @scala.inline
  def apply(releaseDate: String, revision: String, vendor: String, version: String): BiosData = {
    val __obj = js.Dynamic.literal(releaseDate = releaseDate, revision = revision, vendor = vendor, version = version)
  
    __obj.asInstanceOf[BiosData]
  }
}

