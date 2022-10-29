package typings.stylehacks

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.postcss.mod.Result
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Browsers extends StObject {
    
    var browsers: Set[String]
    
    var hack: String
    
    var identifier: String
    
    var message: String
  }
  object Browsers {
    
    inline def apply(browsers: Set[String], hack: String, identifier: String, message: String): Browsers = {
      val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], hack = hack.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browsers]
    }
    
    extension [Self <: Browsers](x: Self) {
      
      inline def setBrowsers(value: Set[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setHack(value: String): Self = StObject.set(x, "hack", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hack extends StObject {
    
    var hack: String
    
    var identifier: String
  }
  object Hack {
    
    inline def apply(hack: String, identifier: String): Hack = {
      val __obj = js.Dynamic.literal(hack = hack.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hack]
    }
    
    extension [Self <: Hack](x: Self) {
      
      inline def setHack(value: String): Self = StObject.set(x, "hack", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify trailingSlashComma */ Any
        ]
       with Instantiable1[
          /* result */ Result, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify trailingSlashComma */ Any
        ]
}
