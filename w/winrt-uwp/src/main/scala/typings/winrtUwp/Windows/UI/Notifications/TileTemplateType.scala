package typings.winrtUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TileTemplateType extends js.Object

/** Specifies the content template to use in a tile update. For a more detailed discussion of each tile, including an example of its XML coding, specifics on each template's image sizes, and use with different versions of the tile XML schema, see The tile template catalog. */
@JSGlobal("Windows.UI.Notifications.TileTemplateType")
@js.native
object TileTemplateType extends js.Object {
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileSquareBlock */
  @js.native
  sealed trait tileSquare150x150Block extends TileTemplateType
  
  /** Windows Phone only */
  @js.native
  sealed trait tileSquare150x150IconWithBadge extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileSquareImage */
  @js.native
  sealed trait tileSquare150x150Image extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileSquarePeekImageAndText01 */
  @js.native
  sealed trait tileSquare150x150PeekImageAndText01 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileSquarePeekImageAndText02 */
  @js.native
  sealed trait tileSquare150x150PeekImageAndText02 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileSquarePeekImageAndText03 */
  @js.native
  sealed trait tileSquare150x150PeekImageAndText03 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileSquarePeekImageAndText04 */
  @js.native
  sealed trait tileSquare150x150PeekImageAndText04 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileSquareText01 */
  @js.native
  sealed trait tileSquare150x150Text01 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileSquareText02 */
  @js.native
  sealed trait tileSquare150x150Text02 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileSquareText03 */
  @js.native
  sealed trait tileSquare150x150Text03 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileSquareText04 */
  @js.native
  sealed trait tileSquare150x150Text04 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310BlockAndText01 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310BlockAndText02 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310Image extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310ImageAndText01 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310ImageAndText02 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310ImageAndTextOverlay01 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310ImageAndTextOverlay02 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310ImageAndTextOverlay03 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310ImageCollection extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310ImageCollectionAndText01 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310ImageCollectionAndText02 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310SmallImageAndText01 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310SmallImagesAndTextList01 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310SmallImagesAndTextList02 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310SmallImagesAndTextList03 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310SmallImagesAndTextList04 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310SmallImagesAndTextList05 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310Text01 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310Text02 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310Text03 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310Text04 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310Text05 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310Text06 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310Text07 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310Text08 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310Text09 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310TextList01 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310TextList02 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileSquare310x310TextList03 extends TileTemplateType
  
  /** Windows Phone only. */
  @js.native
  sealed trait tileSquare71x71IconWithBadge extends TileTemplateType
  
  /** Windows Phone only */
  @js.native
  sealed trait tileSquare71x71Image extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileSquare150x150Block */
  @js.native
  sealed trait tileSquareBlock extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileSquare150x150Image. */
  @js.native
  sealed trait tileSquareImage extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileSquare150x150PeekImageAndText01 */
  @js.native
  sealed trait tileSquarePeekImageAndText01 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileSquare150x150PeekImageAndText02 */
  @js.native
  sealed trait tileSquarePeekImageAndText02 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileSquare150x150PeekImageAndText03 */
  @js.native
  sealed trait tileSquarePeekImageAndText03 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileSquare150x150PeekImageAndText04 */
  @js.native
  sealed trait tileSquarePeekImageAndText04 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileSquare150x150Text01 */
  @js.native
  sealed trait tileSquareText01 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileSquare150x150Text02 */
  @js.native
  sealed trait tileSquareText02 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileSquare150x150Text03 */
  @js.native
  sealed trait tileSquareText03 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileSquare150x150Text04 */
  @js.native
  sealed trait tileSquareText04 extends TileTemplateType
  
  /** One rectangular image that fills the entire tile, no text. */
  @js.native
  sealed trait tileTall150x310Image extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideBlockAndText01 */
  @js.native
  sealed trait tileWide310x150BlockAndText01 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideBlockAndText02 */
  @js.native
  sealed trait tileWide310x150BlockAndText02 extends TileTemplateType
  
