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
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], mediumPlus = mediumPlus.asInstanceOf[js.Any], mega = mega.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], smallPlus = smallPlus.asInstanceOf[js.Any], superLarge = superLarge.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any], xLarge = xLarge.asInstanceOf[js.Any], xLargePlus = xLargePlus.asInstanceOf[js.Any], xSmall = xSmall.asInstanceOf[js.Any], xxLarge = xxLarge.asInstanceOf[js.Any], xxLargePlus = xxLargePlus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFontStyles]
  }
}

