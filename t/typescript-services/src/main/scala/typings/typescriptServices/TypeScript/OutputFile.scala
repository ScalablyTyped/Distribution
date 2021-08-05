package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputFile extends StObject {
  
  var fileType: OutputFileType
  
  var name: String
  
  var sourceMapEntries: js.Array[SourceMapEntry]
  
  var text: String
  
  var writeByteOrderMark: Boolean
}
object OutputFile {
  
  inline def apply(
    fileType: OutputFileType,
    name: String,
    sourceMapEntries: js.Array[SourceMapEntry],
    text: String,
    writeByteOrderMark: Boolean
  ): OutputFile = {
    val __obj = js.Dynamic.literal(fileType = fileType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sourceMapEntries = sourceMapEntries.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFile]
  }
  
  extension [Self <: OutputFile](x: Self) {
    
    inline def setFileType(value: OutputFileType): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSourceMapEntries(value: js.Array[SourceMapEntry]): Self = StObject.set(x, "sourceMapEntries", value.asInstanceOf[js.Any])
    
    inline def setSourceMapEntriesVarargs(value: SourceMapEntry*): Self = StObject.set(x, "sourceMapEntries", js.Array(value :_*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWriteByteOrderMark(value: Boolean): Self = StObject.set(x, "writeByteOrderMark", value.asInstanceOf[js.Any])
  }
}
