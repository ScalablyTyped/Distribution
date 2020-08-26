package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProviderContext extends js.Object {
  /**
    * Generic property bag that contains context-specific properties that data providers can use when populating their data dictionary
    */
  var properties: StringDictionary[js.Any] = js.native
}

object DataProviderContext {
  @scala.inline
  def apply(properties: StringDictionary[js.Any]): DataProviderContext = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderContext]
  }
  @scala.inline
  implicit class DataProviderContextOps[Self <: DataProviderContext] (val x: Self) extends AnyVal {
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
    def setProperties(value: StringDictionary[js.Any]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

