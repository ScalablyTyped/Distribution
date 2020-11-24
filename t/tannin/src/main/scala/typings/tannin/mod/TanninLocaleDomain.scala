package typings.tannin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TanninLocaleDomain
  extends /* key */ StringDictionary[TanninDomainMetadata | (js.Tuple2[String, String])] {
  
  @JSName("")
  var _empty: TanninDomainMetadata | (js.Tuple2[String, String]) = js.native
}
object TanninLocaleDomain {
  
  @scala.inline
  def apply(_empty: TanninDomainMetadata | (js.Tuple2[String, String])): TanninLocaleDomain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[TanninLocaleDomain]
  }
  
  @scala.inline
  implicit class TanninLocaleDomainOps[Self <: TanninLocaleDomain] (val x: Self) extends AnyVal {
    
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
