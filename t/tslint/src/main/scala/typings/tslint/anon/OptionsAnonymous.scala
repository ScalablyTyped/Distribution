package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsAnonymous extends StObject {
  
  var options: Anonymous
}
object OptionsAnonymous {
  
  inline def apply(options: Anonymous): OptionsAnonymous = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsAnonymous]
  }
  
  extension [Self <: OptionsAnonymous](x: Self) {
    
    inline def setOptions(value: Anonymous): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
