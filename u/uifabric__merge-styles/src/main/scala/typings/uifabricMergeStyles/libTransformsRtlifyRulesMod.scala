package typings.uifabricMergeStyles

import typings.uifabricMergeStyles.libIstyleoptionsMod.IStyleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformsRtlifyRulesMod {
  
  @JSImport("@uifabric/merge-styles/lib/transforms/rtlifyRules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rtlifyRules(options: IStyleOptions, rulePairs: js.Array[String | Double], index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rtlifyRules")(options.asInstanceOf[js.Any], rulePairs.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
