package typings.vegaLite

import typings.vegaLite.specBaseMod.BaseSpec
import typings.vegaLite.specBaseMod.BoundsMixins
import typings.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns
import typings.vegaLite.specBaseMod.ResolveMixins
import typings.vegaLite.specMod.GenericSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object specConcatMod {
  
  @JSImport("vega-lite/build/src/spec/concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAnyConcatSpec(spec: BaseSpec): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyConcatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/concat.GenericConcatSpec<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConcatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/concat.GenericConcatSpec<any> */ Boolean]
  
  inline def isHConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/concat.GenericHConcatSpec<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHConcatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/concat.GenericHConcatSpec<any> */ Boolean]
  
  inline def isVConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/concat.GenericVConcatSpec<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVConcatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/concat.GenericVConcatSpec<any> */ Boolean]
  
  trait GenericConcatSpec[S /* <: GenericSpec[Any, Any, Any, Any] */]
    extends StObject
       with BaseSpec
       with GenericCompositionLayoutWithColumns
       with ResolveMixins {
    
    /**
      * A list of views to be concatenated.
      */
    var concat: js.Array[S]
  }
  object GenericConcatSpec {
    
    inline def apply[S /* <: GenericSpec[Any, Any, Any, Any] */](concat: js.Array[S]): GenericConcatSpec[S] = {
      val __obj = js.Dynamic.literal(concat = concat.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericConcatSpec[S]]
    }
    
    extension [Self <: GenericConcatSpec[?], S /* <: GenericSpec[Any, Any, Any, Any] */](x: Self & GenericConcatSpec[S]) {
      
      inline def setConcat(value: js.Array[S]): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      inline def setConcatVarargs(value: S*): Self = StObject.set(x, "concat", js.Array(value*))
    }
  }
  
  trait GenericHConcatSpec[S /* <: GenericSpec[Any, Any, Any, Any] */]
    extends StObject
       with BaseSpec
       with OneDirectionalConcatLayout {
    
    /**
      * A list of views to be concatenated and put into a row.
      */
    var hconcat: js.Array[S]
  }
  object GenericHConcatSpec {
    
    inline def apply[S /* <: GenericSpec[Any, Any, Any, Any] */](hconcat: js.Array[S]): GenericHConcatSpec[S] = {
      val __obj = js.Dynamic.literal(hconcat = hconcat.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericHConcatSpec[S]]
    }
    
    extension [Self <: GenericHConcatSpec[?], S /* <: GenericSpec[Any, Any, Any, Any] */](x: Self & GenericHConcatSpec[S]) {
      
      inline def setHconcat(value: js.Array[S]): Self = StObject.set(x, "hconcat", value.asInstanceOf[js.Any])
      
      inline def setHconcatVarargs(value: S*): Self = StObject.set(x, "hconcat", js.Array(value*))
    }
  }
  
  trait GenericVConcatSpec[S /* <: GenericSpec[Any, Any, Any, Any] */]
    extends StObject
       with BaseSpec
       with OneDirectionalConcatLayout {
    
    /**
      * A list of views to be concatenated and put into a column.
      */
    var vconcat: js.Array[S]
  }
  object GenericVConcatSpec {
    
    inline def apply[S /* <: GenericSpec[Any, Any, Any, Any] */](vconcat: js.Array[S]): GenericVConcatSpec[S] = {
      val __obj = js.Dynamic.literal(vconcat = vconcat.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericVConcatSpec[S]]
    }
    
    extension [Self <: GenericVConcatSpec[?], S /* <: GenericSpec[Any, Any, Any, Any] */](x: Self & GenericVConcatSpec[S]) {
      
      inline def setVconcat(value: js.Array[S]): Self = StObject.set(x, "vconcat", value.asInstanceOf[js.Any])
      
      inline def setVconcatVarargs(value: S*): Self = StObject.set(x, "vconcat", js.Array(value*))
    }
  }
  
  type NormalizedConcatSpec = GenericConcatSpec[Any] | GenericVConcatSpec[Any] | GenericHConcatSpec[Any]
  
  trait OneDirectionalConcatLayout
    extends StObject
       with BoundsMixins
       with ResolveMixins {
    
    /**
      * Boolean flag indicating if subviews should be centered relative to their respective rows or columns.
      *
      * __Default value:__ `false`
      */
    var center: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The spacing in pixels between sub-views of the concat operator.
      *
      * __Default value__: `10`
      */
    var spacing: js.UndefOr[Double] = js.undefined
  }
  object OneDirectionalConcatLayout {
    
    inline def apply(): OneDirectionalConcatLayout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OneDirectionalConcatLayout]
    }
    
    extension [Self <: OneDirectionalConcatLayout](x: Self) {
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
}
