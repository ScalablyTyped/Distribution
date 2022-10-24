package typings.vegaLite

import typings.vegaLite.anon.Graticule
import typings.vegaLite.buildSrcConfigMod.Config
import typings.vegaLite.buildSrcEncodingMod.Encoding
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcMarkMod.Mark
import typings.vegaLite.buildSrcMarkMod.MarkDef
import typings.vegaLite.vegaLiteStrings.arc
import typings.vegaLite.vegaLiteStrings.area
import typings.vegaLite.vegaLiteStrings.bar
import typings.vegaLite.vegaLiteStrings.circle
import typings.vegaLite.vegaLiteStrings.geoshape
import typings.vegaLite.vegaLiteStrings.image
import typings.vegaLite.vegaLiteStrings.line
import typings.vegaLite.vegaLiteStrings.point
import typings.vegaLite.vegaLiteStrings.rect
import typings.vegaLite.vegaLiteStrings.rule
import typings.vegaLite.vegaLiteStrings.square
import typings.vegaLite.vegaLiteStrings.text
import typings.vegaLite.vegaLiteStrings.tick
import typings.vegaLite.vegaLiteStrings.trail
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkInitMod {
  
  @JSImport("vega-lite/build/src/compile/mark/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultFilled(markDef: MarkDef[Mark, ExprRef | SignalRef], config: Config[SignalRef], param2: Graticule): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultFilled")(markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def initMarkdef(
    originalMarkDef: MarkDef[Mark, ExprRef | SignalRef],
    encoding: Encoding[String],
    config: Config[SignalRef]
  ): MarkDef[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick, 
    SignalRef
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("initMarkdef")(originalMarkDef.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MarkDef[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick, 
    SignalRef
  ]]
}
