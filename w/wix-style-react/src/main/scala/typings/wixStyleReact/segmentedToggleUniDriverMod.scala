package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentedToggleUniDriverMod {
  
  @js.native
  trait SegmentedToggleUniDriver
    extends StObject
       with BaseUniDriver {
    
    def isSelected(hook: String): js.Promise[Boolean] = js.native
    def isSelected(hook: Double): js.Promise[Boolean] = js.native
    
    def selectChild(hook: String): js.Promise[Unit] = js.native
    def selectChild(hook: Double): js.Promise[Unit] = js.native
  }
}
