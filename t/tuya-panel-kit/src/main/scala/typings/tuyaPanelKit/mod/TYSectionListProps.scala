package typings.tuyaPanelKit.mod

import typings.reactNative.mod.DefaultSectionT
import typings.reactNative.mod.SectionListData
import typings.reactNative.mod.SectionListProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TYSectionListProps extends SectionListProps[SectionDataProps, DefaultSectionT] {
  
  var contentContainStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var sectionListRef: js.UndefOr[js.Function0[Unit]] = js.native
  
  var separatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var useART: js.UndefOr[Boolean] = js.native
}
object TYSectionListProps {
  
  @scala.inline
  def apply(sections: js.Array[SectionListData[SectionDataProps, DefaultSectionT]]): TYSectionListProps = {
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[TYSectionListProps]
  }
  
  @scala.inline
  implicit class TYSectionListPropsOps[Self <: TYSectionListProps] (val x: Self) extends AnyVal {
    
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
    def setContentContainStyle(value: StyleProp[ViewStyle]): Self = this.set("contentContainStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainStyle: Self = this.set("contentContainStyle", js.undefined)
    
    @scala.inline
    def setContentContainStyleNull: Self = this.set("contentContainStyle", null)
    
    @scala.inline
    def setHeaderStyle(value: StyleProp[ViewStyle]): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    
    @scala.inline
    def setHeaderStyleNull: Self = this.set("headerStyle", null)
    
    @scala.inline
    def setSectionListRef(value: () => Unit): Self = this.set("sectionListRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSectionListRef: Self = this.set("sectionListRef", js.undefined)
    
    @scala.inline
    def setSeparatorStyle(value: StyleProp[ViewStyle]): Self = this.set("separatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparatorStyle: Self = this.set("separatorStyle", js.undefined)
    
    @scala.inline
    def setSeparatorStyleNull: Self = this.set("separatorStyle", null)
    
    @scala.inline
    def setUseART(value: Boolean): Self = this.set("useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseART: Self = this.set("useART", js.undefined)
  }
}
