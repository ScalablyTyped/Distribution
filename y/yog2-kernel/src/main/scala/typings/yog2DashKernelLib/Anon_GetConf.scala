package typings
package yog2DashKernelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetConf extends js.Object {
  var NormalizerManager: org.scalablytyped.runtime.Instantiable0[nodeDashRalLib.nodeDashRalMod.RALNs.NormalizerManager] = js.native
  var RalRunner: org.scalablytyped.runtime.Instantiable1[/* serviceName */ java.lang.String, nodeDashRalLib.nodeDashRalMod.RALNs.RalRunner] = js.native
  def appendExtPath(extPath: java.lang.String): scala.Unit = js.native
  def getConf(name: java.lang.String): nodeDashRalLib.nodeDashRalMod.Config = js.native
  def getRawConf(name: java.lang.String): nodeDashRalLib.nodeDashRalMod.Config = js.native
  def init(): scala.Unit = js.native
  def init(options: js.Object): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def reload(options: js.Object): scala.Unit = js.native
  def setConfigNormalizer(normalizers: nodeDashRalLib.nodeDashRalMod.ConfigNormalizer): scala.Unit = js.native
}

