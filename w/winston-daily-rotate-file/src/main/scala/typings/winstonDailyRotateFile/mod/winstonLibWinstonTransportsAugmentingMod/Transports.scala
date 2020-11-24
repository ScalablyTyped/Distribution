package typings.winstonDailyRotateFile.mod.winstonLibWinstonTransportsAugmentingMod

import org.scalablytyped.runtime.Instantiable1
import typings.winstonDailyRotateFile.mod.DailyRotateFile
import typings.winstonDailyRotateFile.mod.DailyRotateFileTransportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transports extends js.Object {
  
  var DailyRotateFile: Instantiable1[
    /* options */ js.UndefOr[DailyRotateFileTransportOptions], 
    typings.winstonDailyRotateFile.mod.DailyRotateFile
  ] = js.native
  
  var DailyRotateFileTransportOptions: typings.winstonDailyRotateFile.mod.DailyRotateFileTransportOptions = js.native
}
object Transports {
  
  @scala.inline
  def apply(
    DailyRotateFile: Instantiable1[/* options */ js.UndefOr[DailyRotateFileTransportOptions], DailyRotateFile],
    DailyRotateFileTransportOptions: DailyRotateFileTransportOptions
  ): Transports = {
    val __obj = js.Dynamic.literal(DailyRotateFile = DailyRotateFile.asInstanceOf[js.Any], DailyRotateFileTransportOptions = DailyRotateFileTransportOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transports]
  }
  
  @scala.inline
  implicit class TransportsOps[Self <: Transports] (val x: Self) extends AnyVal {
    
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
    def setDailyRotateFile(value: Instantiable1[/* options */ js.UndefOr[DailyRotateFileTransportOptions], DailyRotateFile]): Self = this.set("DailyRotateFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyRotateFileTransportOptions(value: DailyRotateFileTransportOptions): Self = this.set("DailyRotateFileTransportOptions", value.asInstanceOf[js.Any])
  }
}
