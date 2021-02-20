package typings.textMaskCore

import typings.std.HTMLInputElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("text-mask-core", "createTextMaskInputElement")
  @js.native
  def createTextMaskInputElement(config: CreateTextMaskConfig): TextMaskInputElement = js.native
  
  @js.native
  trait CreateTextMaskConfig extends StObject {
    
    var guide: js.UndefOr[String] = js.native
    
    var inputElement: HTMLInputElement = js.native
    
    var keepCharPositions: js.UndefOr[Boolean] = js.native
    
    var mask: Mask = js.native
    
    var pipe: js.UndefOr[Pipe] = js.native
    
    var placeholderChar: js.UndefOr[String] = js.native
    
    var showMask: js.UndefOr[Boolean] = js.native
  }
  object CreateTextMaskConfig {
    
    @scala.inline
    def apply(inputElement: HTMLInputElement, mask: Mask): CreateTextMaskConfig = {
      val __obj = js.Dynamic.literal(inputElement = inputElement.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTextMaskConfig]
    }
    
    @scala.inline
    implicit class CreateTextMaskConfigMutableBuilder[Self <: CreateTextMaskConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGuide(value: String): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      @scala.inline
      def setInputElement(value: HTMLInputElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepCharPositions(value: Boolean): Self = StObject.set(x, "keepCharPositions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepCharPositionsUndefined: Self = StObject.set(x, "keepCharPositions", js.undefined)
      
      @scala.inline
      def setMask(value: Mask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskVarargs(value: (String | RegExp)*): Self = StObject.set(x, "mask", js.Array(value :_*))
      
      @scala.inline
      def setPipe(value: (/* conformedValue */ String, /* config */ js.Any) => PipeResult): Self = StObject.set(x, "pipe", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      @scala.inline
      def setPlaceholderChar(value: String): Self = StObject.set(x, "placeholderChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderCharUndefined: Self = StObject.set(x, "placeholderChar", js.undefined)
      
      @scala.inline
      def setShowMask(value: Boolean): Self = StObject.set(x, "showMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMaskUndefined: Self = StObject.set(x, "showMask", js.undefined)
    }
  }
  
  type Mask = js.Array[String | RegExp]
  
  type Pipe = js.Function2[/* conformedValue */ String, /* config */ js.Any, PipeResult]
  
  @js.native
  trait PipeAddResult extends _PipeResult {
    
    var indexesOfPipedChars: js.Array[Double] = js.native
    
    var value: String = js.native
  }
  object PipeAddResult {
    
    @scala.inline
    def apply(indexesOfPipedChars: js.Array[Double], value: String): PipeAddResult = {
      val __obj = js.Dynamic.literal(indexesOfPipedChars = indexesOfPipedChars.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipeAddResult]
    }
    
    @scala.inline
    implicit class PipeAddResultMutableBuilder[Self <: PipeAddResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexesOfPipedChars(value: js.Array[Double]): Self = StObject.set(x, "indexesOfPipedChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexesOfPipedCharsVarargs(value: Double*): Self = StObject.set(x, "indexesOfPipedChars", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
