package typings.yogBigpipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageletData extends js.Object {
  
  var container: String = js.native
  
  var css: js.Array[String] = js.native
  
  var html: String = js.native
  
  var id: String = js.native
  
  @JSName("js")
  var js_ : js.Array[String] = js.native
  
  var reqID: String = js.native
  
  var scripts: js.Array[String] = js.native
  
  var styles: js.Array[String] = js.native
}
object PageletData {
  
  @scala.inline
  def apply(
    container: String,
    css: js.Array[String],
    html: String,
    id: String,
    js_ : js.Array[String],
    reqID: String,
    scripts: js.Array[String],
    styles: js.Array[String]
  ): PageletData = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reqID = reqID.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageletData]
  }
  
  @scala.inline
  implicit class PageletDataOps[Self <: PageletData] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssVarargs(value: String*): Self = this.set("css", js.Array(value :_*))
    
    @scala.inline
    def setCss(value: js.Array[String]): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJs_Varargs(value: String*): Self = this.set("js", js.Array(value :_*))
    
    @scala.inline
    def setJs_(value: js.Array[String]): Self = this.set("js", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqID(value: String): Self = this.set("reqID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptsVarargs(value: String*): Self = this.set("scripts", js.Array(value :_*))
    
    @scala.inline
    def setScripts(value: js.Array[String]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
}
