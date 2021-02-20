package typings.uifabricUtilities

import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricMergeStyles.istylesetMod.IProcessedStyleSet
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classNamesFunctionMod {
  
  @JSImport("@uifabric/utilities/lib/classNamesFunction", "classNamesFunction")
  @js.native
  def classNamesFunction[TStyleProps /* <: js.Object */, TStyleSet /* <: IStyleSet[TStyleSet] */](): js.Function2[
    /* getStyles */ js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    IProcessedStyleSet[TStyleSet]
  ] = js.native
  @JSImport("@uifabric/utilities/lib/classNamesFunction", "classNamesFunction")
  @js.native
  def classNamesFunction[TStyleProps /* <: js.Object */, TStyleSet /* <: IStyleSet[TStyleSet] */](options: IClassNamesFunctionOptions): js.Function2[
    /* getStyles */ js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    IProcessedStyleSet[TStyleSet]
  ] = js.native
  
  @js.native
  trait IClassNamesFunctionOptions extends StObject {
    
    /**
      * Size of the cache. It overwrites default cache size when defined.
      */
    var cacheSize: js.UndefOr[Double] = js.native
    
    /**
      * Disables class caching for scenarios where styleProp parts mutate frequently.
      */
    var disableCaching: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to true if component base styles are implemented in scss instead of css-in-js.
      */
    var useStaticStyles: js.UndefOr[Boolean] = js.native
  }
  object IClassNamesFunctionOptions {
    
    @scala.inline
    def apply(): IClassNamesFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClassNamesFunctionOptions]
    }
    
    @scala.inline
    implicit class IClassNamesFunctionOptionsMutableBuilder[Self <: IClassNamesFunctionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      @scala.inline
      def setDisableCaching(value: Boolean): Self = StObject.set(x, "disableCaching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCachingUndefined: Self = StObject.set(x, "disableCaching", js.undefined)
      
      @scala.inline
      def setUseStaticStyles(value: Boolean): Self = StObject.set(x, "useStaticStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStaticStylesUndefined: Self = StObject.set(x, "useStaticStyles", js.undefined)
    }
  }
}
