package typings.winrt.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataWriterFactory extends js.Object {
  
  def createDataWriter(outputStream: IOutputStream): DataWriter = js.native
}
object IDataWriterFactory {
  
  @scala.inline
  def apply(createDataWriter: IOutputStream => DataWriter): IDataWriterFactory = {
    val __obj = js.Dynamic.literal(createDataWriter = js.Any.fromFunction1(createDataWriter))
    __obj.asInstanceOf[IDataWriterFactory]
  }
  
  @scala.inline
  implicit class IDataWriterFactoryOps[Self <: IDataWriterFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateDataWriter(value: IOutputStream => DataWriter): Self = this.set("createDataWriter", js.Any.fromFunction1(value))
  }
}
