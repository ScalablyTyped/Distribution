package typings.winrt.Windows.Media.Protection

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaProtectionManager
  extends StObject
     with IMediaProtectionManager
object MediaProtectionManager {
  
  @scala.inline
  def apply(
    oncomponentloadfailed: js.Any,
    onrebootneeded: js.Any,
    onservicerequested: js.Any,
    properties: IPropertySet
  ): MediaProtectionManager = {
    val __obj = js.Dynamic.literal(oncomponentloadfailed = oncomponentloadfailed.asInstanceOf[js.Any], onrebootneeded = onrebootneeded.asInstanceOf[js.Any], onservicerequested = onservicerequested.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProtectionManager]
  }
}
