package typings.typedoc.mod.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.OutliningSpanKind")
@js.native
object OutliningSpanKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.typescript.mod.OutliningSpanKind with String] = js.native
  
  /* "code" */ val Code: typings.typescript.mod.OutliningSpanKind.Code with String = js.native
  
  /* "comment" */ val Comment: typings.typescript.mod.OutliningSpanKind.Comment with String = js.native
  
  /* "imports" */ val Imports: typings.typescript.mod.OutliningSpanKind.Imports with String = js.native
  
  /* "region" */ val Region: typings.typescript.mod.OutliningSpanKind.Region with String = js.native
}
