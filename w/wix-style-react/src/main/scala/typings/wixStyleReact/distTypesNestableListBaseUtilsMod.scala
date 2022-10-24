package typings.wixStyleReact

import typings.wixStyleReact.wixStyleReactStrings.test_id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNestableListBaseUtilsMod {
  
  @JSImport("wix-style-react/dist/types/NestableListBase/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VerticalMovementDirection {
    
    @JSImport("wix-style-react/dist/types/NestableListBase/utils", "VerticalMovementDirection.bottom")
    @js.native
    val bottom: Double = js.native
    
    @JSImport("wix-style-react/dist/types/NestableListBase/utils", "VerticalMovementDirection.top")
    @js.native
    val top: Double = js.native
  }
  
  inline def addToTree(items: Any, item: Any, position: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addToTree")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addToTree(items: Any, item: Any, position: Any, childrenProperty: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addToTree")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], position.asInstanceOf[js.Any], childrenProperty.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def generateUniqueGroupId(): js.Symbol | test_id = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUniqueGroupId")().asInstanceOf[js.Symbol | test_id]
  
  inline def getDepth(item: Any, childrenProperty: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDepth")(item.asInstanceOf[js.Any], childrenProperty.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDropParent(items: Any, nextPosition: Any, childrenProperty: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDropParent")(items.asInstanceOf[js.Any], nextPosition.asInstanceOf[js.Any], childrenProperty.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getNodeAtPosition(items: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtPosition")(items.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getNodeAtPosition(items: Any, position: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtPosition")(items.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getNodeAtPosition(items: Any, position: js.Array[Any], childProp: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtPosition")(items.asInstanceOf[js.Any], position.asInstanceOf[js.Any], childProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getNodeAtPosition(items: Any, position: Unit, childProp: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtPosition")(items.asInstanceOf[js.Any], position.asInstanceOf[js.Any], childProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getNodePosition(items: Any, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodePosition")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getNodePosition(items: Any, item: Any, childProp: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodePosition")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], childProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getNodePosition(items: Any, item: Any, childProp: String, position: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodePosition")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], childProp.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getNodePosition(items: Any, item: Any, childProp: Unit, position: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodePosition")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], childProp.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getSiblingsByNodePosition(items: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSiblingsByNodePosition")(items.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getSiblingsByNodePosition(items: Any, position: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSiblingsByNodePosition")(items.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getSiblingsByNodePosition(items: Any, position: js.Array[Any], childProp: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSiblingsByNodePosition")(items.asInstanceOf[js.Any], position.asInstanceOf[js.Any], childProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getSiblingsByNodePosition(items: Any, position: Unit, childProp: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSiblingsByNodePosition")(items.asInstanceOf[js.Any], position.asInstanceOf[js.Any], childProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getValuesByKey(data: Any, key: Any, childrenProp: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValuesByKey")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], childrenProp.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def hoverAboveItself(prevPosition: Any, nextPosition: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hoverAboveItself")(prevPosition.asInstanceOf[js.Any], nextPosition.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isFistItem(siblings: Any, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isFistItem")(siblings.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isItemHasChildren(item: Any, childrenProperty: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isItemHasChildren")(item.asInstanceOf[js.Any], childrenProperty.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isLastItem(siblings: Any, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isLastItem")(siblings.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isRootItem(depth: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRootItem")(depth.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def moveItem(items: Any, item: Any, currentPosition: Any, newPosition: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveItem")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], currentPosition.asInstanceOf[js.Any], newPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def moveItem(items: Any, item: Any, currentPosition: Any, newPosition: Any, childrenProp: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveItem")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], currentPosition.asInstanceOf[js.Any], newPosition.asInstanceOf[js.Any], childrenProp.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def moveItemOutsideOfTheParent(items: Any, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("moveItemOutsideOfTheParent")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def moveItemOutsideOfTheParent(items: Any, item: Any, childProp: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("moveItemOutsideOfTheParent")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], childProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def moveItemToTheChildOfPrevSibling(items: Any, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("moveItemToTheChildOfPrevSibling")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def moveItemToTheChildOfPrevSibling(items: Any, item: Any, childrenProp: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("moveItemToTheChildOfPrevSibling")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], childrenProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def moveItemVertically(items: Any, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("moveItemVertically")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def moveItemVertically(items: Any, item: Any, step: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("moveItemVertically")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def moveItemVertically(items: Any, item: Any, step: Double, childProp: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("moveItemVertically")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], step.asInstanceOf[js.Any], childProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def moveItemVertically(items: Any, item: Any, step: Unit, childProp: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("moveItemVertically")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], step.asInstanceOf[js.Any], childProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def recursiveMap(items: Any, predicateFn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveMap")(items.asInstanceOf[js.Any], predicateFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def recursiveMap(items: Any, predicateFn: Any, childProp: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveMap")(items.asInstanceOf[js.Any], predicateFn.asInstanceOf[js.Any], childProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def removeFromTree(items: Any, position: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFromTree")(items.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def removeFromTree(items: Any, position: Any, childrenProperty: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFromTree")(items.asInstanceOf[js.Any], position.asInstanceOf[js.Any], childrenProperty.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setCollapse(items: Any, itemId: Any, isCollapsed: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setCollapse")(items.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any], isCollapsed.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def swapItems(items: Any, firstItem: Any, secondItem: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("swapItems")(items.asInstanceOf[js.Any], firstItem.asInstanceOf[js.Any], secondItem.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def swapItems(items: Any, firstItem: Any, secondItem: Any, childProp: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("swapItems")(items.asInstanceOf[js.Any], firstItem.asInstanceOf[js.Any], secondItem.asInstanceOf[js.Any], childProp.asInstanceOf[js.Any])).asInstanceOf[Any]
}
