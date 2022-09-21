package typings.unsplashJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRequestMod {
  
  @js.native
  sealed trait OrderBy extends StObject
  @JSImport("unsplash-js/dist/types/request", "OrderBy")
  @js.native
  object OrderBy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OrderBy & String] = js.native
    
    @js.native
    sealed trait DOWNLOADS
      extends StObject
         with OrderBy
    /* "downloads" */ val DOWNLOADS: typings.unsplashJs.distTypesRequestMod.OrderBy.DOWNLOADS & String = js.native
    
    @js.native
    sealed trait LATEST
      extends StObject
         with OrderBy
    /* "latest" */ val LATEST: typings.unsplashJs.distTypesRequestMod.OrderBy.LATEST & String = js.native
    
    @js.native
    sealed trait OLDEST
      extends StObject
         with OrderBy
    /* "oldest" */ val OLDEST: typings.unsplashJs.distTypesRequestMod.OrderBy.OLDEST & String = js.native
    
    @js.native
    sealed trait POPULAR
      extends StObject
         with OrderBy
    /* "popular" */ val POPULAR: typings.unsplashJs.distTypesRequestMod.OrderBy.POPULAR & String = js.native
    
    @js.native
    sealed trait VIEWS
      extends StObject
         with OrderBy
    /* "views" */ val VIEWS: typings.unsplashJs.distTypesRequestMod.OrderBy.VIEWS & String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.landscape
    - typings.unsplashJs.unsplashJsStrings.portrait
    - typings.unsplashJs.unsplashJsStrings.squarish
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def landscape: typings.unsplashJs.unsplashJsStrings.landscape = "landscape".asInstanceOf[typings.unsplashJs.unsplashJsStrings.landscape]
    
    inline def portrait: typings.unsplashJs.unsplashJsStrings.portrait = "portrait".asInstanceOf[typings.unsplashJs.unsplashJsStrings.portrait]
    
    inline def squarish: typings.unsplashJs.unsplashJsStrings.squarish = "squarish".asInstanceOf[typings.unsplashJs.unsplashJsStrings.squarish]
  }
  
  trait OrientationParam extends StObject {
    
    var orientation: js.UndefOr[Orientation] = js.undefined
  }
  object OrientationParam {
    
    inline def apply(): OrientationParam = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrientationParam]
    }
    
    extension [Self <: OrientationParam](x: Self) {
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
  
  trait PaginationParams extends StObject {
    
    /**
      * API defaults to `"latest"` if no value is provided
      */
    var orderBy: js.UndefOr[OrderBy] = js.undefined
    
    /**
      * API defaults to `1` if no value is provided
      */
    var page: js.UndefOr[Double] = js.undefined
    
    /**
      * API defaults to `10` if no value is provided
      */
    var perPage: js.UndefOr[Double] = js.undefined
  }
  object PaginationParams {
    
    inline def apply(): PaginationParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationParams]
    }
    
    extension [Self <: PaginationParams](x: Self) {
      
      inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
      
      inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
    }
  }
}
