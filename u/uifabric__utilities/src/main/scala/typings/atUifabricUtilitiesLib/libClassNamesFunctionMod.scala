package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/classNamesFunction", JSImport.Namespace)
@js.native
object libClassNamesFunctionMod extends js.Object {
  def classNamesFunction[TStyleProps /* <: js.Object */, TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](): js.Function2[
    /* getStyles */ js.UndefOr[
      atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[TStyleProps, TStyleSet]
    ], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    atUifabricMergeDashStylesLib.libIStyleSetMod.IProcessedStyleSet[TStyleSet]
  ] = js.native
}

