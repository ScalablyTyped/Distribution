package typings.vegaLite

import typings.vegaLite.anon.Normalized
import typings.vegaLite.binMod.Bin
import typings.vegaLite.channeldefMod.FieldDefBase
import typings.vegaLite.channeldefMod.FieldTitleFormatter
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.specMod.TopLevelSpec
import typings.vegaLite.srcConfigMod.Config
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaUtil.mod.LoggerInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compileMod {
  
  @JSImport("vega-lite/build/src/compile/compile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compile(inputSpec: TopLevelSpec): Normalized = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(inputSpec.asInstanceOf[js.Any]).asInstanceOf[Normalized]
  @scala.inline
  def compile(inputSpec: TopLevelSpec, opt: CompileOptions): Normalized = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(inputSpec.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Normalized]
  
  trait CompileOptions extends StObject {
    
    /**
      * Sets a Vega-Lite configuration.
      */
    var config: js.UndefOr[Config[ExprRef | SignalRef]] = js.undefined
    
    /**
      * Sets a field title formatter.
      */
    var fieldTitle: js.UndefOr[FieldTitleFormatter] = js.undefined
    
    /**
      * Sets a custom logger.
      */
    var logger: js.UndefOr[LoggerInterface] = js.undefined
  }
  object CompileOptions {
    
    @scala.inline
    def apply(): CompileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompileOptions]
    }
    
    @scala.inline
    implicit class CompileOptionsMutableBuilder[Self <: CompileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setFieldTitle(
        value: (/* fieldDef */ FieldDefBase[String, Bin], /* config */ Config[ExprRef | SignalRef]) => String
      ): Self = StObject.set(x, "fieldTitle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFieldTitleUndefined: Self = StObject.set(x, "fieldTitle", js.undefined)
      
      @scala.inline
      def setLogger(value: LoggerInterface): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
