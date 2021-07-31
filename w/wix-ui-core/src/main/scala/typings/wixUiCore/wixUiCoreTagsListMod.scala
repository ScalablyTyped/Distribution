package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.wixUiCore.anon.Checked
import typings.wixUiCore.anon.CompId
import typings.wixUiCore.tagMod.TagProps
import typings.wixUiCore.tagsListHelpersMod.DisplayNames
import typings.wixUiCore.tagsListTagsListMod.TagsListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiCoreTagsListMod {
  
  @JSImport("wix-ui-core/tags-list", "FocusableTag")
  @js.native
  class FocusableTag protected ()
    extends typings.wixUiCore.tagsListMod.FocusableTag {
    def this(props: TagProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TagProps, context: js.Any) = this()
  }
  /* static members */
  object FocusableTag {
    
    @JSImport("wix-ui-core/tags-list", "FocusableTag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/tags-list", "FocusableTag.displayName")
    @js.native
    def displayName: DisplayNames = js.native
    @scala.inline
    def displayName_=(x: DisplayNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/tags-list", "FocusableTag.propTypes")
    @js.native
    def propTypes: Checked = js.native
    @scala.inline
    def propTypes_=(x: Checked): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/tags-list", "Tag")
  @js.native
  class Tag protected ()
    extends typings.wixUiCore.tagsListMod.Tag {
    def this(props: TagProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TagProps, context: js.Any) = this()
  }
  /* static members */
  object Tag {
    
    @JSImport("wix-ui-core/tags-list", "Tag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/tags-list", "Tag.displayName")
    @js.native
    def displayName: DisplayNames = js.native
    @scala.inline
    def displayName_=(x: DisplayNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/tags-list", "Tag.propTypes")
    @js.native
    def propTypes: CompId = js.native
    @scala.inline
    def propTypes_=(x: CompId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/tags-list", "TagsList")
  @js.native
  val TagsList: FunctionComponent[TagsListProps] = js.native
}
