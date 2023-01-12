package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsGooglePodcastMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/GooglePodcast", JSImport.Default)
  @js.native
  val default: FC[GooglePodcastProps] = js.native
  
  trait GooglePodcastProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GooglePodcastProps {
    
    inline def apply(): GooglePodcastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GooglePodcastProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GooglePodcastProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GooglePodcastProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsGooglePodcastMod.foo` */
  override def _to: FC[GooglePodcastProps] = default
}
