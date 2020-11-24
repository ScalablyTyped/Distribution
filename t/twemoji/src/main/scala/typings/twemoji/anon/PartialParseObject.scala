package typings.twemoji.anon

import typings.twemoji.mod.ParseCallback
import typings.twemoji.twemojiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<twemoji.twemoji.ParseObject> */
@js.native
trait PartialParseObject extends js.Object {
  
  var attributes: js.UndefOr[js.Function2[/* icon */ String, /* variant */ String, js.Object]] = js.native
  
  var base: js.UndefOr[String] = js.native
  
  var callback: js.UndefOr[ParseCallback] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var ext: js.UndefOr[String] = js.native
  
  var folder: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[String | Double] = js.native
}
object PartialParseObject {
  
  @scala.inline
  def apply(): PartialParseObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialParseObject]
  }
  
  @scala.inline
  implicit class PartialParseObjectOps[Self <: PartialParseObject] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: (/* icon */ String, /* variant */ String) => js.Object): Self = this.set("attributes", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setCallback(value: (/* icon */ String, /* options */ js.Object, /* variant */ String) => String | `false`): Self = this.set("callback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    
    @scala.inline
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    
    @scala.inline
    def setSize(value: String | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
