package typings.yaml

import typings.yaml.anon.Anchor
import typings.yaml.distComposeComposerMod.ComposeErrorHandler
import typings.yaml.distComposeComposerMod.ErrorSource
import typings.yaml.distErrorsMod.ErrorCode
import typings.yaml.distParseCstMod.SourceToken
import typings.yaml.distParseCstMod.Token
import typings.yaml.yamlStrings.`doc-start`
import typings.yaml.yamlStrings.`explicit-key-ind`
import typings.yaml.yamlStrings.`flow map`
import typings.yaml.yamlStrings.`flow sequence`
import typings.yaml.yamlStrings.`map-value-ind`
import typings.yaml.yamlStrings.`seq-item-ind`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeResolvePropsMod {
  
  @JSImport("yaml/dist/compose/resolve-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveProps(tokens: js.Array[SourceToken], param1: ResolvePropsArg): Anchor = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProps")(tokens.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Anchor]
  
  trait ResolvePropsArg extends StObject {
    
    var flow: js.UndefOr[(`flow map`) | (`flow sequence`)] = js.undefined
    
    var indicator: `doc-start` | `explicit-key-ind` | `map-value-ind` | `seq-item-ind`
    
    var next: js.UndefOr[Token | Null] = js.undefined
    
    var offset: Double
    
    def onError(source: ErrorSource, code: ErrorCode, message: String): Unit
    def onError(source: ErrorSource, code: ErrorCode, message: String, warning: Boolean): Unit
    @JSName("onError")
    var onError_Original: ComposeErrorHandler
    
    var startOnNewline: Boolean
  }
  object ResolvePropsArg {
    
    inline def apply(
      indicator: `doc-start` | `explicit-key-ind` | `map-value-ind` | `seq-item-ind`,
      offset: Double,
      onError: (/* source */ ErrorSource, /* code */ ErrorCode, /* message */ String, /* warning */ js.UndefOr[Boolean]) => Unit,
      startOnNewline: Boolean
    ): ResolvePropsArg = {
      val __obj = js.Dynamic.literal(indicator = indicator.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onError = js.Any.fromFunction4(onError), startOnNewline = startOnNewline.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvePropsArg]
    }
    
    extension [Self <: ResolvePropsArg](x: Self) {
      
      inline def setFlow(value: (`flow map`) | (`flow sequence`)): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
      
      inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
      
      inline def setIndicator(value: `doc-start` | `explicit-key-ind` | `map-value-ind` | `seq-item-ind`): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setNext(value: Token): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOnError(
        value: (/* source */ ErrorSource, /* code */ ErrorCode, /* message */ String, /* warning */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction4(value))
      
      inline def setStartOnNewline(value: Boolean): Self = StObject.set(x, "startOnNewline", value.asInstanceOf[js.Any])
    }
  }
}
