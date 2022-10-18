package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibModelsSourcesFileMod {
  
  @JSImport("typedoc/dist/lib/models/sources/file", "SourceReference")
  @js.native
  open class SourceReference protected () extends StObject {
    def this(fileName: String, line: Double, character: Double) = this()
    
    /**
      * The index of the character that emitted the declaration.
      */
    var character: Double = js.native
    
    /**
      * The filename of the source file.
      */
    var fileName: String = js.native
    
    /**
      * The absolute filename of the source file.
      */
    var fullFileName: String = js.native
    
    /**
      * The number of the line that emitted the declaration.
      */
    var line: Double = js.native
    
    def toObject(): typings.typedoc.distLibSerializationSchemaMod.SourceReference = js.native
    
    /**
      * URL for displaying the source file.
      */
    var url: js.UndefOr[String] = js.native
  }
}
