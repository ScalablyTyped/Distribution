package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataProviderResult extends js.Object {
  /**
       * This is the set of data providers that were requested, but either they were defined as client providers, or as remote providers that failed and may be retried by the client.
       */
  var clientProviders: org.scalablytyped.runtime.StringDictionary[ClientDataProviderQuery]
  /**
       * Property bag of data keyed off of the data provider contribution id
       */
  var data: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
       * Set of exceptions that occurred resolving the data providers.
       */
  var exceptions: org.scalablytyped.runtime.StringDictionary[DataProviderExceptionDetails]
  /**
       * List of data providers resolved in the data-provider query
       */
  var resolvedProviders: js.Array[ResolvedDataProvider]
  /**
       * Scope name applied to this data provider result.
       */
  var scopeName: java.lang.String
  /**
       * Scope value applied to this data provider result.
       */
  var scopeValue: java.lang.String
  /**
       * Property bag of shared data that was contributed to by any of the individual data providers
       */
  var sharedData: org.scalablytyped.runtime.StringDictionary[js.Any]
}

