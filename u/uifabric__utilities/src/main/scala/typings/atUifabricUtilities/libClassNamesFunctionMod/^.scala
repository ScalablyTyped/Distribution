package typings.atUifabricUtilities.libClassNamesFunctionMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricMergeDashStyles.libIStyleSetMod.IProcessedStyleSet
import typings.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/classNamesFunction", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def classNamesFunction[TStyleProps /* <: js.Object */, TStyleSet /* <: IStyleSet[TStyleSet] */](): js.Function2[
    /* getStyles */ js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    IProcessedStyleSet[TStyleSet]
  ] = js.native
  def classNamesFunction[TStyleProps /* <: js.Object */, TStyleSet /* <: IStyleSet[TStyleSet] */](options: IClassNamesFunctionOptions): js.Function2[
    /* getStyles */ js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    IProcessedStyleSet[TStyleSet]
  ] = js.native
}

