package typings.uifabricMergeStyles

import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istyleMod.IStyleBaseArray
import typings.uifabricMergeStyles.istyleoptionsMod.IStyleOptions
import typings.uifabricMergeStyles.uifabricMergeStylesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeStylesMod {
  
  @JSImport("@uifabric/merge-styles/lib/mergeStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeCss(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")().asInstanceOf[String]
  inline def mergeCss(args: Null, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mergeCss(args: Unit, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mergeCss(args: IStyle): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mergeCss(args: IStyleBaseArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mergeCss(args: IStyleBaseArray, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mergeCss(args: IStyle, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mergeCss_false(args: js.Array[js.UndefOr[IStyle | IStyleBaseArray | `false` | Null]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mergeCss_false(args: js.Array[js.UndefOr[IStyle | IStyleBaseArray | `false` | Null]], options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mergeCss_false(args: `false`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mergeCss_false(args: `false`, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mergeStyles_false(args: (js.UndefOr[IStyle | IStyleBaseArray | `false` | Null])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyles")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
}
