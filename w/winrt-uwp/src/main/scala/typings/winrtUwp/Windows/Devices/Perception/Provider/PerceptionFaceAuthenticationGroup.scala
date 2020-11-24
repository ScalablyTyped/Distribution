package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A group of unique identifiers specifying IPerceptionFrameProviders that share handlers for entering and exiting Face Authentication mode. */
@js.native
trait PerceptionFaceAuthenticationGroup extends js.Object {
  
  /** The id(s) of the IPerceptionFrameProvider(s) referenced by this group. */
  var frameProviderIds: IVectorView[String] = js.native
}
object PerceptionFaceAuthenticationGroup {
  
  @scala.inline
  def apply(frameProviderIds: IVectorView[String]): PerceptionFaceAuthenticationGroup = {
    val __obj = js.Dynamic.literal(frameProviderIds = frameProviderIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFaceAuthenticationGroup]
  }
  
  @scala.inline
  implicit class PerceptionFaceAuthenticationGroupOps[Self <: PerceptionFaceAuthenticationGroup] (val x: Self) extends AnyVal {
    
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
    def setFrameProviderIds(value: IVectorView[String]): Self = this.set("frameProviderIds", value.asInstanceOf[js.Any])
  }
}
