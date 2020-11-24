package typings.vegaTypings.anon

import typings.vegaTypings.dataMod._Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parse extends _Format {
  
  var parse: typings.vegaTypings.dataMod.Parse = js.native
}
object Parse {
  
  @scala.inline
  def apply(parse: typings.vegaTypings.dataMod.Parse): Parse = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parse]
  }
  
  @scala.inline
  implicit class ParseOps[Self <: Parse] (val x: Self) extends AnyVal {
    
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
    def setParse(value: typings.vegaTypings.dataMod.Parse): Self = this.set("parse", value.asInstanceOf[js.Any])
  }
}
