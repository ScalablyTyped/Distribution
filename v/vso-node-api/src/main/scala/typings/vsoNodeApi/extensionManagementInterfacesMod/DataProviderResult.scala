package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProviderResult extends js.Object {
  /**
    * This is the set of data providers that were requested, but either they were defined as client providers, or as remote providers that failed and may be retried by the client.
    */
  var clientProviders: StringDictionary[ClientDataProviderQuery] = js.native
  /**
    * Property bag of data keyed off of the data provider contribution id
    */
  var data: StringDictionary[js.Any] = js.native
  /**
    * Set of exceptions that occurred resolving the data providers.
    */
  var exceptions: StringDictionary[DataProviderExceptionDetails] = js.native
  /**
    * List of data providers resolved in the data-provider query
    */
  var resolvedProviders: js.Array[ResolvedDataProvider] = js.native
  /**
    * Scope name applied to this data provider result.
    */
  var scopeName: String = js.native
  /**
    * Scope value applied to this data provider result.
    */
  var scopeValue: String = js.native
  /**
    * Property bag of shared data that was contributed to by any of the individual data providers
    */
  var sharedData: StringDictionary[js.Any] = js.native
}

object DataProviderResult {
  @scala.inline
  def apply(
    clientProviders: StringDictionary[ClientDataProviderQuery],
    data: StringDictionary[js.Any],
    exceptions: StringDictionary[DataProviderExceptionDetails],
    resolvedProviders: js.Array[ResolvedDataProvider],
    scopeName: String,
    scopeValue: String,
    sharedData: StringDictionary[js.Any]
  ): DataProviderResult = {
    val __obj = js.Dynamic.literal(clientProviders = clientProviders.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], exceptions = exceptions.asInstanceOf[js.Any], resolvedProviders = resolvedProviders.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any], scopeValue = scopeValue.asInstanceOf[js.Any], sharedData = sharedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderResult]
  }
  @scala.inline
  implicit class DataProviderResultOps[Self <: DataProviderResult] (val x: Self) extends AnyVal {
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
    def setClientProviders(value: StringDictionary[ClientDataProviderQuery]): Self = this.set("clientProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setExceptions(value: StringDictionary[DataProviderExceptionDetails]): Self = this.set("exceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvedProvidersVarargs(value: ResolvedDataProvider*): Self = this.set("resolvedProviders", js.Array(value :_*))
    @scala.inline
    def setResolvedProviders(value: js.Array[ResolvedDataProvider]): Self = this.set("resolvedProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeName(value: String): Self = this.set("scopeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeValue(value: String): Self = this.set("scopeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharedData(value: StringDictionary[js.Any]): Self = this.set("sharedData", value.asInstanceOf[js.Any])
  }
  
}

