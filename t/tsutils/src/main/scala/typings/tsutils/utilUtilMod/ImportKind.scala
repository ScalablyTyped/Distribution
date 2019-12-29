package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImportKind extends js.Object

@JSImport("tsutils/util/util", "ImportKind")
@js.native
object ImportKind extends js.Object {
  @js.native
  sealed trait All extends ImportKind
  
  @js.native
  sealed trait AllImportExpressions extends ImportKind
  
  @js.native
  sealed trait AllImports extends ImportKind
  
  @js.native
  sealed trait AllRequireLike extends ImportKind
  
  @js.native
  sealed trait AllStaticImports extends ImportKind
  
  @js.native
  sealed trait DynamicImport extends ImportKind
  
  @js.native
  sealed trait ExportFrom extends ImportKind
  
  @js.native
  sealed trait ImportDeclaration extends ImportKind
  
  @js.native
  sealed trait ImportEquals extends ImportKind
  
  @js.native
  sealed trait ImportType extends ImportKind
  
  @js.native
  sealed trait Require extends ImportKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImportKind with Double] = js.native
  /* 63 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 24 */ @js.native
  object AllImportExpressions extends TopLevel[AllImportExpressions with Double]
  
  /* 59 */ @js.native
  object AllImports extends TopLevel[AllImports with Double]
  
  /* 18 */ @js.native
  object AllRequireLike extends TopLevel[AllRequireLike with Double]
  
  /* 3 */ @js.native
  object AllStaticImports extends TopLevel[AllStaticImports with Double]
  
  /* 8 */ @js.native
  object DynamicImport extends TopLevel[DynamicImport with Double]
  
  /* 4 */ @js.native
  object ExportFrom extends TopLevel[ExportFrom with Double]
  
  /* 1 */ @js.native
  object ImportDeclaration extends TopLevel[ImportDeclaration with Double]
  
  /* 2 */ @js.native
  object ImportEquals extends TopLevel[ImportEquals with Double]
  
  /* 32 */ @js.native
  object ImportType extends TopLevel[ImportType with Double]
  
  /* 16 */ @js.native
  object Require extends TopLevel[Require with Double]
  
}

