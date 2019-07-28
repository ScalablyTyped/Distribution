package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProviderContext extends js.Object {
  /**
    * Generic property bag that contains context-specific properties that data providers can use when populating their data dictionary
    */
  var properties: StringDictionary[js.Any]
}

object DataProviderContext {
  @scala.inline
  def apply(properties: StringDictionary[js.Any]): DataProviderContext = {
    val __obj = js.Dynamic.literal(properties = properties)
  
    __obj.asInstanceOf[DataProviderContext]
  }
}

