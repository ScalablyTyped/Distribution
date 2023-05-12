package typings.workboxPrecaching

import typings.std.URL
import typings.workboxPrecaching.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait CleanupResult extends StObject {
    
    var deletedCacheRequests: js.Array[String]
  }
  object CleanupResult {
    
    inline def apply(deletedCacheRequests: js.Array[String]): CleanupResult = {
      val __obj = js.Dynamic.literal(deletedCacheRequests = deletedCacheRequests.asInstanceOf[js.Any])
      __obj.asInstanceOf[CleanupResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CleanupResult] (val x: Self) extends AnyVal {
      
      inline def setDeletedCacheRequests(value: js.Array[String]): Self = StObject.set(x, "deletedCacheRequests", value.asInstanceOf[js.Any])
      
      inline def setDeletedCacheRequestsVarargs(value: String*): Self = StObject.set(x, "deletedCacheRequests", js.Array(value*))
    }
  }
  
  trait InstallResult extends StObject {
    
    var notUpdatedURLs: js.Array[String]
    
    var updatedURLs: js.Array[String]
  }
  object InstallResult {
    
    inline def apply(notUpdatedURLs: js.Array[String], updatedURLs: js.Array[String]): InstallResult = {
      val __obj = js.Dynamic.literal(notUpdatedURLs = notUpdatedURLs.asInstanceOf[js.Any], updatedURLs = updatedURLs.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstallResult] (val x: Self) extends AnyVal {
      
      inline def setNotUpdatedURLs(value: js.Array[String]): Self = StObject.set(x, "notUpdatedURLs", value.asInstanceOf[js.Any])
      
      inline def setNotUpdatedURLsVarargs(value: String*): Self = StObject.set(x, "notUpdatedURLs", js.Array(value*))
      
      inline def setUpdatedURLs(value: js.Array[String]): Self = StObject.set(x, "updatedURLs", value.asInstanceOf[js.Any])
      
      inline def setUpdatedURLsVarargs(value: String*): Self = StObject.set(x, "updatedURLs", js.Array(value*))
    }
  }
  
  trait PrecacheEntry extends StObject {
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var revision: js.UndefOr[String | Null] = js.undefined
    
    var url: String
  }
  object PrecacheEntry {
    
    inline def apply(url: String): PrecacheEntry = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrecacheEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrecacheEntry] (val x: Self) extends AnyVal {
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setRevisionNull: Self = StObject.set(x, "revision", null)
      
      inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrecacheRouteOptions extends StObject {
    
    var cleanURLs: js.UndefOr[Boolean] = js.undefined
    
    var directoryIndex: js.UndefOr[String] = js.undefined
    
    var ignoreURLParametersMatching: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    var urlManipulation: js.UndefOr[typings.workboxPrecaching.typesMod.urlManipulation] = js.undefined
  }
  object PrecacheRouteOptions {
    
    inline def apply(): PrecacheRouteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrecacheRouteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrecacheRouteOptions] (val x: Self) extends AnyVal {
      
      inline def setCleanURLs(value: Boolean): Self = StObject.set(x, "cleanURLs", value.asInstanceOf[js.Any])
      
      inline def setCleanURLsUndefined: Self = StObject.set(x, "cleanURLs", js.undefined)
      
      inline def setDirectoryIndex(value: String): Self = StObject.set(x, "directoryIndex", value.asInstanceOf[js.Any])
      
      inline def setDirectoryIndexUndefined: Self = StObject.set(x, "directoryIndex", js.undefined)
      
      inline def setIgnoreURLParametersMatching(value: js.Array[js.RegExp]): Self = StObject.set(x, "ignoreURLParametersMatching", value.asInstanceOf[js.Any])
      
      inline def setIgnoreURLParametersMatchingUndefined: Self = StObject.set(x, "ignoreURLParametersMatching", js.undefined)
      
      inline def setIgnoreURLParametersMatchingVarargs(value: js.RegExp*): Self = StObject.set(x, "ignoreURLParametersMatching", js.Array(value*))
      
      inline def setUrlManipulation(value: /* param0 */ Url => js.Array[URL]): Self = StObject.set(x, "urlManipulation", js.Any.fromFunction1(value))
      
      inline def setUrlManipulationUndefined: Self = StObject.set(x, "urlManipulation", js.undefined)
    }
  }
  
  type urlManipulation = js.Function1[/* param0 */ Url, js.Array[URL]]
}
