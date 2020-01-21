package typings.timezoneJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimezoneJs extends js.Object {
  var loadingScheme: Double = js.native
  var loadingSchemes: TimezoneJsLoadingSchemes = js.native
  var zoneFileBasePath: String = js.native
  def getAllZones(): js.Array[String] = js.native
  def init(): js.Any = js.native
  def init(opts: TimezoneJsOptions): js.Any = js.native
  def loadZoneDataFromObject(obj: js.Object): Unit = js.native
  def transport(opts: TimezoneJsOptions): js.Any = js.native
}

