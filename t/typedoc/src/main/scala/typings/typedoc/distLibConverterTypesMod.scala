package typings.typedoc

import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsTypesMod.SomeType
import typings.typescript.mod.Type
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterTypesMod {
  
  @JSImport("typedoc/dist/lib/converter/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertType(context: Context): SomeType = ^.asInstanceOf[js.Dynamic].applyDynamic("convertType")(context.asInstanceOf[js.Any]).asInstanceOf[SomeType]
  inline def convertType(context: Context, typeOrNode: Type): SomeType = (^.asInstanceOf[js.Dynamic].applyDynamic("convertType")(context.asInstanceOf[js.Any], typeOrNode.asInstanceOf[js.Any])).asInstanceOf[SomeType]
  inline def convertType(context: Context, typeOrNode: TypeNode): SomeType = (^.asInstanceOf[js.Dynamic].applyDynamic("convertType")(context.asInstanceOf[js.Any], typeOrNode.asInstanceOf[js.Any])).asInstanceOf[SomeType]
  
  inline def loadConverters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConverters")().asInstanceOf[Unit]
  
  trait TypeConverter[TNode /* <: TypeNode */, TType /* <: Type */] extends StObject {
    
    def convert(context: Context, node: TNode): SomeType
    
    def convertType(context: Context, `type`: TType, node: TNode): SomeType
    
    var kind: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: TNode['kind'] */ js.Any
      ]
  }
  object TypeConverter {
    
    inline def apply[TNode /* <: TypeNode */, TType /* <: Type */](
      convert: (Context, TNode) => SomeType,
      convertType: (Context, TType, TNode) => SomeType,
      kind: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TNode['kind'] */ js.Any
        ]
    ): TypeConverter[TNode, TType] = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction2(convert), convertType = js.Any.fromFunction3(convertType), kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeConverter[TNode, TType]]
    }
    
    extension [Self <: TypeConverter[?, ?], TNode /* <: TypeNode */, TType /* <: Type */](x: Self & (TypeConverter[TNode, TType])) {
      
      inline def setConvert(value: (Context, TNode) => SomeType): Self = StObject.set(x, "convert", js.Any.fromFunction2(value))
      
      inline def setConvertType(value: (Context, TType, TNode) => SomeType): Self = StObject.set(x, "convertType", js.Any.fromFunction3(value))
      
      inline def setKind(
        value: js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: TNode['kind'] */ js.Any
            ]
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindVarargs(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: TNode['kind'] */ js.Any)*
      ): Self = StObject.set(x, "kind", js.Array(value*))
    }
  }
}
