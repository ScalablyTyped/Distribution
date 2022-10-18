package typings.workboxPrecaching

import typings.std.URL
import typings.workboxPrecaching.anon.Url
import typings.workboxPrecaching.typesUrlmanipulationMod.URLManipulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFetchListenerOptionsMod {
  
  trait FetchListenerOptions extends StObject {
    
    var cleanURLs: js.UndefOr[Boolean] = js.undefined
    
    var directoryIndex: js.UndefOr[String] = js.undefined
    
    var ignoreURLParametersMatching: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    var urlManipulation: js.UndefOr[URLManipulation] = js.undefined
  }
  object FetchListenerOptions {
    
    inline def apply(): FetchListenerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchListenerOptions]
    }
    
    extension [Self <: FetchListenerOptions](x: Self) {
      
      inline def setCleanURLs(value: Boolean): Self = StObject.set(x, "cleanURLs", value.asInstanceOf[js.Any])
      
      inline def setCleanURLsUndefined: Self = StObject.set(x, "cleanURLs", js.undefined)
      
      inline def setDirectoryIndex(value: String): Self = StObject.set(x, "directoryIndex", value.asInstanceOf[js.Any])
      
      inline def setDirectoryIndexUndefined: Self = StObject.set(x, "directoryIndex", js.undefined)
      
      inline def setIgnoreURLParametersMatching(value: js.Array[js.RegExp]): Self = StObject.set(x, "ignoreURLParametersMatching", value.asInstanceOf[js.Any])
      
      inline def setIgnoreURLParametersMatchingUndefined: Self = StObject.set(x, "ignoreURLParametersMatching", js.undefined)
      
      inline def setIgnoreURLParametersMatchingVarargs(value: js.RegExp*): Self = StObject.set(x, "ignoreURLParametersMatching", js.Array(value*))
      
      inline def setUrlManipulation(value: /* url */ Url => js.Array[URL]): Self = StObject.set(x, "urlManipulation", js.Any.fromFunction1(value))
      
      inline def setUrlManipulationUndefined: Self = StObject.set(x, "urlManipulation", js.undefined)
    }
  }
}
