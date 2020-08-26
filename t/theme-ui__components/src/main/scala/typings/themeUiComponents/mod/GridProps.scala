package typings.themeUiComponents.mod

import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react.react.ComponentProps<'div'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'div'>? react.react.ComponentProps<'div'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ @js.native
trait GridProps extends js.Object {
  /**
    *     Number of columns to use for the layout (cannot be used in conjunction with the width prop)
    */
  var columns: js.UndefOr[ResponsiveValue[String | Double, RequiredTheme]] = js.native
  /**
    * Space between child elements
    */
  var gap: js.UndefOr[ResponsiveValue[String | Double, RequiredTheme]] = js.native
  /**
    * Minimum width of child elements
    */
  var width: js.UndefOr[ResponsiveValue[String | Double, RequiredTheme]] = js.native
}

object GridProps {
  @scala.inline
  def apply(): GridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps]
  }
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: ((String | Double) | Null)*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: ResponsiveValue[String | Double, RequiredTheme]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setColumnsNull: Self = this.set("columns", null)
    @scala.inline
    def setGapVarargs(value: ((String | Double) | Null)*): Self = this.set("gap", js.Array(value :_*))
    @scala.inline
    def setGap(value: ResponsiveValue[String | Double, RequiredTheme]): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setGapNull: Self = this.set("gap", null)
    @scala.inline
    def setWidthVarargs(value: ((String | Double) | Null)*): Self = this.set("width", js.Array(value :_*))
    @scala.inline
    def setWidth(value: ResponsiveValue[String | Double, RequiredTheme]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWidthNull: Self = this.set("width", null)
  }
  
}

