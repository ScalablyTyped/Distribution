package typings.tannin.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tannin.mod.TanninDomainMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[TanninDomainMetadata | (js.Tuple2[String, String])] {
  
  @JSName("")
  var _empty: TanninDomainMetadata | (js.Tuple2[String, String]) = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(_empty: TanninDomainMetadata | (js.Tuple2[String, String])): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    
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
    def set_empty(value: TanninDomainMetadata | (js.Tuple2[String, String])): Self = this.set("", value.asInstanceOf[js.Any])
  }
}
