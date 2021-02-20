package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.InstantiableSymbol
import typings.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullInstantiationHelpers {
  
  @JSImport("typescript-services", "PullInstantiationHelpers.MutableTypeArgumentMap")
  @js.native
  class MutableTypeArgumentMap protected ()
    extends typings.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap {
    def this(typeParameterArgumentMap: TypeArgumentMap) = this()
  }
  
  @JSImport("typescript-services", "PullInstantiationHelpers.cleanUpTypeArgumentMap")
  @js.native
  def cleanUpTypeArgumentMap(
    symbol: InstantiableSymbol,
    mutableTypeArgumentMap: typings.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  
  @JSImport("typescript-services", "PullInstantiationHelpers.createTypeParameterArgumentMap")
  @js.native
  def createTypeParameterArgumentMap(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol]
  ): TypeArgumentMap = js.native
  
  @JSImport("typescript-services", "PullInstantiationHelpers.getAllowedToReferenceTypeParametersFromDecl")
  @js.native
  def getAllowedToReferenceTypeParametersFromDecl(decl: typings.typescriptServices.TypeScript.PullDecl): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  @JSImport("typescript-services", "PullInstantiationHelpers.instantiateTypeArgument")
  @js.native
  def instantiateTypeArgument(
    resolver: typings.typescriptServices.TypeScript.PullTypeResolver,
    symbol: InstantiableSymbol,
    mutableTypeParameterMap: typings.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  
  @JSImport("typescript-services", "PullInstantiationHelpers.twoTypesAreInstantiationsOfSameNamedGenericType")
  @js.native
  def twoTypesAreInstantiationsOfSameNamedGenericType(
    type1: typings.typescriptServices.TypeScript.PullTypeSymbol,
    type2: typings.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  
  @JSImport("typescript-services", "PullInstantiationHelpers.updateMutableTypeParameterArgumentMap")
  @js.native
  def updateMutableTypeParameterArgumentMap(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    mutableMap: typings.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  
  @JSImport("typescript-services", "PullInstantiationHelpers.updateTypeParameterArgumentMap")
  @js.native
  def updateTypeParameterArgumentMap(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    typeParameterArgumentMap: TypeArgumentMap
  ): TypeArgumentMap = js.native
}
