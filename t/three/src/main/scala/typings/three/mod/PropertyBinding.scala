package typings.three.mod

import typings.three.propertyBindingMod.ParseTrackNameResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("three", "PropertyBinding")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three", "PropertyBinding.Composite")
  @js.native
  class Composite protected ()
    extends typings.three.propertyBindingMod.PropertyBinding.Composite {
    def this(targetGroup: js.Any, path: js.Any) = this()
    def this(targetGroup: js.Any, path: js.Any, parsedPath: js.Any) = this()
  }
  
  @scala.inline
  def create(root: js.Any, path: js.Any): typings.three.propertyBindingMod.PropertyBinding | typings.three.propertyBindingMod.PropertyBinding.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.three.propertyBindingMod.PropertyBinding | typings.three.propertyBindingMod.PropertyBinding.Composite]
  @scala.inline
  def create(root: js.Any, path: js.Any, parsedPath: js.Any): typings.three.propertyBindingMod.PropertyBinding | typings.three.propertyBindingMod.PropertyBinding.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any], parsedPath.asInstanceOf[js.Any])).asInstanceOf[typings.three.propertyBindingMod.PropertyBinding | typings.three.propertyBindingMod.PropertyBinding.Composite]
  
  @scala.inline
  def findNode(root: js.Any, nodeName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findNode")(root.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def parseTrackName(trackName: String): ParseTrackNameResults = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTrackName")(trackName.asInstanceOf[js.Any]).asInstanceOf[ParseTrackNameResults]
  
  @scala.inline
  def sanitizeNodeName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeNodeName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
