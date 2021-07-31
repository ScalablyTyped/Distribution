package typings.wixStyleReact

import typings.wixStyleReact.anon.AddedId
import typings.wixStyleReact.anon.X
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nestableListDriverMod {
  
  @js.native
  trait NestableListDriver
    extends StObject
       with BaseDriver {
    
    def drag(removedId: String): Unit = js.native
    def drag(removedId: Double): Unit = js.native
    
    def reorder(data: AddedId, offset: X): Unit = js.native
  }
}
