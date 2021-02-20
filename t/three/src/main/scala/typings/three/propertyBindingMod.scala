package typings.three

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertyBindingMod {
  
  @JSImport("three/src/animation/PropertyBinding", "PropertyBinding")
  @js.native
  class PropertyBinding protected () extends StObject {
    def this(rootNode: js.Any, path: String) = this()
    def this(rootNode: js.Any, path: String, parsedPath: js.Any) = this()
    
    var BindingType: StringDictionary[Double] = js.native
    
    var GetterByBindingType: js.Array[js.Function] = js.native
    
    var SetterByBindingTypeAndVersioning: js.Array[js.Array[js.Function]] = js.native
    
    var Versioning: StringDictionary[Double] = js.native
    
    def bind(): Unit = js.native
    
    def getValue(targetArray: js.Any, offset: Double): js.Any = js.native
    
    var node: js.Any = js.native
    
    var parsedPath: js.Any = js.native
    
    var path: String = js.native
    
    var rootNode: js.Any = js.native
    
    def setValue(sourceArray: js.Any, offset: Double): Unit = js.native
    
    def unbind(): Unit = js.native
  }
  /* static members */
  object PropertyBinding {
    
    @JSImport("three/src/animation/PropertyBinding", "PropertyBinding.Composite")
    @js.native
    class Composite protected () extends StObject {
      def this(targetGroup: js.Any, path: js.Any) = this()
      def this(targetGroup: js.Any, path: js.Any, parsedPath: js.Any) = this()
      
      def bind(): Unit = js.native
      
      def getValue(array: js.Any, offset: Double): js.Any = js.native
      
      def setValue(array: js.Any, offset: Double): Unit = js.native
      
      def unbind(): Unit = js.native
    }
    
    @JSImport("three/src/animation/PropertyBinding", "PropertyBinding.create")
    @js.native
    def create(root: js.Any, path: js.Any): PropertyBinding | Composite = js.native
    @JSImport("three/src/animation/PropertyBinding", "PropertyBinding.create")
    @js.native
    def create(root: js.Any, path: js.Any, parsedPath: js.Any): PropertyBinding | Composite = js.native
    
    @JSImport("three/src/animation/PropertyBinding", "PropertyBinding.findNode")
    @js.native
    def findNode(root: js.Any, nodeName: String): js.Any = js.native
    
    @JSImport("three/src/animation/PropertyBinding", "PropertyBinding.parseTrackName")
    @js.native
    def parseTrackName(trackName: String): ParseTrackNameResults = js.native
    
    @JSImport("three/src/animation/PropertyBinding", "PropertyBinding.sanitizeNodeName")
    @js.native
    def sanitizeNodeName(name: String): String = js.native
  }
  
  @js.native
  trait ParseTrackNameResults extends StObject {
    
    var nodeName: String = js.native
    
    var objectIndex: String = js.native
    
    var objectName: String = js.native
    
    var propertyIndex: String = js.native
    
    var propertyName: String = js.native
  }
  object ParseTrackNameResults {
    
    @scala.inline
    def apply(
      nodeName: String,
      objectIndex: String,
      objectName: String,
      propertyIndex: String,
      propertyName: String
    ): ParseTrackNameResults = {
      val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], objectIndex = objectIndex.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any], propertyIndex = propertyIndex.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseTrackNameResults]
    }
    
    @scala.inline
    implicit class ParseTrackNameResultsMutableBuilder[Self <: ParseTrackNameResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectIndex(value: String): Self = StObject.set(x, "objectIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyIndex(value: String): Self = StObject.set(x, "propertyIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    }
  }
}
