package typings.unistUtilIs

import typings.unist.mod.Node
import typings.unistUtilIs.mod.Test
import typings.unistUtilIs.mod.TestFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertMod {
  
  @scala.inline
  def apply[T /* <: Node */](test: Test[T]): TestFunction[T] = ^.asInstanceOf[js.Dynamic].apply(test.asInstanceOf[js.Any]).asInstanceOf[TestFunction[T]]
  
  @JSImport("unist-util-is/convert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
