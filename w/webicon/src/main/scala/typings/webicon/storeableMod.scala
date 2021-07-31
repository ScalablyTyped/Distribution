package typings.webicon

import typings.webicon.downloadableMod.Downloadable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeableMod {
  
  trait Storeable
    extends StObject
       with Downloadable[scala.Nothing] {
    
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
  object Storeable {
    
    @scala.inline
    def apply(): Storeable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Storeable]
    }
    
    @scala.inline
    implicit class StoreableMutableBuilder[Self <: Storeable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconIdResolver(value: /* id */ String => String): Self = StObject.set(x, "iconIdResolver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconIdResolverUndefined: Self = StObject.set(x, "iconIdResolver", js.undefined)
      
      @scala.inline
      def setPreloadable(value: Boolean): Self = StObject.set(x, "preloadable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadableUndefined: Self = StObject.set(x, "preloadable", js.undefined)
    }
  }
}
