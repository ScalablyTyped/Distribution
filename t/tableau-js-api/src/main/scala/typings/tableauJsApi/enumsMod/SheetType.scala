package typings.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SheetType extends StObject
@JSImport("tableau-js-api/enums", "SheetType")
@js.native
object SheetType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SheetType & String] = js.native
  
  @js.native
  sealed trait DASHBOARD
    extends StObject
       with SheetType
  /* "dashboard" */ val DASHBOARD: typings.tableauJsApi.enumsMod.SheetType.DASHBOARD & String = js.native
  
  @js.native
  sealed trait STORY
    extends StObject
       with SheetType
  /* "story" */ val STORY: typings.tableauJsApi.enumsMod.SheetType.STORY & String = js.native
  
  @js.native
  sealed trait WORKSHEET
    extends StObject
       with SheetType
  /* "worksheet" */ val WORKSHEET: typings.tableauJsApi.enumsMod.SheetType.WORKSHEET & String = js.native
}
