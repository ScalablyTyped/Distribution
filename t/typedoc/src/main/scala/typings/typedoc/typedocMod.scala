package typings.typedoc

import typings.typedoc.loggersMod.Logger
import typings.typedoc.optionsOptionsMod.Options
import typings.typedoc.optionsOptionsMod.OptionsReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typedocMod {
  
  @JSImport("typedoc/dist/lib/utils/options/readers/typedoc", "TypeDocReader")
  @js.native
  class TypeDocReader ()
    extends StObject
       with OptionsReader {
    
    /* private */ var findTypedocFile: js.Any = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var priority: Double = js.native
    
    /* CompleteClass */
    override def read(container: Options, logger: Logger): Unit = js.native
    
    /* private */ var readFile: js.Any = js.native
  }
}
