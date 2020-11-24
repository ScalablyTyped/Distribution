package typings.typedoc.optionsOptionsMod

import typings.typedoc.loggersMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsReader extends js.Object {
  
  var name: String = js.native
  
  var priority: Double = js.native
  
  def read(container: Options, logger: Logger): Unit = js.native
}
object OptionsReader {
  
  @scala.inline
  def apply(name: String, priority: Double, read: (Options, Logger) => Unit): OptionsReader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], read = js.Any.fromFunction2(read))
    __obj.asInstanceOf[OptionsReader]
  }
  
  @scala.inline
  implicit class OptionsReaderOps[Self <: OptionsReader] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: (Options, Logger) => Unit): Self = this.set("read", js.Any.fromFunction2(value))
  }
}
