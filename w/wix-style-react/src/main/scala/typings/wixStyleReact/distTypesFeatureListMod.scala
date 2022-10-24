package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFeatureListMod {
  
  @JSImport("wix-style-react/dist/types/FeatureList", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FeatureListProps, js.Object, Any]
  
  type FeatureList = Component[FeatureListProps, js.Object, Any]
  
  trait FeatureListProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var features: js.UndefOr[js.Array[FeatureType]] = js.undefined
  }
  object FeatureListProps {
    
    inline def apply(): FeatureListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureListProps]
    }
    
    extension [Self <: FeatureListProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFeatures(value: js.Array[FeatureType]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setFeaturesVarargs(value: FeatureType*): Self = StObject.set(x, "features", js.Array(value*))
    }
  }
  
  trait FeatureType extends StObject {
    
    var image: ReactNode
    
    var text: String
    
    var title: String
  }
  object FeatureType {
    
    inline def apply(text: String, title: String): FeatureType = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureType]
    }
    
    extension [Self <: FeatureType](x: Self) {
      
      inline def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
