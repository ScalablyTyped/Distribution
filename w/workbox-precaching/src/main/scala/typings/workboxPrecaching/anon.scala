package typings.workboxPrecaching

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FallbackURL extends StObject {
    
    var fallbackURL: String
    
    var precacheController: js.UndefOr[typings.workboxPrecaching.precacheControllerMod.PrecacheController] = js.undefined
  }
  object FallbackURL {
    
    inline def apply(fallbackURL: String): FallbackURL = {
      val __obj = js.Dynamic.literal(fallbackURL = fallbackURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[FallbackURL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FallbackURL] (val x: Self) extends AnyVal {
      
      inline def setFallbackURL(value: String): Self = StObject.set(x, "fallbackURL", value.asInstanceOf[js.Any])
      
      inline def setPrecacheController(value: typings.workboxPrecaching.precacheControllerMod.PrecacheController): Self = StObject.set(x, "precacheController", value.asInstanceOf[js.Any])
      
      inline def setPrecacheControllerUndefined: Self = StObject.set(x, "precacheController", js.undefined)
    }
  }
  
  trait PrecacheController extends StObject {
    
    var precacheController: typings.workboxPrecaching.precacheControllerMod.PrecacheController
  }
  object PrecacheController {
    
    inline def apply(precacheController: typings.workboxPrecaching.precacheControllerMod.PrecacheController): PrecacheController = {
      val __obj = js.Dynamic.literal(precacheController = precacheController.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrecacheController]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrecacheController] (val x: Self) extends AnyVal {
      
      inline def setPrecacheController(value: typings.workboxPrecaching.precacheControllerMod.PrecacheController): Self = StObject.set(x, "precacheController", value.asInstanceOf[js.Any])
    }
  }
  
  trait Url extends StObject {
    
    var url: URL
  }
  object Url {
    
    inline def apply(url: URL): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
