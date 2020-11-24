package typings.webpackCdnInject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Defines urls to be added to document body (tag type is defined by url's file extension).
    */
  var body: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Defines urls to be added to document head (tag type is defined by url's file extension).
    */
  var head: js.UndefOr[js.Array[String]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setBodyVarargs(value: String*): Self = this.set("body", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: js.Array[String]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeadVarargs(value: String*): Self = this.set("head", js.Array(value :_*))
    
    @scala.inline
    def setHead(value: js.Array[String]): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
  }
}
