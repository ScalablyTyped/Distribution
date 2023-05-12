package typings.workboxBuild.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<workbox-build.workbox-build/build/types.GlobPartial, 'globDirectory' | 'globPatterns' | 'templatedURLs'> & {  globDirectory :string,   globPattern :string} */
trait OmitGlobPartialglobDirect extends StObject {
  
  var globDirectory: String
  
  var globFollow: js.UndefOr[Boolean] = js.undefined
  
  var globIgnores: js.UndefOr[js.Array[String]] = js.undefined
  
  var globPattern: String
  
  var globStrict: js.UndefOr[Boolean] = js.undefined
}
object OmitGlobPartialglobDirect {
  
  inline def apply(globDirectory: String, globPattern: String): OmitGlobPartialglobDirect = {
    val __obj = js.Dynamic.literal(globDirectory = globDirectory.asInstanceOf[js.Any], globPattern = globPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitGlobPartialglobDirect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitGlobPartialglobDirect] (val x: Self) extends AnyVal {
    
    inline def setGlobDirectory(value: String): Self = StObject.set(x, "globDirectory", value.asInstanceOf[js.Any])
    
    inline def setGlobFollow(value: Boolean): Self = StObject.set(x, "globFollow", value.asInstanceOf[js.Any])
    
    inline def setGlobFollowUndefined: Self = StObject.set(x, "globFollow", js.undefined)
    
    inline def setGlobIgnores(value: js.Array[String]): Self = StObject.set(x, "globIgnores", value.asInstanceOf[js.Any])
    
    inline def setGlobIgnoresUndefined: Self = StObject.set(x, "globIgnores", js.undefined)
    
    inline def setGlobIgnoresVarargs(value: String*): Self = StObject.set(x, "globIgnores", js.Array(value*))
    
    inline def setGlobPattern(value: String): Self = StObject.set(x, "globPattern", value.asInstanceOf[js.Any])
    
    inline def setGlobStrict(value: Boolean): Self = StObject.set(x, "globStrict", value.asInstanceOf[js.Any])
    
    inline def setGlobStrictUndefined: Self = StObject.set(x, "globStrict", js.undefined)
  }
}
