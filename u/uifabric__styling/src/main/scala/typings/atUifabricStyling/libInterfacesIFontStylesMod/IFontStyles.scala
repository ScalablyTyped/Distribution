package typings.atUifabricStyling.libInterfacesIFontStylesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFontStyles extends js.Object {
  var large: IRawStyle
  var medium: IRawStyle
  var mediumPlus: IRawStyle
  var mega: IRawStyle
  var small: IRawStyle
  var smallPlus: IRawStyle
  var superLarge: IRawStyle
  var tiny: IRawStyle
  var xLarge: IRawStyle
  /**
    * @deprecated Exists for forward compatibility with Fabric 7's Fluent theme.
    * Not recommended for use with Fabric 6.
    */
  var xLargePlus: IRawStyle
  var xSmall: IRawStyle
  var xxLarge: IRawStyle
  /**
    * @deprecated Exists for forward compatibility with Fabric 7's Fluent theme
    * Not recommended for use with Fabric 6.
    */
  var xxLargePlus: IRawStyle
}

object IFontStyles {
  @scala.inline
  def apply(
    large: IRawStyle,
    medium: IRawStyle,
    mediumPlus: IRawStyle,
    mega: IRawStyle,
    small: IRawStyle,
    smallPlus: IRawStyle,
    superLarge: IRawStyle,
    tiny: IRawStyle,
    xLarge: IRawStyle,
    xLargePlus: IRawStyle,
    xSmall: IRawStyle,
    xxLarge: IRawStyle,
    xxLargePlus: IRawStyle
  ): IFontStyles = {
    val __obj = js.Dynamic.literal(large = large, medium = medium, mediumPlus = mediumPlus, mega = mega, small = small, smallPlus = smallPlus, superLarge = superLarge, tiny = tiny, xLarge = xLarge, xLargePlus = xLargePlus, xSmall = xSmall, xxLarge = xxLarge, xxLargePlus = xxLargePlus)
  
    __obj.asInstanceOf[IFontStyles]
  }
}

