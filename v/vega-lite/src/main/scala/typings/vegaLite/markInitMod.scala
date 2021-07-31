package typings.vegaLite

import typings.vegaLite.anon.Graticule
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcMarkMod.MarkDef
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
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markInitMod {
  
  @JSImport("vega-lite/build/src/compile/mark/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defaultFilled(markDef: MarkDef[Mark, ExprRef | SignalRef], config: Config[SignalRef], hasGraticule: Graticule): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultFilled")(markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasGraticule.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def initMarkdef(
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
