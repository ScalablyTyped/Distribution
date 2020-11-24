package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImportKind extends js.Object
@JSImport("tsutils/util/util", "ImportKind")
@js.native
object ImportKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImportKind with Double] = js.native
  
  @js.native
  sealed trait All extends ImportKind
  /* 63 */ @js.native
  object All extends TopLevel[All with Double]
  
  @js.native
  sealed trait AllImportExpressions extends ImportKind
  /* 24 */ @js.native
  object AllImportExpressions extends TopLevel[AllImportExpressions with Double]
  
  @js.native
  sealed trait AllImports extends ImportKind
  /* 59 */ @js.native
  object AllImports extends TopLevel[AllImports with Double]
  
  @js.native
  sealed trait AllRequireLike extends ImportKind
  /* 18 */ @js.native
  object AllRequireLike extends TopLevel[AllRequireLike with Double]
  
  @js.native
  sealed trait AllStaticImports extends ImportKind
  /* 3 */ @js.native
  object AllStaticImports extends TopLevel[AllStaticImports with Double]
  
  @js.native
  sealed trait DynamicImport extends ImportKind
  /* 8 */ @js.native
  object DynamicImport extends TopLevel[DynamicImport with Double]
  
  @js.native
  sealed trait ExportFrom extends ImportKind
  /* 4 */ @js.native
  object ExportFrom extends TopLevel[ExportFrom with Double]
  
  @js.native
  sealed trait ImportDeclaration extends ImportKind
  /* 1 */ @js.native
  object ImportDeclaration extends TopLevel[ImportDeclaration with Double]
  
  @js.native
  sealed trait ImportEquals extends ImportKind
  /* 2 */ @js.native
  object ImportEquals extends TopLevel[ImportEquals with Double]
  
  @js.native
  sealed trait ImportType extends ImportKind
  /* 32 */ @js.native
  object ImportType extends TopLevel[ImportType with Double]
  
  @js.native
  sealed trait Require extends ImportKind
  /* 16 */ @js.native
  object Require extends TopLevel[Require with Double]
}
