package typings.winrt.Windows.Data.Json

import typings.winrt.anon.ResultSucceeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonArrayStatics extends js.Object {
  
  def parse(input: String): JsonArray = js.native
  
  def tryParse(input: String): ResultSucceeded = js.native
}
object IJsonArrayStatics {
  
  @scala.inline
  def apply(parse: String => JsonArray, tryParse: String => ResultSucceeded): IJsonArrayStatics = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
    __obj.asInstanceOf[IJsonArrayStatics]
  }
  
  @scala.inline
  implicit class IJsonArrayStaticsOps[Self <: IJsonArrayStatics] (val x: Self) extends AnyVal {
    
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
    def setParse(value: String => JsonArray): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTryParse(value: String => ResultSucceeded): Self = this.set("tryParse", js.Any.fromFunction1(value))
  }
}
