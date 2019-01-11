package typings
package atUifabricUtilitiesLib.libWarnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/warn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def setWarningCallback(): scala.Unit = js.native
  def setWarningCallback(warningCallback: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def warn(message: java.lang.String): scala.Unit = js.native
  def warnConditionallyRequiredProps[P](
    componentName: java.lang.String,
    props: P,
    requiredProps: js.Array[java.lang.String],
    conditionalPropName: java.lang.String,
    condition: scala.Boolean
  ): scala.Unit = js.native
  def warnDeprecations[P](
    componentName: java.lang.String,
    props: P,
    deprecationMap: atUifabricUtilitiesLib.libWarnMod.ISettingsMap[P]
  ): scala.Unit = js.native
  def warnMutuallyExclusive[P](
    componentName: java.lang.String,
    props: P,
    exclusiveMap: atUifabricUtilitiesLib.libWarnMod.ISettingsMap[P]
  ): scala.Unit = js.native
}

