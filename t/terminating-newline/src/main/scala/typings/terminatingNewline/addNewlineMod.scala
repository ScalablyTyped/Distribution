package typings.terminatingNewline

import typings.node.bufferMod.global.Buffer
import typings.terminatingNewline.mod.CarriageReturnLineFeed_
import typings.terminatingNewline.mod.LineFeed_
import typings.terminatingNewline.mod.ReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addNewlineMod {
  
  @JSImport("terminating-newline/build/add-newline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String): ReturnValue[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[String]]
  inline def default(input: String, options: Options): ReturnValue[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[String]]
  inline def default(input: Buffer): ReturnValue[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[Buffer]]
  inline def default(input: Buffer, options: Options): ReturnValue[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[Buffer]]
  
  trait Options extends StObject {
    
    /**
      * Fallback if newline type cannot be determined. Default: "\n"
      */
    var default: js.UndefOr[LineFeed_ | CarriageReturnLineFeed_] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefault(value: LineFeed_ | CarriageReturnLineFeed_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
}
