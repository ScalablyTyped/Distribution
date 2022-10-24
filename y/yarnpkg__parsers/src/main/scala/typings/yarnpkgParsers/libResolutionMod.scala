package typings.yarnpkgParsers

import typings.yarnpkgParsers.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResolutionMod {
  
  @JSImport("@yarnpkg/parsers/lib/resolution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseResolution(source: String): Resolution = ^.asInstanceOf[js.Dynamic].applyDynamic("parseResolution")(source.asInstanceOf[js.Any]).asInstanceOf[Resolution]
  
  inline def stringifyResolution(resolution: Resolution): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyResolution")(resolution.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Resolution extends StObject {
    
    var descriptor: Description
    
    var from: js.UndefOr[Description] = js.undefined
  }
  object Resolution {
    
    inline def apply(descriptor: Description): Resolution = {
      val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resolution]
    }
    
    extension [Self <: Resolution](x: Self) {
      
      inline def setDescriptor(value: Description): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: Description): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    }
  }
}
