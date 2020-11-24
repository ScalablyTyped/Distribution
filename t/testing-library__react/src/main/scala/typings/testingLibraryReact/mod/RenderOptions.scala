package typings.testingLibraryReact.mod

import typings.react.mod.ComponentType
import typings.std.Element
import typings.testingLibraryDom.getQueriesForElementMod.Queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderOptions[Q /* <: Queries */] extends js.Object {
  
  var baseElement: js.UndefOr[Element] = js.native
  
  var container: js.UndefOr[Element] = js.native
  
  var hydrate: js.UndefOr[Boolean] = js.native
  
  var queries: js.UndefOr[Q] = js.native
  
  var wrapper: js.UndefOr[ComponentType[js.Object]] = js.native
}
object RenderOptions {
  
  @scala.inline
  def apply[Q /* <: Queries */](): RenderOptions[Q] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions[Q]]
  }
  
  @scala.inline
  implicit class RenderOptionsOps[Self <: RenderOptions[_], Q /* <: Queries */] (val x: Self with RenderOptions[Q]) extends AnyVal {
    
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
    def setBaseElement(value: Element): Self = this.set("baseElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseElement: Self = this.set("baseElement", js.undefined)
    
    @scala.inline
    def setContainer(value: Element): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setHydrate(value: Boolean): Self = this.set("hydrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHydrate: Self = this.set("hydrate", js.undefined)
    
    @scala.inline
    def setQueries(value: Q): Self = this.set("queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
    
    @scala.inline
    def setWrapper(value: ComponentType[js.Object]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
