package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.InstantiableSymbol
import typings.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullInstantiationHelpers {
  
  @JSGlobal("TypeScript.PullInstantiationHelpers")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap")
  @js.native
  class MutableTypeArgumentMap protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap {
    def this(typeParameterArgumentMap: TypeArgumentMap) = this()
    
    /* CompleteClass */
    var createdDuplicateTypeArgumentMap: Boolean = js.native
    
    /* CompleteClass */
    override def ensureTypeArgumentCopy(): Unit = js.native
    
    /* CompleteClass */
    var typeParameterArgumentMap: TypeArgumentMap = js.native
  }
  
  inline def cleanUpTypeArgumentMap(
    symbol: InstantiableSymbol,
    mutableTypeArgumentMap: typings.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanUpTypeArgumentMap")(symbol.asInstanceOf[js.Any], mutableTypeArgumentMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createTypeParameterArgumentMap(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol]
  ): TypeArgumentMap = (^.asInstanceOf[js.Dynamic].applyDynamic("createTypeParameterArgumentMap")(typeParameters.asInstanceOf[js.Any], typeArguments.asInstanceOf[js.Any])).asInstanceOf[TypeArgumentMap]
  
  inline def getAllowedToReferenceTypeParametersFromDecl(decl: typings.typescriptServices.TypeScript.PullDecl): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllowedToReferenceTypeParametersFromDecl")(decl.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol]]
  
  inline def instantiateTypeArgument(
    resolver: typings.typescriptServices.TypeScript.PullTypeResolver,
    symbol: InstantiableSymbol,
    mutableTypeParameterMap: typings.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateTypeArgument")(resolver.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], mutableTypeParameterMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def twoTypesAreInstantiationsOfSameNamedGenericType(
    type1: typings.typescriptServices.TypeScript.PullTypeSymbol,
    type2: typings.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("twoTypesAreInstantiationsOfSameNamedGenericType")(type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def updateMutableTypeParameterArgumentMap(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    mutableMap: typings.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMutableTypeParameterArgumentMap")(typeParameters.asInstanceOf[js.Any], typeArguments.asInstanceOf[js.Any], mutableMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateTypeParameterArgumentMap(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    typeParameterArgumentMap: TypeArgumentMap
  ): TypeArgumentMap = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTypeParameterArgumentMap")(typeParameters.asInstanceOf[js.Any], typeArguments.asInstanceOf[js.Any], typeParameterArgumentMap.asInstanceOf[js.Any])).asInstanceOf[TypeArgumentMap]
}
