package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.typesMod.StylableWebpackPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  def options(o: PartialStylableWebpackPlu): StylableWebpackPluginOptions = js.native
}
object Options {
  
  @scala.inline
  def apply(options: PartialStylableWebpackPlu => StylableWebpackPluginOptions): Options = {
    val __obj = js.Dynamic.literal(options = js.Any.fromFunction1(options))
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: PartialStylableWebpackPlu => StylableWebpackPluginOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
  }
}
