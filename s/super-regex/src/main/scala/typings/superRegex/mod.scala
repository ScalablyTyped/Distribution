package typings.superRegex

import typings.functionTimeout.mod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("super-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def firstMatch(regex: js.RegExp, string: String): js.UndefOr[Match] = (^.asInstanceOf[js.Dynamic].applyDynamic("firstMatch")(regex.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Match]]
  inline def firstMatch(regex: js.RegExp, string: String, options: Options): js.UndefOr[Match] = (^.asInstanceOf[js.Dynamic].applyDynamic("firstMatch")(regex.asInstanceOf[js.Any], string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Match]]
  
  inline def isMatch(regex: js.RegExp, string: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(regex.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(regex: js.RegExp, string: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(regex.asInstanceOf[js.Any], string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matches(regex: js.RegExp, string: String): js.Iterable[Match] = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(regex.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[Match]]
  inline def matches(regex: js.RegExp, string: String, options: MatchesOptions): js.Iterable[Match] = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(regex.asInstanceOf[js.Any], string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[Match]]
  
  trait Match extends StObject {
    
    var groups: js.Array[String]
    
    var index: Double
    
    var input: String
    
    var `match`: String
    
    var namedGroups: Record[String, String]
  }
  object Match {
    
    inline def apply(
      groups: js.Array[String],
      index: Double,
      input: String,
      `match`: String,
      namedGroups: Record[String, String]
    ): Match = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], namedGroups = namedGroups.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setNamedGroups(value: Record[String, String]): Self = StObject.set(x, "namedGroups", value.asInstanceOf[js.Any])
    }
  }
  
  trait MatchesOptions
    extends StObject
       with Options {
    
    /**
    	The time in milliseconds to wait before timing out when searching for each match.
    	*/
    val matchTimeout: js.UndefOr[Double] = js.undefined
  }
  object MatchesOptions {
    
    inline def apply(): MatchesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatchesOptions] (val x: Self) extends AnyVal {
      
      inline def setMatchTimeout(value: Double): Self = StObject.set(x, "matchTimeout", value.asInstanceOf[js.Any])
      
      inline def setMatchTimeoutUndefined: Self = StObject.set(x, "matchTimeout", js.undefined)
    }
  }
}
