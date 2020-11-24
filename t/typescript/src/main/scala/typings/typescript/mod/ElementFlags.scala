package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementFlags extends js.Object
@JSImport("typescript", "ElementFlags")
@js.native
object ElementFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementFlags with Double] = js.native
  
  @js.native
  sealed trait Optional extends ElementFlags
  /* 2 */ @js.native
  object Optional extends TopLevel[Optional with Double]
  
  @js.native
  sealed trait Required extends ElementFlags
  /* 1 */ @js.native
  object Required extends TopLevel[Required with Double]
  
  @js.native
  sealed trait Rest extends ElementFlags
  /* 4 */ @js.native
  object Rest extends TopLevel[Rest with Double]
  
  @js.native
  sealed trait Variable extends ElementFlags
  /* 12 */ @js.native
  object Variable extends TopLevel[Variable with Double]
  
  @js.native
  sealed trait Variadic extends ElementFlags
  /* 8 */ @js.native
  object Variadic extends TopLevel[Variadic with Double]
}
