package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureListMod {
  
  @JSImport("wix-style-react/dist/es/src/FeatureList", JSImport.Default)
  @js.native
  class default ()
    extends Component[FeatureListProps, js.Object, js.Any]
  
  type FeatureList = Component[FeatureListProps, js.Object, js.Any]
  
  trait FeatureListProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var features: js.UndefOr[js.Array[FeatureType]] = js.undefined
  }
  object FeatureListProps {
    
    @scala.inline
    def apply(): FeatureListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureListProps]
    }
    
    @scala.inline
    implicit class FeatureListPropsMutableBuilder[Self <: FeatureListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setFeatures(value: js.Array[FeatureType]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setFeaturesVarargs(value: FeatureType*): Self = StObject.set(x, "features", js.Array(value :_*))
    }
  }
  
  trait FeatureType extends StObject {
    
    var image: ReactNode
    
    var text: String
    
    var title: String
  }
  object FeatureType {
    
    @scala.inline
    def apply(text: String, title: String): FeatureType = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureType]
    }
    
    @scala.inline
    implicit class FeatureTypeMutableBuilder[Self <: FeatureType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
