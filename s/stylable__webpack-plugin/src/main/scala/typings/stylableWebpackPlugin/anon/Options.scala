package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.typesMod.StylableWebpackPluginOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  def options(o: PartialStylableWebpackPlu): StylableWebpackPluginOptions = js.native
}
object Options {
  
  @scala.inline
  def apply(options: PartialStylableWebpackPlu => StylableWebpackPluginOptions): Options = {
    val __obj = js.Dynamic.literal(options = js.Any.fromFunction1(options))
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOptions(value: PartialStylableWebpackPlu => StylableWebpackPluginOptions): Self = this.set("options", js.Any.fromFunction1(value))
  }
}
