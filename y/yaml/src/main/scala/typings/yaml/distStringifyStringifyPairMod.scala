package typings.yaml

import typings.yaml.anon.ReadonlyPairunknownunknow
import typings.yaml.distStringifyStringifyMod.StringifyContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStringifyStringifyPairMod {
  
  @JSImport("yaml/dist/stringify/stringifyPair", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringifyPair(hasKeyValue: ReadonlyPairunknownunknow, ctx: StringifyContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyPair")(hasKeyValue.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyPair(hasKeyValue: ReadonlyPairunknownunknow, ctx: StringifyContext, onComment: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyPair")(hasKeyValue.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyPair(
    hasKeyValue: ReadonlyPairunknownunknow,
    ctx: StringifyContext,
    onComment: js.Function0[Unit],
    onChompKeep: js.Function0[Unit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyPair")(hasKeyValue.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any], onChompKeep.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringifyPair(
    hasKeyValue: ReadonlyPairunknownunknow,
    ctx: StringifyContext,
    onComment: Unit,
    onChompKeep: js.Function0[Unit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyPair")(hasKeyValue.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any], onChompKeep.asInstanceOf[js.Any])).asInstanceOf[String]
}
