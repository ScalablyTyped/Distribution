package typings.typedoc

import typings.typedoc.loggersMod.Logger
import typings.typedoc.optionsMod.Options
import typings.typedoc.optionsOptionsMod.OptionsReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argumentsMod {
  
  @JSImport("typedoc/dist/lib/utils/options/readers/arguments", "ArgumentsReader")
  @js.native
  open class ArgumentsReader protected ()
    extends StObject
       with OptionsReader {
    def this(priority: Double) = this()
    def this(priority: Double, args: js.Array[String]) = this()
    
    /* private */ var args: Any = js.native
    
    /**
      * The name of this reader so that it may be removed by plugins without the plugin
      * accessing the instance performing the read. Multiple readers may have the same
      * name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Readers will be processed according to their priority.
      * A higher priority indicates that the reader should be called *later* so that
      * it can override options set by lower priority readers.
      *
      * Note that to preserve expected behavior, the argv reader must have both the lowest
      * priority so that it may set the location of config files used by other readers and
      * the highest priority so that it can override settings from lower priority readers.
      *
      * Note: In 0.23. `priority` will be renamed to `order`, with the same meaning
      */
    /* CompleteClass */
    var priority: Double = js.native
    
    def read(container: Options, logger: Logger): Unit = js.native
    /**
      * Read options from the reader's source and place them in the options parameter.
      * Options without a declared name may be treated as if they were declared with type
      * {@link ParameterType.Mixed}. Options which have been declared must be converted to the
      * correct type. As an alternative to doing this conversion in the reader,
      * the reader may use {@link Options.setValue}, which will correctly convert values.
      * @param options
      * @param compilerOptions
      * @param container the options container that provides declarations
      * @param logger
      */
    /* CompleteClass */
    override def read(container: typings.typedoc.optionsOptionsMod.Options, logger: Logger): Unit = js.native
  }
}
