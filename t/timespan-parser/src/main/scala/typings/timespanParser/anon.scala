package typings.timespanParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GetString extends StObject {
    
    var getString: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof timespan.getString */ Any
    
    var parse: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof timespan.parse */ Any
  }
  object GetString {
    
    inline def apply(
      getString: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof timespan.getString */ Any,
      parse: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof timespan.parse */ Any
    ): GetString = {
      val __obj = js.Dynamic.literal(getString = getString.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetString] (val x: Self) extends AnyVal {
      
      inline def setGetString(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof timespan.getString */ Any
      ): Self = StObject.set(x, "getString", value.asInstanceOf[js.Any])
      
      inline def setParse(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof timespan.parse */ Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    }
  }
}
