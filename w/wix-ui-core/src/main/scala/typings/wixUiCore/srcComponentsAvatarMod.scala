package typings.wixUiCore

import typings.wixUiCore.anon.Placeholder
import typings.wixUiCore.componentsAvatarAvatarMod.AvatarComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsAvatarMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-ui-core/dist/standalone/src/components/avatar", "Avatar")
  @js.native
  class Avatar () extends AvatarComponent
  object Avatar {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/avatar", "Avatar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/avatar", "Avatar.defaultProps")
    @js.native
    def defaultProps: Placeholder = js.native
    inline def defaultProps_=(x: Placeholder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/avatar", "Avatar.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
