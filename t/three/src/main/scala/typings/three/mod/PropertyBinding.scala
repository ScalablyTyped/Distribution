package typings.three.mod

import typings.three.propertyBindingMod.ParseTrackNameResults
import org.scalablytyped.runtime.StObject
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
object PropertyBinding {
  
  @JSImport("three", "PropertyBinding.Composite")
  @js.native
  class Composite protected ()
    extends typings.three.propertyBindingMod.PropertyBinding.Composite {
    def this(targetGroup: js.Any, path: js.Any) = this()
    def this(targetGroup: js.Any, path: js.Any, parsedPath: js.Any) = this()
  }
  
  @JSImport("three", "PropertyBinding.create")
  @js.native
  def create(root: js.Any, path: js.Any): typings.three.propertyBindingMod.PropertyBinding | typings.three.propertyBindingMod.PropertyBinding.Composite = js.native
  @JSImport("three", "PropertyBinding.create")
  @js.native
  def create(root: js.Any, path: js.Any, parsedPath: js.Any): typings.three.propertyBindingMod.PropertyBinding | typings.three.propertyBindingMod.PropertyBinding.Composite = js.native
  
  @JSImport("three", "PropertyBinding.findNode")
  @js.native
  def findNode(root: js.Any, nodeName: String): js.Any = js.native
  
  @JSImport("three", "PropertyBinding.parseTrackName")
  @js.native
  def parseTrackName(trackName: String): ParseTrackNameResults = js.native
  
  @JSImport("three", "PropertyBinding.sanitizeNodeName")
  @js.native
  def sanitizeNodeName(name: String): String = js.native
}
