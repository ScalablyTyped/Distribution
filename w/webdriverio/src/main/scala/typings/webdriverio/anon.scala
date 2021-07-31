package typings.webdriverio

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alpha extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    // color
    var hex: js.UndefOr[String] = js.undefined
    
    var rgba: js.UndefOr[String] = js.undefined
    
    var string: String
    
    var `type`: js.UndefOr[String] = js.undefined
    
    // other
    var unit: js.UndefOr[String] = js.undefined
    
    // font-family
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object Alpha {
    
    @scala.inline
    def apply(string: String): Alpha = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alpha]
    }
    
    @scala.inline
    implicit class AlphaMutableBuilder[Self <: Alpha] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
      
      @scala.inline
      def setRgba(value: String): Self = StObject.set(x, "rgba", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRgbaUndefined: Self = StObject.set(x, "rgba", js.undefined)
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Attempts extends StObject {
    
    var attempts: Double
    
    var limit: Double
  }
  object Attempts {
    
    @scala.inline
    def apply(attempts: Double, limit: Double): Attempts = {
      val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attempts]
    }
    
    @scala.inline
    implicit class AttemptsMutableBuilder[Self <: Attempts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
  
  trait Configurable extends StObject {
    
    var configurable: Boolean
    
    var value: Boolean
    
    var writable: Boolean
  }
  object Configurable {
    
    @scala.inline
    def apply(configurable: Boolean, value: Boolean, writable: Boolean): Configurable = {
      val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configurable]
    }
    
    @scala.inline
    implicit class ConfigurableMutableBuilder[Self <: Configurable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  trait Duration extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
  }
  object Duration {
    
    @scala.inline
    def apply(): Duration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Duration]
    }
    
    @scala.inline
    implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
  
  trait ErrorReason extends StObject {
    
    var errorReason: js.UndefOr[String] = js.undefined
    
    var overwrite: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockOverwrite */ js.Any
      ] = js.undefined
    
    var params: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockResponseParams */ js.Any
      ] = js.undefined
    
    var sticky: js.UndefOr[Boolean] = js.undefined
  }
  object ErrorReason {
    
    @scala.inline
    def apply(): ErrorReason = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorReason]
    }
    
    @scala.inline
    implicit class ErrorReasonMutableBuilder[Self <: ErrorReason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorReason(value: String): Self = StObject.set(x, "errorReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorReasonUndefined: Self = StObject.set(x, "errorReason", js.undefined)
      
      @scala.inline
      def setOverwrite(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockOverwrite */ js.Any
      ): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setParams(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockResponseParams */ js.Any
      ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
    }
  }
  
  trait MockedResponse extends StObject {
    
    var mockedResponse: String | Buffer
  }
  object MockedResponse {
    
    @scala.inline
    def apply(mockedResponse: String | Buffer): MockedResponse = {
      val __obj = js.Dynamic.literal(mockedResponse = mockedResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockedResponse]
    }
    
    @scala.inline
    implicit class MockedResponseMutableBuilder[Self <: MockedResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMockedResponse(value: String | Buffer): Self = StObject.set(x, "mockedResponse", value.asInstanceOf[js.Any])
    }
  }
  
  trait NOTFIBER extends StObject {
    
    var _NOT_FIBER: Configurable
    
    var puppeteer: Value
  }
  object NOTFIBER {
    
    @scala.inline
    def apply(_NOT_FIBER: Configurable, puppeteer: Value): NOTFIBER = {
      val __obj = js.Dynamic.literal(_NOT_FIBER = _NOT_FIBER.asInstanceOf[js.Any], puppeteer = puppeteer.asInstanceOf[js.Any])
      __obj.asInstanceOf[NOTFIBER]
    }
    
    @scala.inline
    implicit class NOTFIBERMutableBuilder[Self <: NOTFIBER] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPuppeteer(value: Value): Self = StObject.set(x, "puppeteer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_NOT_FIBER(value: Configurable): Self = StObject.set(x, "_NOT_FIBER", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var props: js.UndefOr[js.Object] = js.undefined
    
    var state: js.UndefOr[js.Object] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProps(value: js.Object): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setState(value: js.Object): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  /* Inlined std.Record<'element-6066-11e4-a52e-4f735466cecf', string> */
  trait Recordelement606611e4a52e extends StObject {
    
    var `element-6066-11e4-a52e-4f735466cecf`: String
  }
  object Recordelement606611e4a52e {
    
    @scala.inline
    def apply(`element-6066-11e4-a52e-4f735466cecf`: String): Recordelement606611e4a52e = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("element-6066-11e4-a52e-4f735466cecf")(`element-6066-11e4-a52e-4f735466cecf`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Recordelement606611e4a52e]
    }
    
    @scala.inline
    implicit class Recordelement606611e4a52eMutableBuilder[Self <: Recordelement606611e4a52e] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setElement-6066-11e4-a52e-4f735466cecf`(value: String): Self = StObject.set(x, "element-6066-11e4-a52e-4f735466cecf", value.asInstanceOf[js.Any])
    }
  }
  
  trait TranslateToUnicode extends StObject {
    
    var translateToUnicode: js.UndefOr[Boolean] = js.undefined
  }
  object TranslateToUnicode {
    
    @scala.inline
    def apply(): TranslateToUnicode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranslateToUnicode]
    }
    
    @scala.inline
    implicit class TranslateToUnicodeMutableBuilder[Self <: TranslateToUnicode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTranslateToUnicode(value: Boolean): Self = StObject.set(x, "translateToUnicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateToUnicodeUndefined: Self = StObject.set(x, "translateToUnicode", js.undefined)
    }
  }
  
  trait Using extends StObject {
    
    var `using`: String
    
    var value: String
  }
  object Using {
    
    @scala.inline
    def apply(`using`: String, value: String): Using = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("using")(`using`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Using]
    }
    
    @scala.inline
    implicit class UsingMutableBuilder[Self <: Using] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUsing(value: String): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: Null
    
    var writable: Boolean
  }
  object Value {
    
    @scala.inline
    def apply(value: Null, writable: Boolean): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  trait XOffset extends StObject {
    
    var xOffset: js.Any
    
    var yOffset: js.Any
  }
  object XOffset {
    
    @scala.inline
    def apply(xOffset: js.Any, yOffset: js.Any): XOffset = {
      val __obj = js.Dynamic.literal(xOffset = xOffset.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[XOffset]
    }
    
    @scala.inline
    implicit class XOffsetMutableBuilder[Self <: XOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXOffset(value: js.Any): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYOffset(value: js.Any): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    }
  }
}
