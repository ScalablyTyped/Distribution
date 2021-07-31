package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementFlags extends StObject
@JSImport("typescript", "ElementFlags")
@js.native
object ElementFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementFlags & Double] = js.native
  
  @js.native
  sealed trait Optional
    extends StObject
       with ElementFlags
  /* 2 */ val Optional: typings.typescript.mod.ElementFlags.Optional & Double = js.native
  
  @js.native
  sealed trait Required
    extends StObject
       with ElementFlags
  /* 1 */ val Required: typings.typescript.mod.ElementFlags.Required & Double = js.native
  
  @js.native
  sealed trait Rest
    extends StObject
       with ElementFlags
  /* 4 */ val Rest: typings.typescript.mod.ElementFlags.Rest & Double = js.native
  
  @js.native
  sealed trait Variable
    extends StObject
       with ElementFlags
  /* 12 */ val Variable: typings.typescript.mod.ElementFlags.Variable & Double = js.native
  
  @js.native
  sealed trait Variadic
    extends StObject
       with ElementFlags
  /* 8 */ val Variadic: typings.typescript.mod.ElementFlags.Variadic & Double = js.native
}
