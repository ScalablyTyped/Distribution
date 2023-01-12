package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsUserPrivateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/UserPrivate", JSImport.Default)
  @js.native
  val default: FC[UserPrivateProps] = js.native
  
  trait UserPrivateProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UserPrivateProps {
    
    inline def apply(): UserPrivateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserPrivateProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserPrivateProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UserPrivateProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsUserPrivateMod.foo` */
  override def _to: FC[UserPrivateProps] = default
}
