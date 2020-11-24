package typings.winrt.Windows.Data.Json

import typings.winrt.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonValueStatics extends js.Object {
  
  def createBooleanValue(input: Boolean): JsonValue = js.native
  
  def createNumberValue(input: Double): JsonValue = js.native
  
  def createStringValue(input: String): JsonValue = js.native
  
  def parse(input: String): JsonValue = js.native
  
  def tryParse(input: String): Result = js.native
}
object IJsonValueStatics {
  
  @scala.inline
  def apply(
    createBooleanValue: Boolean => JsonValue,
    createNumberValue: Double => JsonValue,
    createStringValue: String => JsonValue,
    parse: String => JsonValue,
    tryParse: String => Result
  ): IJsonValueStatics = {
    val __obj = js.Dynamic.literal(createBooleanValue = js.Any.fromFunction1(createBooleanValue), createNumberValue = js.Any.fromFunction1(createNumberValue), createStringValue = js.Any.fromFunction1(createStringValue), parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
    __obj.asInstanceOf[IJsonValueStatics]
  }
  
  @scala.inline
  implicit class IJsonValueStaticsOps[Self <: IJsonValueStatics] (val x: Self) extends AnyVal {
    
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
    def setCreateBooleanValue(value: Boolean => JsonValue): Self = this.set("createBooleanValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateNumberValue(value: Double => JsonValue): Self = this.set("createNumberValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateStringValue(value: String => JsonValue): Self = this.set("createStringValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParse(value: String => JsonValue): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTryParse(value: String => Result): Self = this.set("tryParse", js.Any.fromFunction1(value))
  }
}
