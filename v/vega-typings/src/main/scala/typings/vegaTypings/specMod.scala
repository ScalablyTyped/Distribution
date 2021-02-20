package typings.vegaTypings

import typings.vegaTypings.autosizeMod.AutoSize
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.configMod.Config
import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.EncodeEntry
import typings.vegaTypings.paddingMod.Padding
import typings.vegaTypings.scopeMod.Scope
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object specMod {
  
  @js.native
  trait Spec
    extends Scope
       with Encodable[EncodeEntry] {
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.native
    
    var autosize: js.UndefOr[AutoSize | SignalRef] = js.native
    
    var background: js.UndefOr[Color | SignalRef] = js.native
    
    var config: js.UndefOr[Config] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double | SignalRef] = js.native
    
    var padding: js.UndefOr[Padding | SignalRef] = js.native
    
    var style: js.UndefOr[String | js.Array[String]] = js.native
    
    var width: js.UndefOr[Double | SignalRef] = js.native
  }
  object Spec {
    
    @scala.inline
    def apply(): Spec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Spec]
    }
    
    @scala.inline
    implicit class SpecMutableBuilder[Self <: Spec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      @scala.inline
      def setAutosize(value: AutoSize | SignalRef): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
      
      @scala.inline
      def setBackground(value: Color | SignalRef): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | SignalRef): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPadding(value: Padding | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double | SignalRef): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
