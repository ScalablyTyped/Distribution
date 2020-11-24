package typings.three.mod

import typings.three.propertyBindingMod.ParseTrackNameResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "PropertyBinding")
@js.native
class PropertyBinding protected ()
  extends typings.three.propertyBindingMod.PropertyBinding {
  def this(rootNode: js.Any, path: String) = this()
  def this(rootNode: js.Any, path: String, parsedPath: js.Any) = this()
}
/* static members */
@JSImport("three", "PropertyBinding")
@js.native
object PropertyBinding extends js.Object {
  
  def create(root: js.Any, path: js.Any): typings.three.propertyBindingMod.PropertyBinding | typings.three.propertyBindingMod.PropertyBinding.Composite = js.native
  def create(root: js.Any, path: js.Any, parsedPath: js.Any): typings.three.propertyBindingMod.PropertyBinding | typings.three.propertyBindingMod.PropertyBinding.Composite = js.native
  
  def findNode(root: js.Any, nodeName: String): js.Any = js.native
  
  def parseTrackName(trackName: String): ParseTrackNameResults = js.native
  
  def sanitizeNodeName(name: String): String = js.native
  
  @js.native
  class Composite protected ()
    extends typings.three.propertyBindingMod.PropertyBinding.Composite {
    def this(targetGroup: js.Any, path: js.Any) = this()
    def this(targetGroup: js.Any, path: js.Any, parsedPath: js.Any) = this()
  }
}
