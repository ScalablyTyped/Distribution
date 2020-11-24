package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutputFileType extends js.Object
@JSImport("typescript", "OutputFileType")
@js.native
object OutputFileType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputFileType with Double] = js.native
  
  @js.native
  sealed trait Declaration extends OutputFileType
  /* 2 */ @js.native
  object Declaration
    extends TopLevel[typings.typescript.mod.OutputFileType.Declaration with Double]
  
  @js.native
  sealed trait JavaScript extends OutputFileType
  /* 0 */ @js.native
  object JavaScript extends TopLevel[JavaScript with Double]
  
  @js.native
  sealed trait SourceMap extends OutputFileType
  /* 1 */ @js.native
  object SourceMap extends TopLevel[SourceMap with Double]
}
