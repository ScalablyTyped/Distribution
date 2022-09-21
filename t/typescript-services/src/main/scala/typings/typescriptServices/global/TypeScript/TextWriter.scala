package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.TextWriter")
@js.native
open class TextWriter protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.TextWriter {
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    outputFileType: typings.typescriptServices.TypeScript.OutputFileType
  ) = this()
  
  /* CompleteClass */
  override def Close(): Unit = js.native
  
  /* CompleteClass */
  override def Write(s: String): Unit = js.native
  
  /* CompleteClass */
  override def WriteLine(s: String): Unit = js.native
  
  /* private */ /* CompleteClass */
  var contents: Any = js.native
  
  /* CompleteClass */
  override def getOutputFile(): typings.typescriptServices.TypeScript.OutputFile = js.native
  
  /* private */ /* CompleteClass */
  var name: Any = js.native
  
  /* CompleteClass */
  var onNewLine: Boolean = js.native
  
  /* private */ /* CompleteClass */
  var outputFileType: Any = js.native
  
  /* private */ /* CompleteClass */
  var writeByteOrderMark: Any = js.native
}
