package typings.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourceFileMode extends StObject
@JSImport("typedoc/dist/lib/utils/options/declaration", "SourceFileMode")
@js.native
object SourceFileMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceFileMode with Double] = js.native
  
  @js.native
  sealed trait File extends SourceFileMode
  /* 0 */ val File: typings.typedoc.optionsDeclarationMod.SourceFileMode.File with Double = js.native
  
  @js.native
  sealed trait Modules extends SourceFileMode
  /* 1 */ val Modules: typings.typedoc.optionsDeclarationMod.SourceFileMode.Modules with Double = js.native
}
