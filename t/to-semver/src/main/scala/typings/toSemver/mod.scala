package typings.toSemver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("to-semver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(versions: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(versions.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def default(versions: js.Array[String], options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(versions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait Options extends StObject {
    
    /**
    	Clean versions. For example, `v1.3.0` → `1.3.0`.
    	@default true
    	*/
    val clean: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Include prereleases, like `1.2.3-alpha.3`.
    	@default true
    	*/
    val includePrereleases: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      inline def setIncludePrereleases(value: Boolean): Self = StObject.set(x, "includePrereleases", value.asInstanceOf[js.Any])
      
      inline def setIncludePrereleasesUndefined: Self = StObject.set(x, "includePrereleases", js.undefined)
    }
  }
}
