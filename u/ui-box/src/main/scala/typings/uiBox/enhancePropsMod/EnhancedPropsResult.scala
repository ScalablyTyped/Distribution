package typings.uiBox.enhancePropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhancedPropsResult extends js.Object {
  var className: String
  var enhancedProps: PreservedProps
}

object EnhancedPropsResult {
  @scala.inline
  def apply(className: String, enhancedProps: PreservedProps): EnhancedPropsResult = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], enhancedProps = enhancedProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnhancedPropsResult]
  }
}

