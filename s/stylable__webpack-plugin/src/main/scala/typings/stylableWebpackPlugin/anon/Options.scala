package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.typesMod.StylableWebpackPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  def options(o: PartialStylableWebpackPlu): StylableWebpackPluginOptions
}
object Options {
  
  inline def apply(options: PartialStylableWebpackPlu => StylableWebpackPluginOptions): Options = {
    val __obj = js.Dynamic.literal(options = js.Any.fromFunction1(options))
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: PartialStylableWebpackPlu => StylableWebpackPluginOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
  }
}
