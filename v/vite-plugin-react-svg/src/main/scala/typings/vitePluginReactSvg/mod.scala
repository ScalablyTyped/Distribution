package typings.vitePluginReactSvg

import typings.react.mod.SVGAttributes
import typings.std.Record
import typings.std.SVGSVGElement
import typings.vite.mod.Plugin2
import typings.vitePluginReactSvg.vitePluginReactSvgBooleans.`false`
import typings.vitePluginReactSvg.vitePluginReactSvgStrings.component
import typings.vitePluginReactSvg.vitePluginReactSvgStrings.end
import typings.vitePluginReactSvg.vitePluginReactSvgStrings.start
import typings.vitePluginReactSvg.vitePluginReactSvgStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Plugin2 = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin2]
  inline def apply(options: Options): Plugin2 = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin2]
  
  @JSImport("vite-plugin-react-svg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Default behavior when importing `.svg` files, possible options are: `url` and `component`.
      *
      * Default value: `url`
      */
    var defaultExport: js.UndefOr[url | component] = js.undefined
    
    /** Props to be forwarded on SVG tag, possible options: `start`, `end` or `false` */
    var expandProps: js.UndefOr[start | end | `false`] = js.undefined
    
    /** Setting this to `true` will wrap the exported component in `React.memo` */
    var memo: js.UndefOr[Boolean] = js.undefined
    
    /** Setting this to `true` will forward ref to the root SVG tag */
    var ref: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Replace an attribute value by another.
      * The main usage of this option is to change an icon color to `currentColor` in order to inherit from text color.
      */
    var replaceAttrValues: js.UndefOr[Record[String, Any]] = js.undefined
    
    /** Add props to the root SVG tag */
    var svgProps: js.UndefOr[SVGAttributes[SVGSVGElement]] = js.undefined
    
    /** Boolean flag to enable/disable SVGO */
    var svgo: js.UndefOr[Boolean] = js.undefined
    
    /** Specify SVGO config */
    var svgoConfig: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OptimizeOptions */ Any
      ] = js.undefined
    
    /** Add title tag via `title` property */
    var titleProp: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDefaultExport(value: url | component): Self = StObject.set(x, "defaultExport", value.asInstanceOf[js.Any])
      
      inline def setDefaultExportUndefined: Self = StObject.set(x, "defaultExport", js.undefined)
      
      inline def setExpandProps(value: start | end | `false`): Self = StObject.set(x, "expandProps", value.asInstanceOf[js.Any])
      
      inline def setExpandPropsUndefined: Self = StObject.set(x, "expandProps", js.undefined)
      
      inline def setMemo(value: Boolean): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
      
      inline def setMemoUndefined: Self = StObject.set(x, "memo", js.undefined)
      
      inline def setRef(value: Boolean): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setReplaceAttrValues(value: Record[String, Any]): Self = StObject.set(x, "replaceAttrValues", value.asInstanceOf[js.Any])
      
      inline def setReplaceAttrValuesUndefined: Self = StObject.set(x, "replaceAttrValues", js.undefined)
      
      inline def setSvgProps(value: SVGAttributes[SVGSVGElement]): Self = StObject.set(x, "svgProps", value.asInstanceOf[js.Any])
      
      inline def setSvgPropsUndefined: Self = StObject.set(x, "svgProps", js.undefined)
      
      inline def setSvgo(value: Boolean): Self = StObject.set(x, "svgo", value.asInstanceOf[js.Any])
      
      inline def setSvgoConfig(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OptimizeOptions */ Any
      ): Self = StObject.set(x, "svgoConfig", value.asInstanceOf[js.Any])
      
      inline def setSvgoConfigUndefined: Self = StObject.set(x, "svgoConfig", js.undefined)
      
      inline def setSvgoUndefined: Self = StObject.set(x, "svgo", js.undefined)
      
      inline def setTitleProp(value: Boolean): Self = StObject.set(x, "titleProp", value.asInstanceOf[js.Any])
      
      inline def setTitlePropUndefined: Self = StObject.set(x, "titleProp", js.undefined)
    }
  }
}
