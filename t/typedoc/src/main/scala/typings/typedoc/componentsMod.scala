package typings.typedoc

import typings.std.ClassDecorator
import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.componentMod.ComponentOptions
import typings.typedoc.converterConverterMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("typedoc/dist/lib/converter/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Component(options: ComponentOptions): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Component")(options.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  @JSImport("typedoc/dist/lib/converter/components", "ConverterComponent")
  @js.native
  abstract class ConverterComponent protected () extends AbstractComponent[Converter] {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
  }
}
