package typings.winrtUwp.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object DataTransfer {
  
  /** Provides data when the target app requests it, instead of including the data in the DataPackage ahead of time. DataProviderHandler is used when the source app wants to avoid unnecessary work that is resource intensive, such as performing format conversions. */
  type DataProviderHandler = js.Function1[
    /* request */ typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataProviderRequest, 
    scala.Unit
  ]
}
