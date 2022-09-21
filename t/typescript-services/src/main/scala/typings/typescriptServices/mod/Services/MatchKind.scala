package typings.typescriptServices.mod.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.MatchKind")
@js.native
open class MatchKind ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.MatchKind
object MatchKind {
  
  @JSImport("typescript-services", "Services.MatchKind")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.MatchKind.exact")
  @js.native
  def exact: String = js.native
  inline def exact_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exact")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("typescript-services", "Services.MatchKind.none")
  @js.native
  def none: String = js.native
  inline def none_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("typescript-services", "Services.MatchKind.prefix")
  @js.native
  def prefix: String = js.native
  inline def prefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("typescript-services", "Services.MatchKind.subString")
  @js.native
  def subString: String = js.native
  inline def subString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subString")(x.asInstanceOf[js.Any])
}