  /** Windows Phone only */
  @js.native
  sealed trait tileWide310x150IconWithBadgeAndText extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideImage */
  @js.native
  sealed trait tileWide310x150Image extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideImageAndText01 */
  @js.native
  sealed trait tileWide310x150ImageAndText01 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideImageAndText02 */
  @js.native
  sealed trait tileWide310x150ImageAndText02 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideImageCollection */
  @js.native
  sealed trait tileWide310x150ImageCollection extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImage01 */
  @js.native
  sealed trait tileWide310x150PeekImage01 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImage02 */
  @js.native
  sealed trait tileWide310x150PeekImage02 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImage03 */
  @js.native
  sealed trait tileWide310x150PeekImage03 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImage04 */
  @js.native
  sealed trait tileWide310x150PeekImage04 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImage05 */
  @js.native
  sealed trait tileWide310x150PeekImage05 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImage06 */
  @js.native
  sealed trait tileWide310x150PeekImage06 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImageAndText01 */
  @js.native
  sealed trait tileWide310x150PeekImageAndText01 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImageAndText02 */
  @js.native
  sealed trait tileWide310x150PeekImageAndText02 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImageCollection01 */
  @js.native
  sealed trait tileWide310x150PeekImageCollection01 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImageCollection02 */
  @js.native
  sealed trait tileWide310x150PeekImageCollection02 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImageCollection03 */
  @js.native
  sealed trait tileWide310x150PeekImageCollection03 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImageCollection04 */
  @js.native
  sealed trait tileWide310x150PeekImageCollection04 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImageCollection05 */
  @js.native
  sealed trait tileWide310x150PeekImageCollection05 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWidePeekImageCollection06 */
  @js.native
  sealed trait tileWide310x150PeekImageCollection06 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideSmallImageAndText01 */
  @js.native
  sealed trait tileWide310x150SmallImageAndText01 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideSmallImageAndText02 */
  @js.native
  sealed trait tileWide310x150SmallImageAndText02 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideSmallImageAndText03 */
  @js.native
  sealed trait tileWide310x150SmallImageAndText03 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideSmallImageAndText04 */
  @js.native
  sealed trait tileWide310x150SmallImageAndText04 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideSmallImageAndText05 */
  @js.native
  sealed trait tileWide310x150SmallImageAndText05 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideText01 */
  @js.native
  sealed trait tileWide310x150Text01 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileWide310x150Text02 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideText03 */
  @js.native
  sealed trait tileWide310x150Text03 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideText04 */
  @js.native
  sealed trait tileWide310x150Text04 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideText05 */
  @js.native
  sealed trait tileWide310x150Text05 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileWide310x150Text06 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileWide310x150Text07 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileWide310x150Text08 extends TileTemplateType
  
  /** Windows 8 (Version 1) name/Windows 8.1 fallback attribute value: TileWideText09 */
  @js.native
  sealed trait tileWide310x150Text09 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileWide310x150Text10 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileWide310x150Text11 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150BlockAndText01 */
  @js.native
  sealed trait tileWideBlockAndText01 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150BlockAndText02 */
  @js.native
  sealed trait tileWideBlockAndText02 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150Image */
  @js.native
  sealed trait tileWideImage extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150ImageAndText01 */
  @js.native
  sealed trait tileWideImageAndText01 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150ImageAndText02 */
  @js.native
  sealed trait tileWideImageAndText02 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150ImageCollection */
  @js.native
  sealed trait tileWideImageCollection extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImage01 */
  @js.native
  sealed trait tileWidePeekImage01 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImage02 */
  @js.native
  sealed trait tileWidePeekImage02 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImage03 */
  @js.native
  sealed trait tileWidePeekImage03 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImage04 */
  @js.native
  sealed trait tileWidePeekImage04 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImage05 */
  @js.native
  sealed trait tileWidePeekImage05 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImage06 */
  @js.native
  sealed trait tileWidePeekImage06 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImageAndText01 */
  @js.native
  sealed trait tileWidePeekImageAndText01 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImageAndText02 */
  @js.native
  sealed trait tileWidePeekImageAndText02 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImageCollection01 */
  @js.native
  sealed trait tileWidePeekImageCollection01 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImageCollection02 */
  @js.native
  sealed trait tileWidePeekImageCollection02 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImageCollection03 */
  @js.native
  sealed trait tileWidePeekImageCollection03 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImageCollection04 */
  @js.native
  sealed trait tileWidePeekImageCollection04 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImageCollection05 */
  @js.native
  sealed trait tileWidePeekImageCollection05 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150PeekImageCollection06 */
  @js.native
  sealed trait tileWidePeekImageCollection06 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150SmallImageAndText01 */
  @js.native
  sealed trait tileWideSmallImageAndText01 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150SmallImageAndText02 */
  @js.native
  sealed trait tileWideSmallImageAndText02 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150SmallImageAndText03 */
  @js.native
  sealed trait tileWideSmallImageAndText03 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150SmallImageAndText04 */
  @js.native
  sealed trait tileWideSmallImageAndText04 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150SmallImageAndText05 */
  @js.native
  sealed trait tileWideSmallImageAndText05 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150Text01 */
  @js.native
  sealed trait tileWideText01 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileWideText02 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150Text03 */
  @js.native
  sealed trait tileWideText03 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150Text04 */
  @js.native
  sealed trait tileWideText04 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150Text05 */
  @js.native
  sealed trait tileWideText05 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileWideText06 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileWideText07 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileWideText08 extends TileTemplateType
  
  /** This name is valid as a template name in version 1 notifications and as a fallback name in later versions. In notifications other than version 1, this template name is TileWide310x150Text09 */
  @js.native
  sealed trait tileWideText09 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileWideText10 extends TileTemplateType
  
  /** Windows only; not supported on Windows Phone 8.1 */
  @js.native
  sealed trait tileWideText11 extends TileTemplateType
  
}

