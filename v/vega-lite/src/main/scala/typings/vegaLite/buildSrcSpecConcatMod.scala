package typings.vegaLite

import typings.vegaLite.buildSrcSpecBaseMod.BaseSpec
import typings.vegaLite.buildSrcSpecBaseMod.BoundsMixins
import typings.vegaLite.buildSrcSpecBaseMod.GenericCompositionLayoutWithColumns
import typings.vegaLite.buildSrcSpecBaseMod.ResolveMixins
import typings.vegaLite.buildSrcSpecMod.GenericSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSpecConcatMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenericConcatSpec[?], S /* <: GenericSpec[Any, Any, Any, Any] */] (val x: Self & GenericConcatSpec[S]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenericHConcatSpec[?], S /* <: GenericSpec[Any, Any, Any, Any] */] (val x: Self & GenericHConcatSpec[S]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenericVConcatSpec[?], S /* <: GenericSpec[Any, Any, Any, Any] */] (val x: Self & GenericVConcatSpec[S]) extends AnyVal {
      
      inline def setVconcat(value: js.Array[S]): Self = StObject.set(x, "vconcat", value.asInstanceOf[js.Any])
      
      inline def setVconcatVarargs(value: S*): Self = StObject.set(x, "vconcat", js.Array(value*))
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type NormalizedConcatSpec = vega-lite.vega-lite/build/src/spec/concat.GenericConcatSpec<vega-lite.vega-lite/build/src/spec.NormalizedSpec> | vega-lite.vega-lite/build/src/spec/concat.GenericVConcatSpec<vega-lite.vega-lite/build/src/spec.NormalizedSpec> | vega-lite.vega-lite/build/src/spec/concat.GenericHConcatSpec<vega-lite.vega-lite/build/src/spec.NormalizedSpec>
  }}}
  to avoid circular code involving: 
  - vega-lite.vega-lite/build/src/spec.GenericSpec
  - vega-lite.vega-lite/build/src/spec.NormalizedSpec
  - vega-lite.vega-lite/build/src/spec/concat.NormalizedConcatSpec
  */
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OneDirectionalConcatLayout] (val x: Self) extends AnyVal {
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
}
