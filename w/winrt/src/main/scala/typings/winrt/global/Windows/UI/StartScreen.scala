package typings.winrt.global.Windows.UI

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.UI.StartScreen.TileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.UI.StartScreen")
@js.native
object StartScreen extends js.Object {
  
  @js.native
  object ForegroundText extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.StartScreen.ForegroundText with Double] = js.native
    
    /* 0 */ val dark: typings.winrt.Windows.UI.StartScreen.ForegroundText.dark with Double = js.native
    
    /* 1 */ val light: typings.winrt.Windows.UI.StartScreen.ForegroundText.light with Double = js.native
  }
  
  @js.native
  class SecondaryTile ()
    extends typings.winrt.Windows.UI.StartScreen.SecondaryTile {
    def this(tileId: String) = this()
    def this(
      tileId: String,
      shortName: String,
      displayName: String,
      args: String,
      tileOptions: TileOptions,
      logoReference: Uri
    ) = this()
    def this(
      tileId: String,
      shortName: String,
      displayName: String,
      args: String,
      tileOptions: TileOptions,
      logoReference: Uri,
      wideLogoReference: Uri
    ) = this()
  }
  /* static members */
  @js.native
  object SecondaryTile extends js.Object {
    
    def exists(tileId: String): Boolean = js.native
    
    def findAllAsync(): IAsyncOperation[IVectorView[typings.winrt.Windows.UI.StartScreen.SecondaryTile]] = js.native
    def findAllAsync(applicationId: String): IAsyncOperation[IVectorView[typings.winrt.Windows.UI.StartScreen.SecondaryTile]] = js.native
    
    def findAllForPackageAsync(): IAsyncOperation[IVectorView[typings.winrt.Windows.UI.StartScreen.SecondaryTile]] = js.native
  }
  
  @js.native
  object TileOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.StartScreen.TileOptions with Double] = js.native
    
    /* 3 */ val copyOnDeployment: typings.winrt.Windows.UI.StartScreen.TileOptions.copyOnDeployment with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.UI.StartScreen.TileOptions.none with Double = js.native
    
    /* 1 */ val showNameOnLogo: typings.winrt.Windows.UI.StartScreen.TileOptions.showNameOnLogo with Double = js.native
    
    /* 2 */ val showNameOnWideLogo: typings.winrt.Windows.UI.StartScreen.TileOptions.showNameOnWideLogo with Double = js.native
  }
}
