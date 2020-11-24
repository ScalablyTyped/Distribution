package typings.tensorflowTfjsData.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerObject[T]
  extends /* x */ StringDictionary[ContainerOrT[T]]
     with Container[T]
object ContainerObject {
  
  @scala.inline
  def apply[T](): ContainerObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerObject[T]]
  }
}
