package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isDescendantOrSelfMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/misc/isDescendantOrSelf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDescendantOrSelf(potentialDescendant: Element, potentialAncestor: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDescendantOrSelf")(potentialDescendant.asInstanceOf[js.Any], potentialAncestor.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
