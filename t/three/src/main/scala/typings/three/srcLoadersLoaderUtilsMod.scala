package typings.three

import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoadersLoaderUtilsMod {
  
  trait LoaderUtils extends StObject {
    
    def decodeText(array: BufferSource): String
    
    def extractUrlBase(url: String): String
    
    def resolveURL(url: String, path: String): String
  }
  object LoaderUtils {
    
    @JSImport("three/src/loaders/LoaderUtils", "LoaderUtils")
    @js.native
    val ^ : LoaderUtils = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoaderUtils] (val x: Self) extends AnyVal {
      
      inline def setDecodeText(value: BufferSource => String): Self = StObject.set(x, "decodeText", js.Any.fromFunction1(value))
      
      inline def setExtractUrlBase(value: String => String): Self = StObject.set(x, "extractUrlBase", js.Any.fromFunction1(value))
      
      inline def setResolveURL(value: (String, String) => String): Self = StObject.set(x, "resolveURL", js.Any.fromFunction2(value))
    }
  }
}
