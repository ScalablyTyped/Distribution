package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.anon.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHotspotAuthenticationContextStatics extends js.Object {
  def tryGetAuthenticationContext(evenToken: String): Context = js.native
}

object IHotspotAuthenticationContextStatics {
  @scala.inline
  def apply(tryGetAuthenticationContext: String => Context): IHotspotAuthenticationContextStatics = {
    val __obj = js.Dynamic.literal(tryGetAuthenticationContext = js.Any.fromFunction1(tryGetAuthenticationContext))
    __obj.asInstanceOf[IHotspotAuthenticationContextStatics]
  }
  @scala.inline
  implicit class IHotspotAuthenticationContextStaticsOps[Self <: IHotspotAuthenticationContextStatics] (val x: Self) extends AnyVal {
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
    def setTryGetAuthenticationContext(value: String => Context): Self = this.set("tryGetAuthenticationContext", js.Any.fromFunction1(value))
  }
  
}

