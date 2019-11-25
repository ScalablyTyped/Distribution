package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProviderResult extends js.Object {
  /**
    * This is the set of data providers that were requested, but either they were defined as client providers, or as remote providers that failed and may be retried by the client.
    */
  var clientProviders: StringDictionary[ClientDataProviderQuery]
  /**
    * Property bag of data keyed off of the data provider contribution id
    */
  var data: StringDictionary[js.Any]
  /**
    * Set of exceptions that occurred resolving the data providers.
    */
  var exceptions: StringDictionary[DataProviderExceptionDetails]
  /**
    * List of data providers resolved in the data-provider query
    */
  var resolvedProviders: js.Array[ResolvedDataProvider]
  /**
    * Scope name applied to this data provider result.
    */
  var scopeName: String
  /**
    * Scope value applied to this data provider result.
    */
  var scopeValue: String
  /**
    * Property bag of shared data that was contributed to by any of the individual data providers
    */
  var sharedData: StringDictionary[js.Any]
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
}

