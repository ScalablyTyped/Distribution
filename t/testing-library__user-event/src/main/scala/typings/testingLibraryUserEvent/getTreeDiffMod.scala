package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTreeDiffMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/misc/getTreeDiff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTreeDiff(): js.Tuple3[js.Array[Element], js.Array[Element], js.Array[Element]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTreeDiff")().asInstanceOf[js.Tuple3[js.Array[Element], js.Array[Element], js.Array[Element]]]
  inline def getTreeDiff(a: Null, b: Element): js.Tuple3[js.Array[Element], js.Array[Element], js.Array[Element]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTreeDiff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[js.Array[Element], js.Array[Element], js.Array[Element]]]
  inline def getTreeDiff(a: Element): js.Tuple3[js.Array[Element], js.Array[Element], js.Array[Element]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTreeDiff")(a.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.Array[Element], js.Array[Element], js.Array[Element]]]
  inline def getTreeDiff(a: Element, b: Element): js.Tuple3[js.Array[Element], js.Array[Element], js.Array[Element]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTreeDiff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[js.Array[Element], js.Array[Element], js.Array[Element]]]
}
