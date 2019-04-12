package typings
package threeLib.srcAnimationPropertyBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/PropertyBinding", "PropertyBinding")
@js.native
class PropertyBinding protected () extends js.Object {
  def this(rootNode: js.Any, path: java.lang.String) = this()
  def this(rootNode: js.Any, path: java.lang.String, parsedPath: js.Any) = this()
  var BindingType: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  var GetterByBindingType: js.Array[js.Function] = js.native
  var SetterByBindingTypeAndVersioning: js.Array[js.Array[js.Function]] = js.native
  var Versioning: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  var node: js.Any = js.native
  var parsedPath: js.Any = js.native
  var path: java.lang.String = js.native
  var rootNode: js.Any = js.native
  def bind(): scala.Unit = js.native
  def getValue(targetArray: js.Any, offset: scala.Double): js.Any = js.native
  def setValue(sourceArray: js.Any, offset: scala.Double): scala.Unit = js.native
  def unbind(): scala.Unit = js.native
}

/* static members */
@JSImport("three/src/animation/PropertyBinding", "PropertyBinding")
@js.native
object PropertyBinding extends js.Object {
  def create(root: js.Any, path: js.Any): threeLib.srcAnimationPropertyBindingMod.PropertyBinding | threeLib.srcAnimationPropertyBindingMod.PropertyBindingNs.Composite = js.native
  def create(root: js.Any, path: js.Any, parsedPath: js.Any): threeLib.srcAnimationPropertyBindingMod.PropertyBinding | threeLib.srcAnimationPropertyBindingMod.PropertyBindingNs.Composite = js.native
  def findNode(root: js.Any, nodeName: java.lang.String): js.Any = js.native
  def parseTrackName(trackName: java.lang.String): js.Any = js.native
}

