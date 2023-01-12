package typings.winrt.Windows.UI

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.UI.Popups.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StartScreen {
  
  @js.native
  sealed trait ForegroundText extends StObject
  @JSGlobal("Windows.UI.StartScreen.ForegroundText")
  @js.native
  object ForegroundText extends StObject {
    
    @js.native
    sealed trait dark
      extends StObject
         with ForegroundText
    
    @js.native
    sealed trait light
      extends StObject
         with ForegroundText
  }
  
  @js.native
  sealed trait TileOptions extends StObject
  @JSGlobal("Windows.UI.StartScreen.TileOptions")
  @js.native
  object TileOptions extends StObject {
    
    @js.native
    sealed trait copyOnDeployment
      extends StObject
         with TileOptions
    
    @js.native
    sealed trait none
      extends StObject
         with TileOptions
    
    @js.native
    sealed trait showNameOnLogo
      extends StObject
         with TileOptions
    
    @js.native
    sealed trait showNameOnWideLogo
      extends StObject
         with TileOptions
  }
  
  @js.native
  trait ISecondaryTile extends StObject {
    
    var arguments: String = js.native
    
    var backgroundColor: Color = js.native
    
    var displayName: String = js.native
    
    var foregroundText: ForegroundText = js.native
    
    var lockScreenBadgeLogo: Uri = js.native
    
    var lockScreenDisplayBadgeAndTileText: Boolean = js.native
    
    var logo: Uri = js.native
    
    def requestCreateAsync(): IAsyncOperation[Boolean] = js.native
    def requestCreateAsync(invocationPoint: Point): IAsyncOperation[Boolean] = js.native
    
    def requestCreateForSelectionAsync(selection: Rect): IAsyncOperation[Boolean] = js.native
    def requestCreateForSelectionAsync(selection: Rect, preferredPlacement: Placement): IAsyncOperation[Boolean] = js.native
    
    def requestDeleteAsync(): IAsyncOperation[Boolean] = js.native
    def requestDeleteAsync(invocationPoint: Point): IAsyncOperation[Boolean] = js.native
    
    def requestDeleteForSelectionAsync(selection: Rect): IAsyncOperation[Boolean] = js.native
    def requestDeleteForSelectionAsync(selection: Rect, preferredPlacement: Placement): IAsyncOperation[Boolean] = js.native
    
    var shortName: String = js.native
    
    var smallLogo: Uri = js.native
    
    var tileId: String = js.native
    
    var tileOptions: TileOptions = js.native
    
    def updateAsync(): IAsyncOperation[Boolean] = js.native
    
    var wideLogo: Uri = js.native
  }
  
  trait ISecondaryTileFactory extends StObject {
    
    def createTile(
      tileId: String,
      shortName: String,
      displayName: String,
      arguments: String,
      tileOptions: TileOptions,
      logoReference: Uri
    ): SecondaryTile
    
    def createWideTile(
      tileId: String,
      shortName: String,
      displayName: String,
      arguments: String,
      tileOptions: TileOptions,
      logoReference: Uri,
      wideLogoReference: Uri
    ): SecondaryTile
    
    def createWithId(tileId: String): SecondaryTile
  }
  object ISecondaryTileFactory {
    
    inline def apply(
      createTile: (String, String, String, String, TileOptions, Uri) => SecondaryTile,
      createWideTile: (String, String, String, String, TileOptions, Uri, Uri) => SecondaryTile,
      createWithId: String => SecondaryTile
    ): ISecondaryTileFactory = {
      val __obj = js.Dynamic.literal(createTile = js.Any.fromFunction6(createTile), createWideTile = js.Any.fromFunction7(createWideTile), createWithId = js.Any.fromFunction1(createWithId))
      __obj.asInstanceOf[ISecondaryTileFactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISecondaryTileFactory] (val x: Self) extends AnyVal {
      
      inline def setCreateTile(value: (String, String, String, String, TileOptions, Uri) => SecondaryTile): Self = StObject.set(x, "createTile", js.Any.fromFunction6(value))
      
      inline def setCreateWideTile(value: (String, String, String, String, TileOptions, Uri, Uri) => SecondaryTile): Self = StObject.set(x, "createWideTile", js.Any.fromFunction7(value))
      
      inline def setCreateWithId(value: String => SecondaryTile): Self = StObject.set(x, "createWithId", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ISecondaryTileStatics extends StObject {
    
    def exists(tileId: String): Boolean = js.native
    
    def findAllAsync(): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
    def findAllAsync(applicationId: String): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
    
    def findAllForPackageAsync(): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
  }
  
  @js.native
  trait SecondaryTile
    extends StObject
       with ISecondaryTile
}
