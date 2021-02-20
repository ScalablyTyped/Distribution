package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputFile extends StObject {
  
  var fileType: OutputFileType = js.native
  
  var name: String = js.native
  
  var sourceMapEntries: js.Array[SourceMapEntry] = js.native
  
  var text: String = js.native
  
  var writeByteOrderMark: Boolean = js.native
}
object OutputFile {
  
  @scala.inline
  def apply(
    fileType: OutputFileType,
    name: String,
    sourceMapEntries: js.Array[SourceMapEntry],
    text: String,
    writeByteOrderMark: Boolean
  ): OutputFile = {
    val __obj = js.Dynamic.literal(fileType = fileType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sourceMapEntries = sourceMapEntries.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFile]
  }
  
  @scala.inline
  implicit class OutputFileMutableBuilder[Self <: OutputFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileType(value: OutputFileType): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapEntries(value: js.Array[SourceMapEntry]): Self = StObject.set(x, "sourceMapEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapEntriesVarargs(value: SourceMapEntry*): Self = StObject.set(x, "sourceMapEntries", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteByteOrderMark(value: Boolean): Self = StObject.set(x, "writeByteOrderMark", value.asInstanceOf[js.Any])
  }
}
