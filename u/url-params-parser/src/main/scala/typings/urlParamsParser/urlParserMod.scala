package typings.urlParamsParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlParserMod {
  
  @JSImport("url-params-parser/url_parser", "UrlParser")
  @js.native
  def UrlParser(urlString: String): UrlParserResult = js.native
  @JSImport("url-params-parser/url_parser", "UrlParser")
  @js.native
  def UrlParser(urlString: String, namedUrl: String): UrlParserResult = js.native
  
  @js.native
  trait UrlParserResult extends StObject {
    
    var host: String = js.native
    
    var hostname: String = js.native
    
    var namedParams: StringDictionary[String] = js.native
    
    var namedParamsKeys: js.Array[String] = js.native
    
    var namedParamsValues: js.Array[String] = js.native
    
    var pathNames: js.Array[String] = js.native
    
    var pathname: String = js.native
    
    var port: String = js.native
    
    var protocol: String = js.native
    
    var queryParams: StringDictionary[String] = js.native
    
    var queryParamsKeys: js.Array[String] = js.native
    
    var queryParamsValues: js.Array[String] = js.native
    
    var search: String = js.native
  }
  object UrlParserResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class UrlParserResultMutableBuilder[Self <: UrlParserResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedParams(value: StringDictionary[String]): Self = StObject.set(x, "namedParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedParamsKeys(value: js.Array[String]): Self = StObject.set(x, "namedParamsKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedParamsKeysVarargs(value: String*): Self = StObject.set(x, "namedParamsKeys", js.Array(value :_*))
      
      @scala.inline
      def setNamedParamsValues(value: js.Array[String]): Self = StObject.set(x, "namedParamsValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedParamsValuesVarargs(value: String*): Self = StObject.set(x, "namedParamsValues", js.Array(value :_*))
      
      @scala.inline
      def setPathNames(value: js.Array[String]): Self = StObject.set(x, "pathNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNamesVarargs(value: String*): Self = StObject.set(x, "pathNames", js.Array(value :_*))
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsKeys(value: js.Array[String]): Self = StObject.set(x, "queryParamsKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsKeysVarargs(value: String*): Self = StObject.set(x, "queryParamsKeys", js.Array(value :_*))
      
      @scala.inline
      def setQueryParamsValues(value: js.Array[String]): Self = StObject.set(x, "queryParamsValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsValuesVarargs(value: String*): Self = StObject.set(x, "queryParamsValues", js.Array(value :_*))
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
}
