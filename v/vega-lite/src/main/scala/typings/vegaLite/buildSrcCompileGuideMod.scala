package typings.vegaLite

import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.buildSrcGuideMod.GuideEncodingEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileGuideMod {
  
  @JSImport("vega-lite/build/src/compile/guide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def guideEncodeEntry(encoding: GuideEncodingEntry, model: UnitModel): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("guideEncodeEntry")(encoding.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
