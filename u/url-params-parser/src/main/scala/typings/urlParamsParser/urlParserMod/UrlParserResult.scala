package typings.urlParamsParser.urlParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlParserResult extends js.Object {
  
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
  implicit class UrlParserResultOps[Self <: UrlParserResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedParams(value: StringDictionary[String]): Self = this.set("namedParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedParamsKeysVarargs(value: String*): Self = this.set("namedParamsKeys", js.Array(value :_*))
    
    @scala.inline
    def setNamedParamsKeys(value: js.Array[String]): Self = this.set("namedParamsKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedParamsValuesVarargs(value: String*): Self = this.set("namedParamsValues", js.Array(value :_*))
    
    @scala.inline
    def setNamedParamsValues(value: js.Array[String]): Self = this.set("namedParamsValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathNamesVarargs(value: String*): Self = this.set("pathNames", js.Array(value :_*))
    
    @scala.inline
    def setPathNames(value: js.Array[String]): Self = this.set("pathNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParams(value: StringDictionary[String]): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParamsKeysVarargs(value: String*): Self = this.set("queryParamsKeys", js.Array(value :_*))
    
    @scala.inline
    def setQueryParamsKeys(value: js.Array[String]): Self = this.set("queryParamsKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParamsValuesVarargs(value: String*): Self = this.set("queryParamsValues", js.Array(value :_*))
    
    @scala.inline
    def setQueryParamsValues(value: js.Array[String]): Self = this.set("queryParamsValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
  }
}
