package typings.sugar.sugarjs.Object

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryStringParseOptions[T, U] extends js.Object {
  
  var auto: js.UndefOr[Boolean] = js.native
  
  var deep: js.UndefOr[Boolean] = js.native
  
  var separator: js.UndefOr[String] = js.native
  
  var transform: js.UndefOr[js.Function3[/* key */ String, /* val */ T, /* obj */ js.Object, U]] = js.native
}
object QueryStringParseOptions {
  
  @scala.inline
  def apply[T, U](): QueryStringParseOptions[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStringParseOptions[T, U]]
  }
  
  @scala.inline
  implicit class QueryStringParseOptionsOps[Self <: QueryStringParseOptions[_, _], T, U] (val x: Self with (QueryStringParseOptions[T, U])) extends AnyVal {
    
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
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    
    @scala.inline
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setTransform(value: (/* key */ String, /* val */ T, /* obj */ js.Object) => U): Self = this.set("transform", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
