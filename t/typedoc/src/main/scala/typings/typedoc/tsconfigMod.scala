package typings.typedoc

import typings.typedoc.loggersMod.Logger
import typings.typedoc.optionsOptionsMod.Options
import typings.typedoc.optionsOptionsMod.OptionsReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsconfigMod {
  
  @JSImport("typedoc/dist/lib/utils/options/readers/tsconfig", "TSConfigReader")
  @js.native
  class TSConfigReader ()
    extends StObject
       with OptionsReader {
    
    /* private */ var _tryReadOptions: js.Any = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var priority: Double = js.native
    
    /* CompleteClass */
    override def read(container: Options, logger: Logger): Unit = js.native
  }
}
