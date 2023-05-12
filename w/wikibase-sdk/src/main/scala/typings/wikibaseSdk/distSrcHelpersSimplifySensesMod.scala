package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesLexemeMod.Sense
import typings.wikibaseSdk.distSrcTypesLexemeMod.SimplifiedSense
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifyClaimsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersSimplifySensesMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/simplify_senses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def simplifySense(sense: Sense): SimplifiedSense = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifySense")(sense.asInstanceOf[js.Any]).asInstanceOf[SimplifiedSense]
  inline def simplifySense(sense: Sense, options: SimplifyClaimsOptions): SimplifiedSense = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifySense")(sense.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedSense]
  
  inline def simplifySenses(senses: js.Array[Sense]): js.Array[SimplifiedSense] = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifySenses")(senses.asInstanceOf[js.Any]).asInstanceOf[js.Array[SimplifiedSense]]
  inline def simplifySenses(senses: js.Array[Sense], options: SimplifyClaimsOptions): js.Array[SimplifiedSense] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifySenses")(senses.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[SimplifiedSense]]
}
