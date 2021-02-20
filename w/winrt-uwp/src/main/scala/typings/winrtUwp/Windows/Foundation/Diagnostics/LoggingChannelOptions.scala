package typings.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents advanced settings that you can use to configure a LoggingChannel object. */
@js.native
trait LoggingChannelOptions extends StObject {
  
  /** Gets or sets the channel group identifier. */
  var group: String = js.native
}
object LoggingChannelOptions {
  
  @scala.inline
  def apply(group: String): LoggingChannelOptions = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingChannelOptions]
  }
  
  @scala.inline
  implicit class LoggingChannelOptionsMutableBuilder[Self <: LoggingChannelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
