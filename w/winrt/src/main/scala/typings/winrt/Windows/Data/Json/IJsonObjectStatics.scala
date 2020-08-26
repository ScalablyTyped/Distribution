package typings.winrt.Windows.Data.Json

import typings.winrt.anon.Succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonObjectStatics extends js.Object {
  def parse(input: String): JsonObject = js.native
  def tryParse(input: String): Succeeded = js.native
}

object IJsonObjectStatics {
  @scala.inline
  def apply(parse: String => JsonObject, tryParse: String => Succeeded): IJsonObjectStatics = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
    __obj.asInstanceOf[IJsonObjectStatics]
  }
  @scala.inline
  implicit class IJsonObjectStaticsOps[Self <: IJsonObjectStatics] (val x: Self) extends AnyVal {
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
    def setParse(value: String => JsonObject): Self = this.set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def setTryParse(value: String => Succeeded): Self = this.set("tryParse", js.Any.fromFunction1(value))
  }
  
}

