package typings.styledComponents.primitivesDistTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleFunction[Props]
  extends StObject
     with _Interpolation[Props] {
  
  def apply(executionContext: ExecutionContext & Props): String | Double | StyledObject | CSSConstructor[Props] | StyleFunction[Props] = js.native
}
