package typings.three.threeMod

import typings.three.srcAnimationPropertyBindingMod.PropertyBindingNs.Composite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "PropertyBinding")
@js.native
class PropertyBinding protected ()
  extends typings.three.srcAnimationPropertyBindingMod.PropertyBinding {
  def this(rootNode: js.Any, path: String) = this()
  def this(rootNode: js.Any, path: String, parsedPath: js.Any) = this()
}

/* static members */
@JSImport("three", "PropertyBinding")
@js.native
object PropertyBinding extends js.Object {
  def create(root: js.Any, path: js.Any): typings.three.srcAnimationPropertyBindingMod.PropertyBinding | Composite = js.native
  def create(root: js.Any, path: js.Any, parsedPath: js.Any): typings.three.srcAnimationPropertyBindingMod.PropertyBinding | Composite = js.native
  def findNode(root: js.Any, nodeName: String): js.Any = js.native
  def parseTrackName(trackName: String): js.Any = js.native
}

