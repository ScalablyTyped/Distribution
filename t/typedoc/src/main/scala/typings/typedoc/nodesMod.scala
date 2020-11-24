package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes", JSImport.Namespace)
@js.native
object nodesMod extends js.Object {
  
  @js.native
  class AccessorConverter ()
    extends typings.typedoc.accessorMod.AccessorConverter
  
  @js.native
  class AliasConverter ()
    extends typings.typedoc.aliasMod.AliasConverter
  
  @js.native
  class BlockConverter ()
    extends typings.typedoc.blockMod.BlockConverter
  
  @js.native
  class ClassConverter ()
    extends typings.typedoc.classMod.ClassConverter
  
  @js.native
  class ConstructorConverter ()
    extends typings.typedoc.constructorMod.ConstructorConverter
  
  @js.native
  class EnumConverter ()
    extends typings.typedoc.enumMod.EnumConverter
  
  @js.native
  class ExportConverter ()
    extends typings.typedoc.exportMod.ExportConverter
  
  @js.native
  class FunctionConverter ()
    extends typings.typedoc.functionMod.FunctionConverter
  
  @js.native
  class IndexSignatureConverter ()
    extends typings.typedoc.signatureIndexMod.IndexSignatureConverter
  
  @js.native
  class InterfaceConverter ()
    extends typings.typedoc.interfaceMod.InterfaceConverter
  
  @js.native
  class ModuleConverter ()
    extends typings.typedoc.moduleMod.ModuleConverter
  
  @js.native
  class ObjectLiteralConverter ()
    extends typings.typedoc.literalObjectMod.ObjectLiteralConverter
  
  @js.native
  class SignatureConverter ()
    extends typings.typedoc.signatureCallMod.SignatureConverter
  
  @js.native
  class TypeLiteralConverter ()
    extends typings.typedoc.literalTypeMod.TypeLiteralConverter
  
  @js.native
  class VariableConverter ()
    extends typings.typedoc.variableMod.VariableConverter
  
  @js.native
  class VariableStatementConverter ()
    extends typings.typedoc.variableStatementMod.VariableStatementConverter
}
