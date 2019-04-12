package typings
package threeLib.srcAnimationPropertyMixerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/PropertyMixer", "PropertyMixer")
@js.native
class PropertyMixer protected () extends js.Object {
  def this(binding: js.Any, typeName: java.lang.String, valueSize: scala.Double) = this()
  var binding: js.Any = js.native
  var buffer: js.Any = js.native
  var cumulativeWeight: scala.Double = js.native
  var referenceCount: scala.Double = js.native
  var useCount: scala.Double = js.native
  var valueSize: scala.Double = js.native
  def accumulate(accuIndex: scala.Double, weight: scala.Double): scala.Unit = js.native
  @JSName("apply")
  def apply(accuIndex: scala.Double): scala.Unit = js.native
  def restoreOriginalState(): scala.Unit = js.native
  def saveOriginalState(): scala.Unit = js.native
}

