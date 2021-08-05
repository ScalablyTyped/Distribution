package typings.webicon

import typings.webicon.iconSetOptionsMod.IconSetOptions
import typings.webicon.webiconBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgIconSetOptionsMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.webicon.iconMod.Icon because Already inherited
  - typings.webicon.downloadableMod.Downloadable because Already inherited
  - typings.webicon.storeableMod.Storeable because var conflicts: iconIdParser, uri, url. Inlined preloadable, iconIdResolver */ trait SvgIconSetOptions
    extends StObject
       with IconSetOptions {
    
    @JSName("cumulative")
    var cumulative_SvgIconSetOptions: js.UndefOr[`false`] = js.undefined
    
    /**
      * Resolves the id of the underlying source.
      *
      * @param id
      * The underlying id of the source.
      *
      * @return
      * The resolved id of the source.
      */
    var iconIdResolver: js.UndefOr[js.Function1[/* id */ String, String]] = js.undefined
    
    /**
      * A value indicating whether the source is preloadable.
      */
    var preloadable: js.UndefOr[Boolean] = js.undefined
  }
  object SvgIconSetOptions {
    
    inline def apply(): SvgIconSetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgIconSetOptions]
    }
    
    extension [Self <: SvgIconSetOptions](x: Self) {
      
      inline def setCumulative(value: `false`): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
      
      inline def setCumulativeUndefined: Self = StObject.set(x, "cumulative", js.undefined)
      
      inline def setIconIdResolver(value: /* id */ String => String): Self = StObject.set(x, "iconIdResolver", js.Any.fromFunction1(value))
      
      inline def setIconIdResolverUndefined: Self = StObject.set(x, "iconIdResolver", js.undefined)
      
      inline def setPreloadable(value: Boolean): Self = StObject.set(x, "preloadable", value.asInstanceOf[js.Any])
      
      inline def setPreloadableUndefined: Self = StObject.set(x, "preloadable", js.undefined)
    }
  }
}
