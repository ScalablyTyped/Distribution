package typings.webpack.loaderOptionsPluginMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.anon.Dictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderOptionsPluginOptions
  extends /* k */ StringDictionary[js.Any] {
  
  /**
  	 * Whether loaders should be in debug mode or not. debug will be removed as of webpack 3
  	 */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Where loaders can be switched to minimize mode
  	 */
  var minimize: js.UndefOr[Boolean] = js.native
  
  /**
  	 * A configuration object that can be used to configure older loaders
  	 */
  var options: js.UndefOr[Dictk] = js.native
}
object LoaderOptionsPluginOptions {
  
  @scala.inline
  def apply(): LoaderOptionsPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderOptionsPluginOptions]
  }
  
  @scala.inline
  implicit class LoaderOptionsPluginOptionsOps[Self <: LoaderOptionsPluginOptions] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setMinimize(value: Boolean): Self = this.set("minimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimize: Self = this.set("minimize", js.undefined)
    
    @scala.inline
    def setOptions(value: Dictk): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
