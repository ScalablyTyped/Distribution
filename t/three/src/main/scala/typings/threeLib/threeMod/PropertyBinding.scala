package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "PropertyBinding")
@js.native
class PropertyBinding protected ()
  extends threeLib.srcAnimationPropertyBindingMod.PropertyBinding {
  def this(rootNode: js.Any, path: java.lang.String) = this()
  def this(rootNode: js.Any, path: java.lang.String, parsedPath: js.Any) = this()
}

/* static members */
@JSImport("three", "PropertyBinding")
@js.native
object PropertyBinding extends js.Object {
  def create(root: js.Any, path: js.Any): threeLib.srcAnimationPropertyBindingMod.PropertyBinding | threeLib.srcAnimationPropertyBindingMod.PropertyBindingNs.Composite = js.native
  def create(root: js.Any, path: js.Any, parsedPath: js.Any): threeLib.srcAnimationPropertyBindingMod.PropertyBinding | threeLib.srcAnimationPropertyBindingMod.PropertyBindingNs.Composite = js.native
  def findNode(root: js.Any, nodeName: java.lang.String): js.Any = js.native
  def parseTrackName(trackName: java.lang.String): js.Any = js.native
}

