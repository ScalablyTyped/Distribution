package typings.wixUiCore.standaloneSrcMod

import typings.wixUiCore.anon.CompId
import typings.wixUiCore.tagsListDothelpersMod.DisplayNames
import typings.wixUiCore.tagsListTagMod.TagProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/standalone/src", "Tag")
@js.native
class Tag protected ()
  extends typings.wixUiCore.componentsTagsListMod.Tag {
  def this(props: TagProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TagProps, context: js.Any) = this()
}
/* static members */
object Tag {
  
  @JSImport("wix-ui-core/dist/standalone/src", "Tag")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src", "Tag.displayName")
  @js.native
  def displayName: DisplayNames = js.native
  @scala.inline
  def displayName_=(x: DisplayNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/standalone/src", "Tag.propTypes")
  @js.native
  def propTypes: CompId = js.native
  @scala.inline
  def propTypes_=(x: CompId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
