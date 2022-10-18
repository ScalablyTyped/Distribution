package typings.three.global.THREE

import typings.three.srcAnimationPropertyBindingMod.ParseTrackNameResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.PropertyBinding")
@js.native
open class PropertyBinding protected ()
  extends typings.three.mod.PropertyBinding {
  def this(rootNode: Any, path: String) = this()
  def this(rootNode: Any, path: String, parsedPath: Any) = this()
}
/* static members */
object PropertyBinding {
  
  @JSGlobal("THREE.PropertyBinding")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("THREE.PropertyBinding.Composite")
  @js.native
  open class Composite protected ()
    extends typings.three.mod.PropertyBinding.Composite {
    def this(targetGroup: Any, path: Any) = this()
    def this(targetGroup: Any, path: Any, parsedPath: Any) = this()
  }
  
  inline def create(root: Any, path: Any): typings.three.srcAnimationPropertyBindingMod.PropertyBinding | typings.three.srcAnimationPropertyBindingMod.PropertyBinding.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcAnimationPropertyBindingMod.PropertyBinding | typings.three.srcAnimationPropertyBindingMod.PropertyBinding.Composite]
  inline def create(root: Any, path: Any, parsedPath: Any): typings.three.srcAnimationPropertyBindingMod.PropertyBinding | typings.three.srcAnimationPropertyBindingMod.PropertyBinding.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any], parsedPath.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcAnimationPropertyBindingMod.PropertyBinding | typings.three.srcAnimationPropertyBindingMod.PropertyBinding.Composite]
  
  inline def findNode(root: Any, nodeName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findNode")(root.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseTrackName(trackName: String): ParseTrackNameResults = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTrackName")(trackName.asInstanceOf[js.Any]).asInstanceOf[ParseTrackNameResults]
  
  inline def sanitizeNodeName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeNodeName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
