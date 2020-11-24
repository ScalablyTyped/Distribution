package typings.testingLibraryDom.queriesMod

import typings.std.Element
import typings.std.RegExp
import typings.testingLibraryDom.matchesMod.MatcherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByRoleOptions extends MatcherOptions {
  
  /**
    * If true only includes elements in the query set that are marked as
    * checked in the accessibility tree, i.e., `aria-checked="true"`
    */
  var checked: js.UndefOr[Boolean] = js.native
  
  /**
    * If true includes elements in the query set that are usually excluded from
    * the accessibility tree. `role="none"` or `role="presentation"` are included
    * in either case.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Includes elements with the `"heading"` role matching the indicated level,
    * either by the semantic HTML heading elements `<h1>-<h6>` or matching
    * the `aria-level` attribute.
    */
  var level: js.UndefOr[Double] = js.native
  
  /**
    * Only considers  elements with the specified accessible name.
    */
  var name: js.UndefOr[
    String | RegExp | (js.Function2[/* accessibleName */ String, /* element */ Element, Boolean])
  ] = js.native
  
  /**
    * If true only includes elements in the query set that are marked as
    * pressed in the accessibility tree, i.e., `aria-pressed="true"`
    */
  var pressed: js.UndefOr[Boolean] = js.native
  
  /**
    * Includes every role used in the `role` attribute
    * For example *ByRole('progressbar', {queryFallbacks: true})` will find <div role="meter progressbar">`.
    */
  var queryFallbacks: js.UndefOr[Boolean] = js.native
  
  /**
    * If true only includes elements in the query set that are marked as
    * selected in the accessibility tree, i.e., `aria-selected="true"`
    */
  var selected: js.UndefOr[Boolean] = js.native
}
object ByRoleOptions {
  
  @scala.inline
  def apply(): ByRoleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByRoleOptions]
  }
  
  @scala.inline
  implicit class ByRoleOptionsOps[Self <: ByRoleOptions] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setNameFunction2(value: (/* accessibleName */ String, /* element */ Element) => Boolean): Self = this.set("name", js.Any.fromFunction2(value))
    
    @scala.inline
    def setName(
      value: String | RegExp | (js.Function2[/* accessibleName */ String, /* element */ Element, Boolean])
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPressed(value: Boolean): Self = this.set("pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressed: Self = this.set("pressed", js.undefined)
    
    @scala.inline
    def setQueryFallbacks(value: Boolean): Self = this.set("queryFallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryFallbacks: Self = this.set("queryFallbacks", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
}
