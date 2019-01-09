package typings
package vegaDashTypingsLib.typesSpecTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title
  extends vegaDashTypingsLib.typesSpecEncodeMod.Encodable[vegaDashTypingsLib.typesSpecEncodeMod.TextEncodeEntry]
     with BaseTitle[
      vegaDashTypingsLib.typesSpecValuesMod.NumberValue, 
      vegaDashTypingsLib.typesSpecValuesMod.StringValue, 
      vegaDashTypingsLib.typesSpecValuesMod.ColorValue, 
      vegaDashTypingsLib.typesSpecValuesMod.FontWeightValue, 
      vegaDashTypingsLib.typesSpecValuesMod.AlignValue, 
      vegaDashTypingsLib.typesSpecValuesMod.TextBaselineValue, 
      TitleFrame | vegaDashTypingsLib.typesSpecValuesMod.StringValue, 
      vegaDashTypingsLib.typesSpecValuesMod.AnchorValue
    ] {
  /**
    * A boolean flag indicating if the title element should respond to input events such as mouse hover.
    */
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A mark name property to apply to the title text mark.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A mark style property to apply to the title text mark. If not specified, a default style of `"group-title"` is applied.
    */
  var style: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The title text.
    */
  var text: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  /**
    * 	The integer z-index indicating the layering of the title group relative to other axis, mark and legend groups.
    *
    * __Default value:__ `0`.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[scala.Double] = js.undefined
}

