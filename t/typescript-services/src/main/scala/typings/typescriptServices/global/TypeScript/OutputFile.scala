package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.OutputFile")
@js.native
open class OutputFile protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.OutputFile {
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typings.typescriptServices.TypeScript.OutputFileType
  ) = this()
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typings.typescriptServices.TypeScript.OutputFileType,
    sourceMapEntries: js.Array[typings.typescriptServices.TypeScript.SourceMapEntry]
  ) = this()
  
  /* CompleteClass */
  var fileType: typings.typescriptServices.TypeScript.OutputFileType = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var sourceMapEntries: js.Array[typings.typescriptServices.TypeScript.SourceMapEntry] = js.native
  
  /* CompleteClass */
  var text: String = js.native
  
  /* CompleteClass */
  var writeByteOrderMark: Boolean = js.native
}
