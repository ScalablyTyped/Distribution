package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionStatisticUpdate extends StObject {
  
  var extensionName: String
  
  var operation: ExtensionStatisticOperation
  
  var publisherName: String
  
  var statistic: ExtensionStatistic
}
object ExtensionStatisticUpdate {
  
  @scala.inline
  def apply(
    extensionName: String,
    operation: ExtensionStatisticOperation,
    publisherName: String,
    statistic: ExtensionStatistic
  ): ExtensionStatisticUpdate = {
    val __obj = js.Dynamic.literal(extensionName = extensionName.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionStatisticUpdate]
  }
  
  @scala.inline
  implicit class ExtensionStatisticUpdateMutableBuilder[Self <: ExtensionStatisticUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: ExtensionStatisticOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatistic(value: ExtensionStatistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
  }
}
