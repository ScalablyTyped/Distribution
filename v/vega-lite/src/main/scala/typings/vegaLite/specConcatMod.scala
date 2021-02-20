package typings.vegaLite

import typings.vegaLite.specBaseMod.BaseSpec
import typings.vegaLite.specBaseMod.BoundsMixins
import typings.vegaLite.specBaseMod.ColumnMixins
import typings.vegaLite.specBaseMod.GenericCompositionLayout
import typings.vegaLite.specBaseMod.ResolveMixins
import typings.vegaLite.specMod.GenericSpec
import typings.vegaLite.specMod.NormalizedSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object specConcatMod {
  
  @JSImport("vega-lite/build/src/spec/concat", "isAnyConcatSpec")
  @js.native
  def isAnyConcatSpec(spec: BaseSpec): Boolean = js.native
  
  @JSImport("vega-lite/build/src/spec/concat", "isConcatSpec")
  @js.native
  def isConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/concat.GenericConcatSpec<any> */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/spec/concat", "isHConcatSpec")
  @js.native
  def isHConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/concat.GenericHConcatSpec<any> */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/spec/concat", "isVConcatSpec")
  @js.native
  def isVConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/concat.GenericVConcatSpec<any> */ Boolean = js.native
  
  @js.native
  trait GenericConcatSpec[S /* <: GenericSpec[_, _, _, _] */]
    extends GenericCompositionLayout
       with BaseSpec
       with ColumnMixins
       with ResolveMixins {
    
    /**
      * A list of views to be concatenated.
      */
    var concat: js.Array[S] = js.native
  }
  object GenericConcatSpec {
    
    @scala.inline
    def apply[S /* <: GenericSpec[_, _, _, _] */](concat: js.Array[S]): GenericConcatSpec[S] = {
      val __obj = js.Dynamic.literal(concat = concat.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericConcatSpec[S]]
    }
    
    @scala.inline
    implicit class GenericConcatSpecMutableBuilder[Self <: GenericConcatSpec[_], S /* <: GenericSpec[_, _, _, _] */] (val x: Self with GenericConcatSpec[S]) extends AnyVal {
      
      @scala.inline
      def setConcat(value: js.Array[S]): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcatVarargs(value: S*): Self = StObject.set(x, "concat", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GenericHConcatSpec[S /* <: GenericSpec[_, _, _, _] */]
    extends OneDirectionalConcatLayout
       with BaseSpec {
    
    /**
      * A list of views to be concatenated and put into a row.
      */
    var hconcat: js.Array[S] = js.native
  }
  object GenericHConcatSpec {
    
    @scala.inline
    def apply[S /* <: GenericSpec[_, _, _, _] */](hconcat: js.Array[S]): GenericHConcatSpec[S] = {
      val __obj = js.Dynamic.literal(hconcat = hconcat.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericHConcatSpec[S]]
    }
    
    @scala.inline
    implicit class GenericHConcatSpecMutableBuilder[Self <: GenericHConcatSpec[_], S /* <: GenericSpec[_, _, _, _] */] (val x: Self with GenericHConcatSpec[S]) extends AnyVal {
      
      @scala.inline
      def setHconcat(value: js.Array[S]): Self = StObject.set(x, "hconcat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHconcatVarargs(value: S*): Self = StObject.set(x, "hconcat", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GenericVConcatSpec[S /* <: GenericSpec[_, _, _, _] */]
    extends OneDirectionalConcatLayout
       with BaseSpec {
    
    /**
      * A list of views to be concatenated and put into a column.
      */
    var vconcat: js.Array[S] = js.native
  }
  object GenericVConcatSpec {
    
    @scala.inline
    def apply[S /* <: GenericSpec[_, _, _, _] */](vconcat: js.Array[S]): GenericVConcatSpec[S] = {
      val __obj = js.Dynamic.literal(vconcat = vconcat.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericVConcatSpec[S]]
    }
    
    @scala.inline
    implicit class GenericVConcatSpecMutableBuilder[Self <: GenericVConcatSpec[_], S /* <: GenericSpec[_, _, _, _] */] (val x: Self with GenericVConcatSpec[S]) extends AnyVal {
      
      @scala.inline
      def setVconcat(value: js.Array[S]): Self = StObject.set(x, "vconcat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVconcatVarargs(value: S*): Self = StObject.set(x, "vconcat", js.Array(value :_*))
    }
  }
  
  type NormalizedConcatSpec = GenericConcatSpec[NormalizedSpec] | GenericVConcatSpec[NormalizedSpec] | GenericHConcatSpec[NormalizedSpec]
  
  @js.native
  trait OneDirectionalConcatLayout
    extends BoundsMixins
       with ResolveMixins {
    
    /**
      * Boolean flag indicating if subviews should be centered relative to their respective rows or columns.
      *
      * __Default value:__ `false`
      */
    var center: js.UndefOr[Boolean] = js.native
    
    /**
      * The spacing in pixels between sub-views of the concat operator.
      *
      * __Default value__: `10`
      */
    var spacing: js.UndefOr[Double] = js.native
  }
  object OneDirectionalConcatLayout {
    
    @scala.inline
    def apply(): OneDirectionalConcatLayout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OneDirectionalConcatLayout]
    }
    
    @scala.inline
    implicit class OneDirectionalConcatLayoutMutableBuilder[Self <: OneDirectionalConcatLayout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
}
