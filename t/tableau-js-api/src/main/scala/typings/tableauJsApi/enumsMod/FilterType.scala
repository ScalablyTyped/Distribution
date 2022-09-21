package typings.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterType extends StObject
@JSImport("tableau-js-api/enums", "FilterType")
@js.native
object FilterType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterType & String] = js.native
  
  @js.native
  sealed trait CATEGORICAL
    extends StObject
       with FilterType
  /* "categorical" */ val CATEGORICAL: typings.tableauJsApi.enumsMod.FilterType.CATEGORICAL & String = js.native
  
  @js.native
  sealed trait HIERARCHICAL
    extends StObject
       with FilterType
  /* "hierarchical" */ val HIERARCHICAL: typings.tableauJsApi.enumsMod.FilterType.HIERARCHICAL & String = js.native
  
  @js.native
  sealed trait QUANTITATIVE
    extends StObject
       with FilterType
  /* "quantitative" */ val QUANTITATIVE: typings.tableauJsApi.enumsMod.FilterType.QUANTITATIVE & String = js.native
  
  @js.native
  sealed trait RELATIVEDATE
    extends StObject
       with FilterType
  /* "relativedate" */ val RELATIVEDATE: typings.tableauJsApi.enumsMod.FilterType.RELATIVEDATE & String = js.native
}
