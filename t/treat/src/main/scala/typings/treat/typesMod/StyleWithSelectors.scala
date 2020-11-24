package typings.treat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ key in treat.treat/lib/types/transformCSS.SimplePseudos[number] ]:? treat.treat/lib/types/types.CSSProperties} */ @js.native
trait StyleWithSelectors extends CSSProperties {
  
  var selectors: js.UndefOr[SelectorMap] = js.native
}
object StyleWithSelectors {
  
  @scala.inline
  def apply(): StyleWithSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleWithSelectors]
  }
  
  @scala.inline
  implicit class StyleWithSelectorsOps[Self <: StyleWithSelectors] (val x: Self) extends AnyVal {
    
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
    def setSelectors(value: SelectorMap): Self = this.set("selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
  }
}
