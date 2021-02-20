package typings.typedoc

import typings.std.ClassDecorator
import typings.typedoc.abstractMod.Reflection
import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.componentMod.ComponentOptions
import typings.typedoc.contextMod.Context
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.Node
import typings.typescript.mod.SyntaxKind
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("typedoc/dist/lib/converter/components", "Component")
  @js.native
  def Component(options: ComponentOptions): ClassDecorator = js.native
  
  @JSImport("typedoc/dist/lib/converter/components", "ConverterComponent")
  @js.native
  abstract class ConverterComponent protected () extends AbstractComponent[Converter] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/components", "ConverterNodeComponent")
  @js.native
  abstract class ConverterNodeComponent[T /* <: Node */] protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def convert(context: Context, node: T): js.UndefOr[Reflection] = js.native
    
    var supports: js.Array[SyntaxKind] = js.native
  }
  
  @JSImport("typedoc/dist/lib/converter/components", "ConverterTypeComponent")
  @js.native
  abstract class ConverterTypeComponent protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var priority: Double = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedoc.componentMod.ComponentHost because Already inherited
  - typings.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typings.typedoc.componentMod.AbstractComponent because Already inherited
  - typings.typedoc.componentsMod.ConverterComponent because Already inherited
  - typings.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typings.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  trait TypeConverter[T /* <: Type */, N /* <: Node */] extends TypeTypeConverter[T] {
    
    def convertNode(context: Context, node: N): js.UndefOr[typings.typedoc.typesAbstractMod.Type] = js.native
    def convertNode(context: Context, node: N, `type`: T): js.UndefOr[typings.typedoc.typesAbstractMod.Type] = js.native
    
    def supportsNode(context: Context, node: N): Boolean = js.native
    def supportsNode(context: Context, node: N, `type`: T): Boolean = js.native
  }
  
  @js.native
  trait TypeNodeConverter[T /* <: Type */, N /* <: Node */] extends ConverterTypeComponent {
    
    def convertNode(context: Context, node: N): js.UndefOr[typings.typedoc.typesAbstractMod.Type] = js.native
    def convertNode(context: Context, node: N, `type`: T): js.UndefOr[typings.typedoc.typesAbstractMod.Type] = js.native
    
    def supportsNode(context: Context, node: N): Boolean = js.native
    def supportsNode(context: Context, node: N, `type`: T): Boolean = js.native
  }
  
  @js.native
  trait TypeTypeConverter[T /* <: Type */] extends ConverterTypeComponent {
    
    def convertType(context: Context, `type`: T): js.UndefOr[typings.typedoc.typesAbstractMod.Type] = js.native
    
    def supportsType(context: Context, `type`: T): Boolean = js.native
  }
}
