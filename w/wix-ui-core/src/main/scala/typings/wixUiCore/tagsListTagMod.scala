package typings.wixUiCore

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLAnchorElement
import typings.std.HTMLInputElement
import typings.std.HTMLLabelElement
import typings.std.MouseEvent
import typings.wixUiCore.anon.Checked
import typings.wixUiCore.anon.CompId
import typings.wixUiCore.tagsListDothelpersMod.DisplayNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagsListTagMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/tags-list/Tag", "FocusableTag")
  @js.native
  class FocusableTag protected ()
    extends Component[TagProps, js.Object, js.Any] {
    def this(props: TagProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TagProps, context: js.Any) = this()
    
    var anchorRef: RefObject[HTMLAnchorElement] = js.native
    
    def handleKeyDown(ev: KeyboardEvent[HTMLAnchorElement | HTMLLabelElement]): Unit = js.native
    
    def handleTagClick(ev: typings.react.mod.MouseEvent[HTMLAnchorElement, MouseEvent]): Unit = js.native
    
    var inputRef: RefObject[HTMLInputElement] = js.native
    
    var labelRef: RefObject[HTMLLabelElement] = js.native
    
    def renderLabeledInput(ownProps: js.Any): Element = js.native
    def renderLabeledInput(ownProps: js.Any, wrapperProps: js.Object): Element = js.native
  }
  /* static members */
  object FocusableTag {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/tags-list/Tag", "FocusableTag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/tags-list/Tag", "FocusableTag.displayName")
    @js.native
    def displayName: DisplayNames = js.native
    inline def displayName_=(x: DisplayNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/tags-list/Tag", "FocusableTag.propTypes")
    @js.native
    def propTypes: Checked = js.native
    inline def propTypes_=(x: Checked): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/standalone/src/components/tags-list/Tag", "Tag")
  @js.native
  class Tag protected ()
    extends Component[TagProps, js.Object, js.Any] {
    def this(props: TagProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TagProps, context: js.Any) = this()
    
    var anchorRef: RefObject[HTMLAnchorElement] = js.native
    
    def handleKeyDown(ev: KeyboardEvent[HTMLAnchorElement]): Unit = js.native
    
    def handleTagClick(ev: typings.react.mod.MouseEvent[HTMLAnchorElement, MouseEvent]): Unit = js.native
    
    var inputRef: RefObject[HTMLInputElement] = js.native
    
    var labelRef: RefObject[HTMLLabelElement] = js.native
  }
  /* static members */
  object Tag {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/tags-list/Tag", "Tag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/tags-list/Tag", "Tag.displayName")
    @js.native
    def displayName: DisplayNames = js.native
    inline def displayName_=(x: DisplayNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/tags-list/Tag", "Tag.propTypes")
    @js.native
    def propTypes: CompId = js.native
    inline def propTypes_=(x: CompId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait TagProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var compId: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tagIndex: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object TagProps {
    
    inline def apply(): TagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagProps]
    }
    
    extension [Self <: TagProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompId(value: String): Self = StObject.set(x, "compId", value.asInstanceOf[js.Any])
      
      inline def setCompIdUndefined: Self = StObject.set(x, "compId", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTagIndex(value: Double): Self = StObject.set(x, "tagIndex", value.asInstanceOf[js.Any])
      
      inline def setTagIndexUndefined: Self = StObject.set(x, "tagIndex", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
