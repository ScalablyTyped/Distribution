package typings.wouter

import org.scalablytyped.runtime.StringDictionary
import typings.wouter.anon.Name
import typings.wouter.useLocationMod.Path
import typings.wouter.wouterBooleans.`false`
import typings.wouter.wouterBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matcherMod {
  
  @JSImport("wouter/types/matcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): MatcherFn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[MatcherFn]
  inline def default(makeRegexpFn: js.Function1[/* pattern */ String, PatternToRegexpResult]): MatcherFn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(makeRegexpFn.asInstanceOf[js.Any]).asInstanceOf[MatcherFn]
  
  type DefaultParams = StringDictionary[String]
  
  type Match[T /* <: DefaultParams */] = MatchWithParams[T] | NoMatch
  
  type MatchWithParams[T /* <: DefaultParams */] = js.Tuple2[`true`, Params[T]]
  
  type MatcherFn = js.Function2[/* pattern */ Path, /* path */ Path, Match[DefaultParams]]
  
  type NoMatch = js.Tuple2[`false`, Null]
  
  type Params[T /* <: DefaultParams */] = T
  
  trait PatternToRegexpResult extends StObject {
    
    var keys: js.Array[Name]
    
    var regexp: js.RegExp
  }
  object PatternToRegexpResult {
    
    inline def apply(keys: js.Array[Name], regexp: js.RegExp): PatternToRegexpResult = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatternToRegexpResult]
    }
    
    extension [Self <: PatternToRegexpResult](x: Self) {
      
      inline def setKeys(value: js.Array[Name]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: Name*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setRegexp(value: js.RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    }
  }
}
