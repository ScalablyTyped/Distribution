package typings.vscodeLanguageserver.anon

import typings.vscodeJsonrpc.disposableMod.Disposable
import typings.vscodeLanguageserver.serverMod.ServerRequestHandler
import typings.vscodeLanguageserverProtocol.protocolTypeHierarchyMod.TypeHierarchyPrepareParams
import typings.vscodeLanguageserverProtocol.protocolTypeHierarchyMod.TypeHierarchySubtypesParams
import typings.vscodeLanguageserverProtocol.protocolTypeHierarchyMod.TypeHierarchySupertypesParams
import typings.vscodeLanguageserverTypes.mod.TypeHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPrepare extends StObject {
  
  def onPrepare(
    handler: ServerRequestHandler[TypeHierarchyPrepareParams, js.Array[TypeHierarchyItem] | Null, scala.Nothing, Unit]
  ): Disposable
  
  def onSubtypes(
    handler: ServerRequestHandler[
      TypeHierarchySubtypesParams, 
      js.Array[TypeHierarchyItem] | Null, 
      js.Array[TypeHierarchyItem], 
      Unit
    ]
  ): Disposable
  
  def onSupertypes(
    handler: ServerRequestHandler[
      TypeHierarchySupertypesParams, 
      js.Array[TypeHierarchyItem] | Null, 
      js.Array[TypeHierarchyItem], 
      Unit
    ]
  ): Disposable
}
object OnPrepare {
  
  inline def apply(
    onPrepare: ServerRequestHandler[TypeHierarchyPrepareParams, js.Array[TypeHierarchyItem] | Null, scala.Nothing, Unit] => Disposable,
    onSubtypes: ServerRequestHandler[
      TypeHierarchySubtypesParams, 
      js.Array[TypeHierarchyItem] | Null, 
      js.Array[TypeHierarchyItem], 
      Unit
    ] => Disposable,
    onSupertypes: ServerRequestHandler[
      TypeHierarchySupertypesParams, 
      js.Array[TypeHierarchyItem] | Null, 
      js.Array[TypeHierarchyItem], 
      Unit
    ] => Disposable
  ): OnPrepare = {
    val __obj = js.Dynamic.literal(onPrepare = js.Any.fromFunction1(onPrepare), onSubtypes = js.Any.fromFunction1(onSubtypes), onSupertypes = js.Any.fromFunction1(onSupertypes))
    __obj.asInstanceOf[OnPrepare]
  }
  
  extension [Self <: OnPrepare](x: Self) {
    
    inline def setOnPrepare(
      value: ServerRequestHandler[TypeHierarchyPrepareParams, js.Array[TypeHierarchyItem] | Null, scala.Nothing, Unit] => Disposable
    ): Self = StObject.set(x, "onPrepare", js.Any.fromFunction1(value))
    
    inline def setOnSubtypes(
      value: ServerRequestHandler[
          TypeHierarchySubtypesParams, 
          js.Array[TypeHierarchyItem] | Null, 
          js.Array[TypeHierarchyItem], 
          Unit
        ] => Disposable
    ): Self = StObject.set(x, "onSubtypes", js.Any.fromFunction1(value))
    
    inline def setOnSupertypes(
      value: ServerRequestHandler[
          TypeHierarchySupertypesParams, 
          js.Array[TypeHierarchyItem] | Null, 
          js.Array[TypeHierarchyItem], 
          Unit
        ] => Disposable
    ): Self = StObject.set(x, "onSupertypes", js.Any.fromFunction1(value))
  }
}
