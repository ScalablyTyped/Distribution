package typings.wixUiCore.storiesUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Category extends StObject
@JSImport("wix-ui-core/dist/standalone/stories/utils", "Category")
@js.native
object Category extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Category & String] = js.native
  
  @js.native
  sealed trait BACKOFFICE
    extends StObject
       with Category
  /* "Backoffice" */ val BACKOFFICE: typings.wixUiCore.storiesUtilsMod.Category.BACKOFFICE & String = js.native
  
  @js.native
  sealed trait COMPONENTS
    extends StObject
       with Category
  /* "Components" */ val COMPONENTS: typings.wixUiCore.storiesUtilsMod.Category.COMPONENTS & String = js.native
  
  @js.native
  sealed trait HOCS
    extends StObject
       with Category
  /* "HOCs" */ val HOCS: typings.wixUiCore.storiesUtilsMod.Category.HOCS & String = js.native
  
  @js.native
  sealed trait TESTS
    extends StObject
       with Category
  /* "Tests" */ val TESTS: typings.wixUiCore.storiesUtilsMod.Category.TESTS & String = js.native
}
