package typings.urlParamsParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlParserMod {
  
  @JSImport("url-params-parser/url_parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def UrlParser(urlString: String): UrlParserResult = ^.asInstanceOf[js.Dynamic].applyDynamic("UrlParser")(urlString.asInstanceOf[js.Any]).asInstanceOf[UrlParserResult]
  inline def UrlParser(urlString: String, namedUrl: String): UrlParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("UrlParser")(urlString.asInstanceOf[js.Any], namedUrl.asInstanceOf[js.Any])).asInstanceOf[UrlParserResult]
  
  trait UrlParserResult extends StObject {
    
    var host: String
    
    var hostname: String
    
    var namedParams: StringDictionary[String]
    
    var namedParamsKeys: js.Array[String]
    
    var namedParamsValues: js.Array[String]
    
    var pathNames: js.Array[String]
    
    var pathname: String
    
    var port: String
    
    var protocol: String
    
    var queryParams: StringDictionary[String]
    
    var queryParamsKeys: js.Array[String]
    
    var queryParamsValues: js.Array[String]
    
    var search: String
  }
  object UrlParserResult {
    
    inline def apply(
      host: String,
      hostname: String,
      namedParams: StringDictionary[String],
      namedParamsKeys: js.Array[String],
      namedParamsValues: js.Array[String],
      pathNames: js.Array[String],
      pathname: String,
      port: String,
      protocol: String,
      queryParams: StringDictionary[String],
      queryParamsKeys: js.Array[String],
      queryParamsValues: js.Array[String],
      search: String
    ): UrlParserResult = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], namedParams = namedParams.asInstanceOf[js.Any], namedParamsKeys = namedParamsKeys.asInstanceOf[js.Any], namedParamsValues = namedParamsValues.asInstanceOf[js.Any], pathNames = pathNames.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], queryParamsKeys = queryParamsKeys.asInstanceOf[js.Any], queryParamsValues = queryParamsValues.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlParserResult]
    }
    
    extension [Self <: UrlParserResult](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setNamedParams(value: StringDictionary[String]): Self = StObject.set(x, "namedParams", value.asInstanceOf[js.Any])
      
      inline def setNamedParamsKeys(value: js.Array[String]): Self = StObject.set(x, "namedParamsKeys", value.asInstanceOf[js.Any])
      
      inline def setNamedParamsKeysVarargs(value: String*): Self = StObject.set(x, "namedParamsKeys", js.Array(value :_*))
      
      inline def setNamedParamsValues(value: js.Array[String]): Self = StObject.set(x, "namedParamsValues", value.asInstanceOf[js.Any])
      
      inline def setNamedParamsValuesVarargs(value: String*): Self = StObject.set(x, "namedParamsValues", js.Array(value :_*))
      
      inline def setPathNames(value: js.Array[String]): Self = StObject.set(x, "pathNames", value.asInstanceOf[js.Any])
      
      inline def setPathNamesVarargs(value: String*): Self = StObject.set(x, "pathNames", js.Array(value :_*))
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsKeys(value: js.Array[String]): Self = StObject.set(x, "queryParamsKeys", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsKeysVarargs(value: String*): Self = StObject.set(x, "queryParamsKeys", js.Array(value :_*))
      
      inline def setQueryParamsValues(value: js.Array[String]): Self = StObject.set(x, "queryParamsValues", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsValuesVarargs(value: String*): Self = StObject.set(x, "queryParamsValues", js.Array(value :_*))
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
}
