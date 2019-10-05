package typings.yog2DashKernel

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.nodeDashRal.nodeDashRalMod.Config
import typings.nodeDashRal.nodeDashRalMod.ConfigNormalizer
import typings.nodeDashRal.nodeDashRalMod.RAL.RalRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofRAL extends js.Object {
  var NormalizerManager: Instantiable0[typings.nodeDashRal.nodeDashRalMod.RAL.NormalizerManager] = js.native
  var RalRunner: Instantiable1[/* serviceName */ String, typings.nodeDashRal.nodeDashRalMod.RAL.RalRunner] = js.native
  def apply(serviceName: String): RalRunner = js.native
  def apply(serviceName: String, options: js.Object): RalRunner = js.native
  def appendExtPath(extPath: String): Unit = js.native
  def getConf(name: String): Config = js.native
  def getRawConf(name: String): Config = js.native
  def init(): Unit = js.native
  def init(options: js.Object): Unit = js.native
  def reload(): Unit = js.native
  def reload(options: js.Object): Unit = js.native
  def setConfigNormalizer(normalizers: ConfigNormalizer): Unit = js.native
}

