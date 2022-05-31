package typings.three.global.THREE

import typings.three.propertyBindingMod.ParseTrackNameResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.PropertyBinding")
@js.native
class PropertyBinding protected ()
  extends typings.three.mod.PropertyBinding {
  def this(rootNode: js.Any, path: String) = this()
  def this(rootNode: js.Any, path: String, parsedPath: js.Any) = this()
}
/* static members */
object PropertyBinding {
  
  @JSGlobal("THREE.PropertyBinding")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("THREE.PropertyBinding.Composite")
  @js.native
  class Composite protected ()
    extends typings.three.mod.PropertyBinding.Composite {
    def this(targetGroup: js.Any, path: js.Any) = this()
    def this(targetGroup: js.Any, path: js.Any, parsedPath: js.Any) = this()
  }
  
  inline def create(root: js.Any, path: js.Any): typings.three.propertyBindingMod.PropertyBinding | typings.three.propertyBindingMod.PropertyBinding.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.three.propertyBindingMod.PropertyBinding | typings.three.propertyBindingMod.PropertyBinding.Composite]
  inline def create(root: js.Any, path: js.Any, parsedPath: js.Any): typings.three.propertyBindingMod.PropertyBinding | typings.three.propertyBindingMod.PropertyBinding.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any], parsedPath.asInstanceOf[js.Any])).asInstanceOf[typings.three.propertyBindingMod.PropertyBinding | typings.three.propertyBindingMod.PropertyBinding.Composite]
  
  inline def findNode(root: js.Any, nodeName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findNode")(root.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def parseTrackName(trackName: String): ParseTrackNameResults = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTrackName")(trackName.asInstanceOf[js.Any]).asInstanceOf[ParseTrackNameResults]
  
  inline def sanitizeNodeName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeNodeName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
