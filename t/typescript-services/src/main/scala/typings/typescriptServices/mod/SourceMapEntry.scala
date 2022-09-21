package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SourceMapEntry")
@js.native
open class SourceMapEntry protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.SourceMapEntry {
  def this(
    emittedFile: String,
    emittedLine: Double,
    emittedColumn: Double,
    sourceFile: String,
    sourceLine: Double,
    sourceColumn: Double,
    sourceName: String
  ) = this()
  
  /* CompleteClass */
  var emittedColumn: Double = js.native
  
  /* CompleteClass */
  var emittedFile: String = js.native
  
  /* CompleteClass */
  var emittedLine: Double = js.native
  
  /* CompleteClass */
  var sourceColumn: Double = js.native
  
  /* CompleteClass */
  var sourceFile: String = js.native
  
  /* CompleteClass */
  var sourceLine: Double = js.native
  
  /* CompleteClass */
  var sourceName: String = js.native
}
