package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathParser extends StObject {
  
  /**
    * Keys that appeared in the path
    */
  var keys: js.Array[PathParserParamKey]
  
  /**
    * Parses a url and returns the matched params or null if it doesn't match. An
    * optional param that isn't preset will be an empty string. A repeatable
    * param will be an array if there is at least one value.
    *
    * @param path - url to parse
    * @returns a Params object, empty if there are no params. `null` if there is
    * no match
    */
  def parse(path: String): PathParams | Null
  
  /**
    * The regexp used to match a url
    */
  var re: js.RegExp
  
  /**
    * The score of the parser
    */
  var score: js.Array[js.Array[Double]]
  
  /**
    * Creates a string version of the url
    *
    * @param params - object of params
    * @returns a url
    */
  def stringify(params: PathParams): String
}
object PathParser {
  
  inline def apply(
    keys: js.Array[PathParserParamKey],
    parse: String => PathParams | Null,
    re: js.RegExp,
    score: js.Array[js.Array[Double]],
    stringify: PathParams => String
  ): PathParser = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), re = re.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[PathParser]
  }
  
  extension [Self <: PathParser](x: Self) {
    
    inline def setKeys(value: js.Array[PathParserParamKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: PathParserParamKey*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setParse(value: String => PathParams | Null): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setRe(value: js.RegExp): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
    
    inline def setScore(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreVarargs(value: js.Array[Double]*): Self = StObject.set(x, "score", js.Array(value*))
    
    inline def setStringify(value: PathParams => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
  }
}
