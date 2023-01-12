package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsSocialButtonPinterestMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/SocialButtonPinterest", JSImport.Default)
  @js.native
  val default: FC[SocialButtonPinterestProps] = js.native
  
  trait SocialButtonPinterestProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SocialButtonPinterestProps {
    
    inline def apply(): SocialButtonPinterestProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialButtonPinterestProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocialButtonPinterestProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SocialButtonPinterestProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsSocialButtonPinterestMod.foo` */
  override def _to: FC[SocialButtonPinterestProps] = default
}
