package typings.unzipper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CentralDirectory extends js.Object {
  
  var commentLength: Double = js.native
  
  var diskNumber: Double = js.native
  
  var diskStart: Double = js.native
  
  def extract(opts: ParseOptions): js.Promise[Unit] = js.native
  
  var files: js.Array[File] = js.native
  
  var numberOfRecords: Double = js.native
  
  var numberOfRecordsOnDisk: Double = js.native
  
  var offsetToStartOfCentralDirectory: Double = js.native
  
  var signature: Double = js.native
  
  var sizeOfCentralDirectory: Double = js.native
}
object CentralDirectory {
  
  @scala.inline
  def apply(
    commentLength: Double,
    diskNumber: Double,
    diskStart: Double,
    extract: ParseOptions => js.Promise[Unit],
    files: js.Array[File],
    numberOfRecords: Double,
    numberOfRecordsOnDisk: Double,
    offsetToStartOfCentralDirectory: Double,
    signature: Double,
    sizeOfCentralDirectory: Double
  ): CentralDirectory = {
    val __obj = js.Dynamic.literal(commentLength = commentLength.asInstanceOf[js.Any], diskNumber = diskNumber.asInstanceOf[js.Any], diskStart = diskStart.asInstanceOf[js.Any], extract = js.Any.fromFunction1(extract), files = files.asInstanceOf[js.Any], numberOfRecords = numberOfRecords.asInstanceOf[js.Any], numberOfRecordsOnDisk = numberOfRecordsOnDisk.asInstanceOf[js.Any], offsetToStartOfCentralDirectory = offsetToStartOfCentralDirectory.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], sizeOfCentralDirectory = sizeOfCentralDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CentralDirectory]
  }
  
  @scala.inline
  implicit class CentralDirectoryOps[Self <: CentralDirectory] (val x: Self) extends AnyVal {
    
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
    def setCommentLength(value: Double): Self = this.set("commentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskNumber(value: Double): Self = this.set("diskNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskStart(value: Double): Self = this.set("diskStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtract(value: ParseOptions => js.Promise[Unit]): Self = this.set("extract", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilesVarargs(value: File*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[File]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfRecords(value: Double): Self = this.set("numberOfRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfRecordsOnDisk(value: Double): Self = this.set("numberOfRecordsOnDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetToStartOfCentralDirectory(value: Double): Self = this.set("offsetToStartOfCentralDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: Double): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeOfCentralDirectory(value: Double): Self = this.set("sizeOfCentralDirectory", value.asInstanceOf[js.Any])
  }
}
