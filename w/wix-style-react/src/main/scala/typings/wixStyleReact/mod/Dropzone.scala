package typings.wixStyleReact.mod

import typings.react.mod.FC
import typings.wixStyleReact.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "Dropzone")
@js.native
open class Dropzone ()
  extends typings.wixStyleReact.distTypesDropzoneMod.default
/* static members */
object Dropzone {
  
  @JSImport("wix-style-react", "Dropzone")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "Dropzone.Content")
  @js.native
  def Content: FC[`1`] = js.native
  inline def Content_=(x: FC[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Dropzone.Overlay")
  @js.native
  def Overlay: FC[`1`] = js.native
  inline def Overlay_=(x: FC[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Overlay")(x.asInstanceOf[js.Any])
}
