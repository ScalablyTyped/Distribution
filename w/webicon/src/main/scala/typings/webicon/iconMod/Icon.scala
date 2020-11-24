package typings.webicon.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon extends js.Object {
  
  /**
    * Parses the input to an icon-id.
    *
    * @param id
    * The id of the icon to get.
    *
    * @param params
    * Additional parameters for getting the icon.
    *
    * @return
    * The id of the icon to get.
    */
  var iconIdParser: js.UndefOr[js.Function2[/* id */ String, /* params */ js.Array[String], String]] = js.native
}
object Icon {
  
  @scala.inline
  def apply(): Icon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit class IconOps[Self <: Icon] (val x: Self) extends AnyVal {
    
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
    def setIconIdParser(value: (/* id */ String, /* params */ js.Array[String]) => String): Self = this.set("iconIdParser", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIconIdParser: Self = this.set("iconIdParser", js.undefined)
  }
}
