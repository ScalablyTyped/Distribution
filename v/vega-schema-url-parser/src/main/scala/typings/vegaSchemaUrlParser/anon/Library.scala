package typings.vegaSchemaUrlParser.anon

import typings.vegaSchemaUrlParser.vegaSchemaUrlParserStrings.`vega-lite`
import typings.vegaSchemaUrlParser.vegaSchemaUrlParserStrings.vega
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Library extends js.Object {
  
  var library: vega | `vega-lite` = js.native
  
  var version: String = js.native
}
object Library {
  
  @scala.inline
  def apply(library: vega | `vega-lite`, version: String): Library = {
    val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Library]
  }
  
  @scala.inline
  implicit class LibraryOps[Self <: Library] (val x: Self) extends AnyVal {
    
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
    def setLibrary(value: vega | `vega-lite`): Self = this.set("library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
