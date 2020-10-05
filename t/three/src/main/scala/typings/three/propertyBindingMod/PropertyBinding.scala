package typings.three.propertyBindingMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/animation/PropertyBinding", "PropertyBinding")
@js.native
class PropertyBinding protected () extends js.Object {
  def this(rootNode: js.Any, path: String) = this()
  def this(rootNode: js.Any, path: String, parsedPath: js.Any) = this()
  var BindingType: StringDictionary[Double] = js.native
  var GetterByBindingType: js.Array[js.Function] = js.native
  var SetterByBindingTypeAndVersioning: js.Array[js.Array[js.Function]] = js.native
  var Versioning: StringDictionary[Double] = js.native
  var node: js.Any = js.native
  var parsedPath: js.Any = js.native
  var path: String = js.native
  var rootNode: js.Any = js.native
  def bind(): Unit = js.native
  def getValue(targetArray: js.Any, offset: Double): js.Any = js.native
  def setValue(sourceArray: js.Any, offset: Double): Unit = js.native
  def unbind(): Unit = js.native
}

/* static members */
@JSImport("three/src/animation/PropertyBinding", "PropertyBinding")
@js.native
object PropertyBinding extends js.Object {
  @js.native
  class Composite protected () extends js.Object {
    def this(targetGroup: js.Any, path: js.Any) = this()
    def this(targetGroup: js.Any, path: js.Any, parsedPath: js.Any) = this()
    def bind(): Unit = js.native
    def getValue(array: js.Any, offset: Double): js.Any = js.native
    def setValue(array: js.Any, offset: Double): Unit = js.native
    def unbind(): Unit = js.native
  }
  
  def create(root: js.Any, path: js.Any): PropertyBinding | Composite = js.native
  def create(root: js.Any, path: js.Any, parsedPath: js.Any): PropertyBinding | Composite = js.native
  def findNode(root: js.Any, nodeName: String): js.Any = js.native
  def parseTrackName(trackName: String): ParseTrackNameResults = js.native
  def sanitizeNodeName(name: String): String = js.native
}

