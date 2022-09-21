package typings.victoryCreateContainer

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("victory-create-container/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineContainerMixins(mixins: Any, Container: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineContainerMixins")(mixins.asInstanceOf[js.Any], Container.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createContainer[V, W](c1: ContainerType, c2: ContainerType): ComponentType[V & W] = (^.asInstanceOf[js.Dynamic].applyDynamic("createContainer")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any])).asInstanceOf[ComponentType[V & W]]
  
  inline def makeCreateContainerFunction(mixinMap: Any, Container: Any): js.Function2[/* behaviorA */ Any, /* behaviorB */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeCreateContainerFunction")(mixinMap.asInstanceOf[js.Any], Container.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* behaviorA */ Any, /* behaviorB */ Any, Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryCreateContainer.victoryCreateContainerStrings.brush
    - typings.victoryCreateContainer.victoryCreateContainerStrings.cursor
    - typings.victoryCreateContainer.victoryCreateContainerStrings.selection
    - typings.victoryCreateContainer.victoryCreateContainerStrings.voronoi
    - typings.victoryCreateContainer.victoryCreateContainerStrings.zoom
  */
  trait ContainerType extends StObject
  object ContainerType {
    
    inline def brush: typings.victoryCreateContainer.victoryCreateContainerStrings.brush = "brush".asInstanceOf[typings.victoryCreateContainer.victoryCreateContainerStrings.brush]
    
    inline def cursor: typings.victoryCreateContainer.victoryCreateContainerStrings.cursor = "cursor".asInstanceOf[typings.victoryCreateContainer.victoryCreateContainerStrings.cursor]
    
    inline def selection: typings.victoryCreateContainer.victoryCreateContainerStrings.selection = "selection".asInstanceOf[typings.victoryCreateContainer.victoryCreateContainerStrings.selection]
    
    inline def voronoi: typings.victoryCreateContainer.victoryCreateContainerStrings.voronoi = "voronoi".asInstanceOf[typings.victoryCreateContainer.victoryCreateContainerStrings.voronoi]
    
    inline def zoom: typings.victoryCreateContainer.victoryCreateContainerStrings.zoom = "zoom".asInstanceOf[typings.victoryCreateContainer.victoryCreateContainerStrings.zoom]
  }
}
