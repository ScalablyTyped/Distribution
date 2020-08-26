package typings.winrt.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHostNameFactory extends js.Object {
  def createHostName(hostName: String): HostName = js.native
}

object IHostNameFactory {
  @scala.inline
  def apply(createHostName: String => HostName): IHostNameFactory = {
    val __obj = js.Dynamic.literal(createHostName = js.Any.fromFunction1(createHostName))
    __obj.asInstanceOf[IHostNameFactory]
  }
  @scala.inline
  implicit class IHostNameFactoryOps[Self <: IHostNameFactory] (val x: Self) extends AnyVal {
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
    def setCreateHostName(value: String => HostName): Self = this.set("createHostName", js.Any.fromFunction1(value))
  }
  
}

