package typings.timezoneJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimezoneJs extends js.Object {
  
  def getAllZones(): js.Array[String] = js.native
  
  def init(): js.Any = js.native
  def init(opts: TimezoneJsOptions): js.Any = js.native
  
  def loadZoneDataFromObject(obj: js.Object): Unit = js.native
  
  var loadingScheme: Double = js.native
  
  var loadingSchemes: TimezoneJsLoadingSchemes = js.native
  
  def transport(opts: TimezoneJsOptions): js.Any = js.native
  
  var zoneFileBasePath: String = js.native
}
