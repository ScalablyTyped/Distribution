package typings.swaggerUiDist.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwaggerUIBundle
  extends /* k */ StringDictionary[js.Any] {
  
  def apply(): js.Any = js.native
  def apply(a: SwaggerConfigs): js.Any = js.native
  
  def getConfigs(): SwaggerConfigs = js.native
}
@JSImport("swagger-ui-dist", "SwaggerUIBundle")
@js.native
object SwaggerUIBundle extends TopLevel[SwaggerUIBundle]
