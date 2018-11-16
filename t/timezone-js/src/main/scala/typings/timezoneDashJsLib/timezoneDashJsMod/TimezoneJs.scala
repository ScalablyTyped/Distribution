package typings
package timezoneDashJsLib.timezoneDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimezoneJs extends js.Object {
  var loadingScheme: scala.Double = js.native
  var loadingSchemes: TimezoneJsLoadingSchemes = js.native
  var zoneFileBasePath: java.lang.String = js.native
  def getAllZones(): js.Array[java.lang.String] = js.native
  def init(): js.Any = js.native
  def init(opts: TimezoneJsOptions): js.Any = js.native
  def loadZoneDataFromObject(obj: js.Object): scala.Unit = js.native
  def transport(opts: TimezoneJsOptions): js.Any = js.native
}

