package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementFlags extends StObject
@JSImport("typescript", "ElementFlags")
@js.native
object ElementFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementFlags with Double] = js.native
  
  @js.native
  sealed trait Optional extends ElementFlags
  /* 2 */ val Optional: typings.typescript.mod.ElementFlags.Optional with Double = js.native
  
  @js.native
  sealed trait Required extends ElementFlags
  /* 1 */ val Required: typings.typescript.mod.ElementFlags.Required with Double = js.native
  
  @js.native
  sealed trait Rest extends ElementFlags
  /* 4 */ val Rest: typings.typescript.mod.ElementFlags.Rest with Double = js.native
  
  @js.native
  sealed trait Variable extends ElementFlags
  /* 12 */ val Variable: typings.typescript.mod.ElementFlags.Variable with Double = js.native
  
  @js.native
  sealed trait Variadic extends ElementFlags
  /* 8 */ val Variadic: typings.typescript.mod.ElementFlags.Variadic with Double = js.native
}
