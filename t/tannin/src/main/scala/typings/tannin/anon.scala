package typings.tannin

import org.scalablytyped.runtime.StringDictionary
import typings.tannin.mod.TanninDomainMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[TanninDomainMetadata | (js.Tuple2[String, String])] {
    
    @JSName("")
    var _empty: TanninDomainMetadata | (js.Tuple2[String, String])
  }
  object Dictkey {
    
    inline def apply(_empty: TanninDomainMetadata | (js.Tuple2[String, String])): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def set_empty(value: TanninDomainMetadata | (js.Tuple2[String, String])): Self = StObject.set(x, "", value.asInstanceOf[js.Any])
    }
  }
}
