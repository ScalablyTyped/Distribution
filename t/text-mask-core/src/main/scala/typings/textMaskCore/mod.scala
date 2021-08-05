package typings.textMaskCore

import typings.std.HTMLInputElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("text-mask-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTextMaskInputElement(config: CreateTextMaskConfig): TextMaskInputElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextMaskInputElement")(config.asInstanceOf[js.Any]).asInstanceOf[TextMaskInputElement]
  
  trait CreateTextMaskConfig extends StObject {
    
    var guide: js.UndefOr[String] = js.undefined
    
    var inputElement: HTMLInputElement
    
    var keepCharPositions: js.UndefOr[Boolean] = js.undefined
    
    var mask: Mask
    
    var pipe: js.UndefOr[Pipe] = js.undefined
    
    var placeholderChar: js.UndefOr[String] = js.undefined
    
    var showMask: js.UndefOr[Boolean] = js.undefined
  }
  object CreateTextMaskConfig {
    
    inline def apply(inputElement: HTMLInputElement, mask: Mask): CreateTextMaskConfig = {
      val __obj = js.Dynamic.literal(inputElement = inputElement.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTextMaskConfig]
    }
    
    extension [Self <: CreateTextMaskConfig](x: Self) {
      
      inline def setGuide(value: String): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      inline def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      inline def setInputElement(value: HTMLInputElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
      
      inline def setKeepCharPositions(value: Boolean): Self = StObject.set(x, "keepCharPositions", value.asInstanceOf[js.Any])
      
      inline def setKeepCharPositionsUndefined: Self = StObject.set(x, "keepCharPositions", js.undefined)
      
      inline def setMask(value: Mask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskVarargs(value: (String | RegExp)*): Self = StObject.set(x, "mask", js.Array(value :_*))
      
      inline def setPipe(value: (/* conformedValue */ String, /* config */ js.Any) => PipeResult): Self = StObject.set(x, "pipe", js.Any.fromFunction2(value))
      
      inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      inline def setPlaceholderChar(value: String): Self = StObject.set(x, "placeholderChar", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderCharUndefined: Self = StObject.set(x, "placeholderChar", js.undefined)
      
      inline def setShowMask(value: Boolean): Self = StObject.set(x, "showMask", value.asInstanceOf[js.Any])
      
      inline def setShowMaskUndefined: Self = StObject.set(x, "showMask", js.undefined)
    }
  }
  
  type Mask = js.Array[String | RegExp]
  
  type Pipe = js.Function2[/* conformedValue */ String, /* config */ js.Any, PipeResult]
  
  trait PipeAddResult
    extends StObject
       with _PipeResult {
    
    var indexesOfPipedChars: js.Array[Double]
    
    var value: String
  }
  object PipeAddResult {
    
    inline def apply(indexesOfPipedChars: js.Array[Double], value: String): PipeAddResult = {
      val __obj = js.Dynamic.literal(indexesOfPipedChars = indexesOfPipedChars.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipeAddResult]
    }
    
    extension [Self <: PipeAddResult](x: Self) {
      
      inline def setIndexesOfPipedChars(value: js.Array[Double]): Self = StObject.set(x, "indexesOfPipedChars", value.asInstanceOf[js.Any])
      
      inline def setIndexesOfPipedCharsVarargs(value: Double*): Self = StObject.set(x, "indexesOfPipedChars", js.Array(value :_*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.textMaskCore.mod.PipeAddResult
    - java.lang.String
    - typings.textMaskCore.textMaskCoreBooleans.`false`
  */
  type PipeResult = _PipeResult | String
  
  @js.native
  trait TextMaskInputElement extends StObject {
    
    def update(): Unit = js.native
    def update(rawValue: String): Unit = js.native
  }
  
  trait _PipeResult extends StObject
}
