package typings
package atTensorflowTfjsDashCoreLib.distEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/environment", "Environment")
@js.native
class Environment protected () extends js.Object {
  def this(global: js.Any) = this()
  var evaluateFlag: js.Any = js.native
  val features: Flags = js.native
  var flagRegistry: js.Any = js.native
  var flags: js.Any = js.native
  var global: js.Any = js.native
  var platform: atTensorflowTfjsDashCoreLib.distPlatformsPlatformMod.Platform = js.native
  var platformName: java.lang.String = js.native
  var populateURLFlags: js.Any = js.native
  var urlFlags: js.Any = js.native
  def get(flagName: java.lang.String): FlagValue = js.native
  def getBool(flagName: java.lang.String): scala.Boolean = js.native
  def getFlags(): Flags = js.native
  def getNumber(flagName: java.lang.String): scala.Double = js.native
  def registerFlag(flagName: java.lang.String, evaluationFn: js.Function0[FlagValue]): scala.Unit = js.native
  def registerFlag(
    flagName: java.lang.String,
    evaluationFn: js.Function0[FlagValue],
    setHook: js.Function1[/* value */ FlagValue, scala.Unit]
  ): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def set(flagName: java.lang.String, value: FlagValue): scala.Unit = js.native
  def setFlags(flags: Flags): scala.Unit = js.native
  def setPlatform(
    platformName: java.lang.String,
    platform: atTensorflowTfjsDashCoreLib.distPlatformsPlatformMod.Platform
  ): scala.Unit = js.native
}

