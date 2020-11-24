package typings.winrt.Windows.Data.Json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonErrorStatics extends js.Object {
  
  def getStatus(hresult: Double): JsonErrorStatus = js.native
}
object IJsonErrorStatics {
  
  @scala.inline
  def apply(getStatus: Double => JsonErrorStatus): IJsonErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[IJsonErrorStatics]
  }
  
  @scala.inline
  implicit class IJsonErrorStaticsOps[Self <: IJsonErrorStatics] (val x: Self) extends AnyVal {
    
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
    def setGetStatus(value: Double => JsonErrorStatus): Self = this.set("getStatus", js.Any.fromFunction1(value))
  }
}
